package com.example.pizzaapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pizzaapp.ui.theme.PizzaAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PizzaAppTheme {
                // A surface container using the 'background' color from the theme


                Row {
                    Checkbox(checked = true, onCheckedChange = ::onCheckboxChange)
                    Spacer(modifier = Modifier.width(8.dp)) // Add spacing between elements (optional)
                    Column() {
                        Text(text = "Pineapple")
                        Text(text = "Whole pizza")
                    }
                }
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