package com.rudra.smallshopkeeper.ui.products

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.rudra.smallshopkeeper.data.entities.ProductEntity
import com.rudra.smallshopkeeper.ui.navigation.Screen

@Composable
fun ProductsScreen(
    viewModel: ProductsViewModel = hiltViewModel(),
    navController: NavController
) {
    val products by viewModel.products.collectAsState()

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(onClick = { navController.navigate(Screen.AddProduct.route) }) {
                Icon(Icons.Filled.Add, contentDescription = "Add Product")
            }
        }
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp)
        ) {
            items(products) { product ->
                ProductListItem(product = product)
            }
        }
    }
}

@Composable
fun ProductListItem(product: ProductEntity) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp)
    ) {
        Row(
            modifier = Modifier.padding(16.dp)
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text(text = product.name)
                Text(text = "Category: ${product.category}")
            }
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text(text = "Price: $${product.sellPrice}")
                Text(text = "Stock: ${product.stock}")
            }
        }
    }
}
