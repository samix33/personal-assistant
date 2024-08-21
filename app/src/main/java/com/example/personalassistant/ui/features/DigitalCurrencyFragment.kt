package com.example.personalassistant.ui.features

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import com.example.personalassistant.R
import com.example.personalassistant.databinding.FragmentDigitalCurrencyBinding

class DigitalCurrencyFragment : Fragment() {
    lateinit var binding: FragmentDigitalCurrencyBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        binding = FragmentDigitalCurrencyBinding.inflate(inflater,container,false)
        binding.button1H.setOnClickListener {
            binding.button1H.background =  ContextCompat.getDrawable(binding.root.context, R.drawable.rounded_button)
            binding.button1d.setBackgroundColor(ContextCompat.getColor(binding.root.context, R.color.colorPrimarydark))
            binding.button1w.setBackgroundColor(ContextCompat.getColor(binding.root.context, R.color.colorPrimarydark))
            binding.button1m.setBackgroundColor(ContextCompat.getColor(binding.root.context, R.color.colorPrimarydark))
            binding.button1y.setBackgroundColor(ContextCompat.getColor(binding.root.context, R.color.colorPrimarydark))

        }
        binding.button1d.setOnClickListener {
            binding.button1d.background =  ContextCompat.getDrawable(binding.root.context, R.drawable.rounded_button)
            binding.button1H.setBackgroundColor(ContextCompat.getColor(binding.root.context, R.color.colorPrimarydark))
            binding.button1w.setBackgroundColor(ContextCompat.getColor(binding.root.context, R.color.colorPrimarydark))
            binding.button1m.setBackgroundColor(ContextCompat.getColor(binding.root.context, R.color.colorPrimarydark))
            binding.button1y.setBackgroundColor(ContextCompat.getColor(binding.root.context, R.color.colorPrimarydark))
        }
        binding.button1w.setOnClickListener {
            binding.button1w.background =  ContextCompat.getDrawable(binding.root.context, R.drawable.rounded_button)
            binding.button1H.setBackgroundColor(ContextCompat.getColor(binding.root.context, R.color.colorPrimarydark))
            binding.button1d.setBackgroundColor(ContextCompat.getColor(binding.root.context, R.color.colorPrimarydark))
            binding.button1m.setBackgroundColor(ContextCompat.getColor(binding.root.context, R.color.colorPrimarydark))
            binding.button1y.setBackgroundColor(ContextCompat.getColor(binding.root.context, R.color.colorPrimarydark))
        }
        binding.button1m.setOnClickListener {
            binding.button1m.background =  ContextCompat.getDrawable(binding.root.context, R.drawable.rounded_button)
            binding.button1H.setBackgroundColor(ContextCompat.getColor(binding.root.context, R.color.colorPrimarydark))
            binding.button1w.setBackgroundColor(ContextCompat.getColor(binding.root.context, R.color.colorPrimarydark))
            binding.button1d.setBackgroundColor(ContextCompat.getColor(binding.root.context, R.color.colorPrimarydark))
            binding.button1y.setBackgroundColor(ContextCompat.getColor(binding.root.context, R.color.colorPrimarydark))

        }
        binding.button1y.setOnClickListener {
            binding.button1y.background =  ContextCompat.getDrawable(binding.root.context, R.drawable.rounded_button)
            binding.button1H.setBackgroundColor(ContextCompat.getColor(binding.root.context, R.color.colorPrimarydark))
            binding.button1w.setBackgroundColor(ContextCompat.getColor(binding.root.context, R.color.colorPrimarydark))
            binding.button1m.setBackgroundColor(ContextCompat.getColor(binding.root.context, R.color.colorPrimarydark))
            binding.button1d.setBackgroundColor(ContextCompat.getColor(binding.root.context, R.color.colorPrimarydark))
        }


        return binding.root
    }

}