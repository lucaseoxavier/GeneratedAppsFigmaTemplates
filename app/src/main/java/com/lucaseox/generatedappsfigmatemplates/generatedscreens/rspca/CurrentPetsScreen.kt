package com.lucaseox.generatedappsfigmatemplates.generatedscreens.rspca// Imports

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lucaseox.generatedappsfigmatemplates.R

@Composable
fun CurrentPetsScreen() {
    Scaffold(
        bottomBar = { BottomNavigationBar() }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            HeaderSection()
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = { /* TODO */ },
                shape = RoundedCornerShape(50),
                modifier = Modifier.fillMaxWidth(0.7f)
            ) {
                Text(text = "Current Pets", fontSize = 18.sp)
            }
            Spacer(modifier = Modifier.height(24.dp))
            PetCard(petName = "Dog")
            Spacer(modifier = Modifier.height(16.dp))
            PetCard(petName = "Cat")
        }
    }
}

@Composable
private fun HeaderSection() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth()
    ) {
        IconButton(onClick = { /* TODO */ }) {
            Icon(
                imageVector = Icons.Default.ArrowBack,
                contentDescription = "Back"
            )
        }
        Spacer(modifier = Modifier.width(8.dp))
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.weight(1f)
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_placeholder),
                contentDescription = "RSPCA Logo",
                modifier = Modifier.size(120.dp)
            )
        }
    }
}

@Composable
private fun PetCard(petName: String) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .border(
                width = 2.dp,
                color = Color(0xFF00AEEF),
                shape = RoundedCornerShape(16.dp)
            )
            .clickable { /* TODO */ }
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_placeholder),
            contentDescription = "$petName Image",
            modifier = Modifier
                .fillMaxWidth()
                .height(180.dp),
            contentScale = ContentScale.Crop
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
                .padding(vertical = 12.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(text = petName, fontSize = 18.sp)
        }
    }
}

@Composable
private fun BottomNavigationBar() {
    NavigationBar {
        NavigationBarItem(
            icon = {
                Icon(
                    imageVector = Icons.Default.Home,
                    contentDescription = "Home"
                )
            },
            selected = false,
            onClick = { /* TODO */ }
        )
        NavigationBarItem(
            icon = {
                Icon(
                    imageVector = Icons.Default.AddCircle,
                    contentDescription = "Add"
                )
            },
            selected = false,
            onClick = { /* TODO */ }
        )
        NavigationBarItem(
            icon = {
                Icon(
                    imageVector = Icons.Default.AddCircle,
                    contentDescription = "Pets"
                )
            },
            selected = false,
            onClick = { /* TODO */ }
        )
    }
}
