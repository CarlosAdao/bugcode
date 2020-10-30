package com.example.snackbar.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.snackbar.R
import com.example.snackbar.domain.Gasto
import kotlinx.android.synthetic.main.fragment_gasto.view.*

class GastosFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater!!.inflate(R.layout.fragment_gasto, container, false)

        view.btnCadastrarGasto.setOnClickListener {
            showToast(getDataEdt(view))
        }

        return  view
    }

    companion object{
        fun newInstance() = GastosFragment()
    }

    //Captura os valores digitados nos campos
    fun getDataEdt(view: View): Gasto{
        val desc = view.edDescricao.text.toString()
        val cat = view.edCategoria.text.toString()
        val dtHr = view.edHora.text.toString()
        val valor = view.edValor.text.toString().toDouble()

        return Gasto(desc, cat, dtHr, valor)
    }

    fun showToast(gasto: Gasto){
        Toast.makeText(context, gasto.descricao, Toast.LENGTH_SHORT).show()
    }

}