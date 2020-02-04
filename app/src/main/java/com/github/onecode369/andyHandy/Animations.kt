package com.github.onecode369.andyHandy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.github.onecode369.andy_handy_animations.*
import kotlinx.android.synthetic.main.activity_animations.*

class Animations : AppCompatActivity() {

    private val animationsArray = arrayOf("No animation","Slide In Left","Slide In Right","Slide In Top","Slide In Bottom","Slide Out Left","Slide Out Right","Slide Out Top","Slide Out Bottom", "Fade In","Fade Out")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animations)

        animations.onItemSelectedListener
        val adapter = ArrayAdapter(this,android.R.layout.simple_spinner_item,animationsArray)
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item)

        animations.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                when(position){
                    0 -> {}
                    1 -> slideInLeft(imageView)
                    2 -> slideInRight(imageView)
                    3 -> slideInTop(imageView)
                    4 -> slideInBottom(imageView)
                    5 -> slideOutLeft(imageView)
                    6 -> slideOutRight(imageView)
                    7 -> slideOutTop(imageView)
                    8 -> slideOutBottom(imageView)
                    9-> fadeIn(imageView)
                    10 -> fadeOut(imageView)
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                // Code to perform some action when nothing is selected
            }
        }

        animations.adapter = adapter
    }
}
