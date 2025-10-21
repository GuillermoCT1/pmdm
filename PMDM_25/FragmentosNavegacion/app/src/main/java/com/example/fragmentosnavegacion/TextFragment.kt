package com.example.fragmentosnavegacion

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.findNavController

class TextFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_text, container, false)
        val text = view.findViewById<EditText>(R.id.edit_text).text
        val buttonNext = view.findViewById<Button>(R.id.btnNext)

        buttonNext.setOnClickListener {
            view.findNavController().navigate(TextFragmentDirections.actionTextFragmentToFinalFragment(text.toString()))
        }
        return view
    }
}