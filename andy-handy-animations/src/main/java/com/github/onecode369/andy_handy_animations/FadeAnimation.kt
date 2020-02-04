package com.github.onecode369.andy_handy_animations

import android.animation.ObjectAnimator
import android.view.View

fun fadeIn(view: View, duration : Long = 2000, repeatCount : Int = 0) : ObjectAnimator {
    view.visibility = View.VISIBLE
    val fadeIn = ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f, 1.0f)
    fadeIn.duration = duration
    fadeIn.repeatCount = repeatCount
    fadeIn.start()
    return  fadeIn
}

fun fadeOut(view: View, duration : Long = 2000, repeatCount : Int = 0) : ObjectAnimator {
    view.visibility = View.VISIBLE
    val fadeOut = ObjectAnimator.ofFloat(view, View.ALPHA, 1.0f, 0.0f)
    fadeOut.duration = duration
    fadeOut.repeatCount = repeatCount
    fadeOut.start()
    return  fadeOut
}