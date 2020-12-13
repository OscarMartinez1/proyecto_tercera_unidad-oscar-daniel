package com.example.android.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.android.navigation.databinding.FragmentTituloBinding


class TituloFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val binding : FragmentTituloBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_titulo, container, false)


        binding.jugarButton.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_tituloFragment_to_juegoFragment))


        // Inflate the layout for this fragment
        return binding.root
    }


}