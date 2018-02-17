package com.gmail.piusanggoro.makanapa

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val daftarMakanan = arrayListOf("Angkringan", "Mie Jowo", "Bakso", "Penyetan", "Masak")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPutuskan.setOnClickListener {
            val random = Random()
            val randomFood = random.nextInt(daftarMakanan.count())
            txtMakanan.text = daftarMakanan[randomFood]
        }

        btnTambahMakanan.setOnClickListener {
            val newFood = txtMakananBaru.text.toString()
            daftarMakanan.add(newFood)
            txtMakananBaru.text.clear()
            //println(daftarMakanan)
        }
    }
}
