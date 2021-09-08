package com.example.lab7_androidadvanced.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.*
import android.widget.ImageView
import com.example.lab7_androidadvanced.R
import com.example.lab7_androidadvanced.databinding.ActivityBai2Binding

class Bai2 : AppCompatActivity() {
    private lateinit var binding: ActivityBai2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBai2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        show()
    }

    private fun show() {
        binding.btnShowAll.setOnClickListener {
            showAll()
        }

        binding.btnShowDoraemon.setOnClickListener {
            showDoraemon()
        }

        binding.btnShowNobita.setOnClickListener {
            showNobita()
        }
    }

    private fun showAll() {
        binding.imgBai2.setImageResource(R.drawable.all)
        animate(binding.imgBai2)
    }

    private fun showNobita() {
        binding.imgBai2.setImageResource(R.drawable.nobita)
        animate(binding.imgBai2)
    }

    private fun showDoraemon() {
        binding.imgBai2.setImageResource(R.drawable.doraemon)
        animate(binding.imgBai2)

    }

    private fun animate(imageView:ImageView) {
        val animation = AnimationUtils.loadAnimation(this, R.anim.slide_show)
        imageView.startAnimation(animation)
    }
}