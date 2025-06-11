package com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v2.bca// Required imports

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lucaseox.generatedappsfigmatemplates.R // Replace with your actual package name

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(Color.White)
    ) {
        TopHeader()
        BalanceCard()
        ServiceGrid()
        PromoSection()
    }
    BottomNavigationBar()
}

@Composable
private fun TopHeader() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF0C3C87))
            .padding(16.dp)
    ) {
        Column {
            Text(text = "Hello,", color = Color.White)
            Text(
                text = "Andhika Putra",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
            Text(
                text = "9087890908",
                color = Color.White,
                fontSize = 12.sp
            )
        }

        Row(
            modifier = Modifier.align(Alignment.TopEnd),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(12.dp)
                    .clip(CircleShape)
                    .background(Color.Green)
            )
            Icon(
                imageVector = Icons.Default.AddCircle,
                contentDescription = "Notification",
                tint = Color.White,
                modifier = Modifier.padding(start = 12.dp)
            )
            Box(
                modifier = Modifier
                    .size(24.dp)
                    .clip(CircleShape)
                    .background(Color.Blue)
                    .padding(start = 12.dp)
            )
        }
    }
}

@Composable
private fun BalanceCard() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 24.dp, vertical = 16.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(Color(0xFF4D9FFF))
            .padding(16.dp)
    ) {
        Column {
            Text(text = "Current Balance", color = Color.White, fontSize = 14.sp)
            Text(
                text = "Rp. 27.950.000",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp
            )
        }
    }
}

@Composable
private fun ServiceGrid() {
    Column(modifier = Modifier.fillMaxWidth()) {
        val services = listOf(
            "M-Info", "M-Transfer", "M-Payment",
            "M-Commerce", "Cardless", "M-Admin"
        )
        for (row in services.chunked(3)) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 24.dp, vertical = 8.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                row.forEach { label ->
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .weight(1f)
                    ) {
                        Box(
                            modifier = Modifier
                                .size(64.dp)
                                .clip(RoundedCornerShape(16.dp))
                                .background(Color(0xFFE8F0FE)),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                imageVector = Icons.Default.AddCircle,
                                contentDescription = label,
                                tint = Color(0xFF0C3C87)
                            )
                        }
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(text = label, fontSize = 12.sp)
                    }
                }
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Box(
                modifier = Modifier
                    .size(width = 32.dp, height = 6.dp)
                    .clip(RoundedCornerShape(3.dp))
                    .background(Color(0xFFD1D5DB))
            )
        }
    }
}

@Composable
private fun PromoSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFF5F8FE))
            .padding(vertical = 16.dp)
    ) {
        Text(
            text = "Promo",
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            modifier = Modifier.padding(horizontal = 24.dp)
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
                .horizontalScroll(rememberScrollState()),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            repeat(3) {
                Image(
                    painter = painterResource(id = R.drawable.ic_placeholder),
                    contentDescription = "Promo Banner",
                    modifier = Modifier
                        .width(280.dp)
                        .height(140.dp)
                        .padding(horizontal = 8.dp)
                        .clip(RoundedCornerShape(16.dp))
                )
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            repeat(3) {
                Box(
                    modifier = Modifier
                        .padding(horizontal = 4.dp)
                        .size(8.dp)
                        .clip(CircleShape)
                        .background(if (it == 0) Color(0xFF0C3C87) else Color.LightGray)
                )
            }
        }
    }
}

@Composable
private fun BottomNavigationBar() {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.BottomCenter
    ) {
        NavigationBar(
            containerColor = Color(0xFFE8F0FE)
        ) {
            NavigationBarItem(
                selected = true,
                onClick = { },
                icon = {
                    Icon(
                        imageVector = Icons.Default.AddCircle,
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
            Spacer(modifier = Modifier.weight(1f))
            NavigationBarItem(
                selected = false,
                onClick = { },
                icon = {
                    Icon(
                        imageVector = Icons.Default.AddCircle,
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
                        imageVector = Icons.Default.AddCircle,
                        contentDescription = "Profile"
                    )
                },
                label = { Text("Profile") }
            )
        }

        FloatingActionButton(
            onClick = { },
            containerColor = Color(0xFF0C3C87),
            contentColor = Color.White,
            modifier = Modifier.offset(y = (-28).dp)
        ) {
            Icon(
                imageVector = Icons.Default.AddCircle,
                contentDescription = "Center Button"
            )
        }
    }
}
