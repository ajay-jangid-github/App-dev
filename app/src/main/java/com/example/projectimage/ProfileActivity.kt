package com.example.projectimage

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import com.example.projectimage.databinding.ActivityMainBinding
import com.example.projectimage.databinding.ActivityProfileBinding
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.ktx.Firebase

class ProfileActivity : AppCompatActivity() {
    lateinit var profile_picker:ImageView
    lateinit var profile_picker_img:ImageView
    private lateinit var firebaseAuth: FirebaseAuth
    private var auth: FirebaseAuth = FirebaseAuth.getInstance()
   private val binding: ActivityProfileBinding by lazy{
       ActivityProfileBinding.inflate(layoutInflater)
   }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        firebaseAuth = FirebaseAuth.getInstance()
        binding.profileSaveBtn.setOnClickListener {
            val username = binding.username1.text.toString()
            val password = binding.password1.text.toString()
            if(username.isNotEmpty() && password.isNotEmpty()){
                    firebaseAuth.createUserWithEmailAndPassword(username,password)
                        .addOnCompleteListener {
                            if(it.isSuccessful){
                                val intent = Intent(this, SubscriptionActivity::class.java)
                                startActivity(intent)
                            }else{
                                Toast.makeText(this, "Please enter correct details", Toast.LENGTH_LONG).show()
                            }
                        }
            }else{
            Toast.makeText(this, "Please fill the Field", Toast.LENGTH_LONG).show()
            }
        }

        binding.profileBackArrow.setOnClickListener {
            finish()
        }
        binding.profilePickerImg.setOnClickListener {
                val pickImg = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI)
                changeImage.launch(pickImg)
            }

    }
    private val changeImage =
        registerForActivityResult(
            ActivityResultContracts.StartActivityForResult()
        ) {
            if (it.resultCode == Activity.RESULT_OK) {
                val data = it.data
                val imgUri = data?.data
                binding.profilePickerImg.setImageURI(imgUri)
            }
        }




}