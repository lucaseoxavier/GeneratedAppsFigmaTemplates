package com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v1.kapuhamusic

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lucaseox.generatedappsfigmatemplates.R

@Composable
fun HomeScreen() {
    Scaffold(
        bottomBar = { BottomNavigationBar() }
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            item { ProfileSection() }
            item { SectionTitle(title = "top-5 music", subtitle = "ever") }
            item { TopFiveMusicSection() }
            item { SectionTitle(title = "most listening", subtitle = "ever") }
            items(5) { index -> MostListeningItem(index) }
        }
    }
}

@Composable
private fun ProfileSection() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                Brush.verticalGradient(
                    colors = listOf(Color(0xFF833AB4), Color(0xFFE1306C))
                )
            )
            .padding(16.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = R.drawable.ic_placeholder),
                contentDescription = "Profile Picture",
                modifier = Modifier.size(72.dp),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text("Connie Pena", fontSize = 20.sp, color = Color.White)
                Text("United States, Peoria", fontSize = 14.sp, color = Color.White)
                Text("July 21, 2019", fontSize = 12.sp, color = Color.White)
            }
            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                Icon(imageVector = Icons.Default.AddCircle, contentDescription = null, tint = Color.White)
                Icon(imageVector = Icons.Default.AddCircle, contentDescription = null, tint = Color.White)
            }
        }
    }
}

@Composable
private fun SectionTitle(title: String, subtitle: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        verticalAlignment = Alignment.Bottom
    ) {
        Text(title, fontSize = 18.sp, fontWeight = FontWeight.Medium)
        Spacer(modifier = Modifier.width(4.dp))
        Text(subtitle, fontSize = 14.sp, color = Color.Red, fontWeight = FontWeight.Light)
    }
}

@Composable
private fun TopFiveMusicSection() {
    LazyRow(contentPadding = PaddingValues(horizontal = 16.dp)) {
        items(5) { index ->
            Column(
                modifier = Modifier
                    .width(120.dp)
                    .padding(end = 8.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(modifier = Modifier.height(100.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_placeholder),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.fillMaxSize()
                    )
                    Icon(
                        imageVector = Icons.Default.AddCircle,
                        contentDescription = null,
                        modifier = Modifier.align(Alignment.Center),
                        tint = Color.White
                    )
                }
                Text("${index + 1}. Lil Nas X, Nas Rodeo", fontSize = 12.sp, maxLines = 2, overflow = TextOverflow.Ellipsis)
            }
        }
    }
}

@Composable
private fun MostListeningItem(index: Int) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = R.drawable.ic_placeholder),
                contentDescription = null,
                modifier = Modifier.size(72.dp),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(12.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text("Lil Nas X, Nas – Rodeo", fontWeight = FontWeight.SemiBold)
                Text("Album: 7 EP", fontSize = 12.sp, color = Color.Gray)
                Text("6125 listening", fontSize = 12.sp, color = Color.Gray)
            }
            Icon(imageVector = Icons.Default.AddCircle, contentDescription = null)
        }
        Spacer(modifier = Modifier.height(8.dp))
        Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
            Icon(imageVector = Icons.Default.AddCircle, contentDescription = null)
            Icon(imageVector = Icons.Default.AddCircle, contentDescription = null)
        }
    }
}

@Composable
private fun BottomNavigationBar() {
    NavigationBar {
        repeat(5) {
            NavigationBarItem(
                selected = it == 0,
                onClick = {},
                icon = {
                    Icon(imageVector = Icons.Default.AddCircle, contentDescription = null)
                }
            )
        }
    }
}
