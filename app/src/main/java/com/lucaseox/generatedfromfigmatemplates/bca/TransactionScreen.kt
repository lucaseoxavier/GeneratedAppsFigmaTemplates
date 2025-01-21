package com.lucaseox.generatedfromfigmatemplates.bca

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TransactionScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFEAF0FF)) // Background color
            .verticalScroll(rememberScrollState())
    ) {
        HeaderSection()
        BalanceSection()
        ActionButtons()
        RecentTransactions()
    }
}

@Composable
private fun HeaderSection() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF3D5AFE)) // Blue background
            .padding(16.dp)
    ) {
        Column {
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
        Row(
            modifier = Modifier.align(Alignment.TopEnd),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.Notifications,
                contentDescription = "Notifications",
                tint = Color.White,
                modifier = Modifier.size(24.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Box(
                modifier = Modifier
                    .size(32.dp)
                    .background(Color.Blue, shape = MaterialTheme.shapes.medium)
            ) // Placeholder for profile image
        }
    }
}

@Composable
private fun BalanceSection() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .background(Color(0xFF2979FF), shape = MaterialTheme.shapes.medium)
            .padding(16.dp)
    ) {
        Column {
            Text(
                text = "Current Balance",
                color = Color.White,
                fontSize = 16.sp
            )
            Text(
                text = "Rp. 27.950.000",
                color = Color.White,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Composable
private fun ActionButtons() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        ActionButton(Icons.Default.Add, "Add")
        ActionButton(Icons.Default.Send, "Send")
        ActionButton(Icons.Default.Menu, "V. Account")
        ActionButton(Icons.Default.MoreVert, "...")
    }
}

@Composable
private fun ActionButton(icon: ImageVector, label: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            imageVector = icon,
            contentDescription = label,
            tint = Color(0xFF2979FF),
            modifier = Modifier.size(40.dp)
        )
        Text(
            text = label,
            fontSize = 14.sp,
            color = Color.Gray
        )
    }
}

@Composable
fun RecentTransactions() {
    Column(modifier = Modifier.padding(16.dp)) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Recent Transaction",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF3D5AFE)
            )
            Text(
                text = "See All",
                fontSize = 14.sp,
                color = Color.Gray
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        TransactionItem("Today", "Rp. 1.320.000", "Wesley Putra", true)
        TransactionItem("", "Rp. 500.000", "Jessica Tanuwijaya", true)

        Text(
            text = "Yesterday",
            fontSize = 14.sp,
            color = Color.Gray,
            modifier = Modifier.padding(vertical = 8.dp)
        )

        TransactionItem("", "Rp. 8.500.000", "Bloom Design House", false)
        TransactionItem("", "Rp. 1.200.000", "Gilbert Tanjung", false)
        TransactionItem("", "Rp. 200.000", "Lidya Danira", false)
    }
}

@Composable
fun TransactionItem(date: String, amount: String, recipient: String, isPositive: Boolean) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
            .background(Color.White, shape = MaterialTheme.shapes.medium)
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column {
            if (date.isNotEmpty()) {
                Text(
                    text = date,
                    fontSize = 12.sp,
                    color = Color.Gray
                )
            }
            Text(
                text = recipient,
                fontSize = 14.sp,
                color = Color.Black
            )
        }
        Text(
            text = amount,
            fontSize = 14.sp,
            color = if (isPositive) Color(0xFF00C853) else Color(0xFFD50000),
            fontWeight = FontWeight.Bold
        )
    }
}
