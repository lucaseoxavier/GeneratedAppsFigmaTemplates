package com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v1.rspca

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.lucaseox.generatedappsfigmatemplates.R

@Composable
fun StartScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Spacer(modifier = Modifier.height(40.dp))

        // Logo placeholder
        Image(
            painter = painterResource(id = R.drawable.ic_placeholder),
            contentDescription = "App Logo",
            modifier = Modifier.size(150.dp)
        )

        Spacer(modifier = Modifier.height(60.dp))

        // Central image placeholder
        Image(
            painter = painterResource(id = R.drawable.ic_placeholder),
            contentDescription = "Central Decoration",
            modifier = Modifier.size(200.dp)
        )

        Spacer(modifier = Modifier.weight(1f))

        // Buttons Row
        BottomButtons()

        Spacer(modifier = Modifier.height(30.dp))
    }
}

@Composable
private fun BottomButtons() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 30.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        TextButton(onClick = { /* TODO: Login action */ }) {
            Text(
                text = "LOGIN",
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color(0xFF039BE5)
            )
        }

        Divider(
            color = Color(0xFF9CCC65),
            modifier = Modifier
                .height(40.dp)
                .width(1.dp)
        )

        TextButton(onClick = { /* TODO: Sign up action */ }) {
            Text(
                text = "SIGN UP",
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color(0xFF039BE5)
            )
        }
    }
}
