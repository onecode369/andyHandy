package com.github.onecode369.andy_handy_animations

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View

fun rotateZoomInX(view: View, duration : Long = 2000, repeatCount : Int = 0) : AnimatorSet {
    val sX = ObjectAnimator.ofFloat(view, View.ROTATION_X, -360f, 0f)
    val sY = ObjectAnimator.ofFloat(view,View.SCALE_X,0f,1f)
    val sZ = ObjectAnimator.ofFloat(view,View.SCALE_Y,0f,1f)
    sX.repeatCount = repeatCount
    sY.repeatCount = repeatCount
    sZ.repeatCount = repeatCount
    val anim = AnimatorSet()
    anim.playTogether(sX,sY,sZ)
    anim.duration = duration
    anim.start()
    return anim
}

fun rotateZoomInY(view: View, duration : Long = 2000, repeatCount : Int = 0) : AnimatorSet {
    val sX = ObjectAnimator.ofFloat(view, View.ROTATION_Y, -360f, 0f)
    val sY = ObjectAnimator.ofFloat(view,View.SCALE_X,0f,1f)
    val sZ = ObjectAnimator.ofFloat(view,View.SCALE_Y,0f,1f)
    sX.repeatCount = repeatCount
    sY.repeatCount = repeatCount
    sZ.repeatCount = repeatCount
    val anim = AnimatorSet()
    anim.playTogether(sX,sY,sZ)
    anim.duration = duration
    anim.start()
    return anim
}

fun rotateZoomInZ(view: View, duration : Long = 2000, repeatCount : Int = 0) : AnimatorSet {
    val sX = ObjectAnimator.ofFloat(view, View.ROTATION, -360f, 0f)
    val sY = ObjectAnimator.ofFloat(view,View.SCALE_X,0f,1f)
    val sZ = ObjectAnimator.ofFloat(view,View.SCALE_Y,0f,1f)
    sX.repeatCount = repeatCount
    sY.repeatCount = repeatCount
    sZ.repeatCount = repeatCount
    val anim = AnimatorSet()
    anim.playTogether(sX,sY,sZ)
    anim.duration = duration
    anim.start()
    return anim
}

fun rotateZoomOutX(view: View, duration : Long = 2000, repeatCount : Int = 0) : AnimatorSet {
    val sX = ObjectAnimator.ofFloat(view, View.ROTATION_X, -360f, 0f)
    val sY = ObjectAnimator.ofFloat(view,View.SCALE_X,1f,0f)
    val sZ = ObjectAnimator.ofFloat(view,View.SCALE_Y,1f,0f)
    sX.repeatCount = repeatCount
    sY.repeatCount = repeatCount
    sZ.repeatCount = repeatCount
    val anim = AnimatorSet()
    anim.playTogether(sX,sY,sZ)
    anim.duration = duration
    anim.start()
    return anim
}

fun rotateZoomOutY(view: View, duration : Long = 2000, repeatCount : Int = 0) : AnimatorSet{
    val sX = ObjectAnimator.ofFloat(view, View.ROTATION_Y, -360f, 0f)
    val sY = ObjectAnimator.ofFloat(view,View.SCALE_X,1f,0f)
    val sZ = ObjectAnimator.ofFloat(view,View.SCALE_Y,1f,0f)
    sX.repeatCount = repeatCount
    sY.repeatCount = repeatCount
    sZ.repeatCount = repeatCount
    val anim = AnimatorSet()
    anim.playTogether(sX,sY,sZ)
    anim.duration = duration
    anim.start()
    return anim
}

fun rotateZoomOutZ(view: View, duration : Long = 2000, repeatCount : Int = 0) : AnimatorSet {
    val sX = ObjectAnimator.ofFloat(view, View.ROTATION, -360f, 0f)
    val sY = ObjectAnimator.ofFloat(view,View.SCALE_X,1f,0f)
    val sZ = ObjectAnimator.ofFloat(view,View.SCALE_Y,1f,0f)
    sX.repeatCount = repeatCount
    sY.repeatCount = repeatCount
    sZ.repeatCount = repeatCount
    val anim = AnimatorSet()
    anim.playTogether(sX,sY,sZ)
    anim.duration = duration
    anim.start()
    return anim
}