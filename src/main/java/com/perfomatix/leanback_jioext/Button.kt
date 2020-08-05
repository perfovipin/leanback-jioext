package com.perfomatix.leanback_jioext

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Typeface
import android.graphics.drawable.Drawable
import android.util.TypedValue
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.appcompat.widget.AppCompatButton
import androidx.core.content.ContextCompat
import androidx.core.graphics.TypefaceCompat
import com.perfomatix.perfolibrary.R


class Button( context:Context?):AppCompatButton(context) {

private  val mContext =context
private  val value =TypedValue()

    override fun setTypeface(tf: Typeface?, style: Int) {
        var finalTypeface: Typeface? = null
        if (tf != null) {
            val yle = if(style > 0) style  else R.style.textFont
            finalTypeface = TypefaceCompat.create(context, tf, yle)
        }
        super.setTypeface(finalTypeface ?: tf, style)
    }
    override fun setBackground(background: Drawable?) {
         var drawable = background
        if(background == null)
        {
            mContext?.theme?.resolveAttribute(android.R.attr.selectableItemBackground, value, true)
              drawable = ContextCompat.getDrawable(mContext!!,R.drawable.ripple)
        }
        super.setBackground(drawable)
    }

    override fun setLayoutParams(params: ViewGroup.LayoutParams?) {
        var param = params
        if(params == null)
        {
         param = LinearLayout.LayoutParams(150, 50)
        }
        super.setLayoutParams(param)
    }

}