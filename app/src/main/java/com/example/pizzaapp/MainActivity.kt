package com.example.pizzaapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.pizzaapp.UIComposables.ToppingCell
import com.example.pizzaapp.ui.theme.PizzaAppTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PizzaAppTheme {
                ToppingCell()
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
fun GreetingPreview() {
    PizzaAppTheme {
       // Greeting("Android")
    }
}