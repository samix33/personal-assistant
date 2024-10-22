package com.example.personalassistant.ui.features.Model.repository

import android.util.Log
import com.example.personalassistant.ui.features.Model.data.CoinsData
import com.example.personalassistant.ui.features.Model.net.ApiService

class coinRepositoryImpl(private val  apiService: ApiService): coinrepository {

    override suspend fun gettopcoin(): List<CoinsData.Data> {
        return listOf()
    }
}