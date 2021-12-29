package com.example.databindingconcepts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databindingconcepts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        val post=MyData("CEDCOSS TECHNOLOGIES","Define your digital transformation with best-in-class solutions to lead all across the globe! Bring out the best in you with the best we have ","" +
                "https://cedcoss.com/assets/images/id-2018/1.jpg")
        binding.post=post





    }
}