package com.lucaseox.generatedappsfigmatemplates.navigation.v2.kapuhamusic

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.lucaseox.generatedappsfigmatemplates.navigation.GridScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.Router
import com.lucaseox.generatedappsfigmatemplates.navigation.refactoredV2KapuhaMusicMenuButtons

fun NavGraphBuilder.refactoredKapuhaMusicGraphV2(navController: NavHostController) {
    navigation<Router.RefactoredKapuhaMusicV2.Route>(startDestination = Router.RefactoredKapuhaMusicV2.MenuScreen) {
        composable<Router.RefactoredKapuhaMusicV2.MenuScreen> {
            GridScreen(navController, refactoredV2KapuhaMusicMenuButtons, Router.RefactoredKapuhaMusicV2.MenuScreen.name)
        }
        composable<Router.RefactoredKapuhaMusicV2.HomeScreen> {
        }
        composable<Router.RefactoredKapuhaMusicV2.StartScreen> {
        }
    }
}