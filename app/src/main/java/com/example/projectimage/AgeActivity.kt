package com.example.projectimage

import android.app.DatePickerDialog
import android.content.Intent
import android.icu.util.Calendar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.example.projectimage.databinding.ActivityAgeBinding
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator
import java.util.Locale


class AgeActivity() : AppCompatActivity() {
    private val binding: ActivityAgeBinding by lazy {
        ActivityAgeBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        //Show the Hi data name
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.bdayBackArrow.setOnClickListener {
          /*  val intent = Intent(this, SelcategoryActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)*/

        }
        val navController = findNavController(R.id.nav_host_fragment)

        addIndicators()
        setupIndicater(navController)

        binding.bdayBackArrow.setOnClickListener {
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
        val count = 5
        val indicators = arrayOfNulls<ImageView>(count)
        for (i in 0 until count) {
            indicators[i] = ImageView(this)
            indicators[i]!!.background =
                ContextCompat.getDrawable(this@AgeActivity, R.drawable.active_dot)
            val params = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT
            )
            params.setMargins(8, 0, 8, 0)
            binding.indicatorLayout.addView(indicators[i], params)
        }
        indicators[0]!!.background =
            ContextCompat.getDrawable(this@AgeActivity, R.drawable.active_dot)
    }


    private fun updateIndicators(position: Int) {
        for (i in 0 until binding.indicatorLayout.childCount) {
            val imageView = binding.indicatorLayout.getChildAt(i) as ImageView
            if (i == position) {
                imageView.background =
                    ContextCompat.getDrawable(this@AgeActivity, R.drawable.non_active_dot)
            } else {
                imageView.background =
                    ContextCompat.getDrawable(this@AgeActivity, R.drawable.non_active_dot)
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
                else -> -1
            }
            if (index != -1) {
                updateIndicators(index)
            }
        }
    }

}


















