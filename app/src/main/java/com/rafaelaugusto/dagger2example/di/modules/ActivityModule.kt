package com.rafaelaugusto.dagger2example.di.modules

import com.rafaelaugusto.dagger2example.Person
import com.rafaelaugusto.dagger2example.di.scopes.ScopeActivity
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

/**
 * Created by rafael on 08/06/2018.
 */


@Module
class ActivityModule {

    @Provides
    @ScopeActivity
    fun providerPerson():Person = Person()
}