package com.natanbrito.animatedapp

import android.os.Build
import android.os.Bundle
import android.transition.TransitionManager
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.content_main)
        setSupportActionBar(toolbar)
    }


    fun swapView(view: View) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            TransitionManager.beginDelayedTransition(layout)
        }
        placeholder.setContentId(view.id)
    }
}
