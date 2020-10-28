package com.example.snackbar.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.snackbar.R
import kotlinx.android.synthetic.main.fragment_gasto.view.*
import kotlinx.android.synthetic.main.fragment_home.view.*

class GastosFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view: View = inflater!!.inflate(R.layout.fragment_gasto, container, false)

        var msg = "Olá mundo cruel"
        view.edDescricao.setText(msg)

        return  view
    }

    companion object{
        fun newInstance() = GastosFragment()
    }
}