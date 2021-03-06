package com.github.onecode369.andy_handy_commons.dialog

import android.content.Context
import android.content.DialogInterface

fun Context.dialogBox(
    title: String,
    message: String,
    cancelable: Boolean = false,
    positiveButton: String = "Ok",
    positiveButtonFun: () -> Unit = {},
    negativeButton: String = "",
    negativeButtonFun: () -> Unit = {}
) {
    val dialog = android.app.AlertDialog.Builder(this)
        .setTitle(title)
        .setMessage(message)
        .setPositiveButton(positiveButton) { _: DialogInterface, _: Int ->
            positiveButtonFun()
        }
    if (negativeButton.isNotEmpty())
        dialog.setNegativeButton(negativeButton) { _: DialogInterface, _: Int ->
            negativeButtonFun()
        }

    dialog.setCancelable(cancelable)
        .show()
}

fun Context.dialogBox(
    title: Int,
    message: Int,
    cancelable: Boolean = false,
    positiveButton: String = "Ok",
    positiveButtonFun: () -> Unit = {},
    negativeButton: String = "",
    negativeButtonFun: () -> Unit = {}
) {
    val dialog = android.app.AlertDialog.Builder(this)
        .setTitle(title)
        .setMessage(message)
        .setPositiveButton(positiveButton) { _: DialogInterface, _: Int ->
            positiveButtonFun()
        }
    if (negativeButton.isNotEmpty())
        dialog.setNegativeButton(negativeButton) { _: DialogInterface, _: Int ->
            negativeButtonFun()
        }

    dialog.setCancelable(cancelable)
        .show()
}

fun dialogBoxOther(
    context: Context,
    title: String,
    message: String,
    cancelable: Boolean = false,
    positiveButton: String = "Ok",
    positiveButtonFun: () -> Unit = {},
    negativeButton: String = "",
    negativeButtonFun: () -> Unit = {}
) {
    val dialog = android.app.AlertDialog.Builder(context)
        .setTitle(title)
        .setMessage(message)
        .setPositiveButton(positiveButton) { _: DialogInterface, _: Int ->
            positiveButtonFun()
        }
    if (negativeButton.isNotEmpty())
        dialog.setNegativeButton(negativeButton) { _: DialogInterface, _: Int ->
            negativeButtonFun()
        }

    dialog.setCancelable(cancelable)
        .show()
}

fun dialogBoxOther(
    context: Context,
    title: Int,
    message: Int,
    cancelable: Boolean = false,
    positiveButton: String = "Ok",
    positiveButtonFun: () -> Unit = {},
    negativeButton: String = "",
    negativeButtonFun: () -> Unit = {}
) {
    val dialog = android.app.AlertDialog.Builder(context)
        .setTitle(title)
        .setMessage(message)
        .setPositiveButton(positiveButton) { _: DialogInterface, _: Int ->
            positiveButtonFun()
        }
    if (negativeButton.isNotEmpty())
        dialog.setNegativeButton(negativeButton) { _: DialogInterface, _: Int ->
            negativeButtonFun()
        }

    dialog.setCancelable(cancelable)
        .show()
}