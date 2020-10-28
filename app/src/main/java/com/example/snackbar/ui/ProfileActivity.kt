package com.example.snackbar.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.snackbar.R

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        //Obtém os valores que foram passados pelo bundle
        val bundle :Bundle ?=intent.extras
        if (bundle != null){
            val nome = bundle.getString("nome")
            val peso = bundle.getDouble("peso")
            val idade = bundle.getInt("idade")
            val titular = bundle.getBoolean("titular")

            Toast.makeText(this, bundle.toString(), Toast.LENGTH_SHORT).show()
        }
    }
}