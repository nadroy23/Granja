package com.nadroy.myappmovil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog

class InformacionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informacion)
    }

    fun horarios(btningresar: View){
        val ingreso = Intent(this,CalendarioActivity::class.java)
        startActivity(ingreso)
    }

    fun Alertas(btningresar: View){
        val dialogo = AlertDialog.Builder(this)
            .setTitle("¡Ops!")
            .setMessage("Esta funcionalidad aun no esta implementada...") // R.string.variable
            .create().show()
    }

    fun Tareas(btningresar: View){
        val dialogo = AlertDialog.Builder(this)
            .setTitle("¡Ops!")
            .setMessage("Esta funcionalidad aun no esta implementada...") // R.string.variable
            .create().show()
    }
}