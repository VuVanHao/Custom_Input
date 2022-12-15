package com.hao.eggnotification

import android.app.ActivityOptions
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private var btnGoTo2 : Button ?= null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGoTo2 = findViewById(R.id.btnGoTo2)

        val btnGoToEdt : Button = findViewById(R.id.btnGoToEdt)

        btnGoTo2?.setOnClickListener {
            val intent = Intent(this,Activity2::class.java)
            val bundle = ActivityOptions.makeSceneTransitionAnimation(this).toBundle()
            startActivity(intent,bundle);
        }

        btnGoToEdt.setOnClickListener {
            val intent = Intent(this,ActivityEdt::class.java)
            val bundle = ActivityOptions.makeSceneTransitionAnimation(this).toBundle()
            startActivity(intent,bundle);
        }
    }
}