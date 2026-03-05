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
        val kelas = intent.getStringExtra("kelas")

        findViewById<Button>(R.id.btnNasiGoreng).setOnClickListener {
            val intent = Intent(this, DetailPesanan::class.java)
            intent.putExtra("nama", nama)
            intent.putExtra("nim", nim)
            intent.putExtra("kelas", kelas)
            intent.putExtra("pesanan", "Nasi Goreng")
            intent.putExtra("harga", 15000)
            startActivity(intent)
        }

        findViewById<Button>(R.id.btnMieAyam).setOnClickListener {
            val intent = Intent(this, DetailPesanan::class.java)
            intent.putExtra("nama", nama)
            intent.putExtra("nim", nim)
            intent.putExtra("kelas", kelas)
            intent.putExtra("pesanan", "Mie Ayam")
            intent.putExtra("harga", 12000)
            startActivity(intent)
        }

        findViewById<Button>(R.id.btnAyamGeprek).setOnClickListener {
            val intent = Intent(this, DetailPesanan::class.java)
            intent.putExtra("nama", nama)
            intent.putExtra("nim", nim)
            intent.putExtra("kelas", kelas)
            intent.putExtra("pesanan", "Ayam Geprek")
            intent.putExtra("harga", 18000)
            startActivity(intent)
        }

        findViewById<Button>(R.id.btnBakso).setOnClickListener {
            val intent = Intent(this, DetailPesanan::class.java)
            intent.putExtra("nama", nama)
            intent.putExtra("nim", nim)
            intent.putExtra("kelas", kelas)
            intent.putExtra("pesanan", "Bakso")
            intent.putExtra("harga", 10000)
            startActivity(intent)
        }
    }
}
