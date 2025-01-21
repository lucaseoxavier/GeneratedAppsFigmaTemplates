package com.lucaseox.generatedfromfigmatemplates.bca

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lucaseox.generatedfromfigmatemplates.R

@Composable
fun LoginScreen() {
    // Background color for the entire screen
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF0C519C)) // Replace with the correct blue color
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 32.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            // App Logo
            Image(
                painter = painterResource(id = R.drawable.ic_bca_logo), // Replace with your logo resource
                contentDescription = "App Logo",
                modifier = Modifier
                    .size(100.dp)
                    .padding(bottom = 24.dp)
            )

            // Welcome Text
            Text(
                text = "Welcome!",
                style = TextStyle(
                    color = Color.White,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold
                ),
                modifier = Modifier.padding(bottom = 8.dp)
            )

            // Subtitle Text
            Text(
                text = "Please enter your access code",
                style = TextStyle(
                    color = Color(0xFFB0C4DE),
                    fontSize = 16.sp
                ),
                modifier = Modifier.padding(bottom = 24.dp)
            )

            // PIN Input Field
            val pin = remember { mutableStateOf("") }
            BasicTextField(
                value = pin.value,
                onValueChange = { pin.value = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White, RoundedCornerShape(8.dp))
                    .padding(horizontal = 16.dp, vertical = 12.dp),
                textStyle = TextStyle(
                    color = Color.Gray,
                    fontSize = 16.sp
                ),
                visualTransformation = PasswordVisualTransformation(),
                singleLine = true
            )

            // Login Button
            Button(
                onClick = { /* Handle Login Action */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF5A9DF5)),
                shape = RoundedCornerShape(8.dp)
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

            // Change Password Text
            Text(
                text = "Change your password",
                style = TextStyle(
                    color = Color.White,
                    fontSize = 14.sp
                ),
                modifier = Modifier
                    .padding(top = 16.dp)
                    .clickable { /* Handle Password Change */ }
            )
        }
    }
}
