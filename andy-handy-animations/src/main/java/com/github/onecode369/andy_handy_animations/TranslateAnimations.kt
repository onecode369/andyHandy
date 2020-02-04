package com.github.onecode369.andy_handy_animations

import android.animation.ObjectAnimator
import android.view.View

fun translateX( view: View, duration : Long = 2000, repeatCount : Int = 0, fromX : Float = -250f , toX : Float = 0f ) : ObjectAnimator {
    val translate = ObjectAnimator.ofFloat(view,View.TRANSLATION_X,fromX,toX)
    translate.duration = duration
    translate.repeatCount = repeatCount
    translate.start()
    return translate
}

fun translateY( view: View, duration : Long = 2000, repeatCount : Int = 0, fromY : Float = -250f , toY : Float = 0f ) : ObjectAnimator {
    val translate = ObjectAnimator.ofFloat(view,View.TRANSLATION_Y,fromY,toY)
    translate.duration = duration
    translate.repeatCount = repeatCount
    translate.start()
    return translate
}