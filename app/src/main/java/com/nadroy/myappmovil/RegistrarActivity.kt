package com.nadroy.myappmovil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog

class RegistrarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrar)
    }

    fun inicio(btningresar: View){
        val ingreso = Intent(this,LoginActivity::class.java)
        startActivity(ingreso)
    }

    fun googleLogin(btningresar: View){
        val dialogo = AlertDialog.Builder(this)
            .setTitle("¡Ops!")
            .setMessage("Esta funcionalidad aun no esta implementada...") // R.string.variable
            .create().show()
    }

}