package com.example.fragment8

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragment8.databinding.FragmentBlankBinding

class BlankFragment : Fragment() {
    lateinit var binding: FragmentBlankBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBlankBinding.inflate(layoutInflater)

        binding.ekran.background = Color.color

        binding.edittext.setOnClickListener {
            val blankFragment = BlankFragment2()
            val fragmentManager = parentFragmentManager
            val transaction = fragmentManager.beginTransaction()
            transaction.replace(R.id.mainContainer, blankFragment)
            transaction.commit()
        }

        return binding.root
    }
}