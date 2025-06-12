package com.lucaseox.generatedappsfigmatemplates.navigation.v3.kapuhamusic

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v3.kapuhamusic.MusicHomeScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v3.kapuhamusic.OnboardingScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.GridScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.Router
import com.lucaseox.generatedappsfigmatemplates.navigation.refactoredV3KapuhaMusicMenuButtons

fun NavGraphBuilder.refactoredKapuhaMusicGraphV3(navController: NavHostController) {
    navigation<Router.RefactoredKapuhaMusicV3.Route>(startDestination = Router.RefactoredKapuhaMusicV3.MenuScreen) {
        composable<Router.RefactoredKapuhaMusicV3.MenuScreen> {
            GridScreen(navController, refactoredV3KapuhaMusicMenuButtons, Router.RefactoredKapuhaMusicV3.MenuScreen.name)
        }
        composable<Router.RefactoredKapuhaMusicV3.HomeScreen> {
            MusicHomeScreen()
        }
        composable<Router.RefactoredKapuhaMusicV3.StartScreen> {
            OnboardingScreen()
        }
    }
}