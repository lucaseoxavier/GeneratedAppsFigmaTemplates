package com.lucaseox.generatedappsfigmatemplates.navigation.v1.kapuhamusic

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredkapuhamusic.HomeScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredkapuhamusic.KapuhaIntroScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.GridScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.Router
import com.lucaseox.generatedappsfigmatemplates.navigation.refactoredKapuhaMusicMenuButtons

fun NavGraphBuilder.refactoredKapuhaMusicGraph(navController: NavHostController) {
    navigation<Router.RefactoredKapuhaMusic.Route>(startDestination = Router.RefactoredKapuhaMusic.MenuScreen) {
        composable<Router.RefactoredKapuhaMusic.MenuScreen> {
            GridScreen(navController, refactoredKapuhaMusicMenuButtons, Router.RefactoredKapuhaMusic.MenuScreen.name)
        }
        composable<Router.RefactoredKapuhaMusic.StartScreen> {
            KapuhaIntroScreen()
        }
        composable<Router.RefactoredKapuhaMusic.HomeScreen> {
            HomeScreen()
        }
    }
}