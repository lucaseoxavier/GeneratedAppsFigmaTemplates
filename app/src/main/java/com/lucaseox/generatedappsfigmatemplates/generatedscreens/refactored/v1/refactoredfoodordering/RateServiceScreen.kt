package com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredfoodordering// Required imports
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
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
            .padding(vertical = 32.dp, horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Rate your service",
            fontSize = 20.sp,
            color = Color.Black,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier.padding(bottom = 40.dp)
        )

        RatingBlock(
            label = "How was your ",
            highlight = "food?",
            contentDescriptionPrefix = "Food",
            imageRes = R.drawable.ic_placeholder
        )

        Spacer(modifier = Modifier.height(56.dp))

        RatingBlock(
            label = "How was your ",
            highlight = "delivery?",
            contentDescriptionPrefix = "Delivery",
            imageRes = R.drawable.ic_placeholder
        )
    }
}

@Composable
private fun RatingBlock(
    label: String,
    highlight: String,
    contentDescriptionPrefix: String,
    imageRes: Int
) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = buildAnnotatedString {
                append(label)
                withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                    append(highlight)
                }
            },
            fontSize = 22.sp,
            color = Color.White,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(24.dp))

        Box(
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape)
                .background(Color.White),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = imageRes),
                contentDescription = "$contentDescriptionPrefix image",
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(100.dp)
            )
        }

        Spacer(modifier = Modifier.height(24.dp))

        Row(
            horizontalArrangement = Arrangement.spacedBy(56.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.AddCircle,
                contentDescription = "$contentDescriptionPrefix Dislike",
                tint = Color.White,
                modifier = Modifier
                    .size(48.dp)
            )
            Icon(
                imageVector = Icons.Default.AddCircle,
                contentDescription = "$contentDescriptionPrefix Like",
                tint = Color.White,
                modifier = Modifier
                    .size(48.dp)
            )
        }
    }
}
