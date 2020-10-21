package com.example.snackbar.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.snackbar.R
import com.example.snackbar.domain.Usuario
import kotlinx.android.synthetic.main.login_body.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        btnLogin.setOnClickListener{

            callCadastro(getInformationUser())
        }
    }
    //Pega as informações do usuario
    fun getInformationUser(): Usuario{
        val username = edUserName.text.toString()
        val senha = edPassword.text.toString()

        return Usuario(1, username, senha)
    }

    //Chama a activity de cadastro
    fun callCadastro(usuario: Usuario){
        var intent = Intent(this, MainActivity::class.java)
        intent.putExtra("key", usuario)
        startActivity(intent)
    }
}