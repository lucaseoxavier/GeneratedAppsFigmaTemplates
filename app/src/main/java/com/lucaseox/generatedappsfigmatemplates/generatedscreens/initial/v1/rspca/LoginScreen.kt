package com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v1.rspca// Required imports

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.ImeAction
import com.lucaseox.generatedappsfigmatemplates.R // Replace with your actual package name

@Composable
fun LoginScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 32.dp)
            .padding(top = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            imageVector = Icons.Default.AddCircle,
            contentDescription = "Back Button",
            tint = Color.Black,
            modifier = Modifier
                .align(Alignment.Start)
                .size(24.dp)
        )

        Spacer(modifier = Modifier.height(24.dp))

        Image(
            painter = painterResource(id = R.drawable.ic_placeholder),
            contentDescription = "Logo",
            modifier = Modifier
                .height(80.dp),
            contentScale = ContentScale.Fit
        )

        Spacer(modifier = Modifier.height(48.dp))

        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }

        LoginTextField(
            value = email,
            onValueChange = { email = it },
            placeholder = "E-mail",
            isPassword = false
        )

        Spacer(modifier = Modifier.height(16.dp))

        LoginTextField(
            value = password,
            onValueChange = { password = it },
            placeholder = "Password",
            isPassword = true
        )

        Spacer(modifier = Modifier.height(48.dp))

        Button(
            onClick = { /* Handle login */ },
            shape = RoundedCornerShape(50),
            colors = ButtonDefaults.buttonColors(containerColor = Color.White),
            border = ButtonDefaults.outlinedButtonBorder,
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp)
                .shadow(4.dp, shape = RoundedCornerShape(50))
        ) {
            Text(
                text = "Login",
                color = Color.Black,
                fontSize = 16.sp,
                textAlign = TextAlign.Center
            )
        }
    }
}

@Composable
private fun LoginTextField(
    value: String,
    onValueChange: (String) -> Unit,
    placeholder: String,
    isPassword: Boolean
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        placeholder = {
            Text(text = placeholder, color = Color.Gray)
        },
        singleLine = true,
        shape = RoundedCornerShape(50),
        visualTransformation = if (isPassword) PasswordVisualTransformation() else VisualTransformation.None,
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp)
            .shadow(4.dp, shape = RoundedCornerShape(50)),
        colors = OutlinedTextFieldDefaults.colors(
            unfocusedBorderColor = Color(0xFF03A9F4),
            focusedBorderColor = Color(0xFF03A9F4),
            unfocusedContainerColor = Color.White,
            focusedContainerColor = Color.White
        ),
//        keyboardOptions = androidx.compose.ui.text.input.KeyboardOptions(
//            keyboardType = if (isPassword) KeyboardType.Password else KeyboardType.Email,
//            imeAction = ImeAction.Next
//        )
    )
}
