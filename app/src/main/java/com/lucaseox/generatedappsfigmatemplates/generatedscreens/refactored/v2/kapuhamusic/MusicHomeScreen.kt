package com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v2.kapuhamusic

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
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
fun MusicHomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        HeaderSection()
        Spacer(modifier = Modifier.height(16.dp))
        TopFiveMusicSection()
        Spacer(modifier = Modifier.height(16.dp))
        MostListeningSection()
        Spacer(modifier = Modifier.height(72.dp))
    }
}

@Composable
private fun HeaderSection() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(Color(0xFFFA3B88), Color(0xFF4545F1))
                )
            )
            .padding(16.dp)
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(id = R.drawable.ic_placeholder),
                contentDescription = "Profile picture of Connie Pena",
                modifier = Modifier
                    .size(80.dp)
                    .clip(MaterialTheme.shapes.extraLarge),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text("Connie Pena", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 18.sp)
            Text(
                "United States, Peoria",
                color = Color(0xFFEDC5E5),
                fontSize = 14.sp
            )
            Text(
                "July 21, 2019",
                color = Color(0xFFEDC5E5),
                fontSize = 12.sp
            )
        }
        Row(
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(end = 8.dp, bottom = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            IconButton(
                onClick = { },
                modifier = Modifier.semantics { contentDescription = "Profile settings" }
            ) {
                Icon(imageVector = Icons.Default.AddCircle, contentDescription = null, tint = Color.White)
            }
            IconButton(
                onClick = { },
                modifier = Modifier.semantics { contentDescription = "User options" }
            ) {
                Icon(imageVector = Icons.Default.AddCircle, contentDescription = null, tint = Color.White)
            }
        }
    }
}

@Composable
private fun TopFiveMusicSection() {
    Column(modifier = Modifier.padding(start = 16.dp)) {
        Text(
            text = "top-5 music ever",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.SemiBold
        )
        Spacer(modifier = Modifier.height(8.dp))
        LazyRow(contentPadding = PaddingValues(end = 16.dp)) {
            items(5) { index ->
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(end = 12.dp)
                        .width(120.dp)
                ) {
                    Box {
                        Image(
                            painter = painterResource(id = R.drawable.ic_placeholder),
                            contentDescription = "Top music album cover ${index + 1}",
                            modifier = Modifier
                                .size(100.dp)
                                .clip(MaterialTheme.shapes.medium),
                            contentScale = ContentScale.Crop
                        )
                        Icon(
                            imageVector = Icons.Default.AddCircle,
                            contentDescription = "Play top music ${index + 1}",
                            tint = Color.White,
                            modifier = Modifier.align(Alignment.Center).size(32.dp)
                        )
                    }
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = "${index + 1}. Lil Nas X, Nas Rodeo",
                        fontSize = 12.sp,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    }
}

@Composable
private fun MostListeningSection() {
    Column(modifier = Modifier.padding(horizontal = 16.dp)) {
        Text(
            text = "most listening ever",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.SemiBold
        )
        Spacer(modifier = Modifier.height(16.dp))
        repeat(2) { index ->
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(vertical = 8.dp)
            ) {
                Box {
                    Image(
                        painter = painterResource(id = R.drawable.ic_placeholder),
                        contentDescription = "Most listened track cover ${index + 1}",
                        modifier = Modifier
                            .size(80.dp)
                            .clip(MaterialTheme.shapes.medium),
                        contentScale = ContentScale.Crop
                    )
                    Icon(
                        imageVector = Icons.Default.AddCircle,
                        contentDescription = "Play most listened track ${index + 1}",
                        tint = Color.White,
                        modifier = Modifier.align(Alignment.Center).size(28.dp)
                    )
                }
                Spacer(modifier = Modifier.width(12.dp))
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        "Lil Nas X, Nas - Rodeo",
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.semantics { contentDescription = "Track title: Lil Nas X, Nas - Rodeo" }
                    )
                    Text(
                        "Album: 7 EP",
                        fontSize = 12.sp,
                        color = Color(0xFF888888),
                        modifier = Modifier.semantics { contentDescription = "Album name: 7 EP" }
                    )
                    Text(
                        "6125 listening",
                        fontSize = 12.sp,
                        color = Color(0xFF888888),
                        modifier = Modifier.semantics { contentDescription = "Listening count: 6125" }
                    )
                }
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    IconButton(
                        onClick = { },
                        modifier = Modifier.semantics { contentDescription = "Like this track ${index + 1}" }
                    ) {
                        Icon(imageVector = Icons.Default.AddCircle, contentDescription = null)
                    }
                    IconButton(
                        onClick = { },
                        modifier = Modifier.semantics { contentDescription = "More options for track ${index + 1}" }
                    ) {
                        Icon(imageVector = Icons.Default.AddCircle, contentDescription = null)
                    }
                }
            }
        }
    }
}
