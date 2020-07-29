package com.example.examen.UI

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.examen.R
import kotlinx.android.synthetic.main.activity_login.*


class Login : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btn_login.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id){
                R.id.btn_login->{
                    val intent = Intent(this@Login,Transaction_activity::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}