package com.example.personalassistant.ui.features.util

import android.app.Application
import com.example.personalassistant.ui.features.Model.net.crateApiService
import com.example.personalassistant.ui.features.Model.repository.coinRepositoryImpl
import com.example.personalassistant.ui.features.Model.repository.coinrepository
import com.example.personalassistant.ui.features.ui.coinViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import org.koin.core.context.startKoin


class Myapp:Application() {
    override fun onCreate() {
        super.onCreate()
        val myModuled= module {
            single<coinrepository> { coinRepositoryImpl(get()) }
            single { crateApiService() }
            viewModel{(isInternetConection : Boolean)->coinViewModel(get(),isInternetConection)}
        }
        startKoin {
            androidContext(this@Myapp)
            modules(myModuled)
        }
    }


}