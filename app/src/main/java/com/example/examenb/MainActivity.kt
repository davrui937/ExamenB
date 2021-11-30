package com.example.examenb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.widget.doOnTextChanged
import com.example.examenb.databinding.ActivityMainBinding

private lateinit var binding : ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)


     binding.ed1.doOnTextChanged { text, start, before, count ->

        text?.let { safeText->
            var cont =0
            safeText.forEach {
                if(it == ' '){
                    cont++
                }
            }
            if(cont==4){
                binding.b1.visibility= View.VISIBLE}
            else{
                binding.b1.visibility= View.GONE
            }
        }
     }
    }
}