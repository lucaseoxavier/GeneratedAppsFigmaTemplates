package com.lucaseox.generatedfromfigmatemplates

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.lucaseox.generatedfromfigmatemplates.navigation.AppNavigation
import com.lucaseox.generatedfromfigmatemplates.ui.theme.GeneratedAppsFigmaTemplatesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GeneratedAppsFigmaTemplatesTheme {
                val navController = rememberNavController()
                AppNavigation(navController)
            }
        }
    }
}