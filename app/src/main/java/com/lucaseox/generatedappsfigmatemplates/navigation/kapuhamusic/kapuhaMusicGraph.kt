package com.lucaseox.generatedappsfigmatemplates.navigation.kapuhamusic

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v1.kapuhamusic.HomeScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v1.kapuhamusic.KapuhaIntroScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.GridScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.Router
import com.lucaseox.generatedappsfigmatemplates.navigation.kapuhaMusicMenuButtons

fun NavGraphBuilder.kapuhaMusicGraph(navController: NavHostController) {
    navigation<Router.KapuhaMusic.Route>(startDestination = Router.KapuhaMusic.MenuScreen) {
        composable<Router.KapuhaMusic.MenuScreen> {
            GridScreen(navController, kapuhaMusicMenuButtons)
        }
        composable<Router.KapuhaMusic.StartScreen> {
            KapuhaIntroScreen()
        }
        composable<Router.KapuhaMusic.HomeScreen> {
            HomeScreen()
        }
    }
}