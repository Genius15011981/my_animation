package com.example.myanimation

import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myanimation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.alphaBtn.setOnClickListener(){
            val animation=AnimationUtils.loadAnimation(this, R.anim.alpha_anim)
            binding.imageView.startAnimation(animation)

         binding.rotateBtn.setOnClickListener(){
             val animation=AnimationUtils.loadAnimation(this, R.anim.rotate_anim)
             binding.imageView.startAnimation(animation)
         }
        }
        binding.scaleBtn.setOnClickListener(){
            val animation=AnimationUtils.loadAnimation(this, R.anim.scale_anim)
            binding.imageView.startAnimation(animation)
        }

        binding.rotateBtn.setOnClickListener(){
            val animation=AnimationUtils.loadAnimation(this, R.anim.rotate_anim)
            binding.imageView.startAnimation(animation)
        }

        binding.translBtn.setOnClickListener(){
            val animation=AnimationUtils.loadAnimation(this, R.anim.translate_anim)
            binding.imageView.startAnimation(animation)
        }

    }
}
