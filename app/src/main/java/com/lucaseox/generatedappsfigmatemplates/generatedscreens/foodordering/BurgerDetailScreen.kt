package com.lucaseox.generatedappsfigmatemplates.generatedscreens.foodordering// Necessary imports

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// Replace this with your actual drawable resource
import com.lucaseox.generatedappsfigmatemplates.R

@Composable
fun BurgerDetailScreen() {
    val scrollState = rememberScrollState()
    var quantity by remember { mutableStateOf(2) }
    var selectedSize by remember { mutableStateOf("M") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .padding(16.dp)
    ) {
        // Top bar with back and favorite icons
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            IconButton(onClick = { /* TODO: Handle back */ }) {
                Icon(imageVector = Icons.Default.AddCircle, contentDescription = "Back")
            }
            IconButton(onClick = { /* TODO: Handle favorite */ }) {
                Icon(imageVector = Icons.Default.AddCircle, contentDescription = "Favorite")
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        // Title
        Text(
            text = "Chipotle Cheesy Chicken",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF1D1D1D),
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

        // Subtitle
        Text(
            text = "A signature flame-grilled chicken\npatty topped with smoked beef",
            fontSize = 14.sp,
            color = Color(0xFF707070),
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(top = 8.dp)
                .align(Alignment.CenterHorizontally)
        )

        // Burger image
        Image(
            painter = painterResource(id = R.drawable.ic_placeholder),
            contentDescription = "Burger Image",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .padding(vertical = 24.dp)
        )

        // Size selection
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            SizeOption("S", selectedSize) { selectedSize = it }
            SizeOption("M", selectedSize) { selectedSize = it }
            SizeOption("L", selectedSize) { selectedSize = it }
        }

        Spacer(modifier = Modifier.height(24.dp))

        // Quantity selector
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxWidth()
        ) {
            IconButton(
                onClick = { if (quantity > 1) quantity-- },
                modifier = Modifier
                    .size(48.dp)
                    .background(Color(0xFFF85888), CircleShape)
            ) {
                Text("-", fontSize = 24.sp, color = Color.White)
            }

            Text(
                text = quantity.toString(),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(horizontal = 24.dp)
            )

            IconButton(
                onClick = { quantity++ },
                modifier = Modifier
                    .size(48.dp)
                    .background(Color(0xFFF85888), CircleShape)
            ) {
                Text("+", fontSize = 24.sp, color = Color.White)
            }
        }

        Spacer(modifier = Modifier.height(32.dp))

        // Price and button
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                Text(
                    text = "Price",
                    fontSize = 14.sp,
                    color = Color.Gray
                )
                Text(
                    text = "$41.90",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF1D1D1D)
                )
            }

            Button(
                onClick = { /* TODO: Handle add to cart */ },
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF85888)),
                modifier = Modifier
                    .height(56.dp)
                    .width(180.dp)
            ) {
                Icon(imageVector = Icons.Default.AddCircle, contentDescription = "Cart", tint = Color.White)
                Spacer(modifier = Modifier.width(8.dp))
                Text("Go to Cart", color = Color.White)
            }
        }
    }
}

@Composable
private fun SizeOption(size: String, selectedSize: String, onSelected: (String) -> Unit) {
    val isSelected = size == selectedSize
    val backgroundColor = if (isSelected) Color(0xFFF85888) else Color.White
    val textColor = if (isSelected) Color.White else Color.Black

    Box(
        modifier = Modifier
            .size(56.dp)
            .background(backgroundColor, RoundedCornerShape(12.dp))
            .clickable { onSelected(size) },
        contentAlignment = Alignment.Center
    ) {
        Text(text = size, color = textColor, fontWeight = FontWeight.Bold)
    }
}
