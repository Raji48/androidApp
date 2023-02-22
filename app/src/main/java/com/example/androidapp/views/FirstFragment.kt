package com.example.androidapp.views

import android.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.androidapp.databinding.ActivityFirstFragmentBinding


class FirstFragment : Fragment() {
    private var firstFragmentBinding: ActivityFirstFragmentBinding? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        // inflate the layout and bind to the _binding
        firstFragmentBinding =  ActivityFirstFragmentBinding.inflate(inflater, container, false)

        // retrieve the entered data by the user
        firstFragmentBinding!!.firstFragmentButton.setOnClickListener {
                Toast.makeText(activity, "First Fragment", Toast.LENGTH_SHORT).show()
        }

        // Inflate the layout for this fragment
        return firstFragmentBinding!!.root
    }
}

