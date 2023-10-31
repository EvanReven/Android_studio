package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val textView8 = findViewById<TextView>(R.id.textView8)


        button.setOnClickListener {
            // Ketika tombol diklik, ubah teks TextView
            textView8.text = "\"Hello, Yulius Evan Karunia-C2157201007" +
                    " Kamu Berhasil Membuat tugas ini"
        }

    }
}
