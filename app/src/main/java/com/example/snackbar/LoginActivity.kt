package com.example.snackbar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.login_body.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        btnLogin.setOnClickListener{
            callCadastro()
        }
    }

    //Chama a activity de cadastro
    fun callCadastro(){
        var intent = Intent(this, CadastroActivity::class.java)
        startActivity(intent)
    }
}