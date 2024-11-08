package com.example.projectimage

import android.app.Activity
import android.content.ActivityNotFoundException
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.ImageView
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.app.ActivityCompat.startActivityForResult
import androidx.core.content.ContextCompat
import com.example.projectimage.databinding.ActivityAssesmentBinding


@Suppress("DEPRECATION")
lateinit var cam_img: ImageView
lateinit var imageView3: ImageView
var CAMERA_REQUEST_CODE = 100
@Suppress("DEPRECATION", "DEPRECATED_IDENTITY_EQUALS")
class AssesmentActivity : AppCompatActivity() {
    lateinit var imageView3:ImageView
    private val binding: ActivityAssesmentBinding by lazy {
        ActivityAssesmentBinding.inflate(layoutInflater)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.assSubtBtn.setOnClickListener {
            val intent = Intent(this, LipsActivity::class.java)
            startActivity(intent)
        }

        binding.vidassBackArrow.setOnClickListener {
            val intent = Intent(this, ConfirmationActivity::class.java)
            startActivity(intent)
        }


    }


    }

