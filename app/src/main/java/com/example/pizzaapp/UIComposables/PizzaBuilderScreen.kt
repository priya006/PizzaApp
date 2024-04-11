package com.example.pizzaapp.UIComposables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
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
import com.example.pizzaapp.model.ToppingPlacementPair

@Composable
fun PizzaBuilderScreen(
    modifier: Modifier = Modifier
) {
    val toppingsList = listOf(
        ToppingPlacementPair(Topping.TOPPING_MUSHROOM,Placement.PLACEMENT_LEFT),
        ToppingPlacementPair(Topping.TOPPING_PINEAPPLE,Placement.PLACEMENT_ALL),
        ToppingPlacementPair(Topping.TOPPING_BASIL,Placement.PLACEMENT_RIGHT),
        ToppingPlacementPair(Topping.TOPPING_MUSHROOM,Placement.PLACEMENT_ALL),
        ToppingPlacementPair(Topping.TOPPING_PINEAPPLE,Placement.PLACEMENT_ALL),
        ToppingPlacementPair(Topping.TOPPING_BASIL,Placement.PLACEMENT_LEFT),
        ToppingPlacementPair(Topping.TOPPING_MUSHROOM,Placement.PLACEMENT_ALL)
    )
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {

        Spacer(modifier = Modifier.height(300.dp))
        // Composable rendering checkbox and text
        ToppingList(toppingsList)

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
private fun ToppingList(toppingsList: List<ToppingPlacementPair>) {

    LazyColumn {
        items(toppingsList.size){index ->
            val toppingAndPlacement = toppingsList[index]
            ToppingCell(
                topping = toppingAndPlacement.topping,
                placement = toppingAndPlacement.placement,
                isChecked = true
            )
        }

    }


}

@Preview
@Composable
private fun previewPizzaBuilderScreen() {


}