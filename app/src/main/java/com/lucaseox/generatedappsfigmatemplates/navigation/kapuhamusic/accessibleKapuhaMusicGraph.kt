package com.lucaseox.generatedappsfigmatemplates.navigation.kapuhamusic

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredkapuhamusic.HomeScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredkapuhamusic.KapuhaIntroScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.GridScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.Router
import com.lucaseox.generatedappsfigmatemplates.navigation.accessibleKapuhaMusicMenuButtons

fun NavGraphBuilder.accessibleKapuhaMusicGraph(navController: NavHostController) {
    navigation<Router.AccessibleKapuhaMusic.Route>(startDestination = Router.AccessibleKapuhaMusic.MenuScreen) {
        composable<Router.AccessibleKapuhaMusic.MenuScreen> {
            GridScreen(navController, accessibleKapuhaMusicMenuButtons)
        }
        composable<Router.AccessibleKapuhaMusic.StartScreen> {
            KapuhaIntroScreen()
        }
        composable<Router.AccessibleKapuhaMusic.HomeScreen> {
            HomeScreen()
        }
    }
}