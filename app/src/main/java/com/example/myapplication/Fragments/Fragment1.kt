package com.example.myapplication.Fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.myapplication.R



class Fragment1 : Fragment(R.layout.fragment_first) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val sendButton = view.findViewById<Button>(R.id.buttonSend)
        val amountEditText = view.findViewById<EditText>(R.id.editTextAmound)

        val controller = Navigation.findNavController(view)

        sendButton.setOnClickListener {

            val amountText = amountEditText.text.toString()

            if (amountText.isEmpty() ){
                return@setOnClickListener
            }

            val action = Fragment1Directions.actionFragment1ToFragment2(amountText)
            controller.navigate(action)

        }
    }
}