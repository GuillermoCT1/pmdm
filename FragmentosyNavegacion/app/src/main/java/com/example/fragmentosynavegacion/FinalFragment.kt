package com.example.fragmentosynavegacion

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class FinalFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val mensaje = FinalFragmentArgs.fromBundle(requireArguments()).texto
        val view = inflater.inflate(R.layout.fragment_final, container, false)
        view.findViewById<TextView>(R.id.textoFinal).text = mensaje
        return view
    }
}