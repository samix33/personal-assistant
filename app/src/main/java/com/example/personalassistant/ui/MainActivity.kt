package com.example.personalassistant.ui

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.personalassistant.R
import com.example.personalassistant.databinding.ActivityMainBinding
import com.example.personalassistant.ui.features.AiFragment
import com.example.personalassistant.ui.features.DigitalCurrencyFragment
import com.example.personalassistant.ui.features.HomeFragment

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        transform(HomeFragment())
        binding.bottomBar.onItemSelected = {
            when(it){
                0->{
                    transform(DigitalCurrencyFragment())
                }
                1->{
                    transform(HomeFragment())

                }
                2->{
                    transform(AiFragment())

                }
            }

        }

    }
    private fun transform(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.framelayot, fragment)
        transaction.commit()

    }
}