package com.example.fragment_guiado_emptyview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController


class onboarding0Fragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_onboarding0, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val boton=view.findViewById<Button>(R.id.botonSiguiente)
        val skip = view.findViewById<Button>(R.id.skip)
        skip.setOnClickListener{view.findNavController().navigate(R.id.action_onboarding0Fragment_to_homeFragment)}
        boton.setOnClickListener{view.findNavController().navigate(R.id.action_onboarding0Fragment_to_onboarding1Fragment)}
    }
}