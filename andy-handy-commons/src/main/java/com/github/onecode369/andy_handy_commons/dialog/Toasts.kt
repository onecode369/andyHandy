@file:Suppress("NOTHING_TO_INLINE", "unused")
package com.github.onecode369.andy_handy_commons.dialog

import android.content.Context
import android.widget.Toast

// Short Length Application Toast

inline fun Context.toast(message: Int): Toast = Toast
    .makeText(this, message, Toast.LENGTH_SHORT)
    .apply {
        show()
    }

inline fun Context.toast(message: CharSequence): Toast = Toast
    .makeText(this, message, Toast.LENGTH_SHORT)
    .apply {
        show()
    }

// Long Length Application Toast

inline fun Context.longToast(message: Int): Toast = Toast
    .makeText(this, message, Toast.LENGTH_LONG)
    .apply {
        show()
    }

inline fun Context.longToast(message: CharSequence): Toast = Toast
    .makeText(this, message, Toast.LENGTH_LONG)
    .apply {
        show()
    }


// Short Length Fragment Toast

inline fun toastOther(context: Context, message: Int): Toast = Toast
    .makeText(context, message, Toast.LENGTH_SHORT)
    .apply {
        show()
    }

inline fun toastOther(context: Context ,message: CharSequence): Toast = Toast
    .makeText(context, message, Toast.LENGTH_SHORT)
    .apply {
        show()
    }

// Long Length Toast

inline fun longToastOther(context: Context ,message: Int): Toast = Toast
    .makeText(context, message, Toast.LENGTH_LONG)
    .apply {
        show()
    }

inline fun longToastOther(context: Context ,message: CharSequence): Toast = Toast
    .makeText(context, message, Toast.LENGTH_LONG)
    .apply {
        show()
    }
