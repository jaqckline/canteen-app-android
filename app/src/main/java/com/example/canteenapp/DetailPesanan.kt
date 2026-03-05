package com.example.canteenapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class DetailPesanan : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_pesanan)

        // Ambil data dari intent
        val harga = intent.getIntExtra("harga", 0)

        // Ambil komponen dari XML (sesuai ID baru)
        val inputQty = findViewById<TextInputEditText>(R.id.inputQty)
        val textTotal = findViewById<EditText>(R.id.textTotal)
        val btnTotal = findViewById<Button>(R.id.btnLogin)

        btnTotal.setOnClickListener {

            val qtyString = inputQty.text.toString()

            if (qtyString.isNotEmpty()) {
                val qty = qtyString.toInt()
                val total = harga * qty

                textTotal.setText("Rp $total")
            } else {
                textTotal.setText("Isi jumlah dulu")
            }
        }
    }
}