package com.app.snackbarlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.app.snackbar.SnackBarHelper

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initStatusBar()
        val view= window.decorView.findViewById<View>(android.R.id.content)

        val text=findViewById<TextView>(R.id.simpleEror)
        val text2=findViewById<TextView>(R.id.simpleSuccess)
        val text3=findViewById<TextView>(R.id.errorMsgIconTop)
        val text4=findViewById<TextView>(R.id.errorMsgIconBottom)
        val text5=findViewById<TextView>(R.id.errorMsgIconTopRTL)
        val text6=findViewById<TextView>(R.id.errorMsgIconBottomRTL)

        text.setOnClickListener {
            SnackBarHelper.showError(this,"Error Message")

        }
        text2.setOnClickListener {
            SnackBarHelper.successToast(this,"Success Message")
        }
        text3.setOnClickListener {
            SnackBarHelper.showErrorTopAlert(this, view,"Error Message","SnackBar",R.mipmap.ic_launcher)
        }
        text4.setOnClickListener {
            SnackBarHelper.showErrorBottomAlert(this, view,"Error Message","SnackBar",R.mipmap.ic_launcher)
        }
        text5.setOnClickListener {
            SnackBarHelper.showErrorTopAlertRTL(this, view,"Error Message","SnackBar",R.mipmap.ic_launcher)
        }
        text6.setOnClickListener {
            SnackBarHelper.showErrorBottomAlertRTL(this, view,"Error Message","SnackBar",R.mipmap.ic_launcher)
        }
    }

    private fun initStatusBar() {
        val decorView = window.decorView
        val uiOptions = (View.SYSTEM_UI_FLAG_FULLSCREEN or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN)
        decorView.systemUiVisibility = uiOptions
    }
}