package com.github.onecode369.andyHandy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.github.onecode369.andy_handy_animations.*
import kotlinx.android.synthetic.main.activity_animations.*

class Animations : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animations)

        val animationsArray = arrayOf("No animation","Slide In Left","Slide In Right","Slide In Top","Slide In Bottom",
            "Slide Out Left","Slide Out Right","Slide Out Top","Slide Out Bottom", "Fade In","Fade Out","Zoom In","Zoom Out",
            "Rotate","Rotate X","Rotate Y","Rotate Z","Translate X","Translate Y",
            "Bounce In Left","Bounce In Right","Bounce In Top","Bounce In Bottom","Rotate Zoom In X","Rotate Zoom In Y","Rotate Zoom In Z",
            "Rotate Zoom Out X","Rotate Zoom Out Y","Rotate Zoom Out Z","")

        animations.onItemSelectedListener
        val adapter = ArrayAdapter(this,android.R.layout.simple_spinner_item,animationsArray)
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item)

        animations.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View? , position: Int, id: Long) {
                when(position){
                    0 -> rotate(imageView,0f,0f)
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
                    11 -> zoomIn(imageView)
                    12 -> zoomOut(imageView)
                    13 -> rotate(imageView)
                    14 -> rotateX(imageView)
                    15 -> rotateY(imageView)
                    16 -> rotateZ(imageView)
                    17 -> translateX(imageView)
                    18 -> translateY(imageView)
                    19 -> bounceInLeft(imageView)
                    20 -> bounceInRight(imageView)
                    21 -> bounceInTop(imageView)
                    22 -> bounceInBottom(imageView)
                    23 -> rotateZoomInX(imageView)
                    24 -> rotateZoomInY(imageView)
                    25 -> rotateZoomInZ(imageView)
                    26 -> rotateZoomOutX(imageView)
                    27 -> rotateZoomOutY(imageView)
                    28 -> rotateZoomOutZ(imageView)
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                rotate(imageView)
            }
        }

        animations.adapter = adapter
    }
}
