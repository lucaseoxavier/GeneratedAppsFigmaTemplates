package com.lucaseox.generatedappsfigmatemplates.navigation.v1.musicprototype

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v1.musicprototype.HomeScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v1.musicprototype.MusicPlayerScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.GridScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.Router
import com.lucaseox.generatedappsfigmatemplates.navigation.musicPrototypeMenuButtons

fun NavGraphBuilder.musicPrototypeGraph(navController: NavHostController) {
    navigation<Router.MusicPrototype.Route>(startDestination = Router.MusicPrototype.MenuScreen) {
        composable<Router.MusicPrototype.MenuScreen> {
            GridScreen(navController, musicPrototypeMenuButtons, Router.MusicPrototype.MenuScreen.name)
        }
        composable<Router.MusicPrototype.HomeScreen> {
            HomeScreen()
        }
        composable<Router.MusicPrototype.PlayerScreen> {
            MusicPlayerScreen()
        }
    }
}