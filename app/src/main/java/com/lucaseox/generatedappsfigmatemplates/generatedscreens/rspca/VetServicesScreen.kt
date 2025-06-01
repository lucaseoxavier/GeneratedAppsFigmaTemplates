package com.lucaseox.generatedappsfigmatemplates.generatedscreens.rspca

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lucaseox.generatedappsfigmatemplates.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun VetServicesScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(bottom = 72.dp)
    ) {
        TopAppBar(
            title = {},
            navigationIcon = {
                IconButton(onClick = { /* TODO: Handle back */ }) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Back"
                    )
                }
            },
            actions = {},
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        Image(
            painter = painterResource(id = R.drawable.ic_placeholder),
            contentDescription = "RSPCA Logo",
            modifier = Modifier
                .height(48.dp)
                .align(Alignment.CenterHorizontally)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { /* TODO */ },
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(horizontal = 32.dp),
            shape = RoundedCornerShape(50)
        ) {
            Text("Vet Services")
        }

        Spacer(modifier = Modifier.height(24.dp))

        VetCard("94 Carlisle Street", true, true)
        VetCard("97 Walpole Avenue", true, true)
        VetCard("49 Creedon Street", false, true)
        VetCard("24 McLachlan Street", false, false)
    }

    BottomAppBar(
//        modifier = Modifier.align(Alignment.CenterHorizontally),
        containerColor = MaterialTheme.colorScheme.primaryContainer
    ) {
        IconButton(onClick = { /* TODO */ }, modifier = Modifier.weight(1f)) {
            Icon(imageVector = Icons.Default.Home, contentDescription = "Home")
        }
        IconButton(onClick = { /* TODO */ }, modifier = Modifier.weight(1f)) {
            Icon(imageVector = Icons.Default.AddCircle, contentDescription = "Add")
        }
        IconButton(onClick = { /* TODO */ }, modifier = Modifier.weight(1f)) {
            Icon(imageVector = Icons.Default.AddCircle, contentDescription = "Pets")
        }
    }
}

@Composable
private fun VetCard(address: String, isOnline: Boolean, isOpen: Boolean) {
    Card(
        shape = RoundedCornerShape(12.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        border = ButtonDefaults.outlinedButtonBorder
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text(text = address, fontWeight = FontWeight.Bold, fontSize = 16.sp)
                Spacer(modifier = Modifier.height(4.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier
                            .size(10.dp)
                            .background(
                                color = if (isOnline) Color(0xFF4CAF50) else Color(0xFFF44336),
                                shape = CircleShape
                            )
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(
                        text = if (isOnline) "Online" else "Offline",
                        color = if (isOnline) Color(0xFF4CAF50) else Color(0xFFF44336),
                        fontSize = 14.sp
                    )
                    Spacer(modifier = Modifier.width(12.dp))
                    Text(
                        text = if (isOpen) "🐾 Open" else "🐾 Close",
                        color = if (isOpen) Color(0xFF4CAF50) else Color(0xFFE91E63),
                        fontSize = 14.sp
                    )
                }
            }
            Spacer(modifier = Modifier.width(16.dp))
            Image(
                painter = painterResource(id = R.drawable.ic_placeholder),
                contentDescription = "Profile Image",
                modifier = Modifier
                    .size(56.dp)
                    .background(Color.LightGray, shape = CircleShape),
                contentScale = ContentScale.Crop
            )
        }
    }
}
