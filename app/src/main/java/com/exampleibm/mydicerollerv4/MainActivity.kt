package com.exampleibm.mydicerollerv4

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.exampleibm.mydicerollerv4.ui.main.MainFragment

class MainActivity : AppCompatActivity() {
    companion object{
        private const val TAG = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.i(TAG, "onCreate:")
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart Called")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop Called")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume Called")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause Called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "onRestart Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onStart Called")
    }
}