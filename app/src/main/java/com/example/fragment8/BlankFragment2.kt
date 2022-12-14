package com.example.fragment8

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragment8.databinding.FragmentBlank2Binding


class BlankFragment2 : Fragment() {
    lateinit var binding: FragmentBlank2Binding

    @SuppressLint("ResourceType")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBlank2Binding.inflate(layoutInflater)


        binding.img1.setOnClickListener {
            Color.color = binding.img1.background
        }

        binding.img2.setOnClickListener {
            Color.color = binding.img2.background
        }

        binding.img3.setOnClickListener {
            Color.color = binding.img3.background
        }

        binding.img4.setOnClickListener {
            Color.color = binding.img4.background
        }

        binding.img5.setOnClickListener {
            Color.color = binding.img5.background
        }

        binding.img6.setOnClickListener {
            Color.color = binding.img6.background
        }

        binding.img7.setOnClickListener {
            Color.color = binding.img7.background
        }

        binding.img8.setOnClickListener {
            Color.color = binding.img8.background
        }

        binding.img9.setOnClickListener {
            Color.color = binding.img9.background
        }
        binding.img10.setOnClickListener {
            Color.color = binding.img10.background
        }
        binding.img11.setOnClickListener {
            Color.color = binding.img11.background
        }
        binding.img12.setOnClickListener {
            Color.color = binding.img12.background
        }



        binding.btnSetcolor.setOnClickListener {
            val blankFragment = BlankFragment()
            val fragmentManager = parentFragmentManager
            val transaction = fragmentManager.beginTransaction()
            transaction.replace(R.id.mainContainer, blankFragment)
            transaction.commit()
        }

        return binding.root


    }


}
