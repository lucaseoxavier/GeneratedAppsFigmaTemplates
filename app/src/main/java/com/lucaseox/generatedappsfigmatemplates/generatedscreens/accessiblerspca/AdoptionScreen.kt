package com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessiblerspca

// Required Imports
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
//import androidx.compose.material.icons.filled.Pets
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// Placeholder Image Resource
import com.lucaseox.generatedappsfigmatemplates.R

// ✅ Color Palette (Accessibility Compliant)
private val PrimaryBlue = Color(0xFF0079A1)
private val OnPrimary = Color.White
private val OnBackground = Color(0xFF121212)

@Composable
fun AdoptionScreen() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            HeaderSection()

            Spacer(modifier = Modifier.height(16.dp))

            AdoptionButton()

            Spacer(modifier = Modifier.height(16.dp))

            PetCard(petName = "Dog")
            Spacer(modifier = Modifier.height(12.dp))
            PetCard(petName = "Cat")

            Spacer(modifier = Modifier.height(32.dp))

            BottomNavigationBar()
        }
    }
}

@Composable
private fun HeaderSection() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 24.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = Icons.Default.ArrowBack,
            contentDescription = "Back",
            tint = PrimaryBlue,
            modifier = Modifier.size(24.dp)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.weight(1f)
        ) {
            Text(
                text = "RSPCA",
                color = PrimaryBlue,
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "for all creatures great & small",
                color = PrimaryBlue,
                fontSize = 12.sp
            )
        }
        Spacer(modifier = Modifier.width(40.dp))
    }
}

@Composable
private fun AdoptionButton() {
    Button(
        onClick = { /* Handle click */ },
        colors = ButtonDefaults.buttonColors(containerColor = PrimaryBlue),
        shape = RoundedCornerShape(50),
        modifier = Modifier
            .fillMaxWidth(0.7f)
            .height(50.dp)
    ) {
        Text(
            text = "Adoption",
            fontSize = 18.sp,
            color = OnPrimary,
            fontWeight = FontWeight.Medium
        )
    }
}

@Composable
private fun PetCard(petName: String) {
    Card(
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(4.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        modifier = Modifier
            .fillMaxWidth(0.9f)
            .clickable { /* Handle click */ }
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_placeholder),
                contentDescription = petName,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = petName,
                    fontSize = 18.sp,
                    color = OnBackground,
                    modifier = Modifier.padding(8.dp)
                )
            }
        }
    }
}

@Composable
private fun BottomNavigationBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 24.dp, vertical = 12.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(icon = Icons.Default.Home, description = "Home")
        IconButton(icon = Icons.Default.AddCircle, description = "Add")
        IconButton(icon = Icons.Default.AddCircle, description = "Pets")
    }
}

@Composable
private fun IconButton(
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    description: String
) {
    Box(
        modifier = Modifier
            .size(56.dp)
            .background(color = PrimaryBlue, shape = CircleShape)
            .clickable { },
        contentAlignment = Alignment.Center
    ) {
        Icon(
            imageVector = icon,
            contentDescription = description,
            tint = OnPrimary,
            modifier = Modifier.size(28.dp)
        )
    }
}
