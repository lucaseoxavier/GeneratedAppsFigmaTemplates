package com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v3.bca// Required imports

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.stateDescription
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lucaseox.generatedappsfigmatemplates.R

@Composable
fun SetLimitScreen() {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .background(Color.White)
    ) {
        TopHeader()
        ProfileSection()
        CardImage()
        LimitSliderSection()
        ActionButtons()
    }
}

@Composable
private fun TopHeader() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF1B4BA0))
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
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
                    contentDescription = "Notification icon",
                    tint = Color.White
                )
                Spacer(modifier = Modifier.width(12.dp))
                Icon(
                    imageVector = Icons.Default.AddCircle,
                    contentDescription = "Settings icon",
                    tint = Color.White
                )
            }
        }
    }
}

@Composable
private fun ProfileSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(96.dp)
                .background(Color.LightGray, shape = RoundedCornerShape(16.dp))
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_placeholder),
                contentDescription = "Profile photo",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = "Andhika Putra",
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                color = Color(0xFF1B4BA0)
            )
            Spacer(modifier = Modifier.width(4.dp))
            Icon(
                imageVector = Icons.Default.AddCircle,
                contentDescription = "Verified badge",
                tint = Color(0xFF1B4BA0)
            )
        }

        Text(
            text = "Paspor BCA 9087890908",
            fontSize = 14.sp,
            color = Color(0xFF555555)
        )
    }
}

@Composable
private fun CardImage() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 16.dp),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_placeholder),
            contentDescription = "Bank card image",
            modifier = Modifier
                .fillMaxWidth(0.9f)
                .aspectRatio(4f)
                .background(Color.Black, shape = RoundedCornerShape(16.dp)),
            contentScale = ContentScale.Crop
        )
    }
}

@Composable
private fun LimitSliderSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFF2F6FF), shape = RoundedCornerShape(topStart = 32.dp, topEnd = 32.dp))
            .padding(16.dp)
    ) {
        LimitSlider(title = "Cash Withdrawal Limit", maxLabel = "7.000.000")
        LimitSlider(title = "Transfer Limit (BCA)", maxLabel = "25.000.000")
        LimitSlider(title = "Transfer Limit (Different Bank)", maxLabel = "10.000.000")
        LimitSlider(title = "Debit Transaction Debit", maxLabel = "25.000.000")
    }
}

@Composable
private fun LimitSlider(title: String, maxLabel: String) {
    var sliderValue by remember { mutableStateOf(0.5f) }
    var textValue by remember { mutableStateOf("") }

    Column(modifier = Modifier.padding(vertical = 12.dp)) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            fontSize = 14.sp,
            color = Color(0xFF1B4BA0)
        )
        Slider(
            value = sliderValue,
            onValueChange = { sliderValue = it },
            modifier = Modifier
                .fillMaxWidth()
                .semantics {
                    contentDescription = "$title slider"
                    stateDescription = "Current value is ${(sliderValue * 100).toInt()} percent"
                },
            colors = SliderDefaults.colors(
                thumbColor = Color(0xFF1B4BA0),
                activeTrackColor = Color(0xFFB6C9F0)
            )
        )
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Min. 10.000", fontSize = 12.sp)
            OutlinedTextField(
                value = textValue,
                onValueChange = { textValue = it },
                label = { Text("Enter Amount") },
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 8.dp),
                singleLine = true
            )
            Text(text = "Min. $maxLabel", fontSize = 12.sp)
        }
    }
}

@Composable
private fun ActionButtons() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(24.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        OutlinedButton(
            onClick = {},
            modifier = Modifier
                .weight(1f)
                .height(48.dp)
        ) {
            Text("Cancel", fontWeight = FontWeight.Bold)
        }
        Spacer(modifier = Modifier.width(16.dp))
        Button(
            onClick = {},
            modifier = Modifier
                .weight(1f)
                .height(48.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF3D7AFE))
        ) {
            Text("Save", fontWeight = FontWeight.Bold)
        }
    }
}
