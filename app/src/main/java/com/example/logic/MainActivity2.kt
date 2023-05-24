package com.example.logic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.logic.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main2)
         binding = ActivityMain2Binding.inflate(layoutInflater)
        binding.btnTampilkan2.setOnClickListener {
           ubahData()
        }
        setContentView(binding.root)
    }
    private fun ubahData(){
        var angka1 = binding.etAngka1.text.toString().toInt()
        var angka2 = angka1 * 10
        binding.tvHasil2.text = angka2.toString()
    }
}