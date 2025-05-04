package com.lucaseox.generatedappsfigmatemplates.generatedscreens.bca

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.ArrowForward
//import androidx.compose.material.icons.filled.AccountBalanceWallet
//import androidx.compose.material.icons.filled.MoreHoriz
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.text.style.TextOverflow
import com.lucaseox.generatedappsfigmatemplates.R

@Composable
fun TransactionScreen() {
    Scaffold(
        bottomBar = { BottomNavigationBar() },
        floatingActionButton = { CenterFloatingActionButton() },
        floatingActionButtonPosition = FabPosition.Center,
        containerColor = Color(0xFFF6F8FD)
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
        ) {
            item { HeaderSection() }
            item { BalanceSection() }
            item { ActionButtonsSection() }
            item { RecentTransactionSection() }
        }
    }
}

@Composable
private fun HeaderSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF1D4ED8))
            .padding(16.dp)
    ) {
        Text(
            text = "Hello,",
            color = Color.White,
            fontSize = 16.sp
        )
        Text(
            text = "Andhika Putra",
            color = Color.White,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "9087890908",
            color = Color.White,
            fontSize = 14.sp
        )
    }
}

@Composable
private fun BalanceSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .background(Color(0xFF60A5FA), shape = MaterialTheme.shapes.medium)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Current Balance",
            color = Color.White,
            fontSize = 14.sp
        )
        Text(
            text = "Rp. 27.950.000",
            color = Color.White,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
private fun ActionButtonsSection() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        ActionButton(Icons.Default.AddCircle, "Add")
        ActionButton(Icons.Default.ArrowForward, "Send")
        ActionButton(Icons.Default.AddCircle, "V. Account")
        IconButton(onClick = { }) {
            Icon(
                imageVector = Icons.Default.AddCircle,
                contentDescription = "More Options"
            )
        }
    }
}

@Composable
private fun ActionButton(icon: androidx.compose.ui.graphics.vector.ImageVector, label: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Icon(
            imageVector = icon,
            contentDescription = label,
            modifier = Modifier.size(36.dp)
        )
        Text(text = label, fontSize = 12.sp)
    }
}

@Composable
private fun RecentTransactionSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFEFF3FD))
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Recent Transaction",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "See All",
                fontSize = 14.sp,
                color = Color.Blue
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Today",
            fontSize = 14.sp,
            fontWeight = FontWeight.SemiBold
        )

        Spacer(modifier = Modifier.height(8.dp))

        TransactionItem(name = "Wesley Putra", amount = "1.320.000", isExpense = true)
        TransactionItem(name = "Jessica Tanuwijaya", amount = "500.000", isExpense = false)

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Yesterday",
            fontSize = 14.sp,
            fontWeight = FontWeight.SemiBold
        )

        Spacer(modifier = Modifier.height(8.dp))

        TransactionItem(name = "Bloom Design House", amount = "8.500.000", isExpense = false)
        TransactionItem(name = "Gilbert Tanjung", amount = "1.200.000", isExpense = false)
        TransactionItem(name = "Lidya Danira", amount = "200.000", isExpense = false)
    }
}

@Composable
private fun TransactionItem(name: String, amount: String, isExpense: Boolean) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
            .background(Color.White, shape = MaterialTheme.shapes.medium)
            .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = if (isExpense) Icons.Default.ArrowForward else Icons.Default.ArrowForward,
            contentDescription = "Transaction Type",
            tint = if (isExpense) Color.Red else Color.Green,
            modifier = Modifier.size(24.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = "Rp. $amount",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = name,
                fontSize = 14.sp,
                color = Color.Gray,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}

@Composable
private fun BottomNavigationBar() {
    NavigationBar {
        NavigationBarItem(
            selected = true,
            onClick = { },
            icon = {
                Icon(
                    imageVector = Icons.Default.Home,
                    contentDescription = "Home"
                )
            },
            label = { Text("Home") }
        )
        NavigationBarItem(
            selected = false,
            onClick = { },
            icon = {
                Icon(
                    imageVector = Icons.Default.AddCircle,
                    contentDescription = "Transaction"
                )
            },
            label = { Text("Transaction") }
        )
        Spacer(modifier = Modifier.width(48.dp))
        NavigationBarItem(
            selected = false,
            onClick = { },
            icon = {
                Icon(
                    imageVector = Icons.Default.Notifications,
                    contentDescription = "Notification"
                )
            },
            label = { Text("Notification") }
        )
        NavigationBarItem(
            selected = false,
            onClick = { },
            icon = {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "Profile"
                )
            },
            label = { Text("Profile") }
        )
    }
}

@Composable
private fun CenterFloatingActionButton() {
    FloatingActionButton(onClick = { }) {
        Image(
            painter = painterResource(id = R.drawable.ic_placeholder),
            contentDescription = "Center Action"
        )
    }
}
