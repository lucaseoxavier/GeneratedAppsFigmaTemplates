package com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredrspca

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lucaseox.generatedappsfigmatemplates.R


@Composable
fun PetInfoScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp)
    ) {
        TopBar()
        Spacer(modifier = Modifier.height(16.dp))
        PetNameCard(name = "Zoulou")
        Spacer(modifier = Modifier.height(24.dp))
        PetOptionCard(title = "Diet")
        Spacer(modifier = Modifier.height(16.dp))
        PetOptionCard(title = "BMI Checker")
        Spacer(modifier = Modifier.height(16.dp))
        PetOptionCard(title = "Exercise")
        Spacer(modifier = Modifier.height(24.dp))
        BottomNavigationBar()
    }
}

@Composable
private fun TopBar() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth()
    ) {
        Icon(
            imageVector = Icons.Default.ArrowBack,
            contentDescription = "Back",
            tint = Color(0xFF0077B5),
            modifier = Modifier.size(32.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxWidth()) {
            Text(
                text = "RSPCA",
                color = Color(0xFF0077B5),
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "for all creatures great & small",
                color = Color(0xFF0077B5),
                fontSize = 12.sp
            )
        }
    }
}

@Composable
private fun PetNameCard(name: String) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color(0xFF0077B5), shape = RoundedCornerShape(50))
            .padding(vertical = 12.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Pet Name : $name",
            color = Color.White,
            fontSize = 20.sp
        )
    }
}

@Composable
private fun PetOptionCard(title: String) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.White, shape = RoundedCornerShape(24.dp))
            .clickable { }
            .padding(8.dp)
            .border(2.dp, Color(0xFF0077B5), RoundedCornerShape(24.dp)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_placeholder),
            contentDescription = title,
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = title,
            fontSize = 20.sp,
            color = Color.Black,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
private fun BottomNavigationBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = Icons.Default.Home,
            contentDescription = "Home",
            tint = Color(0xFF0077B5),
            modifier = Modifier.size(48.dp)
        )
        Icon(
            imageVector = Icons.Default.AddCircle,
            contentDescription = "Add",
            tint = Color(0xFF0077B5),
            modifier = Modifier.size(64.dp)
        )
        Icon(
            imageVector = Icons.Default.AddCircle,
            contentDescription = "Pets",
            tint = Color(0xFF0077B5),
            modifier = Modifier.size(48.dp)
        )
    }
}