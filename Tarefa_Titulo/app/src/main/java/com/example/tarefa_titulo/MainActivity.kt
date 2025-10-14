package com.example.tarefa_titulo

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val texto = findViewById<TextView>(R.id.texto)
        var lista1=listOf("O misterio de","A vinganza do", "O último baile para")
        var lista2=listOf("o robot perdido","a illa esquecida", "o dragón de xeo")
        var lista3=listOf("no verán do 87", "antes damedianoite", "sen volta atrás")
        var lista4= mutableListOf("","","")
//        for (i in 1..3){
//            lista4[0]=lista1[Random.nextInt(1,4)]
//            lista4[1]=lista2[Random.nextInt(1,4)]
//            lista4[2]=lista3[Random.nextInt(1,4)]
//        }
       // return inflater.inflate(R.layout.activity_main, texto)
    }
}