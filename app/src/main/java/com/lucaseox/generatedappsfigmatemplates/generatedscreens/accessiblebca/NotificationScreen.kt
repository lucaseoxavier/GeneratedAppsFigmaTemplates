// NotificationScreen.kt

package com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessiblebca

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
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
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
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
                .padding(padding)
                .fillMaxSize()
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
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF0B318F))
            .padding(16.dp)
    ) {
        Column(modifier = Modifier.align(Alignment.TopStart)) {
            Text(text = "Hello,", fontSize = 14.sp, color = Color.White)
            Text(
                text = "Andhika Putra",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
            Text(text = "9087890908", fontSize = 14.sp, color = Color.White)
        }

        Row(
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(top = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.Notifications,
                contentDescription = "Alerts and notifications icon",
                tint = Color.White
            )
            Spacer(modifier = Modifier.width(12.dp))
            Icon(
                imageVector = Icons.Default.AddCircle,
                contentDescription = "User avatar placeholder icon",
                tint = Color.White
            )
        }
    }
}

@Composable
private fun NotificationTabs() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .height(48.dp)
            .background(Color(0xFFE6EBFA), shape = MaterialTheme.shapes.large)
    ) {
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
                .background(Color(0xFF3458D1), shape = MaterialTheme.shapes.large)
                .semantics { contentDescription = "Selected tab: Notification (1)" },
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Notification (1)",
                color = Color.White,
                fontWeight = FontWeight.Bold
            )
        }
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
                .semantics { contentDescription = "Tab: Message" },
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Message",
                color = Color(0xFF0B318F),
                fontWeight = FontWeight.Medium
            )
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
        notifications.forEachIndexed { index, notification ->
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 12.dp)
                    .semantics {
                        contentDescription = "Notification $index: $notification"
                    }
            ) {
                Text(
                    text = notification,
                    color = Color.Black,
                    fontSize = 14.sp
                )
            }
            Divider(color = Color(0xFFE0E0E0), thickness = 1.dp)
        }
    }
}

@Composable
private fun NotificationBottomNavigation() {
    NavigationBar(containerColor = Color(0xFF0B318F)) {
        NavigationBarItem(
            icon = {
                Icon(
                    imageVector = Icons.Default.AddCircle,
                    contentDescription = "Navigate to Home"
                )
            },
            selected = false,
            onClick = {}
        )
        NavigationBarItem(
            icon = {
                Icon(
                    imageVector = Icons.Default.AddCircle,
                    contentDescription = "Navigate to Transactions"
                )
            },
            selected = false,
            onClick = {}
        )
        NavigationBarItem(
            icon = {
                Icon(
                    imageVector = Icons.Default.AddCircle,
                    contentDescription = "Navigate to Notifications"
                )
            },
            selected = true,
            onClick = {}
        )
        NavigationBarItem(
            icon = {
                Icon(
                    imageVector = Icons.Default.AddCircle,
                    contentDescription = "Navigate to Profile"
                )
            },
            selected = false,
            onClick = {}
        )
    }
}
