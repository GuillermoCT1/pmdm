package com.example.fragment_guiado_emptyview

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import androidx.navigation.findNavController


class Onboarding1Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_onboarding1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //log para probar donde falla
        Log.d("Onboarding1Fragment", "onViewCreated ejecutado")
        val navController = view.findNavController()
        val botonSiguiente = view.findViewById<Button>(R.id.botonSiguiente)
        val botonSkip = view.findViewById<Button>(R.id.skip)
        botonSiguiente.setOnClickListener{
            Log.d("Onboarding1Fragment", "Botón pulsado")
            navController.navigate(R.id.action_onboarding1Fragment_to_onboarding2Fragment)
        }
        botonSkip.setOnClickListener{
            view.findNavController().navigate(R.id.action_onboarding1Fragment_to_homeFragment)
        }
    }

}