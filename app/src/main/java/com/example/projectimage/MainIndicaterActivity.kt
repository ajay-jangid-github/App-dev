package com.example.projectimage

import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.example.projectimage.databinding.ActivityIndiMainBinding

class MainIndicaterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityIndiMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIndiMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val navController = findNavController(R.id.nav_host_fragment)

        addIndicators()
        setupIndicater(navController)

        binding.back.setOnClickListener {
            val currentDestinationId = navController.currentDestination?.id
            val startDestinationId = navController.graph.startDestinationId

            // Check if the current destination is the start destination
            if (currentDestinationId == startDestinationId) {
                // If it is, exit the app
                finish()
            } else {
                // Otherwise, navigate back to the previous fragment
                navController.navigateUp()
            }
        }
    }


    private fun addIndicators() {
        val count = 6
        val indicators = arrayOfNulls<ImageView>(count)
        for (i in 0 until count) {
            indicators[i] = ImageView(this)
            indicators[i]!!.background =
                ContextCompat.getDrawable(this@MainIndicaterActivity, R.drawable.non_active_dot)
            val params = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT
            )
            params.setMargins(8, 0, 8, 0)
            binding.indicatorLayout.addView(indicators[i], params)
        }
        indicators[0]!!.background =
            ContextCompat.getDrawable(this@MainIndicaterActivity, R.drawable.active_dot)
    }


    private fun updateIndicators(position: Int) {
        for (i in 0 until binding.indicatorLayout.childCount) {
            val imageView = binding.indicatorLayout.getChildAt(i) as ImageView
            if (i == position) {
                imageView.background =
                    ContextCompat.getDrawable(
                        this@MainIndicaterActivity,
                        R.drawable.active_dot
                    )
            } else {
                imageView.background =
                    ContextCompat.getDrawable(
                        this@MainIndicaterActivity,
                        R.drawable.non_active_dot
                    )
            }
        }
    }

    private fun setupIndicater(navController: NavController) {

        // Update the selected tab based on the current fragment
        navController.addOnDestinationChangedListener { _, destination, _ ->
            val index = when (destination.id) {
                R.id.firstFragment -> 0
                R.id.secondFragment -> 1
                R.id.thirdFragment -> 2
                R.id.fourthFragment -> 3
                R.id.fifthFragment -> 4
                R.id.sixFragment -> 5
                else -> -1
            }
            if (index != -1) {
                updateIndicators(index)
            }
        }
    }
}