package com.example.logic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var etName = findViewById<EditText>(R.id.et_name)
        var btnTampilkan = findViewById<Button>(R.id.btn_tampilkan)
        var tvHasil = findViewById<TextView>(R.id.tv_hasil)
        var btnToAct2 = findViewById<Button>(R.id.btn_act2)

        btnTampilkan.setOnClickListener() {
            tvHasil.text = etName.text.toString()
        }

        btnToAct2.setOnClickListener {
            var intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }
    }
}