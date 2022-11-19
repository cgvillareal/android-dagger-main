package com.example.android.dagger.di

import android.content.Context
import com.example.android.dagger.login.LoginComponent
import com.example.android.dagger.main.MainActivity
import com.example.android.dagger.registration.RegistrationActivity
import com.example.android.dagger.registration.RegistrationComponent
import com.example.android.dagger.registration.enterdetails.EnterDetailsFragment
import com.example.android.dagger.registration.termsandconditions.TermsAndConditionsFragment
import com.example.android.dagger.settings.SettingsActivity
import com.example.android.dagger.user.UserManager
import dagger.BindsInstance
import dagger.Component
import dagger.Module
import javax.inject.Singleton

@Singleton
@Component(modules = [StorageModule::class, AppSubcomponents::class]) //modules: con esto puedo acceder a la informacion de StorageModule
interface AppComponent {
    //Factory crea una instancia del AppComponent
    @Component.Factory
    interface Factory{
        //con @bindInstance, el contexto pasado estará disponible en el gráfico
        fun create(@BindsInstance context: Context) : AppComponent
    }

    fun userManager() : UserManager
    //clases que pueden ser inyectadas por este componente. Con esto le decimos que esta actividad
    // solicita la inyeccion y tiene que proporcionarle las dependencias anotadas con @inject
    //fun inject(activity: RegistrationActivity)

    // Expose RegistrationComponent factory from the graph
    fun registrationComponent(): RegistrationComponent.Factory

    fun loginComponent() : LoginComponent.Factory

    //fun inject(activity: MainActivity) //agrego MainActivity

    //fun inject(activity: TermsAndConditionsFragment)

    //fun inject(activity: EnterDetailsFragment)

    //fun inject(activity: SettingsActivity)
}