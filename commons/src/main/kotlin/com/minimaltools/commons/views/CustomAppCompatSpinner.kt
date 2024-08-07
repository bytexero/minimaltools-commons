package com.minimaltools.commons.views

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.AdapterView
import android.widget.TextView
import androidx.appcompat.widget.AppCompatSpinner
import com.minimaltools.commons.R
import com.minimaltools.commons.adapters.CustomArrayAdapter
import com.minimaltools.commons.extensions.applyColorFilter

class CustomAppCompatSpinner : AppCompatSpinner {
    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(context, attrs, defStyle)

    fun setColors(textColor: Int, accentColor: Int, backgroundColor: Int) {
        if (adapter == null)
            return

        val cnt = adapter.count
        val items = kotlin.arrayOfNulls<Any>(cnt)
        for (i in 0 until cnt)
            items[i] = adapter.getItem(i)

        val position = selectedItemPosition
        val padding = resources.getDimension(R.dimen.activity_margin).toInt()
        adapter = CustomArrayAdapter(context, android.R.layout.simple_spinner_item, items, textColor, backgroundColor, padding)
        setSelection(position)

        val superListener = onItemSelectedListener
        onItemSelectedListener = object : OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                if (view != null) {
                    (view as TextView).setTextColor(textColor)
                }
                superListener?.onItemSelected(parent, view, position, id)
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
        }
        background.applyColorFilter(textColor)
    }
}
