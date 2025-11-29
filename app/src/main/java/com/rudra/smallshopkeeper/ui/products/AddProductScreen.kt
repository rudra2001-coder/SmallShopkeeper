package com.rudra.smallshopkeeper.ui.products

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController

@Composable
fun AddProductScreen(
    viewModel: AddProductViewModel = hiltViewModel(),
    navController: NavController
) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text("Add Product")
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = viewModel.productName,
            onValueChange = { viewModel.productName = it },
            label = { Text("Product Name") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        OutlinedTextField(
            value = viewModel.buyingPrice,
            onValueChange = { viewModel.buyingPrice = it },
            label = { Text("Buying Price") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        OutlinedTextField(
            value = viewModel.sellingPrice,
            onValueChange = { viewModel.sellingPrice = it },
            label = { Text("Selling Price") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        OutlinedTextField(
            value = viewModel.stock,
            onValueChange = { viewModel.stock = it },
            label = { Text("Stock") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        OutlinedTextField(
            value = viewModel.category,
            onValueChange = { viewModel.category = it },
            label = { Text("Category") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = {
                viewModel.saveProduct()
                navController.popBackStack()
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Save Product")
        }
    }
}
