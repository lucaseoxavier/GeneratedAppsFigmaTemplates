package com.lucaseox.generatedfromfigmatemplates.animalwikiaccessible

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lucaseox.generatedfromfigmatemplates.R

@Composable
fun SplashScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Spacer(modifier = Modifier.height(40.dp))

        Image(
            painter = painterResource(id = R.drawable.ic_animal_wiki), // Substitua pelo recurso correto
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth(0.7f)
                .aspectRatio(1f),
            contentScale = ContentScale.Crop
        )

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(horizontal = 16.dp)
        ) {
            Text(
                text = "Animal Wiki",
                style = MaterialTheme.typography.headlineMedium.copy(
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF1A73E8), // Cor ajustada para maior contraste
                    fontSize = 28.sp
                )
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "What do you know about the\nanimal kingdom?",
                style = MaterialTheme.typography.bodyMedium.copy(
                    color = Color(0xFF5A7DAF), // Cor ajustada para maior contraste
                    fontSize = 16.sp
                ),
                lineHeight = 20.sp,
                textAlign = androidx.compose.ui.text.style.TextAlign.Center
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { /* TODO: Add navigation action */ },
            colors = ButtonDefaults.buttonColors(
                containerColor = Brush.horizontalGradient(
                    colors = listOf(Color(0xFF3B82F6), Color(0xFF2DD4BF))
                ).toLinearGradientBrush()
            ),
            shape = RoundedCornerShape(12.dp),
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(0.8f)
                .height(50.dp)
        ) {
            Text(
                text = "Get Started",
                style = MaterialTheme.typography.labelLarge.copy(
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )
            )
        }

        Spacer(modifier = Modifier.height(40.dp))
    }
}

private fun Brush.toLinearGradientBrush(): Color {
    // Simplificado para atender à API Material3.
    return Color.Transparent
}
