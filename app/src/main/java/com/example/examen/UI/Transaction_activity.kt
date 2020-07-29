package com.example.examen.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Toast
import androidx.core.widget.doAfterTextChanged
import com.example.examen.R
import com.example.examen.SaredApp
import kotlinx.android.synthetic.main.activity_transaction_activity.*

class Transaction_activity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transaction_activity)
        tv_nombre.text = (SaredApp.prefs.name)
        tv_telefono.text = (SaredApp.prefs.telefono)
        ibtn_back.setOnClickListener(this)
        btn_confirmar.setOnClickListener(this)
        edt_coment.addTextChangedListener(textWatcher)
        et_cantidad.addTextChangedListener(textWatcherCant)
    }


        override fun onBackPressed() {
            super.onBackPressed()
        }

        override fun onClick(v: View?) {
            if (v != null) {
                when (v.id) {
                    R.id.ibtn_back -> {
                        onBackPressed()
                    }
                    R.id.btn_confirmar -> {
                        Toast.makeText(
                            this,
                            "Cantidad:  " + et_cantidad.text + "  total:" + et_cantidad.text + "  comentario" + edt_coment.text,
                            Toast.LENGTH_LONG
                        ).show()
                        onBackPressed()
                    }
                }
            }

        }

        val textWatcher  = object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
                if (!et_cantidad.text.isNullOrBlank() && !edt_coment.text.isNullOrBlank()) {
                    btn_confirmar.isEnabled = true
                }

            }

                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                }

                override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                }
            }

    val textWatcherCant  = object : TextWatcher {
        override fun afterTextChanged(p0: Editable?) {
            if (!et_cantidad.text.isNullOrBlank() && !edt_coment.text.isNullOrBlank()) {
                btn_confirmar.isEnabled = true
                tv_total.text = p0.toString()
            }

        }

        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        }

        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            if (!et_cantidad.text.isNullOrBlank() && !edt_coment.text.isNullOrBlank()) {
                btn_confirmar.isEnabled = true
                tv_total.text = p0.toString()
            }
        }
    }
        }