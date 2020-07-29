package com.example.examen.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.examen.R
import kotlinx.android.synthetic.main.activity_transaction_activity.*

class Transaction_activity : AppCompatActivity(), View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transaction_activity)
        ibtn_back.setOnClickListener(this)
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id){
                R.id.ibtn_back->{
                    onBackPressed()
                }
            }
        }

    }
}