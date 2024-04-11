package com.example.pizzaapp.UIComposables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pizzaapp.R
import com.example.pizzaapp.model.Placement
import com.example.pizzaapp.model.Topping

@Composable
fun PizzaBuilderScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {

        // Composable rendering checkbox and text
        ToppingList()
        Spacer(modifier = Modifier.height(600.dp))

        // Composable rendering button
        PlaceOrderButton(
            textResourceId = R.string.place_order_button,
            onClick = {}
        )
    }
}


@Composable
private fun PlaceOrderButton(textResourceId: Int, onClick: () -> Unit) {
    var buttonText = stringResource(id = textResourceId)
    Button(onClick = { onClick() },
        modifier = Modifier.fillMaxWidth()) {
        Text(text = buttonText
        )
    }
}


@Composable
private fun ToppingList(modifier: Modifier = Modifier) {

    ToppingCell(
        topping = Topping.TOPPING_BASIL,
        placement = Placement.PLACEMENT_LEFT,
        isChecked = true
    )
}

@Preview
@Composable
private fun previewPizzaBuilderScreen() {


}