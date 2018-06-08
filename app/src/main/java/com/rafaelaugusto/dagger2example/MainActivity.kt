package com.rafaelaugusto.dagger2example

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var perfil:Perfil

    @Inject
    lateinit var person:Person

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidInjection.inject(this)
        setContentView(R.layout.activity_main)

        perfil.width  = 1
        perfil.height = 2

        person.name = "Rafael"

        tv.text =person.name +"-"+ perfil.shape().toString()

        btn_to_activity2.setOnClickListener{
            startActivity(Intent(this,Main2Activity::class.java))
        }
    }
}
