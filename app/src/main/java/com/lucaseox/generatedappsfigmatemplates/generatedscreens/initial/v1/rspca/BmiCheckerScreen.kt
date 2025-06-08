// File: BmiCheckerScreen.kt
package com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v1.rspca

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lucaseox.generatedappsfigmatemplates.R

@Composable
fun BmiCheckerScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        BmiHeader()
        Spacer(modifier = Modifier.height(24.dp))
        BmiCheckerButton()
        Spacer(modifier = Modifier.height(24.dp))
        BmiChartImage()
        Spacer(modifier = Modifier.height(32.dp))
        BmiBottomNavigation()
    }
}

@Composable
private fun BmiHeader() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth()
    ) {
        Icon(
            imageVector = Icons.Default.ArrowBack,
            contentDescription = "Back",
            modifier = Modifier
                .size(32.dp)
                .clickable { /* Handle back navigation */ }
        )
        Spacer(modifier = Modifier.width(8.dp))
        Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxWidth()) {
            Text(
                text = "RSPCA",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF00AEEF)
            )
            Text(
                text = "for all creatures great & small",
                fontSize = 12.sp,
                color = Color.Gray
            )
        }
    }
}

@Composable
private fun BmiCheckerButton() {
    Button(
        onClick = { /* Handle click */ },
        shape = CircleShape,
        modifier = Modifier
            .height(48.dp)
            .width(200.dp)
    ) {
        Text(text = "BMI Checker", fontSize = 16.sp)
    }
}

@Composable
private fun BmiChartImage() {
    Image(
        painter = painterResource(id = R.drawable.ic_placeholder),
        contentDescription = "BMI Chart",
        contentScale = ContentScale.FillWidth,
        modifier = Modifier
            .fillMaxWidth()
            .height(300.dp)
            .background(Color(0xFFE0F7FA)) // Optional background color placeholder
    )
}

@Composable
private fun BmiBottomNavigation() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 32.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(onClick = { /* Navigate Home */ }) {
            Icon(
                imageVector = Icons.Default.Home,
                contentDescription = "Home",
                modifier = Modifier.size(36.dp)
            )
        }
        IconButton(onClick = { /* Primary action */ }) {
            Icon(
                imageVector = Icons.Default.AddCircle,
                contentDescription = "Add",
                modifier = Modifier.size(48.dp)
            )
        }
        IconButton(onClick = { /* Navigate to Help or Paw Section */ }) {
            Icon(
                imageVector = Icons.Default.AddCircle,
                contentDescription = "Help",
                modifier = Modifier.size(36.dp)
            )
        }
    }
}
