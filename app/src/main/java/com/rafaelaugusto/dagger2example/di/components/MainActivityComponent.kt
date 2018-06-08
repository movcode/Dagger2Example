package com.rafaelaugusto.dagger2example.di.components

import com.rafaelaugusto.dagger2example.MainActivity
import com.rafaelaugusto.dagger2example.di.modules.ActivityModule
import com.rafaelaugusto.dagger2example.di.scopes.ScopeActivity
import dagger.Subcomponent
import dagger.android.AndroidInjector

/**
 * Created by rafael on 08/06/2018.
 */
@ScopeActivity
@Subcomponent(modules = arrayOf(ActivityModule::class))

interface MainActivityComponent :AndroidInjector<MainActivity>{
    @Subcomponent.Builder
    abstract class Builder: AndroidInjector.Builder<MainActivity>()
}

