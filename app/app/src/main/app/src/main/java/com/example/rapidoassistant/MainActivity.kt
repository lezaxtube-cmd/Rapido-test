package com.example.rapidoassistant

import android.app.Activity
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER
        layout.setBackgroundColor(Color.parseColor("#F4F6FA"))
        layout.setPadding(48, 48, 48, 48)

        val title = TextView(this)
        title.text = "Rapido Ride Assistant"
        title.textSize = 26f
        title.setTypeface(null, Typeface.BOLD)
        title.setTextColor(Color.parseColor("#1A5DD8"))

        val status = TextView(this)
        status.text = "Stage 1: app build ho gaya.\nAssistant abhi OFF hai."
        status.textSize = 16f
        status.setTextColor(Color.DKGRAY)
        status.setPadding(0, 24, 0, 0)

        layout.addView(title)
        layout.addView(status)
        setContentView(layout)
    }
}
