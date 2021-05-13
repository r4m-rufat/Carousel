package com.codingwithrufat.corouselview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.synnapps.carouselview.CarouselView

class MainActivity : AppCompatActivity() {

    private lateinit var carouselView: CarouselView
    var sampleImages = arrayOf(R.drawable.picture_1, R.drawable.picture_2,
    R.drawable.picture_3, R.drawable.picture_4, R.drawable.picture_5)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        carouselView = findViewById(R.id.carouselView)

        carouselView.pageCount = sampleImages.size

        carouselView.setImageListener { position, imageView ->
            imageView.setImageResource(sampleImages[position])
        }

    }


}