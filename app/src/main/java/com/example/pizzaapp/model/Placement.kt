package com.example.pizzaapp.model

import android.content.Context
import androidx.annotation.StringRes
import com.example.pizzaapp.R

enum class Placement(@StringRes val resourceId: Int) {
    PLACEMENT_ALL(R.string.placement_all),
    PLACEMENT_LEFT(R.string.placement_left),
    PLACEMENT_RIGHT(R.string.placement_right);


    /*
    getLocalizedString allows you to retrieve
    the relevant string resource based on the
    current context (which includes the user's locale) at runtime
     */
    fun getLocalizedString(context : Context):String{
        return context.getString(resourceId)
    }
}