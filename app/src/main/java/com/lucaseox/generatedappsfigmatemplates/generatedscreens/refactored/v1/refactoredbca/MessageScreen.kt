package com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredbca

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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lucaseox.generatedappsfigmatemplates.R

@Composable
fun MessageScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(Color.White)
            .padding(bottom = 80.dp)
    ) {
        UserGreetingCard()
        NotificationTabs()
        NotificationCard()
        FiberPromoCard()
    }
    BottomNavigationBar()
}

@Composable
private fun UserGreetingCard() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
            .background(Color(0xFF1545A5))
            .padding(16.dp)
    ) {
        Column(modifier = Modifier.align(Alignment.TopStart)) {
            Text("Hello,", color = Color.White)
            Text("Andhika Putra", fontWeight = FontWeight.Bold, fontSize = 20.sp, color = Color.White)
            Text("9087890908", color = Color.White)
        }
        Row(modifier = Modifier.align(Alignment.TopEnd), verticalAlignment = Alignment.CenterVertically) {
            Icon(Icons.Default.AddCircle, contentDescription = "Notification Icon", tint = Color.White)
            Spacer(modifier = Modifier.width(12.dp))
            Box(
                modifier = Modifier
                    .size(16.dp)
                    .clip(CircleShape)
                    .background(Color.Black)
            )
        }
    }
}

@Composable
private fun NotificationTabs() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.Center
    ) {
        Box(
            modifier = Modifier
                .weight(1f)
                .clip(RoundedCornerShape(topStart = 12.dp, bottomStart = 12.dp))
                .background(Color(0xFFE8ECF4))
                .padding(vertical = 12.dp),
            contentAlignment = Alignment.Center
        ) {
            Text("Notification", color = Color(0xFF4A4A4A))
        }
        Box(
            modifier = Modifier
                .weight(1f)
                .clip(RoundedCornerShape(topEnd = 12.dp, bottomEnd = 12.dp))
                .background(Color(0xFF2C6FFF))
                .padding(vertical = 12.dp),
            contentAlignment = Alignment.Center
        ) {
            Text("Message (2)", color = Color.White)
        }
    }
}

@Composable
private fun NotificationCard() {
    Column(modifier = Modifier.padding(16.dp)) {
        Image(
            painter = painterResource(id = R.drawable.ic_placeholder),
            contentDescription = "Promotion Image",
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(12.dp)),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text("Ada Voucher Buat Kamu, Nih! Ayo Buruan!", fontWeight = FontWeight.Bold)
        Text(
            "Selama Januari 2022, belanja fashion, barang rumah tangga hingga skincare hemat up to 100rb dengan voucher ini",
            color = Color(0xFF4A4A4A)
        )
        Text("Berlaku hanya sampai 31 Jan 2022", fontSize = 12.sp, color = Color(0xFF4A4A4A))
    }
}

@Composable
private fun FiberPromoCard() {
    Column(modifier = Modifier.padding(16.dp)) {
        Image(
            painter = painterResource(id = R.drawable.ic_placeholder),
            contentDescription = "Fiber Promo Image",
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(12.dp)),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text("Goodbye CABLE, Hello FIBER!", fontWeight = FontWeight.Bold)
        Text(
            "Ada kejutan untuk rumahmu karena kali ini adanya diskon hingga 50% untuk paket langganan fiber. Pengalaman menonton menjadi lebih asyik!",
            color = Color(0xFF4A4A4A)
        )
        Text("Berlaku hanya sampai 31 Jan 2022", fontSize = 12.sp, color = Color(0xFF4A4A4A))
    }
}

@Composable
private fun BottomNavigationBar() {
    NavigationBar(
//        modifier = Modifier.align(Alignment.CenterHorizontally)
    ) {
        NavigationBarItem(
            selected = false,
            onClick = {},
            icon = { Icon(Icons.Default.AddCircle, contentDescription = "Home Tab") },
            label = { Text("Home") }
        )
        NavigationBarItem(
            selected = false,
            onClick = {},
            icon = { Icon(Icons.Default.AddCircle, contentDescription = "Transaction Tab") },
            label = { Text("Transaction") }
        )
        NavigationBarItem(
            selected = true,
            onClick = {},
            icon = { Icon(Icons.Default.AddCircle, contentDescription = "Notification Tab") },
            label = { Text("Notification") }
        )
        NavigationBarItem(
            selected = false,
            onClick = {},
            icon = { Icon(Icons.Default.AddCircle, contentDescription = "Profile Tab") },
            label = { Text("Profile") }
        )
    }
}
