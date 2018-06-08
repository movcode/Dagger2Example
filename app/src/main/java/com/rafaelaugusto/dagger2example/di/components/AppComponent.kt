package com.rafaelaugusto.dagger2example.di.components

import com.rafaelaugusto.dagger2example.App
import com.rafaelaugusto.dagger2example.di.ActivityBuilders
import com.rafaelaugusto.dagger2example.di.modules.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * Created by rafael on 08/06/2018.
 */

@Singleton
@Component(
        modules = arrayOf(
                AndroidSupportInjectionModule::class,
                AppModule::class,
                ActivityBuilders::class
        )
)

interface AppComponent{

    @Component.Builder
    interface  Builder{
        @BindsInstance
        fun application(app: App):Builder
        fun build():AppComponent
    }

    fun inject(app: App)
}