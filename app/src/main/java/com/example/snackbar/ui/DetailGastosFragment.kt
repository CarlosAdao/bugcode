package com.example.snackbar.ui

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.snackbar.R
import kotlinx.android.synthetic.main.fragment_detail_gastos.view.*
import kotlinx.android.synthetic.main.fragment_home.view.*

class DetailGastosFragment : Fragment() {
    private var msg = 1

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater!!.inflate(R.layout.fragment_detail_gastos, container, false)
        view.tvTitleDetailGastos.text = msg.toString()

        return  view
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
            arguments?.getInt("key")?.let {
                msg = it
        }
    }

    companion object{
        @JvmStatic
        fun newInstance(msg: Int) = DetailGastosFragment().apply {
            arguments = Bundle().apply {
                putInt("key", msg)
            }
        }
    }
}