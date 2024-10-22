package com.example.personalassistant.ui.features.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.personalassistant.databinding.FragmentDigitalCurrencyBinding
import com.example.personalassistant.ui.features.Model.data.CoinsData
import com.example.startup_music_player.util.NetworkChecker
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf

class DigitalCurrencyFragment : Fragment() {
    lateinit var binding: FragmentDigitalCurrencyBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val viewModel : coinViewModel by viewModel(parameters= {parametersOf(NetworkChecker(binding.root.context).isInternetConnected)})
        // Inflate the layout for this fragment
        binding = FragmentDigitalCurrencyBinding.inflate(inflater,container,false)

        return binding.root
    }

}