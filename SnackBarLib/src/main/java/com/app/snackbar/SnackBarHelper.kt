package com.app.snackbar

import android.app.Activity
import android.content.Context
import android.content.res.Resources
import android.os.Build
import android.os.Handler
import android.util.DisplayMetrics
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.core.content.ContextCompat
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.snackbar.Snackbar.SnackbarLayout

object SnackBarHelper {

     fun showErrorTopAlert(
        context: Context?,
        parentView: View,
        message: String?,
        appName: String?,
        drawable: Int
    ) {
        val snackbar = Snackbar.make(parentView, message!!, Snackbar.LENGTH_LONG)
        val layout = snackbar.view as SnackbarLayout
        layout.findViewById<View>(com.google.android.material.R.id.snackbar_text).visibility =
            View.INVISIBLE
        val inflater = LayoutInflater.from(parentView.context)
        val view = layout.rootView
        val params: ViewGroup.LayoutParams = snackbar.view.layoutParams

        if (params is CoordinatorLayout.LayoutParams) {
            (params as CoordinatorLayout.LayoutParams).gravity = Gravity.TOP
        } else {
            (params as FrameLayout.LayoutParams).gravity = Gravity.TOP
        }

        view.layoutParams = params
        view.setBackgroundColor(ContextCompat.getColor(context!!, R.color.white))
        val mTextView = view.findViewById<TextView>(com.google.android.material.R.id.snackbar_text)
        mTextView.textSize = convertDpToPixel(10F)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) mTextView.textAlignment =
            View.TEXT_ALIGNMENT_CENTER else mTextView.gravity = Gravity.CENTER_HORIZONTAL
        val snackView: View = inflater.inflate(R.layout.snackbar, null)
        (snackView.findViewById<View>(R.id.massege) as TextView).text = message
        (snackView.findViewById<View>(R.id.app_name) as TextView).text = appName
        (snackView.findViewById<View>(R.id.iv_icon) as ImageView).setImageResource(drawable)
        layout.addView(snackView, 0)
        snackbar.show()


        if (snackbar != null && snackbar.isShown) {
            Handler().postDelayed({
                val animation1 =
                    AnimationUtils.loadAnimation(context, R.anim.bottom_to_top)
                snackbar.view.animation = animation1
                snackbar.view.visibility = View.GONE
            }, 2500)
        }


    }


     fun showErrorTopAlertRTL(
        context: Context?,
        parentView: View,
        message: String?,
        appName: String?,
        drawable: Int
    ) {
        val snackbar = Snackbar.make(parentView, message!!, Snackbar.LENGTH_LONG)
        val layout = snackbar.view as SnackbarLayout
        layout.findViewById<View>(com.google.android.material.R.id.snackbar_text).visibility =
            View.INVISIBLE
        val inflater = LayoutInflater.from(parentView.context)
        val view = layout.rootView
        val params: ViewGroup.LayoutParams = snackbar.view.layoutParams

        if (params is CoordinatorLayout.LayoutParams) {
            (params as CoordinatorLayout.LayoutParams).gravity = Gravity.TOP
        } else {
            (params as FrameLayout.LayoutParams).gravity = Gravity.TOP
        }

        view.layoutParams = params
        view.setBackgroundColor(ContextCompat.getColor(context!!, R.color.white))
        val mTextView = view.findViewById<TextView>(com.google.android.material.R.id.snackbar_text)
        mTextView.textSize = convertDpToPixel(10F)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) mTextView.textAlignment =
            View.TEXT_ALIGNMENT_CENTER else mTextView.gravity = Gravity.CENTER_HORIZONTAL
        val snackView: View = inflater.inflate(R.layout.snackbar, null)
        (snackView.findViewById<View>(R.id.massege) as TextView).text = message
        (snackView.findViewById<View>(R.id.app_name) as TextView).text = appName
        (snackView.findViewById<View>(R.id.iv_icon) as ImageView).setImageResource(drawable)
        layout.addView(snackView, 0)
        snackbar.show()


        if (snackbar != null && snackbar.isShown) {
            Handler().postDelayed({
                val animation1 =
                    AnimationUtils.loadAnimation(context, R.anim.right_to_left)
                snackbar.view.animation = animation1
                snackbar.view.visibility = View.GONE
            }, 2500)
        }


    }



     fun showErrorBottomAlert(context: Context?, parentView: View ,message: String?,
                                  appName: String?,
                                  drawable: Int) {
        val snackbar = Snackbar.make(parentView, message!!, Snackbar.LENGTH_LONG)
        val layout = snackbar.view as SnackbarLayout
        layout.findViewById<View>(com.google.android.material.R.id.snackbar_text).visibility =
            View.INVISIBLE
        val inflater = LayoutInflater.from(parentView.context)
        val view = layout.rootView
        val params: ViewGroup.LayoutParams = snackbar.view.layoutParams

        if (params is CoordinatorLayout.LayoutParams) {
            (params as CoordinatorLayout.LayoutParams).gravity = Gravity.BOTTOM
        } else {
            (params as FrameLayout.LayoutParams).gravity = Gravity.BOTTOM
        }

        view.layoutParams = params
        view.setBackgroundColor(ContextCompat.getColor(context!!, R.color.white))
        val mTextView = view.findViewById<TextView>(com.google.android.material.R.id.snackbar_text)
        mTextView.textSize = convertDpToPixel(10F)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) mTextView.textAlignment =
            View.TEXT_ALIGNMENT_CENTER else mTextView.gravity = Gravity.CENTER_HORIZONTAL
        val snackView: View = inflater.inflate(R.layout.snackbar, null)
        (snackView.findViewById<View>(R.id.massege) as TextView).text = message
        (snackView.findViewById<View>(R.id.app_name) as TextView).text = appName
        (snackView.findViewById<View>(R.id.iv_icon) as ImageView).setImageResource(drawable)
        layout.addView(snackView, 0)
        snackbar.show()


        if (snackbar != null && snackbar.isShown) {
            Handler().postDelayed({
                val animation1 =
                    AnimationUtils.loadAnimation(context, R.anim.top_to_bottom)
                snackbar.view.animation = animation1
                snackbar.view.visibility = View.GONE
            }, 2500)
        }


    }


    fun showErrorBottomAlertRTL(
        context: Context?,
        parentView: View,
        message: String?,
        appName: String?,
        drawable: Int
    ) {
        val snackbar = Snackbar.make(parentView, message!!, Snackbar.LENGTH_LONG)
        val layout = snackbar.view as SnackbarLayout
        layout.findViewById<View>(com.google.android.material.R.id.snackbar_text).visibility =
            View.INVISIBLE
        val inflater = LayoutInflater.from(parentView.context)
        val view = layout.rootView
        val params: ViewGroup.LayoutParams = snackbar.view.layoutParams

        if (params is CoordinatorLayout.LayoutParams) {
            (params as CoordinatorLayout.LayoutParams).gravity = Gravity.BOTTOM
        } else {
            (params as FrameLayout.LayoutParams).gravity = Gravity.BOTTOM
        }

        view.layoutParams = params
        view.setBackgroundColor(ContextCompat.getColor(context!!, R.color.white))
        val mTextView = view.findViewById<TextView>(com.google.android.material.R.id.snackbar_text)
        mTextView.textSize = convertDpToPixel(10F)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) mTextView.textAlignment =
            View.TEXT_ALIGNMENT_CENTER else mTextView.gravity = Gravity.CENTER_HORIZONTAL
        val snackView: View = inflater.inflate(R.layout.snackbar, null)
        (snackView.findViewById<View>(R.id.massege) as TextView).text = message
        (snackView.findViewById<View>(R.id.app_name) as TextView).text = appName
        (snackView.findViewById<View>(R.id.iv_icon) as ImageView).setImageResource(drawable)
        layout.addView(snackView, 0)
        snackbar.show()


        if (snackbar != null && snackbar.isShown) {
            Handler().postDelayed({
                val animation1 =
                    AnimationUtils.loadAnimation(context, R.anim.right_to_left)
                snackbar.view.animation = animation1
                snackbar.view.visibility = View.GONE
            }, 2500)
        }


    }

    fun successToast(context: Activity?, message: String?) {
        val inflater: LayoutInflater = context!!.layoutInflater
        val layout: View = inflater.inflate(
            R.layout.toast_layout,
            context.findViewById(R.id.toast_layout_root) as ViewGroup?
        )
        layout.background = context.resources.getDrawable(R.drawable.success_layout)

        val text =
            layout.findViewById<View>(R.id.text) as TextView
        text.text = message

        val toast = Toast(context)
        toast.setGravity(Gravity.TOP or Gravity.END, 20, 20)
        toast.duration = Toast.LENGTH_SHORT
        toast.view = layout
        toast.show()
    }

    fun showError(context: Activity?, message: String?) {
        val inflater: LayoutInflater = context!!.layoutInflater
        val layout: View = inflater.inflate(
            R.layout.toast_layout,
            context.findViewById(R.id.toast_layout_root) as ViewGroup?
        )

        val text =
            layout.findViewById<View>(R.id.text) as TextView
        text.text = message

        val toast = Toast(context)
        toast.setGravity(Gravity.TOP or Gravity.END, 20, 20)
        toast.duration = Toast.LENGTH_LONG
        toast.view = layout
        toast.show()
    }


    private fun convertDpToPixel(dp: Float): Float {
        val metrics = Resources.getSystem().displayMetrics
        return dp * (metrics.densityDpi.toFloat() / DisplayMetrics.DENSITY_DEFAULT)
    }

}

