package com.example.androidapp.views

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.appcompat.app.AppCompatActivity
import com.example.androidapp.databinding.ActivityLoginBinding


class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_login)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            button.setOnClickListener(){
//               print( userName.editText);
//                var inputValue: String? = null
//                if(inputValue == null){
//                    println("username null");
//                }else{
//                    inputValue = userName.addTextChangedListener(object: TextWatcher {
//                        override fun beforeTextChanged(
//                            p0: CharSequence?,
//                            p1: Int,
//                            p2: Int,
//                            p3: Int,
//                        ) {
//                            return
//                        }
//
//                        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
//                              return
//                        }
//
//                        override fun afterTextChanged(p0: Editable?) {
//                            inputValue = p0.toString();
//                        }
//
//                    }).toString()
//                    print("=====");
//                    println(inputValue);
//                }
                val i = Intent(applicationContext, FragmentActivity::class.java)
                startActivity(i)
            }
        }

//        button.setOnClickListener(){
//          val inputValue: String = binding.userName.editText.toString()
//          if(inputValue == null){
//              println("username null");
//          }else{
//              print(inputValue);
//          }
//      }
    }
}
