package com.rudra.smallshopkeeper.ui.sales

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun SalesScreen(
    viewModel: SalesViewModel = hiltViewModel()
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(text = "Sales", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(16.dp))

        // Cart Items
        LazyColumn(modifier = Modifier.weight(1f)) {
            // TODO: Replace with actual cart items
            items(5) { index ->
                Text(text = "Cart Item ${index + 1}")
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Total and Checkout
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Total: $120.00", style = MaterialTheme.typography.titleMedium)
            Button(onClick = { /* TODO: Process payment */ }) {
                Text(text = "Checkout")
            }
        }
    }
}
