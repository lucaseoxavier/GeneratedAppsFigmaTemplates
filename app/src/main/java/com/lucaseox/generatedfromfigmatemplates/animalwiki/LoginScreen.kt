package com.lucaseox.generatedfromfigmatemplates.animalwiki

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lucaseox.generatedfromfigmatemplates.R

@Composable
fun LoginScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        HeaderImage()

        Column(modifier = Modifier.fillMaxWidth()) {
            Text(
                text = "Welcome Back!",
                style = TextStyle(
                    color = Color(0xFF76B5E7),
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold
                ),
                modifier = Modifier.padding(bottom = 16.dp)
            )

            InputField(label = "Email")
            Spacer(modifier = Modifier.height(8.dp))
            InputField(label = "Password")
        }

        Column(modifier = Modifier.fillMaxWidth()) {
            LoginButton()
            Spacer(modifier = Modifier.height(8.dp))
            GetStartedButton()
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Forgot your password?",
                style = TextStyle(
                    color = Color(0xFF76B5E7),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium
                )
            )
        }
    }
}

@Composable
private fun HeaderImage() {
    Image(
        painter = painterResource(id = R.drawable.ic_animal_wiki), // Substitua por sua imagem
        contentDescription = "Header Image",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .height(200.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(bottomEnd = 100.dp))
    )
}

@Composable
private fun InputField(label: String) {
    val text = remember { "" }

    BasicTextField(
        value = text,
        onValueChange = {},
        textStyle = TextStyle(
            color = Color.Black,
            fontSize = 16.sp
        ),
        modifier = Modifier
            .fillMaxWidth()
            .background(
                color = Color(0xFFF2F2F2),
                shape = RoundedCornerShape(8.dp)
            )
            .padding(16.dp),
        decorationBox = { innerTextField ->
            if (text.isEmpty()) {
                Text(
                    text = label,
                    style = TextStyle(
                        color = Color.Gray,
                        fontSize = 16.sp
                    )
                )
            }
            innerTextField()
        }
    )
}

@Composable
private fun LoginButton() {
    Button(
        onClick = {},
        colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier
            .fillMaxWidth()
            .background(
                brush = Brush.horizontalGradient(
                    colors = listOf(
                        Color(0xFF5A98F7),
                        Color(0xFF3CE6E8)
                    )
                ),
                shape = RoundedCornerShape(8.dp)
            )
    ) {
        Text(
            text = "Login",
            style = TextStyle(
                color = Color.White,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
        )
    }
}

@Composable
private fun GetStartedButton() {
    OutlinedButton(
        onClick = {},
        shape = RoundedCornerShape(8.dp),
        border = ButtonDefaults.outlinedButtonBorder,
        colors = ButtonDefaults.outlinedButtonColors(containerColor = Color.Transparent),
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = "Get started",
            style = TextStyle(
                color = Color(0xFF76B5E7),
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
        )
    }
}
