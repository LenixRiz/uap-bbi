package com.example.bbianak

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val hitungButton: Button = findViewById(R.id.hitungButton)
        hitungButton.setOnClickListener {
            hitungBeratBadanIdeal()
        }
    }

    fun hitungBeratBadanIdeal() {
        val editTextNama: EditText = findViewById(R.id.editTextNama)
        val editTextTahun: EditText = findViewById(R.id.editTextTahun)
        val editTextBulan: EditText = findViewById(R.id.editTextBulan)
        val textViewHasil: TextView = findViewById(R.id.textViewHasil)

        val namaAnak: String = editTextNama.text.toString()
        val tahun: Int = editTextTahun.text.toString().toInt()
        val bulan: Int = editTextBulan.text.toString().toInt()

        // Hitung berat badan ideal berdasarkan rumus tertentu
        val beratBadanIdeal: Double = hitungBeratBadanIdeal(tahun, bulan)

        // Tampilkan hasil di TextView
        val hasilPengiraan =
            "Ananda $namaAnak \nUsia $tahun Tahun, $bulan Bulan\nBerat Badan Ideal adalah $beratBadanIdeal KG"
        textViewHasil.text = hasilPengiraan
    }

    fun hitungBeratBadanIdeal(tahun: Int, bulan: Int): Double {
        // Implementasikan rumus berat badan ideal sesuai kebutuhan
        // Contoh sederhana: 10 + (0.5 * tahun) + (0.1 * bulan)
        //return 10 + (0.5 * tahun) + (0.1 * bulan)
        return (3 + (tahun * 2) + (bulan*0.17)).toDouble()
    }
}
