package com.example.android.dagger.di

import android.content.Context
import com.example.android.dagger.registration.RegistrationActivity
import dagger.BindsInstance
import dagger.Component
import dagger.Module

@Component (modules = [StorageModule::class]) //modules: con esto puedo acceder a la informacion de StorageModule
interface AppComponent {
    //Factory crea una instancia del AppComponent
    @Component.Factory
    interface Factory{
        //con @bindInstance, el contexto pasado estará disponible en el gráfico
        fun create(@BindsInstance context: Context) : AppComponent
    }

    //clases que pueden ser inyectadas por este componente. Con esto le decimos que esta actividad
    // solicita la inyeccion y tiene que proporcionarle las dependencias anotadas con @inject
    fun inject(activity: RegistrationActivity)
}