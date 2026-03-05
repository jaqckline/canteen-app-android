package com.example.canteenapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import java.text.NumberFormat
import java.util.Locale

class DetailPesanan : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_pesanan)

        val nama = intent.getStringExtra("nama")
        val nim = intent.getStringExtra("nim")
        val kelas = intent.getStringExtra("kelas")
        val pesanan = intent.getStringExtra("pesanan")
        val harga = intent.getIntExtra("harga", 0)

        val textNama = findViewById<EditText>(R.id.textNama)
        val textNim = findViewById<EditText>(R.id.textNim)
        val textKelas = findViewById<EditText>(R.id.textKelas)
        val textPesanan = findViewById<EditText>(R.id.textPesanan)

        textNama.setText(nama)
        textNim.setText(nim)
        textKelas.setText(kelas)
        textPesanan.setText(pesanan)

        val inputQty = findViewById<TextInputEditText>(R.id.inputQty)
        val textTotal = findViewById<EditText>(R.id.textTotal)
        val btnTotal = findViewById<Button>(R.id.btnLogin)

        btnTotal.setOnClickListener {
            val qtyString = inputQty.text.toString()

            if (qtyString.isNotEmpty()) {
                val qty = qtyString.toInt()
                val formatRupiah = NumberFormat.getCurrencyInstance(Locale("in", "ID"))

                val total = formatRupiah.format(harga * qty)
                textTotal.setText(total)
            } else {
                textTotal.setText("Mohon isi kuantitas (Qty)")
            }
        }
    }
}