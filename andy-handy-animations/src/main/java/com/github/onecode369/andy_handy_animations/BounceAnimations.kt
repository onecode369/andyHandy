package com.github.onecode369.andy_handy_animations

import android.view.View
import android.view.animation.Animation
import android.view.animation.BounceInterpolator
import android.view.animation.TranslateAnimation

fun bounceInLeft(view: View, duration : Long = 2000, repeatCount : Int = 0) : Animation {
    view.visibility = View.VISIBLE
    val bounceIn: Animation = TranslateAnimation(
        Animation.RELATIVE_TO_PARENT, -1.0f, Animation.RELATIVE_TO_PARENT, 0.0f,
        Animation.RELATIVE_TO_PARENT, 0.0f, Animation.RELATIVE_TO_PARENT, 0.0f
    )
    bounceIn.interpolator = BounceInterpolator()
    bounceIn.duration = duration
    bounceIn.repeatCount = repeatCount
    view.startAnimation(bounceIn)
    return  view.animation
}

fun bounceInRight(view: View, duration : Long = 2000, repeatCount : Int = 0) : Animation {
    view.visibility = View.VISIBLE
    val bounceIn: Animation = TranslateAnimation(
        Animation.RELATIVE_TO_PARENT, 1.0f, Animation.RELATIVE_TO_PARENT, 0.0f,
        Animation.RELATIVE_TO_PARENT, 0.0f, Animation.RELATIVE_TO_PARENT, 0.0f
    )
    bounceIn.interpolator = BounceInterpolator()
    bounceIn.duration = duration
    bounceIn.repeatCount = repeatCount
    view.startAnimation(bounceIn)
    return  view.animation
}

fun bounceInTop(view: View, duration : Long = 2000, repeatCount : Int = 0) : Animation {
    view.visibility = View.VISIBLE
    val bounceIn: Animation = TranslateAnimation(
        Animation.RELATIVE_TO_PARENT, 0.0f, Animation.RELATIVE_TO_PARENT, 0.0f,
        Animation.RELATIVE_TO_PARENT, -1.0f, Animation.RELATIVE_TO_PARENT, 0.0f
    )
    bounceIn.interpolator = BounceInterpolator()
    bounceIn.duration = duration
    bounceIn.repeatCount = repeatCount
    view.startAnimation(bounceIn)
    return  view.animation
}

fun bounceInBottom(view: View, duration : Long = 2000, repeatCount : Int = 0) : Animation {
    view.visibility = View.VISIBLE
    val bounceIn: Animation = TranslateAnimation(
        Animation.RELATIVE_TO_PARENT, 0.0f, Animation.RELATIVE_TO_PARENT, 0.0f,
        Animation.RELATIVE_TO_PARENT, 1.0f, Animation.RELATIVE_TO_PARENT, 0.0f
    )
    bounceIn.interpolator = BounceInterpolator()
    bounceIn.duration = duration
    bounceIn.repeatCount = repeatCount
    view.startAnimation(bounceIn)
    return  view.animation
}