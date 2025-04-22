package com.lucaseox.generatedappsfigmatemplates.navigation.kapuhamusic

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.lucaseox.generatedappsfigmatemplates.navigation.GridScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.Router
import com.lucaseox.generatedappsfigmatemplates.navigation.accessibleKapuhaMusicMenuButtons

fun NavGraphBuilder.accessibleKapuhaMusicGraph(navController: NavHostController) {
    navigation<Router.AccessibleKapuhaMusic.Route>(startDestination = Router.AccessibleKapuhaMusic.MenuScreen) {
        composable<Router.AccessibleKapuhaMusic.MenuScreen> {
            GridScreen(navController, accessibleKapuhaMusicMenuButtons)
        }
        composable<Router.AccessibleKapuhaMusic.StartScreen> {}
        composable<Router.AccessibleKapuhaMusic.HomeScreen> {}
    }
}