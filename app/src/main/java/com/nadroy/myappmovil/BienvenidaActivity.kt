package com.nadroy.myappmovil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class BienvenidaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bienvenida)
    }

    fun info(btningresar: View){
        val ingreso = Intent(this,InformacionActivity::class.java)
        startActivity(ingreso)
    }

}