package com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessiblerspca

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
//import androidx.compose.material.icons.filled.Pets
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lucaseox.generatedappsfigmatemplates.R


@Composable
fun GroomingServicesScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp)
    ) {
        TopBar()
        Spacer(modifier = Modifier.height(16.dp))
        GroomingTitleButton()
        Spacer(modifier = Modifier.height(16.dp))
        ServiceCard(address = "18 Henry Street", status = "Online", openStatus = "Open")
        ServiceCard(address = "48 Myrtle Street", status = "Offline", openStatus = "Open")
        ServiceCard(address = "2 Thomas Lane", status = "Offline", openStatus = "Open")
        ServiceCard(address = "8 Henry Street", status = "Offline", openStatus = "Close")
    }
    BottomNavigationBar()
}

@Composable
private fun TopBar() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = Icons.Default.ArrowBack,
            contentDescription = "Navigate back",
            tint = Color(0xFF0077B5),
            modifier = Modifier.size(48.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Image(
            painter = painterResource(id = R.drawable.ic_placeholder),
            contentDescription = "RSPCA Logo",
            modifier = Modifier.height(40.dp)
        )
    }
}

@Composable
private fun GroomingTitleButton() {
    Button(
        onClick = {},
        shape = RoundedCornerShape(50),
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF0077B5)),
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(text = "Grooming Services", color = Color.White, fontSize = 18.sp)
    }
}

@Composable
private fun ServiceCard(address: String, status: String, openStatus: String) {
    val isOnline = status == "Online"
    val isOpen = openStatus == "Open"
    val statusColor = if (isOnline) Color(0xFF4CAF50) else Color(0xFFD32F2F)
    val openColor = if (isOpen) Color(0xFF4CAF50) else Color(0xFFD32F2F)

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
            .border(2.dp, Color(0xFF0077B5), RoundedCornerShape(16.dp))
            .padding(8.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column(modifier = Modifier.weight(1f)) {
            Text(text = address, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.height(4.dp))
            Row(verticalAlignment = Alignment.CenterVertically) {
                StatusIndicator(color = statusColor)
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    text = status,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.semantics { contentDescription = "$address is $status" }
                )
                Spacer(modifier = Modifier.width(16.dp))
                StatusIndicator(color = openColor)
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    text = openStatus,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.semantics { contentDescription = "$address is $openStatus" }
                )
            }
        }
        Image(
            painter = painterResource(id = R.drawable.ic_placeholder),
            contentDescription = "Profile image of $address",
            modifier = Modifier
                .size(64.dp)
                .padding(start = 8.dp)
        )
    }
}

@Composable
private fun StatusIndicator(color: Color) {
    Box(
        modifier = Modifier
            .size(12.dp)
            .background(color = color, shape = CircleShape)
    )
}

@Composable
private fun BottomNavigationBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = Icons.Default.Home,
            contentDescription = "Navigate to Home",
            tint = Color(0xFF0077B5),
            modifier = Modifier.size(48.dp)
        )
        Icon(
            imageVector = Icons.Default.AddCircle,
            contentDescription = "Add New",
            tint = Color(0xFF0077B5),
            modifier = Modifier.size(48.dp)
        )
        Icon(
            imageVector = Icons.Default.AddCircle,
            contentDescription = "Navigate to Animal Services",
            tint = Color(0xFF0077B5),
            modifier = Modifier.size(48.dp)
        )
    }
}
