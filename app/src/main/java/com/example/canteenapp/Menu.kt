package com.example.canteenapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlin.jvm.java

class Menu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val nama = intent.getStringExtra("nama")
        val nim = intent.getStringExtra("nim")

        findViewById<Button>(R.id.btnNasiGoreng).setOnClickListener {
            val intent = Intent(this, DetailPesanan::class.java)
            intent.putExtra("nama", nama)
            intent.putExtra("nim", nim)
            intent.putExtra("menu", "Nasi Goreng")
            intent.putExtra("harga", 15000)
            startActivity(intent)
        }
    }
}
