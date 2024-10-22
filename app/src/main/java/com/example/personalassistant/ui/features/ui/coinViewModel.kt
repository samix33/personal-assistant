package com.example.personalassistant.ui.features.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.personalassistant.ui.features.Model.data.CoinsData
import com.example.personalassistant.ui.features.Model.repository.coinrepository
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

class coinViewModel(val repository: coinrepository,IsInternetConrction : Boolean):ViewModel() {
    val Coindata = MutableLiveData<List<CoinsData.Data>>()

    init {
        RefreshorUpdataData(IsInternetConrction)
    }

    private fun RefreshorUpdataData(IsInternetConrction : Boolean) {
        viewModelScope.launch {
            if (IsInternetConrction){
                val answerDataCoin = async { repository.gettopcoin() }
                updatadata(answerDataCoin.await())
            }

        }


    }
    fun updatadata(data: List<CoinsData.Data>){
        Coindata.value = data
    }

}