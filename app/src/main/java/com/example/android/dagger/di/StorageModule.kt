package com.example.android.dagger.di

import android.content.Context
import com.example.android.dagger.storage.SharedPreferencesStorage
import com.example.android.dagger.storage.Storage
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Qualifier

@Retention(AnnotationRetention.BINARY)
@Qualifier
annotation class RegistrationStorage

@Retention(AnnotationRetention.BINARY)
@Qualifier
annotation class LoginStorage

@Module //le indico que es un modulo. Al tener que ser la funcion abstracta, me pide que la clase tambien lo sea
 class StorageModule {

    @RegistrationStorage
    @Provides
    fun provideRegistrationStorage(context: Context): Storage{
        return SharedPreferencesStorage(context)
    }

    @LoginStorage
    @Provides
    fun provideLoginStorage(context: Context): Storage{
        return SharedPreferencesStorage(context)
    }


  //  @Binds //Use @Binds para decirle a Dagger qué implementación necesita usar al proporcionar una interfaz.
  //  abstract fun provideStorage(storage : SharedPreferencesStorage) : Storage

    @Provides
    fun provideStorage(context: Context): Storage {
        // Whenever Dagger needs to provide an instance of type Storage,
        // this code (the one inside the @Provides method) will be run.
        return SharedPreferencesStorage(context)
    }
}