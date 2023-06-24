package com.ali.mybindingdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ali.mybindingdata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var mainBinding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = mainBinding.root
        setContentView(view)



        mainBinding.buttonOk.setOnClickListener {
            mainBinding.textViewResult.text = mainBinding.editTextEntery.text
        }
    }
}