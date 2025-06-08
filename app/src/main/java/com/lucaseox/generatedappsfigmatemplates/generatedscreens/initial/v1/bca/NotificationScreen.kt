// NotificationScreen.kt

package com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v1.bca

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lucaseox.generatedappsfigmatemplates.R

@Composable
fun NotificationScreen() {
    val groupedNotifications = mapOf(
        "JAN 2022" to listOf(
            "Payment to merchant TIKET COM with amount Rp. 1.290.000",
            "Top-Up Rp. 100.000 from BANK BRI was successful",
            "Payment to merchant TIKET COM with amount Rp. 1.290.000"
        ),
        "DEC 2021" to listOf(
            "Payment to merchant Go-Pay with amount Rp. 1.290.000",
            "Payment to merchant TIKET COM with amount Rp. 1.290.000",
            "Top-Up Rp. 25.000 Flazz BCA was successful",
            "Payment to merchant TIKET COM with amount Rp. 1.290.000"
        ),
        "NOV 2021" to listOf(
            "Payment to merchant TIKET COM with amount Rp. 1.290.000",
            "Top-Up Rp. 100.000 from BANK BRI was successful",
            "Payment to merchant TIKET COM with amount Rp. 1.290.000"
        )
    )

    Scaffold(
        bottomBar = { NotificationBottomNavigation() },
        containerColor = Color.White
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .verticalScroll(rememberScrollState())
        ) {
            NotificationHeader()
            NotificationTabs()
            groupedNotifications.forEach { (month, notifications) ->
                NotificationMonthSection(month, notifications)
            }
        }
    }
}

@Composable
private fun NotificationHeader() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF0B318F))
            .padding(16.dp)
    ) {
        Text(
            text = "Hello,",
            fontSize = 14.sp,
            color = Color.White
        )
        Text(
            text = "Andhika Putra",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )
        Text(
            text = "9087890908",
            fontSize = 14.sp,
            color = Color.White
        )
        Spacer(modifier = Modifier.height(16.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ) {
            Icon(
                imageVector = Icons.Default.Notifications,
                contentDescription = "Notification",
                tint = Color.White
            )
            Spacer(modifier = Modifier.width(16.dp))
            Icon(
                imageVector = Icons.Default.AddCircle,
                contentDescription = "Avatar Placeholder",
                tint = Color.White
            )
        }
    }
}

@Composable
private fun NotificationTabs() {
    Row(
        modifier = Modifier
            .padding(16.dp)
            .height(48.dp)
            .fillMaxWidth()
            .background(Color(0xFFE6EBFA), shape = MaterialTheme.shapes.large)
    ) {
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
                .background(Color(0xFF4D7CFE), shape = MaterialTheme.shapes.large),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Notification (1)", color = Color.White, fontWeight = FontWeight.Bold)
        }
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight(),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Message", color = Color(0xFF0B318F), fontWeight = FontWeight.Medium)
        }
    }
}

@Composable
private fun NotificationMonthSection(month: String, notifications: List<String>) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFE6EBFA))
                .padding(12.dp)
        ) {
            Text(
                text = month,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF0B318F)
            )
        }
        notifications.forEach { notification ->
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 12.dp)
            ) {
                Text(text = notification, color = Color.Black, fontSize = 14.sp)
            }
            Divider(color = Color(0xFFE0E0E0), thickness = 1.dp)
        }
    }
}

@Composable
private fun NotificationBottomNavigation() {
    NavigationBar(
        containerColor = Color(0xFF0B318F)
    ) {
        NavigationBarItem(
            icon = { Icon(imageVector = Icons.Default.AddCircle, contentDescription = "Home") },
            selected = false,
            onClick = {}
        )
        NavigationBarItem(
            icon = { Icon(imageVector = Icons.Default.AddCircle, contentDescription = "Transaction") },
            selected = false,
            onClick = {}
        )
        NavigationBarItem(
            icon = { Icon(imageVector = Icons.Default.AddCircle, contentDescription = "Notification") },
            selected = true,
            onClick = {}
        )
        NavigationBarItem(
            icon = { Icon(imageVector = Icons.Default.AddCircle, contentDescription = "Profile") },
            selected = false,
            onClick = {}
        )
    }
}
