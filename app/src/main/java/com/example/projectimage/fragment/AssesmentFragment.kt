package com.example.projectimage.fragment

import android.content.ActivityNotFoundException
import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.projectimage.AssesmentActivity
import com.example.projectimage.R
import com.example.projectimage.databinding.FragmentFourthBinding

@Suppress("DEPRECATION")
class AssesmentFragment : Fragment() {
    private var CAMERA_REQUEST_CODE = 1
    private lateinit var imageView3:ImageView
    private var _binding: FragmentFourthBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFourthBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.assSubtBtn.setOnClickListener {
            findNavController().navigate(R.id.action_fourthFragment_to_fifthFragment)

        }

        binding.camImg.setOnClickListener {
            openCamera()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null // Clear references to the binding class to avoid memory leaks
    }
    private fun openCamera() {
        val openCameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        startActivity(openCameraIntent)
        try {
            startActivityForResult(openCameraIntent, CAMERA_REQUEST_CODE)
        } catch (e: ActivityNotFoundException) {
                Toast.makeText(this@AssesmentFragment.requireContext(),"Error,Camera is not working",Toast.LENGTH_LONG).show()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == com.example.projectimage.CAMERA_REQUEST_CODE && resultCode
            == AppCompatActivity.RESULT_OK) {
            val imageBitmap = data?.extras?.get("data") as Bitmap
            binding.imageView3.setImageBitmap(imageBitmap)
        }
    }

}