package com.lucaseox.generatedappsfigmatemplates.navigation.v3.kapuhamusic

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.lucaseox.generatedappsfigmatemplates.navigation.GridScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.Router
import com.lucaseox.generatedappsfigmatemplates.navigation.v3KapuhaMusicMenuButtons

fun NavGraphBuilder.kapuhaMusicGraphV3(navController: NavHostController) {
    navigation<Router.KapuhaMusicV3.Route>(startDestination = Router.KapuhaMusicV3.MenuScreen) {
        composable<Router.KapuhaMusicV3.MenuScreen> {
            GridScreen(navController, v3KapuhaMusicMenuButtons, Router.KapuhaMusicV3.MenuScreen.name)
        }
        composable<Router.KapuhaMusicV3.HomeScreen> {
        }
        composable<Router.KapuhaMusicV3.StartScreen> {
        }
    }
}