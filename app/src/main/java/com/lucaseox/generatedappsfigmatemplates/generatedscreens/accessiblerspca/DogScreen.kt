package com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessiblerspca// Imports

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
//import androidx.compose.material.icons.filled.Pets
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lucaseox.generatedappsfigmatemplates.R

@Composable
fun DogScreen() {
    Scaffold(
        topBar = { TopBar() },
        bottomBar = { BottomNavigationBar() },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /* TODO */ },
                containerColor = Color(0xFF0077C2),
                contentColor = Color.White,
                shape = CircleShape
            ) {
                Icon(
                    imageVector = Icons.Default.AddCircle,
                    contentDescription = "Add Pet"
                )
            }
        },
        floatingActionButtonPosition = FabPosition.Center
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .fillMaxSize()
                .padding(horizontal = 16.dp)
                .padding(top = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            CategoryButton()

            Spacer(modifier = Modifier.height(24.dp))

            PetItem(name = "Simba")
            Spacer(modifier = Modifier.height(16.dp))
            PetItem(name = "Zoulou")
        }
    }
}

@Composable
private fun TopBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(
            onClick = { /* TODO */ }
        ) {
            Icon(
                imageVector = Icons.Default.ArrowBack,
                contentDescription = "Back",
                tint = Color(0xFF0077C2)
            )
        }

        Spacer(modifier = Modifier.width(8.dp))

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = "RSPCA",
                color = Color(0xFF0077C2),
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "for all creatures great & small",
                fontSize = 10.sp,
                color = Color(0xFF5C5C5C)
            )
        }
    }
}

@Composable
private fun CategoryButton() {
    Button(
        onClick = { /* TODO */ },
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF0077C2)),
        shape = RoundedCornerShape(50),
        modifier = Modifier
            .fillMaxWidth(0.7f)
            .height(48.dp)
    ) {
        Text(
            text = "Dog",
            color = Color.White,
            fontSize = 18.sp
        )
    }
}

@Composable
private fun PetItem(name: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(64.dp)
            .background(
                color = Color.White,
                shape = RoundedCornerShape(50)
            )
            .border(
                width = 2.dp,
                color = Color(0xFF0077C2),
                shape = RoundedCornerShape(50)
            )
            .clickable { /* TODO */ }
            .padding(horizontal = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = name,
            modifier = Modifier.weight(1f),
            fontSize = 18.sp,
            color = Color.Black
        )
        Image(
            painter = painterResource(id = R.drawable.ic_placeholder),
            contentDescription = "$name Image",
            modifier = Modifier
                .size(48.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )
    }
}

@Composable
private fun BottomNavigationBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp)
            .background(color = Color.White),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(onClick = { /* TODO */ }) {
            Icon(
                imageVector = Icons.Default.Home,
                contentDescription = "Navigate to Home",
                tint = Color(0xFF0077C2)
            )
        }
        IconButton(onClick = { /* TODO */ }) {
            Icon(
                imageVector = Icons.Default.AddCircle,
                contentDescription = "Navigate to Add",
                tint = Color(0xFF0077C2)
            )
        }
        IconButton(onClick = { /* TODO */ }) {
            Icon(
                imageVector = Icons.Default.AddCircle,
                contentDescription = "Navigate to Pets",
                tint = Color(0xFF0077C2)
            )
        }
    }
}
