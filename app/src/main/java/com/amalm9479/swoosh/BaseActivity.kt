package com.amalm9479.swoosh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

open class BaseActivity : AppCompatActivity() {

    val TAG ="LifeCycle"

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG,"${javaClass.simpleName}OnCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)
    }
    override fun onStart() {
        Log.d(TAG,"${javaClass.simpleName}OnCreate")
        super.onStart()
    }
    override fun onResume() {
        Log.d(TAG,"${javaClass.simpleName}onResume")
        super.onResume()
    }
    override fun onRestart() {
        Log.d(TAG,"${javaClass.simpleName}onRestart")
        super.onRestart()
    }
    override fun onPause() {
        Log.d(TAG,"${javaClass.simpleName}onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG,"${javaClass.simpleName}onStop")
        super.onStop()
    }
    override fun onDestroy() {
        Log.d(TAG,"${javaClass.simpleName}onDestroy")
        super.onDestroy()
    }
}