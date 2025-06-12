package com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v3.bca

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TransactionScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(Color(0xFFF4F7FF))
    ) {
        HeaderSection()
        BalanceCard()
        ActionButtonsRow()
        TransactionHistorySection()
    }
    BottomNavigationBar()
}

@Composable
private fun HeaderSection() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF173F92))
            .padding(16.dp)
    ) {
        Column {
            Text("Hello,", color = Color.White, fontSize = 14.sp)
            Text("Andhika Putra", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 18.sp)
            Text("9087890908", color = Color.White, fontSize = 12.sp)
        }
    }
}

@Composable
private fun BalanceCard() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFF2A70E0))
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text("Current Balance", color = Color.White, fontSize = 14.sp)
            Text(
                "Rp. 27.950.000",
                color = Color.White,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Composable
private fun ActionButtonsRow() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        ActionButton("Add")
        ActionButton("Send")
        ActionButton("V. Account")
        Icon(
            imageVector = Icons.Default.AddCircle,
            contentDescription = "More",
            modifier = Modifier.semantics { contentDescription = "More" }
        )
    }
}

@Composable
private fun ActionButton(label: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Icon(
            imageVector = Icons.Default.AddCircle,
            contentDescription = label,
            tint = Color(0xFF2A70E0),
            modifier = Modifier
                .size(36.dp)
                .semantics { contentDescription = label }
        )
        Text(label, fontSize = 12.sp, color = Color.Black)
    }
}

@Composable
private fun TransactionHistorySection() {
    Column(modifier = Modifier.padding(16.dp)) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text("Recent Transaction", fontWeight = FontWeight.Bold, fontSize = 16.sp, color = Color(0xFF173F92))
            Text("See All", fontSize = 14.sp, color = Color(0xFF2A70E0))
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text("Today", fontWeight = FontWeight.Medium, color = Color(0xFF555555))
        TransactionItem("Rp. 1.320.000", "Wesley Putra", isIncome = false)
        TransactionItem("Rp. 500.000", "Jessica Tanuwijaya", isIncome = true)
        Spacer(modifier = Modifier.height(8.dp))
        Text("Yesterday", fontWeight = FontWeight.Medium, color = Color(0xFF555555))
        TransactionItem("Rp. 8.500.000", "Bloom Design House", isIncome = true)
        TransactionItem("Rp. 1.200.000", "Gilbert Tanjung", isIncome = true)
        TransactionItem("Rp. 200.000", "Lidya Danira", isIncome = true)
    }
}

@Composable
private fun TransactionItem(amount: String, name: String, isIncome: Boolean) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFFFFFFFF))
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.AddCircle,
                contentDescription = if (isIncome) "Income" else "Expense",
                tint = if (isIncome) Color(0xFF00A843) else Color(0xFFB00020),
                modifier = Modifier
                    .size(24.dp)
                    .semantics {
                        contentDescription = if (isIncome) "Income" else "Expense"
                    }
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text(amount, fontWeight = FontWeight.Bold, color = Color.Black)
                Text(name, color = Color(0xFF666666), fontSize = 12.sp)
            }
        }
    }
}

@Composable
private fun BottomNavigationBar() {
    NavigationBar(containerColor = Color(0xFF173F92)) {
        NavigationBarItem(
            selected = false,
            onClick = {},
            icon = {
                Icon(
                    Icons.Default.AddCircle,
                    contentDescription = "Home",
                    modifier = Modifier.semantics { contentDescription = "Home" }
                )
            },
            label = { Text("Home") }
        )
        NavigationBarItem(
            selected = true,
            onClick = {},
            icon = {
                Icon(
                    Icons.Default.AddCircle,
                    contentDescription = "Transaction",
                    modifier = Modifier.semantics { contentDescription = "Transaction" }
                )
            },
            label = { Text("Transaction") }
        )
        NavigationBarItem(
            selected = false,
            onClick = {},
            icon = {
                Icon(
                    Icons.Default.AddCircle,
                    contentDescription = "Center",
                    modifier = Modifier.semantics { contentDescription = "Center" }
                )
            },
            label = { Text("") }
        )
        NavigationBarItem(
            selected = false,
            onClick = {},
            icon = {
                Icon(
                    Icons.Default.AddCircle,
                    contentDescription = "Notification",
                    modifier = Modifier.semantics { contentDescription = "Notification" }
                )
            },
            label = { Text("Notification") }
        )
        NavigationBarItem(
            selected = false,
            onClick = {},
            icon = {
                Icon(
                    Icons.Default.AddCircle,
                    contentDescription = "Profile",
                    modifier = Modifier.semantics { contentDescription = "Profile" }
                )
            },
            label = { Text("Profile") }
        )
    }
}
