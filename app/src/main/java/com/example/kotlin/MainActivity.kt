package com.example.kotlin

import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private var clickCount = 0

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

        // Encontrar os TextViews, o Switch e o Button no layout
        val helloWorldTextView: TextView = findViewById(R.id.hello)
        val button: Button = findViewById(R.id.button)

        // Definir o texto inicial do TextView
        helloWorldTextView.text = "Você clicou: 0 vezes"

        // Configurar um listener para o Button
        button.setOnClickListener {
            clickCount++
            helloWorldTextView.text = "Você clicou: $clickCount vezes"
        }
    }
}
