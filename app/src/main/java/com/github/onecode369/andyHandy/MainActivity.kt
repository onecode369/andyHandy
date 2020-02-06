package com.github.onecode369.andyHandy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.onecode369.andy_handy_commons.dialog.dialogBox
import com.github.onecode369.andy_handy_commons.dialog.snackbar
import com.github.onecode369.andy_handy_commons.dialog.toast
import com.github.onecode369.andy_handy_commons.intents.*
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
            snackbar(activity_main_root,"Hi")
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
            notification(124,"Andy","Andy test","Blah blah blah",
                "Andy Notification",R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground)
        }
        new_activity_btn.setOnClickListener {
            andyStartActivity(Animations())
        }
        browse_btn.setOnClickListener {
            browse("https://www.google.com")
        }
        share_btn.setOnClickListener {
            share("Hi Andy main","This is message from andy main","Choose to andy")
        }
        email_btn.setOnClickListener {
            email("example@gmail.com","Andy Main Test","andy main text emailing")
        }
        call_btn.setOnClickListener {
            makeCall("9999999999")
        }
        sms_btn.setOnClickListener {
            sendSMS("9999999999","From main andy")
        }
    }
}
