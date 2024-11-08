package com.example.projectimage.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.projectimage.R
import com.example.projectimage.SoundActivity
import com.example.projectimage.databinding.FragmentFifthBinding

class LispFragment : Fragment() {

    private var _binding: FragmentFifthBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFifthBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.lispsContBtn.setOnClickListener {
            findNavController().navigate(R.id.action_fifthFragment_to_sixFragment)
        }
        binding.lispNextArrow.setOnClickListener {
            val intent = Intent(context, SoundActivity::class.java)
            startActivity(intent)
            onDestroy()
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null // Clear references to the binding class to avoid memory leaks
    }
}