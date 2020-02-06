@file:Suppress("UNCHECKED_CAST")

package com.github.onecode369.andy_handy_commons.others

import android.content.Context

// Inside Activity

fun Context.saveMyPreferences(preferenceName : String ,vararg savePreference :  Pair<String , Any?>){
        val sharedPref = getSharedPreferences(preferenceName,Context.MODE_PRIVATE)
    val editor = sharedPref.edit()
    for(pair in savePreference){
        when (pair.second) {
            is Int -> editor.putInt(pair.first,pair.second as Int)
            is Long -> editor.putLong(pair.first,pair.second as Long)
            is Float -> editor.putFloat(pair.first,pair.second as Float)
            is Boolean -> editor.putBoolean(pair.first,pair.second as Boolean)
            is String -> editor.putString(pair.first,pair.second as String)
            is Set<*> -> editor.putStringSet(pair.first,pair.second as Set<String>)
            else -> throw Exception("${pair.first} has value of wrong type")
        }
    }
    editor.apply()
}

fun Context.getStringPreference(preferenceName: String , key : String , defaultValue : String = "") : String {
    val sharedPref = getSharedPreferences(preferenceName,Context.MODE_PRIVATE)
    return sharedPref.getString(key,defaultValue)!!
}

fun Context.getIntPreference(preferenceName: String , key : String , defaultValue : Int = 0) : Int {
    val sharedPref = getSharedPreferences(preferenceName,Context.MODE_PRIVATE)
    return sharedPref.getInt(key,defaultValue)
}

fun Context.getLongPreference(preferenceName: String , key : String , defaultValue : Long = 0L) : Long {
    val sharedPref = getSharedPreferences(preferenceName,Context.MODE_PRIVATE)
    return sharedPref.getLong(key,defaultValue)
}

fun Context.getBooleanPreference(preferenceName: String , key : String , defaultValue : Boolean = false) : Boolean {
    val sharedPref = getSharedPreferences(preferenceName,Context.MODE_PRIVATE)
    return sharedPref.getBoolean(key,defaultValue)
}

fun Context.getFloatPreference(preferenceName: String , key : String , defaultValue : Float = 0f) : Float {
    val sharedPref = getSharedPreferences(preferenceName,Context.MODE_PRIVATE)
    return sharedPref.getFloat(key,defaultValue)
}

fun Context.getStringSetPreference(preferenceName: String , key : String , defaultValue : Set<String> = setOf()) : Set<String> {
    val sharedPref = getSharedPreferences(preferenceName,Context.MODE_PRIVATE)
    return sharedPref.getStringSet(key,defaultValue)!!
}

fun Context.getAllPreferences(preferenceName: String) : Map<String , Any?> {
    val sharedPref = getSharedPreferences(preferenceName,Context.MODE_PRIVATE)
    return  sharedPref.all
}

// Outside Activity

fun saveMyPreferencesOther(context: Context , preferenceName : String ,vararg savePreference :  Pair<String , Any?>){
    val sharedPref = context.getSharedPreferences(preferenceName,Context.MODE_PRIVATE)
    val editor = sharedPref.edit()
    for(pair in savePreference){
        when (pair.second) {
            is Int -> editor.putInt(pair.first,pair.second as Int)
            is Long -> editor.putLong(pair.first,pair.second as Long)
            is Float -> editor.putFloat(pair.first,pair.second as Float)
            is Boolean -> editor.putBoolean(pair.first,pair.second as Boolean)
            is String -> editor.putString(pair.first,pair.second as String)
            is Set<*> -> editor.putStringSet(pair.first,pair.second as Set<String>)
            else -> throw Exception("${pair.first} has value of wrong type")
        }
    }
    editor.apply()
}

fun getStringPreferenceOther(context: Context , preferenceName: String , key : String , defaultValue : String = "") : String {
    val sharedPref = context.getSharedPreferences(preferenceName,Context.MODE_PRIVATE)
    return sharedPref.getString(key,defaultValue)!!
}

fun getIntPreferenceOther(context: Context ,preferenceName: String , key : String , defaultValue : Int = 0) : Int {
    val sharedPref = context.getSharedPreferences(preferenceName,Context.MODE_PRIVATE)
    return sharedPref.getInt(key,defaultValue)
}

fun getLongPreferenceOther(context: Context ,preferenceName: String , key : String , defaultValue : Long = 0L) : Long {
    val sharedPref = context.getSharedPreferences(preferenceName,Context.MODE_PRIVATE)
    return sharedPref.getLong(key,defaultValue)
}

fun getBooleanPreferenceOther(context: Context ,preferenceName: String , key : String , defaultValue : Boolean = false) : Boolean {
    val sharedPref = context.getSharedPreferences(preferenceName,Context.MODE_PRIVATE)
    return sharedPref.getBoolean(key,defaultValue)
}

fun getFloatPreferenceOther(context: Context ,preferenceName: String , key : String , defaultValue : Float = 0f) : Float {
    val sharedPref = context.getSharedPreferences(preferenceName,Context.MODE_PRIVATE)
    return sharedPref.getFloat(key,defaultValue)
}

fun getStringSetPreferenceOther(context: Context ,preferenceName: String , key : String , defaultValue : Set<String> = setOf()) : Set<String> {
    val sharedPref = context.getSharedPreferences(preferenceName,Context.MODE_PRIVATE)
    return sharedPref.getStringSet(key,defaultValue)!!
}

fun getAllPreferencesOther(context: Context ,preferenceName: String) : Map<String , Any?> {
    val sharedPref = context.getSharedPreferences(preferenceName,Context.MODE_PRIVATE)
    return  sharedPref.all
}