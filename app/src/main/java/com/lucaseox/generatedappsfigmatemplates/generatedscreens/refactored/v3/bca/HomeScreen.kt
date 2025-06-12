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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lucaseox.generatedappsfigmatemplates.R

@Composable
fun HomeScreen() {
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .background(Color.White)
            .padding(bottom = 80.dp) // for bottom navigation
    ) {
        HeaderSection()
        BalanceSection()
        ActionGridSection()
        PromoSection()
    }

    BottomNavigationBar()
}

@Composable
private fun HeaderSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF0D47A1))
            .padding(16.dp)
    ) {
        Text(
            text = "Hello,",
            color = Color.White,
            fontSize = 14.sp
        )
        Text(
            text = "Andhika Putra",
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = "9087890908",
            color = Color.White,
            fontSize = 12.sp
        )
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ) {
            Icon(
                imageVector = Icons.Default.AddCircle,
                contentDescription = "Top Notification Icon",
                tint = Color.White,
                modifier = Modifier.padding(8.dp)
            )
            Box(
                modifier = Modifier
                    .size(24.dp)
                    .clip(CircleShape)
                    .background(Color.Blue)
                    .semantics { contentDescription = "User Profile Indicator" }
            )
        }
    }
}

@Composable
private fun BalanceSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(Color(0xFF42A5F5)) // Increased contrast
            .padding(16.dp)
    ) {
        Text(
            text = "Current Balance",
            color = Color.White,
            fontSize = 14.sp,
            fontWeight = FontWeight.SemiBold
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
private fun ActionGridSection() {
    val items = listOf(
        "M-Info", "M-Transfer", "M-Payment",
        "M-Commerce", "Cardless", "M-Admin"
    )

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        for (row in 0 until 2) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                for (col in 0 until 3) {
                    val index = row * 3 + col
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.padding(8.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .size(64.dp)
                                .clip(RoundedCornerShape(16.dp))
                                .background(Color(0xFFE3F2FD))
                                .semantics { contentDescription = "Icon for ${items[index]}" },
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                imageVector = Icons.Default.AddCircle,
                                contentDescription = null,
                                tint = Color(0xFF1976D2)
                            )
                        }
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = items[index],
                            fontSize = 12.sp,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.semantics { contentDescription = "Label for ${items[index]}" }
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun PromoSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFF0F4FF))
            .padding(16.dp)
    ) {
        Text(
            text = "Promo",
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(160.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            repeat(2) { index ->
                Image(
                    painter = painterResource(id = R.drawable.ic_placeholder),
                    contentDescription = "Promo Image ${index + 1}",
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                        .clip(RoundedCornerShape(12.dp))
                )
            }
        }
    }
}

@Composable
private fun BottomNavigationBar() {
    NavigationBar(
        containerColor = Color(0xFFE3F2FD),
        modifier = Modifier
            .fillMaxWidth()
            .height(80.dp)
//            .align(Alignment.BottomCenter)
    ) {
        NavigationBarItem(
            selected = true,
            onClick = {},
            icon = {
                Icon(
                    Icons.Default.AddCircle,
                    contentDescription = "Bottom Nav Home"
                )
            },
            label = { Text("Home", color = Color.Black) }
        )
        NavigationBarItem(
            selected = false,
            onClick = {},
            icon = {
                Icon(
                    Icons.Default.AddCircle,
                    contentDescription = "Bottom Nav Transaction"
                )
            },
            label = { Text("Transaction", color = Color.Black) }
        )
        NavigationBarItem(
            selected = false,
            onClick = {},
            icon = {
                Box(
                    modifier = Modifier
                        .size(48.dp)
                        .clip(CircleShape)
                        .background(Color(0xFF1976D2)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        Icons.Default.AddCircle,
                        contentDescription = "Bottom Nav Center"
                    )
                }
            },
            label = { Text("") }
        )
        NavigationBarItem(
            selected = false,
            onClick = {},
            icon = {
                Icon(
                    Icons.Default.AddCircle,
                    contentDescription = "Bottom Nav Notification"
                )
            },
            label = { Text("Notification", color = Color.Black) }
        )
        NavigationBarItem(
            selected = false,
            onClick = {},
            icon = {
                Icon(
                    Icons.Default.AddCircle,
                    contentDescription = "Bottom Nav Profile"
                )
            },
            label = { Text("Profile", color = Color.Black) }
        )
    }
}
