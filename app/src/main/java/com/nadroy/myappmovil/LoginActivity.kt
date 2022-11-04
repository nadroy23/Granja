package com.nadroy.myappmovil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class LoginActivity : AppCompatActivity() {

    private var edit_user: EditText?=null
    private var edit_password: EditText?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        edit_user = findViewById(R.id.editTextTextPersonName)
        edit_password = findViewById(R.id.editTextTextPassword)
    }

    fun ingresar(btningresar: View){

        if (edit_user!!.text.toString()=="admin"){
            if (edit_password!!.text.toString()=="admin"){
                val ingreso = Intent(this,BienvenidaActivity::class.java)
                startActivity(ingreso)
            }
        }else{
            val dialogo = AlertDialog.Builder(this)
                .setTitle("¡Alerta!")
                .setMessage("Usuario o Contraseña incorrectos...") // R.string.variable
                .create().show()
        }
    }

    fun registrar(btningresar: View){
        val ingreso = Intent(this,RegistrarActivity::class.java)
        startActivity(ingreso)
    }

    fun googleLogin(btningresar: View){
        val dialogo = AlertDialog.Builder(this)
            .setTitle("¡Ops!")
            .setMessage("Esta funcionalidad aun no esta implementada...") // R.string.variable
            .create().show()
    }
}