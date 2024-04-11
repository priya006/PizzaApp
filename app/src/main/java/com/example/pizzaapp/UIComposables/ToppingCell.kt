package com.example.pizzaapp.UIComposables

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.pizzaapp.model.Placement
import com.example.pizzaapp.model.Topping

@Composable
fun ToppingCell(topping: Topping, placement: Placement?, isChecked : Boolean) {
    val thisIsChecked = remember { mutableStateOf(isChecked) } // Track checkbox state

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.clickable { thisIsChecked }
        .padding(horizontal = 16.dp, vertical = 4.dp)
    ) {
        Checkbox(checked = thisIsChecked.value, onCheckedChange = {newState -> thisIsChecked.value = newState})
        Spacer(modifier = Modifier.width(8.dp)) // Add spacing between elements (optional)
        Column() {
            Text(text = stringResource(topping.resourceId),
                style = MaterialTheme.typography.bodyLarge)
            if (placement != null) {
                Text(text = stringResource(placement.resourceId,
                    ),
                    style = MaterialTheme.typography.bodySmall )
            }
        }

    }
}