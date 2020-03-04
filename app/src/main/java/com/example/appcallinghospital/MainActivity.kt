package com.example.appcallinghospital

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun call_hospit(viev: View){
        val callIntent = Intent (this, LoginActivity::class.java)
        startActivity(callIntent)
    }
}
