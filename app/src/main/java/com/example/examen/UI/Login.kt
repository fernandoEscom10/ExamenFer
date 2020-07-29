package com.example.examen.UI

import android.content.DialogInterface
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.examen.R
import com.example.examen.SaredApp
import kotlinx.android.synthetic.main.activity_login.*


class Login : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        nombre_client.text = SaredApp.prefs.name
        btn_login.setOnClickListener(this)
        olvidae_contraseña.setOnClickListener(this)
        olvidar_user.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id){
                R.id.btn_login->{
                    if(pinEntry.text!!.toString() == SaredApp.prefs.password) {
                        val intent = Intent(this@Login, Transaction_activity::class.java)
                        startActivity(intent)
                    }else{
                        Toast.makeText(this, "Contraseña invalida", Toast.LENGTH_SHORT).show()
                    }
                }
                R.id.olvidar_user->{
                    val alertDialogBuilder = AlertDialog.Builder(this)
                    val pass = SaredApp.prefs.password
                    alertDialogBuilder.setTitle("¿Seguro quieres borrar el usuario?")
                    alertDialogBuilder.setMessage("¿Borrar?")
                    alertDialogBuilder.setPositiveButton("Borrar",
                        DialogInterface.OnClickListener( function = borraruser))
                    alertDialogBuilder.show()
                }
                R.id.olvidae_contraseña->{
                    Toast.makeText(this,"tu Contraseña es "+ SaredApp.prefs.password, Toast.LENGTH_LONG).show()
                }
            }
        }
    }

    val borraruser = {dialog: DialogInterface, wich: Int ->
       borrar()
    }

    fun borrar(){
        SaredApp.prefs.password!!.replace("123456","",false)
    }
}

