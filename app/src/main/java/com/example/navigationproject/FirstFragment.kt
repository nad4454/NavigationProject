package com.example.navigationproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import com.example.navigationproject.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button.setOnClickListener {

            val text = binding.editTextTextPersonName.text.toString()
            val bundle = bundleOf("name" to text)
            Navigation.findNavController(it).navigate(R.id.action_firstFragment_to_secondFragment, bundle)
        }

        binding.button2.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_firstFragment_to_second_graph)
        }

    }
}