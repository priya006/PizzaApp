package com.example.pizzaapp.model

import android.content.Context
import androidx.annotation.StringRes
import com.example.pizzaapp.R

enum class Topping( @StringRes val resourceId: Int) {
    PLACEMENT_ALL(R.string.placement_all),
    PLACEMENT_LEFT(R.string.placement_left),
    PLACEMENT_RIGHT(R.string.placement_right),
    TOPPING_BASIL(R.string.topping_basil),
    TOPPING_MUSHROOM(R.string.topping_mushroom),
    TOPPING_PINEAPPLE(R.string.topping_pineapple);


    /*
    getLocalizedString allows you to retrieve
    the relevant string resource based on the
    current context (which includes the user's locale) at runtime
     */
    fun getLocalizedString(context : Context):String{
        return context.getString(resourceId)
    }
}