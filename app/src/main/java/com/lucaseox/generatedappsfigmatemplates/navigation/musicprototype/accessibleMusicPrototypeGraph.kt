package com.lucaseox.generatedappsfigmatemplates.navigation.musicprototype

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredmusicprototype.HomeScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.GridScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.Router
import com.lucaseox.generatedappsfigmatemplates.navigation.accessibleMusicPrototypeMenuButtons

fun NavGraphBuilder.accessibleMusicPrototypeGraph(navController: NavHostController) {
    navigation<Router.AccessibleMusicPrototype.Route>(startDestination = Router.AccessibleMusicPrototype.MenuScreen) {
        composable<Router.AccessibleMusicPrototype.MenuScreen> {
            GridScreen(navController, accessibleMusicPrototypeMenuButtons)
        }
        composable<Router.AccessibleMusicPrototype.HomeScreen> {
            HomeScreen()
        }
        composable<Router.AccessibleMusicPrototype.PlayerScreen> {
            // no accessibility errors
        }
    }
}