package com.example.projectimage.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.projectimage.R
import com.example.projectimage.databinding.FragmentThirdBinding

class ConfirmFragment : Fragment() {

    private var _binding: FragmentThirdBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentThirdBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.yesImg.setOnClickListener {
            findNavController().navigate(R.id.action_thirdFragment_to_fourthFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null // Clear references to the binding class to avoid memory leaks
    }
}