package com.github.onecode369.andy_handy_commons.notifications

import android.app.Activity
import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.graphics.BitmapFactory
import android.graphics.Color
import android.os.Build

fun Context.notification(uniqueId : Int ,channelId : String,contentTitle : String,contentText : String,description : String,smallIcon : Int,largeIcon : Int){
    lateinit var notificationChannel : NotificationChannel
    lateinit var builder : Notification.Builder

    val notificationManager : NotificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        notificationChannel = NotificationChannel(channelId,description,NotificationManager.IMPORTANCE_HIGH)
        notificationChannel.enableLights(true)
        notificationChannel.lightColor = Color.GREEN
        notificationChannel.enableVibration(false)
        notificationManager.createNotificationChannel(notificationChannel)

        builder = Notification.Builder(this,channelId)
            .setContentTitle(contentTitle)
            .setContentText(contentText)
            .setSmallIcon(smallIcon)
            .setLargeIcon(BitmapFactory.decodeResource(this.resources,largeIcon))
    }else{

        builder = Notification.Builder(this)
            .setContentTitle(contentTitle)
            .setContentText(contentText)
            .setSmallIcon(smallIcon)
            .setLargeIcon(BitmapFactory.decodeResource(this.resources,largeIcon))
    }
    notificationManager.notify(uniqueId,builder.build())
}

fun notificationOther(context: Context , uniqueId : Int ,channelId : String,contentTitle : String,contentText : String,description : String,smallIcon : Int,largeIcon : Int){
    lateinit var notificationChannel : NotificationChannel
    lateinit var builder : Notification.Builder
    val notificationManager : NotificationManager =  context.getSystemService(Activity.NOTIFICATION_SERVICE) as NotificationManager

    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        notificationChannel = NotificationChannel(channelId,description,NotificationManager.IMPORTANCE_HIGH)
        notificationChannel.enableLights(true)
        notificationChannel.lightColor = Color.GREEN
        notificationChannel.enableVibration(false)
        notificationManager.createNotificationChannel(notificationChannel)

        builder = Notification.Builder(context,channelId)
            .setContentTitle(contentTitle)
            .setContentText(contentText)
            .setSmallIcon(smallIcon)
            .setLargeIcon(BitmapFactory.decodeResource(context.resources,largeIcon))
    }else{

        builder = Notification.Builder(context)
            .setContentTitle(contentTitle)
            .setContentText(contentText)
            .setSmallIcon(smallIcon)
            .setLargeIcon(BitmapFactory.decodeResource(context.resources,largeIcon))
    }
    notificationManager.notify(uniqueId,builder.build())
}