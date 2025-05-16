package com.lucaseox.generatedappsfigmatemplates.generatedscreens.foodordering// Necessary imports
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lucaseox.generatedappsfigmatemplates.R

@Composable
fun RateServiceScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF85888))
            .verticalScroll(rememberScrollState())
            .padding(vertical = 32.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Rate your service",
            style = MaterialTheme.typography.bodyLarge.copy(
                fontSize = 20.sp,
                color = Color.White,
                textAlign = TextAlign.Center
            )
        )

        Spacer(modifier = Modifier.height(48.dp))

        RatingSection(
            questionTitle = "How was your",
            questionHighlight = "food?",
            imageRes = R.drawable.ic_placeholder
        )

        Spacer(modifier = Modifier.height(48.dp))

        RatingSection(
            questionTitle = "How was your",
            questionHighlight = "delivery?",
            imageRes = R.drawable.ic_placeholder
        )
    }
}

@Composable
private fun RatingSection(
    questionTitle: String,
    questionHighlight: String,
    imageRes: Int
) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = buildString { append("$questionTitle ") },
            style = MaterialTheme.typography.bodyLarge.copy(
                fontSize = 20.sp,
                color = Color.White
            )
        )
        Text(
            text = questionHighlight,
            style = MaterialTheme.typography.bodyLarge.copy(
                fontSize = 24.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold
            )
        )

        Spacer(modifier = Modifier.height(24.dp))

        Box(
            modifier = Modifier
                .size(120.dp)
                .background(Color.White, shape = CircleShape),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = imageRes),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(100.dp)
            )
        }

        Spacer(modifier = Modifier.height(24.dp))

        Row(horizontalArrangement = Arrangement.spacedBy(64.dp)) {
            Icon(
                imageVector = Icons.Default.AddCircle,
                contentDescription = "Dislike",
                tint = Color.White,
                modifier = Modifier.size(40.dp)
            )
            Icon(
                imageVector = Icons.Default.AddCircle,
                contentDescription = "Like",
                tint = Color.White,
                modifier = Modifier.size(40.dp)
            )
        }
    }
}
