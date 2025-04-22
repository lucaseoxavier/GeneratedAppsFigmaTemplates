// AccessibleLoginScreen.kt
package com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessibleanimalwiki

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lucaseox.generatedappsfigmatemplates.R

@Composable
fun AccessibleLoginScreen() {
    val scrollState = rememberScrollState()
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .padding(horizontal = 24.dp, vertical = 32.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_placeholder),
            contentDescription = "Placeholder image",
            modifier = Modifier
                .size(200.dp)
                .padding(bottom = 32.dp),
            contentScale = ContentScale.Crop
        )

        Text(
            text = "Welcome\nBack!",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF0077CC),
            lineHeight = 36.sp
        )

        Spacer(modifier = Modifier.height(32.dp))

        AccessibleTextField(
            value = email,
            onValueChange = { email = it },
            placeholder = "Email"
        )

        Spacer(modifier = Modifier.height(16.dp))

        AccessibleTextField(
            value = password,
            onValueChange = { password = it },
            placeholder = "Password"
        )

        Spacer(modifier = Modifier.height(32.dp))

        GradientButton(text = "Login", onClick = {})

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedButton(
            onClick = {},
            shape = RoundedCornerShape(12.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Get started",
                color = Color(0xFF0077CC),
                fontWeight = FontWeight.Bold
            )
        }

        Spacer(modifier = Modifier.height(24.dp))

        TextButton(onClick = {}) {
            Text(
                text = "Forgot your password?",
                color = Color(0xFF0077CC)
            )
        }
    }
}

@Composable
private fun AccessibleTextField(
    value: String,
    onValueChange: (String) -> Unit,
    placeholder: String
) {
    Column(modifier = Modifier.fillMaxWidth()) {
        BasicTextField(
            value = value,
            onValueChange = onValueChange,
            textStyle = TextStyle(
                color = Color.Black,
                fontSize = 16.sp
            ),
            decorationBox = { innerTextField ->
                Column {
                    if (value.isEmpty()) {
                        Text(
                            text = placeholder,
                            color = Color(0xFF0077CC),
                            fontSize = 16.sp
                        )
                    }
                    innerTextField()
                    Spacer(modifier = Modifier.height(4.dp))
                    Divider(color = Color(0xFF0077CC), thickness = 1.dp)
                }
            }
        )
    }
}

@Composable
private fun GradientButton(
    text: String,
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp),
        shape = RoundedCornerShape(12.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
        contentPadding = PaddingValues()
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.horizontalGradient(
                        colors = listOf(Color(0xFF4B86F0), Color(0xFF1FE9C2))
                    ),
                    shape = RoundedCornerShape(12.dp)
                ),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = text,
                color = Color.White,
                fontWeight = FontWeight.Bold
            )
        }
    }
}
