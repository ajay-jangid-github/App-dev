package com.example.projectimage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.example.projectimage.databinding.ActivityLipsBinding
import com.example.projectimage.databinding.ActivityMainBinding
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    private lateinit var firebaseAuth: FirebaseAuth
    private val binding: ActivityMainBinding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)
        binding.signUpTxt.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
            finish()
        }
        firebaseAuth = FirebaseAuth.getInstance()
        binding.loginBtn.setOnClickListener {
            val username = binding.signEditText.text.toString()
            val password = binding.signEditPassword.text.toString()
            if(username.isNotEmpty() && password.isNotEmpty()){
                firebaseAuth.signInWithEmailAndPassword(username,password)
                    .addOnCompleteListener {
                        if(it.isSuccessful){
                          /*  val intent = Intent(this, MainIndicaterActivity::class.java)
                            startActivity(intent)
                            finish()*/
                        }else{
                            Toast.makeText(this, it.exception.toString(), Toast.LENGTH_LONG)
                        }
                    }
            }else{
                Toast.makeText(this, "Please fill the Field", Toast.LENGTH_LONG)
            }
        }

    }


}