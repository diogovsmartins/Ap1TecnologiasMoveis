package com.example.ap1riscocardaco

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonForNextPage=findViewById<Button>(R.id.nextPageButton1)
        buttonForNextPage.setOnClickListener{
           getValuesFromFirstPage()
        }
        
    }

    private fun getValuesFromFirstPage():String{
        val value=findViewById<EditText>(R.id.ageInput)
        return value.text.toString()
    }
}