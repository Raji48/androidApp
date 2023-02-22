package com.example.androidapp.views

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.androidapp.databinding.ActivityFragmentBinding


class FragmentActivity : AppCompatActivity() {
  private lateinit  var fragmentBinding: ActivityFragmentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        fragmentBinding = ActivityFragmentBinding.inflate(layoutInflater)
        setContentView(fragmentBinding.root)
        fragmentBinding.apply {
            firstFragmentButton.setOnClickListener(){
                loadFragment(FirstFragment())
            }
            secondFragmentButton.setOnClickListener(){
                loadFragment(SecondFragment())
            }
        }
    }
    private fun loadFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(fragmentBinding.frameLayout.id, fragment)
        transaction.disallowAddToBackStack()
        transaction.commit()
    }
}