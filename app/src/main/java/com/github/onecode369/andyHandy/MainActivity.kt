package com.github.onecode369.andyHandy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.onecode369.andy_handy_commons.dialog.dialogBox
import com.github.onecode369.andy_handy_commons.dialog.snackbar
import com.github.onecode369.andy_handy_commons.dialog.toast
import com.github.onecode369.andy_handy_commons.intents.ankoStartActivity
import com.github.onecode369.andy_handy_commons.notifications.notification
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
        dialog_btn.setOnClickListener {
            dialogBox("title", "message",
                true,"Yes", {
                    finish()
                },
                "No",{
                    finish()
                })
        }
        notify_btn.setOnClickListener {
            notification(124,"Anko","Anko test","Blah blah blah","Anko Notification",R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground)
        }
        new_activity_btn.setOnClickListener {
            ankoStartActivity(MainActivity(),true,Pair("Check1","Checked"))
        }
    }
}
