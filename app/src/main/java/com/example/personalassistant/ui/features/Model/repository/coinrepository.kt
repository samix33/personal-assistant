package com.example.personalassistant.ui.features.Model.repository

import com.example.personalassistant.ui.features.Model.data.CoinsData


interface coinrepository {
    suspend fun gettopcoin():List<CoinsData.Data>
}