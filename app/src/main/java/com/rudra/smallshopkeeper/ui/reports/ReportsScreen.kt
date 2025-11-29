package com.rudra.smallshopkeeper.ui.reports

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun ReportsScreen(
    viewModel: ReportsViewModel = hiltViewModel()
) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text("Reports", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(16.dp))

        // Sales Trends
        Card(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text("Sales Trends", style = MaterialTheme.typography.titleMedium)
                // TODO: Add chart
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Profit Analysis
        Card(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text("Profit Analysis", style = MaterialTheme.typography.titleMedium)
                // TODO: Add chart
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Inventory Reports
        Card(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text("Inventory Reports", style = MaterialTheme.typography.titleMedium)
                // TODO: Add chart
            }
        }
    }
}
