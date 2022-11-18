package com.example.android.dagger.di

import com.example.android.dagger.storage.SharedPreferencesStorage
import com.example.android.dagger.storage.Storage
import dagger.Binds
import dagger.Module

@Module //le indico que es un modulo. Al tener que ser la funcion abstracta, me pide que la clase tambien lo sea
abstract class StorageModule {

    @Binds //Use @Binds para decirle a Dagger qué implementación necesita usar al proporcionar una interfaz.
    abstract fun provideStorage(storage : SharedPreferencesStorage) : Storage
}