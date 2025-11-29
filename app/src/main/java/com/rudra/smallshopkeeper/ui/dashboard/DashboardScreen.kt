package com.rudra.smallshopkeeper.ui.dashboard

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun DashboardScreen(
    viewModel: DashboardViewModel = hiltViewModel()
) {
    val products by viewModel.products.collectAsState()
    val sales by viewModel.sales.collectAsState()
    val activities by viewModel.activities.collectAsState()

    val totalSales = sales.sumOf { it.totalAmount }
    val totalProfit = sales.sumOf { it.profit }

    Column(modifier = Modifier.padding(16.dp)) {
        Text("Dashboard", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(16.dp))

        // Quick Stats
        Card(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text("Quick Stats", style = MaterialTheme.typography.titleMedium)
                Spacer(modifier = Modifier.height(8.dp))
                Text("Total Products: ${products.size}")
                Text("Total Sales: $${String.format("%.2f", totalSales)}")
                Text("Total Profit: $${String.format("%.2f", totalProfit)}")
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Recent Activities
        Card(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text("Recent Activities", style = MaterialTheme.typography.titleMedium)
                Spacer(modifier = Modifier.height(8.dp))
                LazyColumn {
                    items(activities) { activity ->
                        Text(text = "${activity.type}: ${activity.description} - $${activity.amount}")
                    }
                }
            }
        }
    }
}
