package com.rafaelaugusto.dagger2example.di.modules

import com.rafaelaugusto.dagger2example.Perfil
import com.rafaelaugusto.dagger2example.di.components.MainActivity2Component
import com.rafaelaugusto.dagger2example.di.components.MainActivityComponent
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by rafael on 08/06/2018.
 */

@Module(subcomponents = arrayOf(
        MainActivityComponent::class,
        MainActivity2Component::class))
class AppModule{
    @Singleton
    @Provides
    fun providerPerfil() = Perfil()

}