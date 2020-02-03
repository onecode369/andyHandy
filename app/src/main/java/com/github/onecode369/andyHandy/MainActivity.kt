package com.github.onecode369.andyHandy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.onecode369.andy_handy_commons.dialog.snackbar
import com.github.onecode369.andy_handy_commons.dialog.toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toast_btn.setOnClickListener {
            toast("Hi there!")
        }
        snackbar_btn.setOnClickListener {
            snackbar(activity_main_root,"hi","Ok",{finish()})
        }
    }
}
