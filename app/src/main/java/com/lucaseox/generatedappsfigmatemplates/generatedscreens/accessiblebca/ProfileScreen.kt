package com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessiblebca

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
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lucaseox.generatedappsfigmatemplates.R

@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        // Header
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF0D47A1))
                .padding(top = 16.dp, bottom = 48.dp),
            contentAlignment = Alignment.TopCenter
        ) {
            Row(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 24.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.Top
            ) {
                Text(
                    text = "BCA mobile",
                    color = Color.White,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = Icons.Default.AddCircle,
                        contentDescription = "Status Indicator",
                        tint = Color(0xFFFF6666), // Adjusted for contrast
                        modifier = Modifier.size(16.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Icon(
                        imageVector = Icons.Default.AddCircle,
                        contentDescription = "Notification Icon",
                        tint = Color.White,
                        modifier = Modifier.size(24.dp)
                    )
                }
            }

            Image(
                painter = painterResource(id = R.drawable.ic_placeholder),
                contentDescription = "Profile Picture",
                modifier = Modifier
                    .size(96.dp)
                    .offset(y = 56.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )
        }

        Spacer(modifier = Modifier.height(56.dp))

        // Name and ID section
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = "Andhika Putra",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = "Paspor BCA  9087890908",
                    color = Color(0xFF666666), // Adjusted for contrast
                    fontSize = 14.sp
                )
                Spacer(modifier = Modifier.width(4.dp))
                Icon(
                    imageVector = Icons.Default.AddCircle,
                    contentDescription = "Copy Passport ID",
                    modifier = Modifier.size(16.dp),
                    tint = Color.Gray
                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Card Image
        Image(
            painter = painterResource(id = R.drawable.ic_placeholder),
            contentDescription = "Card Image",
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp)
                .height(180.dp)
                .clip(RoundedCornerShape(12.dp)),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Card Number box
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp)
                .background(Color(0xFF1E88E5), RoundedCornerShape(12.dp)) // Darker blue for contrast
                .padding(16.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Column {
                    Text(
                        text = "Card Number",
                        color = Color.White.copy(alpha = 0.95f) // Lightened text for contrast
                    )
                    Text(
                        text = "4691 5112 3456 7890",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp
                    )
                }
                Icon(
                    imageVector = Icons.Default.AddCircle,
                    contentDescription = "Copy Card Number",
                    tint = Color.White
                )
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        // Action Buttons
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            ActionItem(title = "Control", description = "Control Button")
            ActionItem(title = "Set Limit", description = "Set Limit Button")
            ActionItem(title = "Block", description = "Block Button")
        }

        Spacer(modifier = Modifier.height(32.dp))

        // Bottom Navigation
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFEFF3FB))
                .padding(vertical = 12.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            BottomNavItem(label = "Home", description = "Home Navigation")
            BottomNavItem(label = "Transaction", description = "Transaction Navigation")
            BottomNavItem(label = "Notification", description = "Notification Navigation")
            BottomNavItem(label = "Profile", isSelected = true, description = "Profile Navigation")
        }
    }
}

@Composable
private fun ActionItem(title: String, description: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Icon(
            imageVector = Icons.Default.AddCircle,
            contentDescription = description,
            tint = Color(0xFF1976D2),
            modifier = Modifier
                .size(48.dp)
                .background(Color(0xFFDCEEFF), CircleShape)
                .padding(8.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = title)
    }
}

@Composable
private fun BottomNavItem(label: String, isSelected: Boolean = false, description: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Icon(
            imageVector = Icons.Default.AddCircle,
            contentDescription = description,
            tint = if (isSelected) Color(0xFF0D47A1) else Color.Gray
        )
        Text(
            text = label,
            fontSize = 12.sp,
            color = if (isSelected) Color(0xFF0D47A1) else Color.Gray,
            textAlign = TextAlign.Center
        )
    }
}
