package com.example.wearosgallery

import androidx.viewpager.widget.ViewPager
import android.app.Activity
import android.os.Bundle



class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager = findViewById<ViewPager>(R.id.vpMain)
        val adapter = GalleryAdapter(this, loadData())
        viewPager.setAdapter(adapter)
    }

}