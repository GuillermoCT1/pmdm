package com.example.ud01_1_

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

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
        val btnFind = findViewById<Button> (R.id.btnFind)
        btnFind.setOnClickListener {
            val spinner = findViewById<Spinner>(R.id.btnFind)
            val listAnimal = findViewById<TextView>(R.id.list_Animal)
            listAnimal.text = getListAnimals(spinner.selectedItemId).joinToString(" ")
            //spinner.selectedItem
        }
    }
    fun getListAnimals(id:Long) : List<String> = when(id){
        0L -> listOf("Pastor aleman","Bulldog","Caniche")
        1L -> listOf("Siamés","Persa","Siberiano")
        2L -> listOf("loro","periquito","cacatua")
        else -> listOf()
    }


}