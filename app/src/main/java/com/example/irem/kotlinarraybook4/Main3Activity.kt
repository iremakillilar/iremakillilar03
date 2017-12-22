package com.example.irem.kotlinarraybook4

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main3.*

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        button2.setOnClickListener{
            val intent= Intent(this,Main4Activity::class.java)
            startActivity(intent)
        }

    }
}
