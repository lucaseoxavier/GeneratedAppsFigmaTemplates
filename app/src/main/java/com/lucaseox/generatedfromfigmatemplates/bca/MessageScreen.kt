package com.lucaseox.generatedfromfigmatemplates.bca

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lucaseox.generatedfromfigmatemplates.R

@Composable
fun MessageScreen() {
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
    ) {
        Header()
        Spacer(modifier = Modifier.height(16.dp))
        NotificationTabBar()
        Spacer(modifier = Modifier.height(16.dp))
        PromoCard(
            title = "Ada Voucher Buat Kamu, Nih! Ayo Buruan!",
            description = "Selama Januari 2022, belanja fashion, barang rumah tangga hingga skincare hemat up to 100rb dengan voucher ini",
            imageRes = R.drawable.gopay_voucher,
            expiry = "Berlaku hanya sampai 31 Jan 2022"
        )
        Spacer(modifier = Modifier.height(16.dp))
        PromoCard(
            title = "Goodbye CABLE, Hello FIBER!",
            description = "Ada kejutan untuk rumahmu karena kali ini adanya diskon hingga 50% untuk paket langganan fiber. Pengalaman menonton menjadi lebih asyik!",
            imageRes = R.drawable.cbn_fiber,
            expiry = "Berlaku hanya sampai 31 Jan 2022"
        )
    }
    BottomNavigationBar()
}

@Composable
fun Header() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Text(
            text = "Hello.",
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
    }
}

@Composable
fun NotificationTabBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        TabButton(
            text = "Notification",
            isSelected = false
        )
        TabButton(
            text = "Message (2)",
            isSelected = true
        )
    }
}

@Composable
fun TabButton(text: String, isSelected: Boolean) {
    TextButton(
        onClick = { /* Handle click */ },
        colors = ButtonDefaults.textButtonColors(
            containerColor = if (isSelected) Color.Blue else Color.LightGray,
            contentColor = Color.White
        ),
        modifier = Modifier
            .height(48.dp)
    ) {
        Text(text)
    }
}

@Composable
fun PromoCard(title: String, description: String, imageRes: Int, expiry: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.elevatedCardElevation(4.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Image(
                painter = painterResource(id = imageRes),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(120.dp)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = title,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = description,
                fontSize = 14.sp
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = expiry,
                fontSize = 12.sp,
                color = Color.Gray
            )
        }
    }
}

@Composable
private fun BottomNavigationBar() {
    NavigationBar(
        containerColor = Color.White,
        modifier = Modifier.fillMaxWidth()
    ) {
        NavigationBarItem(
            icon = { Icon(Icons.Filled.Home, contentDescription = "Home") },
            label = { Text("Home") },
            selected = false,
            onClick = { /* Handle Home click */ }
        )
        NavigationBarItem(
            icon = { Icon(Icons.Filled.ShoppingCart, contentDescription = "Transaction") },
            label = { Text("Transaction") },
            selected = false,
            onClick = { /* Handle Transaction click */ }
        )
        NavigationBarItem(
            icon = { Icon(Icons.Filled.Notifications, contentDescription = "Notification") },
            label = { Text("Notification") },
            selected = true,
            onClick = { /* Handle Notification click */ }
        )
        NavigationBarItem(
            icon = { Icon(Icons.Filled.Person, contentDescription = "Profile") },
            label = { Text("Profile") },
            selected = false,
            onClick = { /* Handle Profile click */ }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMessageScreen() {
    MessageScreen()
}
