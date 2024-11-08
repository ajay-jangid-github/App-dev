package com.example.projectimage.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.projectimage.LipsActivity
import com.example.projectimage.ProfileActivity
import com.example.projectimage.databinding.FragmentSixBinding

class SoundFragment : Fragment() {

    private var _binding: FragmentSixBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSixBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.soundStrtBtn.setOnClickListener {
            startActivity(Intent(context, ProfileActivity::class.java))
        }
        binding.backArrow.setOnClickListener {
            val intent = Intent(context, LipsActivity::class.java)
            startActivity(intent)
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null // Clear references to the binding class to avoid memory leaks
    }
}