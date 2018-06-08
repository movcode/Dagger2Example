package com.rafaelaugusto.dagger2example

import android.app.Activity
import android.app.Application
import android.support.v4.app.Fragment
import com.rafaelaugusto.dagger2example.di.components.AppComponent
import com.rafaelaugusto.dagger2example.di.components.DaggerAppComponent
import com.rafaelaugusto.dagger2example.di.modules.AppModule
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject

/**
 * Created by rafael on 08/06/2018.
 */


class App:Application(),HasSupportFragmentInjector,HasActivityInjector{
    @Inject
    lateinit var mActivityInjector: DispatchingAndroidInjector<Activity>
    lateinit var mFragmentInjector: DispatchingAndroidInjector<Fragment>


    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent.builder()
                .application(this)
                .build()
                .inject(this)
    }


    override fun supportFragmentInjector(): AndroidInjector<Fragment>? {
        return mFragmentInjector
    }

    override fun activityInjector(): AndroidInjector<Activity> {
        return  mActivityInjector
    }

}