// MainScreen.kt
package com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v1.rspca

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
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
import com.lucaseox.generatedappsfigmatemplates.ui.theme.GeneratedAppsFigmaTemplatesTheme
import com.lucaseox.generatedappsfigmatemplates.R

@Composable
fun ExerciseScreen() {
    GeneratedAppsFigmaTemplatesTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color.White
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 24.dp, vertical = 16.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(bottom = 16.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Back",
                        tint = Color(0xFF00AEEF)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Image(
                        painter = painterResource(id = R.drawable.ic_placeholder),
                        contentDescription = "RSPCA Logo",
                        modifier = Modifier
                            .height(40.dp)
                            .weight(1f),
                        contentScale = ContentScale.Fit
                    )
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(56.dp)
                        .background(color = Color(0xFF00AEEF), shape = RoundedCornerShape(50)),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Exercise",
                        color = Color.White,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Medium,
                        modifier = Modifier.padding(start = 24.dp)
                    )
                    Icon(
                        imageVector = Icons.Default.AddCircle,
                        contentDescription = "Exercise Icon",
                        tint = Color.White,
                        modifier = Modifier.padding(end = 24.dp)
                    )
                }

                Spacer(modifier = Modifier.height(24.dp))

                val exercises = listOf("Walk", "Stairs Running", "Treadmill", "Tug’o’war", "Summing")

                exercises.forEach { activity ->
                    ExerciseButton(text = activity)
                    Spacer(modifier = Modifier.height(16.dp))
                }

                Spacer(modifier = Modifier.weight(1f))

                BottomNavigationBar()
            }
        }
    }
}

@Composable
private fun ExerciseButton(text: String) {
    OutlinedButton(
        onClick = { },
        shape = RoundedCornerShape(50),
        border = ButtonDefaults.outlinedButtonBorder.copy(width = 2.dp, /*color = Color(0xFF00AEEF)*/),
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp),
        colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.Black)
    ) {
        Text(text = text, fontSize = 16.sp)
    }
}

@Composable
private fun BottomNavigationBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 16.dp),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = Icons.Default.Home,
            contentDescription = "Home",
            tint = Color(0xFF00AEEF),
            modifier = Modifier.size(32.dp)
        )
        Icon(
            imageVector = Icons.Default.AddCircle,
            contentDescription = "Add",
            tint = Color(0xFF00AEEF),
            modifier = Modifier.size(40.dp)
        )
        Icon(
            imageVector = Icons.Default.AddCircle,
            contentDescription = "Paw",
            tint = Color(0xFF00AEEF),
            modifier = Modifier.size(32.dp)
        )
    }
}
