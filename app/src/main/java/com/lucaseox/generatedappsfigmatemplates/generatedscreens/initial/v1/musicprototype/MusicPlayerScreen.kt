package com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v1.musicprototype

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import com.lucaseox.generatedappsfigmatemplates.R

@Composable
fun MusicPlayerScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFF3B3E79),
                        Color(0xFF000000)
                    )
                )
            )
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TopBar()

            Spacer(modifier = Modifier.height(20.dp))

            Image(
                painter = painterResource(id = R.drawable.ic_placeholder),
                contentDescription = "Album cover",
                modifier = Modifier
                    .size(280.dp)
                    .clip(RoundedCornerShape(24.dp))
            )

            Spacer(modifier = Modifier.height(32.dp))

            Text(
                text = "Heartbreak Arcade",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                textAlign = TextAlign.Center
            )

            Text(
                text = "By Alifya Design",
                fontSize = 14.sp,
                color = Color.Gray,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(32.dp))

            Image(
                painter = painterResource(id = R.drawable.ic_placeholder),
                contentDescription = "Audio wave",
                modifier = Modifier
                    .height(80.dp)
                    .fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(48.dp))

            PlaybackControls()
        }
    }
}

@Composable
private fun TopBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                imageVector = Icons.Default.AddCircle,
                contentDescription = "Back",
                tint = Color.White
            )
        }

        Spacer(modifier = Modifier.weight(1f))

        Text(
            text = "Playing",
            fontSize = 16.sp,
            fontWeight = FontWeight.Medium,
            color = Color.White
        )

        Spacer(modifier = Modifier.weight(1f))

        Box(modifier = Modifier.size(48.dp)) // Empty space for symmetry
    }
}

@Composable
private fun PlaybackControls() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(onClick = { /* Previous action */ }) {
            Icon(
                imageVector = Icons.Default.AddCircle,
                contentDescription = "Previous",
                tint = Color.Gray,
                modifier = Modifier.size(32.dp)
            )
        }

        FloatingActionButton(
            onClick = { /* Play/Pause action */ },
            containerColor = Color(0xFF4034B7)
        ) {
            Icon(
                imageVector = Icons.Default.AddCircle,
                contentDescription = "Play",
                tint = Color.White
            )
        }

        IconButton(onClick = { /* Next action */ }) {
            Icon(
                imageVector = Icons.Default.AddCircle,
                contentDescription = "Next",
                tint = Color.Gray,
                modifier = Modifier.size(32.dp)
            )
        }
    }
}
