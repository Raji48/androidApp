package com.example.androidapp.views

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.androidapp.databinding.ActivitySecondFragmentBinding

class SecondFragment : Fragment() {
    private var secondFragmentBinding: ActivitySecondFragmentBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        secondFragmentBinding = ActivitySecondFragmentBinding.inflate(inflater, container, false)
        secondFragmentBinding!!.secondFragmentButton.setOnClickListener(){

        }
        return secondFragmentBinding!!.root //super.onCreateView(inflater, container, savedInstanceState)
    }
}