@file:Suppress("NOTHING_TO_INLINE", "unused")
package com.github.onecode369.andy_handy_commons.dialog

import android.view.View
import com.google.android.material.snackbar.Snackbar

// Length Short

fun snackbar(
    view: View,
    text: String,
    actionText: String = "",
    function: () -> Unit = {}
) {
    val snackbar = Snackbar.make(view, text, Snackbar.LENGTH_SHORT)
    if (actionText.isNotEmpty()) {
        snackbar.setAction(actionText) {
            function()
        }
    }
    snackbar.show()
}

fun snackbar(
    view: View,
    text: Int,
    actionText: String = "",
    function: () -> Unit = {}
) {
    val snackbar = Snackbar.make(view, text, Snackbar.LENGTH_SHORT)
    if (actionText.isNotEmpty()) {
        snackbar.setAction(actionText) {
            function()
        }
    }
    snackbar.show()
}

//Length Long

fun longSnackbar(
    view: View,
    text: String,
    actionText: String = "",
    function: () -> Unit = {}
) {
    val snackbar = Snackbar.make(view, text, Snackbar.LENGTH_LONG)
    if (actionText.isNotEmpty()) {
        snackbar.setAction(actionText) {
            function()
        }
    }
    snackbar.show()
}

fun longSnackbar(
    view: View,
    text: Int,
    actionText: String = "",
    function: () -> Unit = {}
) {
    val snackbar = Snackbar.make(view, text, Snackbar.LENGTH_LONG)
    if (actionText.isNotEmpty()) {
        snackbar.setAction(actionText) {
            function()
        }
    }
    snackbar.show()
}

//Length Indefinite

fun indefiniteSnackbar(
    view: View,
    text: String,
    actionText: String = "",
    function: () -> Unit = {}
) {
    val snackbar = Snackbar.make(view, text, Snackbar.LENGTH_INDEFINITE)
    if (actionText.isNotEmpty()) {
        snackbar.setAction(actionText) {
            function()
        }
    }
    snackbar.show()
}

fun indefiniteSnackbar(
    view: View,
    text: Int,
    actionText: String = "",
    function: () -> Unit = {}
) {
    val snackbar = Snackbar.make(view, text, Snackbar.LENGTH_INDEFINITE)
    if (actionText.isNotEmpty()) {
        snackbar.setAction(actionText) {
            function()
        }
    }
    snackbar.show()
}