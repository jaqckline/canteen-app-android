package com.example.canteenapp

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.jvm.java

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNama = findViewById<EditText>(R.id.inputNama)
        val etNim = findViewById<EditText>(R.id.inputNim)
        val spKelas = findViewById<Spinner>(R.id.spinnerKelas)
        val btnMasuk = findViewById<Button>(R.id.btnLogin)

        val kelas = arrayOf("2AEC1", "2AEC2", "2AEC3", "2AEC3")
        spKelas.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, kelas)

        btnMasuk.setOnClickListener {
            if (etNama.text.isEmpty() || etNim.text.isEmpty()) {
                Toast.makeText(this, "Data tidak boleh kosong", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, Menu::class.java)
                intent.putExtra("nama", etNama.text.toString())
                intent.putExtra("nim", etNim.text.toString())
                intent.putExtra("kelas", spKelas.selectedItem.toString())
                startActivity(intent)
            }
        }
    }
}