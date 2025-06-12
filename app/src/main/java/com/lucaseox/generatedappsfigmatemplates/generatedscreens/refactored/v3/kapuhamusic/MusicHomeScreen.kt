package com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v3.kapuhamusic

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lucaseox.generatedappsfigmatemplates.R

@Composable
fun MusicHomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        ProfileHeader()
        TopFiveMusicSection()
        MostListeningSection()
        BottomNavigationBar()
    }
}

@Composable
private fun ProfileHeader() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(180.dp)
            .background(
                Brush.verticalGradient(
                    colors = listOf(Color(0xFF7A00C2), Color(0xFFDA58A5))
                )
            )
            .padding(16.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = R.drawable.ic_placeholder),
                contentDescription = "Profile image",
                modifier = Modifier
                    .size(72.dp)
                    .clip(CircleShape)
            )
            Spacer(modifier = Modifier.width(12.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text("Connie Pena", color = Color.White, fontWeight = FontWeight.Bold)
                Text("United States, Peoria", color = Color.White, fontSize = 12.sp)
                Text("July 21, 2019", color = Color.White, fontSize = 12.sp)
            }
            Column(horizontalAlignment = Alignment.End) {
                Icon(
                    imageVector = Icons.Default.AddCircle,
                    contentDescription = "Add user",
                    tint = Color.White
                )
                Spacer(modifier = Modifier.height(8.dp))
                Icon(
                    imageVector = Icons.Default.AddCircle,
                    contentDescription = "Add friend",
                    tint = Color.White
                )
            }
        }
    }
}

@Composable
private fun TopFiveMusicSection() {
    Column(modifier = Modifier.padding(vertical = 16.dp)) {
        SectionTitle("top-5 music", "ever")
        LazyRow(
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items((1..5).toList()) { index ->
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Box(modifier = Modifier.semantics { contentDescription = "Top music cover $index" }) {
                        Image(
                            painter = painterResource(id = R.drawable.ic_placeholder),
                            contentDescription = null,
                            modifier = Modifier
                                .size(120.dp)
                                .clip(MaterialTheme.shapes.medium)
                        )
                        Icon(
                            imageVector = Icons.Default.AddCircle,
                            contentDescription = "Play button",
                            tint = Color.White,
                            modifier = Modifier
                                .align(Alignment.Center)
                                .size(32.dp)
                        )
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Text("$index. Lil Nas X, Nas\nRodeo", textAlign = TextAlign.Center, fontSize = 12.sp)
                }
            }
        }
    }
}

@Composable
private fun MostListeningSection() {
    Column(modifier = Modifier.padding(vertical = 16.dp)) {
        SectionTitle("most listening", "ever")
        Column(modifier = Modifier.padding(horizontal = 16.dp)) {
            repeat(2) { index ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(modifier = Modifier.semantics { contentDescription = "Most listened image ${index + 1}" }) {
                        Image(
                            painter = painterResource(id = R.drawable.ic_placeholder),
                            contentDescription = null,
                            modifier = Modifier
                                .size(72.dp)
                                .clip(MaterialTheme.shapes.medium)
                        )
                        Icon(
                            imageVector = Icons.Default.AddCircle,
                            contentDescription = "Play button",
                            tint = Color.White,
                            modifier = Modifier
                                .align(Alignment.Center)
                                .size(24.dp)
                        )
                    }
                    Spacer(modifier = Modifier.width(12.dp))
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = "Lil Nas X, Nas - Rodeo",
                            fontWeight = FontWeight.SemiBold,
                            modifier = Modifier.semantics { contentDescription = "Track title ${index + 1}" }
                        )
                        Text(
                            text = "Album: 7 EP",
                            fontSize = 12.sp,
                            color = Color(0xFF555555),
                            modifier = Modifier.semantics { contentDescription = "Album info ${index + 1}" }
                        )
                        Text(
                            text = "6125 listening",
                            fontSize = 12.sp,
                            color = Color(0xFF555555),
                            modifier = Modifier.semantics { contentDescription = "Listening count ${index + 1}" }
                        )
                    }
                    Icon(
                        imageVector = Icons.Default.AddCircle,
                        contentDescription = "Options button ${index + 1}"
                    )
                }
            }
        }
    }
}

@Composable
private fun SectionTitle(title: String, highlight: String) {
    Row(modifier = Modifier.padding(horizontal = 16.dp)) {
        Text(text = title, fontSize = 16.sp, fontWeight = FontWeight.Medium)
        Spacer(modifier = Modifier.width(4.dp))
        Text(
            text = highlight,
            fontSize = 16.sp,
            color = Color(0xFFB0006D), // Increased contrast for accessibility
            fontWeight = FontWeight.Medium,
            modifier = Modifier.semantics { contentDescription = "$title highlight" }
        )
    }
}

@Composable
private fun BottomNavigationBar() {
    NavigationBar(modifier = Modifier.fillMaxWidth()) {
        repeat(5) {
            NavigationBarItem(
                icon = {
                    Icon(
                        imageVector = Icons.Default.AddCircle,
                        contentDescription = "Navigation item ${it + 1}"
                    )
                },
                selected = false,
                onClick = {}
            )
        }
    }
}
