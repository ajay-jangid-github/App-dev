package com.example.projectimage.fragment

import android.app.DatePickerDialog
import android.icu.util.Calendar
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.projectimage.R
import com.example.projectimage.databinding.FragmentSecondBinding
import java.text.SimpleDateFormat
import java.util.Locale

class AgeFragment : Fragment() {
    private var calendar:Calendar = Calendar.getInstance()
    private lateinit var brthTxt: TextView
    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.birthbtn.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment_to_thirdFragment)
        }
        binding.brthTxt.setOnClickListener {
            showDatePicker()
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null // Clear references to the binding class to avoid memory leaks
    }
    private fun showDatePicker() {
        val datePickerDialog = view?.let {
            DatePickerDialog(
                it.context,
                { DatePicker, year: Int, monthOfYear: Int, dayOfMonth: Int ->
                    val selectedDate = Calendar.getInstance()
                    selectedDate.set(year,monthOfYear,dayOfMonth)
                    val dateFormat = SimpleDateFormat("dd-MM-yyy", Locale.getDefault())
                    val formattedDate = dateFormat.format(selectedDate.time)
                    binding.brthTxt.text = formattedDate
                },
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH)
            )
        }
        datePickerDialog?.show()
    }

}