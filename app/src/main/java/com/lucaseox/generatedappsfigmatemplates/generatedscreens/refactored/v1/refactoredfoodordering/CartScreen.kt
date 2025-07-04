package com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredfoodordering// Required imports
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lucaseox.generatedappsfigmatemplates.R

@Composable
fun CartScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Default.AddCircle,
                    contentDescription = "Navigate back"
                )
            }
            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Default.AddCircle,
                    contentDescription = "Menu options"
                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        CartItem(
            title = "Chipotle Che...",
            quantity = 3,
            price = "$62.85"
        )
        Spacer(modifier = Modifier.height(8.dp))
        CartItem(
            title = "Beef Burger",
            quantity = 1,
            price = "$20.95"
        )

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .height(52.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1A1A63)),
            shape = RoundedCornerShape(50)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text("Apply Coupons", color = Color.White)
                Spacer(modifier = Modifier.width(8.dp))
                Icon(
                    imageVector = Icons.Default.AddCircle,
                    contentDescription = "Apply coupon",
                    tint = Color.White
                )
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        SummaryItem("Item Total", "$83.8")
        SummaryItem("Delivery Charge", "$2.25")
        SummaryItem("Tax", "$0.25")
        Spacer(modifier = Modifier.height(8.dp))
        SummaryItem("Total :", "$86.30", isBold = true)

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .height(52.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFF3D71)),
            shape = RoundedCornerShape(50)
        ) {
            Text(
                "Proceed to payment method",
                color = Color(0xFFFFFFFF), // Pure white for better contrast
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Composable
private fun CartItem(title: String, quantity: Int, price: String) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_placeholder),
                contentDescription = "$title image",
                modifier = Modifier.size(48.dp)
            )

            Text(
                text = title,
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 16.dp),
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )

            QuantitySelector(quantity = quantity, title = title)

            Spacer(modifier = Modifier.width(16.dp))

            Text(text = price, fontWeight = FontWeight.SemiBold)

            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Default.AddCircle,
                    contentDescription = "Remove $title from cart"
                )
            }
        }
    }
}

@Composable
private fun QuantitySelector(quantity: Int, title: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .background(Color(0xFFF0F0F0), shape = RoundedCornerShape(8.dp))
            .padding(horizontal = 8.dp, vertical = 4.dp)
    ) {
        IconButton(onClick = {}) {
            Icon(
                imageVector = Icons.Default.AddCircle,
                contentDescription = "Decrease quantity of $title"
            )
        }
        Text(
            text = quantity.toString(),
            fontSize = 16.sp,
            fontWeight = FontWeight.Medium,
            color = Color(0xFF000000) // Dark text for contrast
        )
        IconButton(onClick = {}) {
            Icon(
                imageVector = Icons.Default.AddCircle,
                contentDescription = "Increase quantity of $title"
            )
        }
    }
}

@Composable
private fun SummaryItem(label: String, value: String, isBold: Boolean = false) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = label,
            color = Color(0xFF6B6B6B),
            fontSize = 14.sp,
            fontWeight = if (isBold) FontWeight.Bold else FontWeight.Normal
        )
        Text(
            text = value,
            color = if (isBold) Color(0xFF1A1A63) else Color(0xFF6B6B6B),
            fontSize = 14.sp,
            fontWeight = if (isBold) FontWeight.Bold else FontWeight.Normal
        )
    }
}
