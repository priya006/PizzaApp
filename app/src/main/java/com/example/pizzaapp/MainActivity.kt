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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.pizzaapp.UIComposables.PizzaBuilderScreen
import com.example.pizzaapp.UIComposables.ToppingCell
import com.example.pizzaapp.model.Placement
import com.example.pizzaapp.model.Topping
import com.example.pizzaapp.ui.theme.PizzaAppTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PizzaAppTheme {
                PizzaBuilderScreen()
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
private fun WithTopping() {
    PizzaAppTheme {
        Row {
            Checkbox(checked = true, onCheckedChange = {/*something */ })
            Column() {
                Text(text = stringResource(Topping.TOPPING_BASIL.resourceId))
                Text(text = stringResource(Placement.PLACEMENT_ALL.resourceId))
            }
        }
    }
}

    @Preview(showBackground = true)
    @Composable
    private fun WithOutTopping() {
        PizzaAppTheme {
            ToppingCell(topping = Topping.TOPPING_BASIL, placement = null, isChecked = false )
            }
        }

