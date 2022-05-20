package com.qhy040404.getapilevel

import android.os.Bundle
import android.os.Looper
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
    }

    private fun initView() {
        Thread(get()).start()
    }

    private inner class get : Runnable {
        override fun run() {
            Looper.prepare()

            val textView: TextView = findViewById(R.id.ApiTextView)
            textView.text = android.os.Build.VERSION.SDK_INT.toString()
        }
    }
}