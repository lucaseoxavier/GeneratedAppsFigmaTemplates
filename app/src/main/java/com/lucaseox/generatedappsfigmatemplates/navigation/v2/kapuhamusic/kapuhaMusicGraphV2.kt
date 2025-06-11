package com.lucaseox.generatedappsfigmatemplates.navigation.v2.kapuhamusic

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v2.kapuhamusic.MusicHomeScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v2.kapuhamusic.OnboardingScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.GridScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.Router
import com.lucaseox.generatedappsfigmatemplates.navigation.v2KapuhaMusicMenuButtons

fun NavGraphBuilder.kapuhaMusicGraphV2(navController: NavHostController) {
    navigation<Router.KapuhaMusicV2.Route>(startDestination = Router.KapuhaMusicV2.MenuScreen) {
        composable<Router.KapuhaMusicV2.MenuScreen> {
            GridScreen(navController, v2KapuhaMusicMenuButtons, Router.KapuhaMusicV2.MenuScreen.name)
        }
        composable<Router.KapuhaMusicV2.HomeScreen> {
            MusicHomeScreen()
        }
        composable<Router.KapuhaMusicV2.StartScreen> {
            OnboardingScreen()
        }
    }
}