package com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v1.todo

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun RegisterScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFF2F6F5)) // background color as per design
            .verticalScroll(rememberScrollState())
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(60.dp))

            Text(
                text = "Welcome to Onboard!",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Let's help to meet up your tasks.",
                fontSize = 14.sp,
                color = Color.DarkGray,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(32.dp))

            PrivateTextField(placeholder = "Enter your full name")
            Spacer(modifier = Modifier.height(16.dp))

            PrivateTextField(placeholder = "Enter your Email", keyboardType = KeyboardType.Email)
            Spacer(modifier = Modifier.height(16.dp))

            PrivateTextField(placeholder = "Enter Password", isPassword = true)
            Spacer(modifier = Modifier.height(16.dp))

            PrivateTextField(placeholder = "Confirm password", isPassword = true)
            Spacer(modifier = Modifier.height(32.dp))

            Button(
                onClick = { /* Register logic */ },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4EC6C5)),
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
            ) {
                Text(text = "Register", fontWeight = FontWeight.Bold, color = Color.White)
            }

            Spacer(modifier = Modifier.height(24.dp))

            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(text = "Already have an account ?", color = Color.Black)
                TextButton(onClick = { /* Navigate to Sign In */ }) {
                    Text(text = "Sign In", color = Color(0xFF4EC6C5))
                }
            }
        }
    }
}

@Composable
private fun PrivateTextField(
    placeholder: String,
    keyboardType: KeyboardType = KeyboardType.Text,
    isPassword: Boolean = false
) {
    (if (isPassword) PasswordVisualTransformation() else null)?.let {
        OutlinedTextField(
        value = "",
        onValueChange = { /* Handle input */ },
        placeholder = {
            Text(text = placeholder, color = Color.Black.copy(alpha = 0.6f))
        },
        shape = RoundedCornerShape(50.dp),
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp),
        singleLine = true,
        keyboardOptions = KeyboardOptions(keyboardType = keyboardType),
        visualTransformation = it
    )
    }
}
