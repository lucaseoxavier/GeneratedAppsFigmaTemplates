package com.lucaseox.generatedfromfigmatemplates.bca

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun NotificationScreen() {
    Scaffold(
        topBar = { TopBar() },
        bottomBar = { BottomNavigationBar() }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .verticalScroll(rememberScrollState())
                .fillMaxSize()
        ) {
            HeaderSection()
            NotificationTabs()
            NotificationList()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun TopBar() {
    TopAppBar(
        title = {},
        actions = {
            Icon(imageVector = Icons.Default.Notifications, contentDescription = "Notifications", tint = Color.White)
            Spacer(modifier = Modifier.width(16.dp))
            Icon(imageVector = Icons.Default.AccountCircle, contentDescription = "Profile", tint = Color.White)
        },
        colors = TopAppBarDefaults.topAppBarColors(containerColor = Color(0xFF3157D5))
    )
}

@Composable
private fun HeaderSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.Start
    ) {
        Text(text = "Hello,", color = Color.White, fontSize = 16.sp)
        Text(text = "Andhika Putra", color = Color.White, fontSize = 20.sp, fontWeight = FontWeight.Bold)
        Text(text = "9087890908", color = Color.White, fontSize = 14.sp)
    }
}

@Composable
private fun NotificationTabs() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 16.dp),
        horizontalArrangement = Arrangement.Center
    ) {
        TabItem(title = "Notification (1)", selected = true)
        TabItem(title = "Message", selected = false)
    }
}

@Composable
private fun TabItem(title: String, selected: Boolean) {
    Text(
        text = title,
        modifier = Modifier
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .then(
                if (selected) Modifier.background(MaterialTheme.colorScheme.primary) else Modifier
            ),
        color = if (selected) Color.White else Color.Gray,
        textAlign = TextAlign.Center
    )
}

@Composable
private fun NotificationList() {
    Column(modifier = Modifier.fillMaxWidth()) {
        NotificationSection(title = "JAN 2022") {
            NotificationItem("Pembayaran di Merchant TIKET COM dengan nominal Rp. 1.290.000")
            NotificationItem("Top-Up Rp. 100.000 dari BANK BRI telah berhasil")
        }
        NotificationSection(title = "DEC 2021") {
            NotificationItem("Pembayaran di Merchant Go-Pay dengan nominal Rp. 1.290.000")
        }
        NotificationSection(title = "NOV 2021") {
            NotificationItem("Pembayaran di Merchant TIKET COM dengan nominal Rp. 1.290.000")
        }
    }
}

@Composable
private fun NotificationSection(title: String, content: @Composable () -> Unit) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(
            text = title,
            modifier = Modifier.padding(16.dp),
            fontWeight = FontWeight.Bold,
            fontSize = 14.sp
        )
        content()
    }
}

@Composable
private fun NotificationItem(message: String) {
    Text(
        text = message,
        modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
        fontSize = 14.sp
    )
}

@Composable
private fun BottomNavigationBar() {
    NavigationBar {
        NavigationBarItem(
            selected = false,
            onClick = {},
            icon = { Icon(imageVector = Icons.Default.Home, contentDescription = "Home") },
            label = { Text("Home") }
        )
        NavigationBarItem(
            selected = false,
            onClick = {},
            icon = { Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = "Transaction") },
            label = { Text("Transaction") }
        )
        NavigationBarItem(
            selected = true,
            onClick = {},
            icon = { Icon(imageVector = Icons.Default.Notifications, contentDescription = "Notification") },
            label = { Text("Notification") }
        )
        NavigationBarItem(
            selected = false,
            onClick = {},
            icon = { Icon(imageVector = Icons.Default.Person, contentDescription = "Profile") },
            label = { Text("Profile") }
        )
    }
}
