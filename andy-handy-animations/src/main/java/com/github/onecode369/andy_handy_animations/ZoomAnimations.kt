package com.github.onecode369.andy_handy_animations

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View
import android.view.animation.AccelerateInterpolator

fun zoomIn(view: View, duration : Long = 2000, repeatCount : Int = 0) : AnimatorSet {
    val anims = AnimatorSet();
    val sX = ObjectAnimator.ofFloat(view, View.SCALE_X, 0.0f, 1.0f)
    val sY = ObjectAnimator.ofFloat(view, View.SCALE_Y, 0.0f, 1.0f)
    sX.repeatCount = repeatCount
    sY.repeatCount = repeatCount
    anims.playTogether(sX, sY)
    anims.duration = duration
    anims.interpolator = AccelerateInterpolator()
    anims.start()
    return anims
}

fun zoomOut(view: View, duration : Long = 2000, repeatCount : Int = 0) : AnimatorSet{
    val anims = AnimatorSet();
    val sX = ObjectAnimator.ofFloat(view, View.SCALE_X, 1.0f, 0.0f)
    val sY = ObjectAnimator.ofFloat(view, View.SCALE_Y, 1.0f, 0.0f)
    sX.repeatCount = repeatCount
    sY.repeatCount = repeatCount
    anims.playTogether(sX, sY)
    anims.duration = duration
    anims.interpolator = AccelerateInterpolator()
    anims.start()
    return anims
}