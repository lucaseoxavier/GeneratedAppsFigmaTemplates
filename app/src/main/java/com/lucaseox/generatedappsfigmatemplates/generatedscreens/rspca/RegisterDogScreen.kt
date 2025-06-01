package com.lucaseox.generatedappsfigmatemplates.generatedscreens.rspca// Import statements

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lucaseox.generatedappsfigmatemplates.R

@Composable
fun RegisterDogScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .padding(top = 24.dp)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        RegisterDogHeader()

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "Registering a new dog",
            color = Color.White,
            modifier = Modifier
                .background(color = Color(0xFF00AEEF), shape = RoundedCornerShape(50))
                .padding(horizontal = 32.dp, vertical = 12.dp),
            fontSize = 18.sp,
            fontWeight = FontWeight.Medium
        )

        Spacer(modifier = Modifier.height(24.dp))

        val nameState = remember { mutableStateOf(TextFieldValue()) }
        val breedState = remember { mutableStateOf(TextFieldValue()) }
        val weightState = remember { mutableStateOf(TextFieldValue()) }
        val ageState = remember { mutableStateOf(TextFieldValue()) }
        val otherState = remember { mutableStateOf(TextFieldValue()) }

        RegisterDogTextField(placeholder = "Name", value = nameState.value) {
            nameState.value = it
        }
        RegisterDogTextField(placeholder = "Breed", value = breedState.value) {
            breedState.value = it
        }
        RegisterDogTextField(placeholder = "Weight", value = weightState.value) {
            weightState.value = it
        }
        RegisterDogTextField(placeholder = "Age", value = ageState.value) {
            ageState.value = it
        }
        RegisterDogTextField(placeholder = "Other", value = otherState.value) {
            otherState.value = it
        }

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = { /* Handle submit */ },
            colors = ButtonDefaults.buttonColors(containerColor = Color.White),
            shape = RoundedCornerShape(50),
            modifier = Modifier
                .width(150.dp)
                .height(48.dp)
                .border(
                    width = 2.dp,
                    color = Color(0xFF00AEEF),
                    shape = RoundedCornerShape(50)
                )
        ) {
            Text(text = "Submit", color = Color.Black, fontSize = 16.sp)
        }
    }
}

@Composable
private fun RegisterDogHeader() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth()
    ) {
        IconButton(onClick = { /* Handle back */ }) {
            Icon(
                imageVector = Icons.Default.AddCircle,
                contentDescription = "Back"
            )
        }
        Spacer(modifier = Modifier.weight(1f))
        Image(
            painter = painterResource(id = R.drawable.ic_placeholder),
            contentDescription = "RSPCA Logo",
            modifier = Modifier
                .height(60.dp)
                .width(150.dp)
        )
        Spacer(modifier = Modifier.weight(1f))
    }
}

@Composable
private fun RegisterDogTextField(
    placeholder: String,
    value: TextFieldValue,
    onValueChange: (TextFieldValue) -> Unit
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        placeholder = {
            Text(
                text = placeholder,
                color = Color.Gray,
                fontSize = 16.sp
            )
        },
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 6.dp)
            .height(56.dp),
        shape = RoundedCornerShape(50),
        colors = OutlinedTextFieldDefaults.colors(
            unfocusedBorderColor = Color(0xFF00AEEF),
            focusedBorderColor = Color(0xFF00AEEF),
            cursorColor = Color(0xFF00AEEF)
        ),
        singleLine = true
    )
}
