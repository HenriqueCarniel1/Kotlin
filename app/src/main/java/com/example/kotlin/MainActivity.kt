package com.example.kotlin

import android.os.Bundle
import android.widget.Switch
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Configuração para permitir o uso de "edge-to-edge"
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Encontrar o TextView e o Switch no layout
        val helloWorldTextView: TextView = findViewById(R.id.hello)
        val switch: Switch = findViewById(R.id.switch1)

        // Definir o texto inicial do TextView
        helloWorldTextView.text = "Hello World"

        // Configurar um listener para o Switch
        switch.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                helloWorldTextView.text = "Gustavo Henrique"
            } else {
                helloWorldTextView.text = "Hello World"
            }
        }
    }
}
