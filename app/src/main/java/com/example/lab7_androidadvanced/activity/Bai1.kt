package com.example.lab7_androidadvanced.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.view.animation.TranslateAnimation
import com.example.lab7_androidadvanced.R
import com.example.lab7_androidadvanced.databinding.ActivityBai1Binding

class Bai1 : AppCompatActivity() {
    private lateinit var binding: ActivityBai1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBai1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        animate()
    }

    private fun animate() {
        binding.btnZoom.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.zoom)
            binding.imgBai1.startAnimation(animation)
        }

        binding.btnRotate.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.rotate)
            binding.imgBai1.startAnimation(animation)
        }

        binding.btnMove.setOnClickListener {
            val animation = TranslateAnimation(0f, 500f, 0f, 0f).apply {
                repeatCount = 1
                repeatMode = Animation.REVERSE
                duration = 3000
            }
            binding.imgBai1.startAnimation(animation)

            Handler(Looper.getMainLooper()).postDelayed({
                val reverseAnimation = TranslateAnimation(0f, -500f, 0f, 0f).apply {
                    repeatCount = 1
                    repeatMode = Animation.REVERSE
                    duration = 3000
                }
                binding.imgBai1.startAnimation(reverseAnimation)
            }, 6000)
        }
    }
}