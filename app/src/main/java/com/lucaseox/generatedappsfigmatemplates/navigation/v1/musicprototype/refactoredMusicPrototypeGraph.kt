package com.lucaseox.generatedappsfigmatemplates.navigation.v1.musicprototype

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredmusicprototype.HomeScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.GridScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.Router
import com.lucaseox.generatedappsfigmatemplates.navigation.refactoredMusicPrototypeMenuButtons

fun NavGraphBuilder.refactoredMusicPrototypeGraph(navController: NavHostController) {
    navigation<Router.RefactoredMusicPrototype.Route>(startDestination = Router.RefactoredMusicPrototype.MenuScreen) {
        composable<Router.RefactoredMusicPrototype.MenuScreen> {
            GridScreen(navController, refactoredMusicPrototypeMenuButtons, Router.RefactoredMusicPrototype.MenuScreen.name)
        }
        composable<Router.RefactoredMusicPrototype.HomeScreen> {
            HomeScreen()
        }
        composable<Router.RefactoredMusicPrototype.PlayerScreen> {
            // no accessibility errors
        }
    }
}