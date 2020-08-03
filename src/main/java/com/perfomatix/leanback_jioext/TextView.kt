package com.perfomatix.leanback_jioext

import android.content.Context
import android.graphics.Typeface
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.graphics.TypefaceCompat
import com.perfomatix.perfolibrary.R

class TextView(context: Context?) : AppCompatTextView(context) {
    override fun setTypeface(tf: Typeface?, style: Int) {
        var finalTypeface: Typeface? = null
        if (tf != null) {
            val yle = if(style > 0) style  else R.style.textFont
            finalTypeface = TypefaceCompat.create(context, tf, yle)
        }
        super.setTypeface(finalTypeface ?: tf, style)
    }
}