package com.github.onecode369.andy_handy_animations

import android.animation.ObjectAnimator
import android.view.View

fun rotate(view: View, fromDegree : Float = -360f , toDegree : Float = 0f , duration : Long = 2000, repeatCount : Int = 0) : ObjectAnimator {
    val rotate = ObjectAnimator.ofFloat(view, View.ROTATION, fromDegree, toDegree)
    rotate.duration = duration
    rotate.repeatCount = repeatCount
    rotate.start()
    return rotate
}

fun rotateX(view: View, fromDegree : Float = -360f , toDegree : Float = 0f , duration : Long = 2000, repeatCount : Int = 0) : ObjectAnimator {
    val rotate = ObjectAnimator.ofFloat(view,View.ROTATION_X,fromDegree,toDegree)
    rotate.duration = duration
    rotate.repeatCount = repeatCount
    rotate.start()
    return rotate
}

fun rotateY(view: View, fromDegree : Float = -360f , toDegree : Float = 0f , duration : Long = 2000, repeatCount : Int = 0) : ObjectAnimator {
    val rotate = ObjectAnimator.ofFloat(view,View.ROTATION_Y,fromDegree,toDegree)
    rotate.duration = duration
    rotate.repeatCount = repeatCount
    rotate.start()
    return rotate
}

fun rotateZ(view: View, fromDegree : Float = -360f , toDegree : Float = 0f , duration : Long = 2000, repeatCount : Int = 0) : ObjectAnimator {
    val rotate = ObjectAnimator.ofFloat(view,View.ROTATION,fromDegree,toDegree)
    rotate.duration = duration
    rotate.repeatCount = repeatCount
    rotate.start()
    return rotate
}