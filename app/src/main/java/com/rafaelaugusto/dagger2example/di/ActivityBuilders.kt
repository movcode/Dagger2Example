package com.rafaelaugusto.dagger2example.di

import com.rafaelaugusto.dagger2example.MainActivity
import dagger.Binds
import dagger.Module
import dagger.android.ActivityKey
import dagger.multibindings.IntoMap
import android.app.Activity
import com.rafaelaugusto.dagger2example.Main2Activity
import com.rafaelaugusto.dagger2example.di.components.MainActivity2Component
import com.rafaelaugusto.dagger2example.di.components.MainActivityComponent
import dagger.android.AndroidInjector



/**
 * Created by rafael on 08/06/2018.
 */


@Module
abstract  class  ActivityBuilders{

    @Binds
    @IntoMap
    @ActivityKey(MainActivity::class)
    internal abstract fun bindMainActivity(builder: MainActivityComponent.Builder) : AndroidInjector.Factory<out Activity>


    @Binds
    @IntoMap
    @ActivityKey(Main2Activity::class)
    internal abstract fun bindMain2Activity(builder: MainActivity2Component.Builder):AndroidInjector.Factory<out  Activity>

}