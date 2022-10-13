package com.indra.intentindra

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MoveWithDataActivity : AppCompatActivity() {
    private lateinit var tvDaraReceived: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_data)

        tvDaraReceived = findViewById(R.id.tv_data_received)
        Datareceived()
    }

    private fun Datareceived() {
        val bundle = intent.extras
        val nama = bundle?.getString("Nama")
        val alamat = bundle?.getString("Alamat")

        tvDaraReceived.text = nama + " " + alamat

    }
}