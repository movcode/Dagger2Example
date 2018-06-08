package com.rafaelaugusto.dagger2example

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_main2.*
import javax.inject.Inject

class Main2Activity : AppCompatActivity() {


    @Inject
    lateinit var perfil:Perfil

    @Inject
    lateinit var person:Person

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidInjection.inject(this)
        setContentView(R.layout.activity_main2)


        tv2.text = person.name+"-"+perfil.shape().toString()

    }
}
