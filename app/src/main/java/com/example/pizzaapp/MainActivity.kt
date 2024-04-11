package com.example.pizzaapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.pizzaapp.UIComposables.ToppingCell
import com.example.pizzaapp.model.Placement
import com.example.pizzaapp.model.Topping
import com.example.pizzaapp.ui.theme.PizzaAppTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val context = LocalContext.current
            PizzaAppTheme {
                ToppingCell(
                 topping = Topping.TOPPING_BASIL.getLocalizedString(context),
                    placement = Placement.PLACEMENT_LEFT.getLocalizedString(context),
                    onCheckedChange = {})
            }
        }
    }
}

fun onCheckboxChange(isChecked: Boolean) {
    // Implement your logic here, like updating a state variable
    // or performing an action based on the checked state
}

@Preview(showBackground = true)
@Composable
private fun GreetingPreview() {
    PizzaAppTheme {
            Row {
                Checkbox(checked = true, onCheckedChange = {/*something */})
                Column() {
                    Text(text = "Pineapple")
                    Text(text = "Whole pizza")
                }
            }
    }
}