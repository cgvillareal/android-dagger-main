package com.example.android.dagger.di

import javax.inject.Scope

/*
* Reglas del Scope - alcance
*
*  ---Cuando un TIPO está marcado con una anotación de alcance, solo lo pueden usar
*     los componentes que están anotados con el mismo alcance
*
* ----Cuando un COMPONENTE está marcado con una anotación de alcance, solo puede proporcionar
*     tipos con esa anotación o tipos que no tienen anotación
*
* ----Un subcomponente no puede utilizar una anotación de alcance utilizada por uno de sus
*     componentes principales.
*
* Los componentes también implican subcomponentes en este contexto.
*
* */
@Scope
@MustBeDocumented
@Retention(value = AnnotationRetention.RUNTIME)
annotation class ActivityScope
