package com.lucaseox.generatedappsfigmatemplates.generatedscreens.bca// Required Imports

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
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
import com.lucaseox.generatedappsfigmatemplates.R // Replace with your actual package name

@Composable
fun CardBlockageScreen() {
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .background(Color.White)
    ) {
        TopBarSection()
        ProfileSection()
        CardImageSection()
        CardDetailsSection()
        ActionButtonsSection()
    }
}

@Composable
private fun TopBarSection() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF003399))
            .padding(16.dp)
    ) {
        Text(
            text = "BCA mobile",
            color = Color.White,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align(Alignment.CenterStart)
        )
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.align(Alignment.CenterEnd)
        ) {
            Icon(
                imageVector = Icons.Default.AddCircle,
                contentDescription = "Notification Icon",
                tint = Color.Red
            )
            Icon(
                imageVector = Icons.Default.AddCircle,
                contentDescription = "Profile Icon",
                tint = Color.Blue
            )
        }
    }
}

@Composable
private fun ProfileSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_placeholder),
            contentDescription = "Profile Picture",
            modifier = Modifier
                .size(96.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(8.dp))
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = "Andhika Putra",
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
            )
            Spacer(modifier = Modifier.width(4.dp))
            Icon(
                imageVector = Icons.Default.AddCircle,
                contentDescription = "Verified Icon",
                tint = Color.Blue
            )
        }
        Text(
            text = "Paspor BCA  9087890908",
            fontSize = 14.sp,
            color = Color.Gray
        )
    }
}

@Composable
private fun CardImageSection() {
    Image(
        painter = painterResource(id = R.drawable.ic_placeholder),
        contentDescription = "Card Image",
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
            .height(180.dp)
            .clip(RoundedCornerShape(12.dp)),
        contentScale = ContentScale.Crop
    )
}

@Composable
private fun CardDetailsSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
    ) {
        Text(
            text = "Card Blockage",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF003399)
        )

        Spacer(modifier = Modifier.height(16.dp))

        DetailRow(label = "Card Number", value = "4691 5112 3456 7890")
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        DetailRow(label = "Card Type", value = "Black Card")
        Divider(modifier = Modifier.padding(vertical = 8.dp))

        Text(
            text = "I hereby give instructions to BCA to block my ATM card mentioned above. By blocking the ATM card, I agree that:\n\n" +
                    "1. My TAPRES BCA, BCA Dollar, or 'Tahapan Xpresi' account connected to the ATM card will also be blocked\n" +
                    "2. Transactions using or related to the ATM card through BCA e-banking cannot be processed until the card is replaced\n\n" +
                    "For more information, please contact Halo BCA at 1500888",
            fontSize = 14.sp,
            color = Color.DarkGray,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFEFF3FF), RoundedCornerShape(8.dp))
                .padding(12.dp)
        )
    }
}

@Composable
private fun DetailRow(label: String, value: String) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = label, fontWeight = FontWeight.Medium, fontSize = 14.sp)
        Text(text = value, fontWeight = FontWeight.Normal, fontSize = 14.sp)
    }
}

@Composable
private fun ActionButtonsSection() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        OutlinedButton(
            onClick = { /* Handle Cancel */ },
            modifier = Modifier
                .weight(1f)
                .height(48.dp)
        ) {
            Text("Cancel")
        }
        Spacer(modifier = Modifier.width(16.dp))
        Button(
            onClick = { /* Handle Save */ },
            modifier = Modifier
                .weight(1f)
                .height(48.dp)
        ) {
            Text("Save")
        }
    }
}
