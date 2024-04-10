package com.example.pizzaapp.UIComposables

import android.content.Context
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.pizzaapp.model.Topping
import com.example.pizzaapp.onCheckboxChange

@Composable
 fun ToppingCell(context: Context) {
    Row {
        Checkbox(checked = true, onCheckedChange = ::onCheckboxChange)
        Spacer(modifier = Modifier.width(8.dp)) // Add spacing between elements (optional)
        Column() {
            Text(text = Topping.TOPPING_BASIL.getLocalizedString(context))
            Text(text = Topping.PLACEMENT_LEFT.getLocalizedString(context))
        }
    }
}