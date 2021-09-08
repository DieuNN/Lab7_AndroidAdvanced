package com.example.lab7_androidadvanced.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageView
import com.example.lab7_androidadvanced.R
import com.example.lab7_androidadvanced.databinding.ActivityBai3Binding

class Bai3 : AppCompatActivity() {
    private lateinit var binding: ActivityBai3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBai3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set anim for hour
        setAnimate(binding.imgHour, R.anim.hour)

        //set anim for minute
        setAnimate(binding.imgMinute, R.anim.minute)

        //set anim for sec
        setAnimate(binding.imgSecond, R.anim.second)
    }

    private fun setAnimate(imageView:ImageView, animateID:Int) {
        val animation = AnimationUtils.loadAnimation(this, animateID)
        imageView.startAnimation(animation)
    }


}