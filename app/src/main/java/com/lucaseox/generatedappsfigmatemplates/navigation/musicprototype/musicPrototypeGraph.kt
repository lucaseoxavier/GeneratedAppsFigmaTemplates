package com.lucaseox.generatedappsfigmatemplates.navigation.musicprototype

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.lucaseox.generatedappsfigmatemplates.navigation.GridScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.Router
import com.lucaseox.generatedappsfigmatemplates.navigation.musicPrototypeMenuButtons

fun NavGraphBuilder.musicPrototypeGraph(navController: NavHostController) {
    navigation<Router.MusicPrototype.Route>(startDestination = Router.MusicPrototype.MenuScreen) {
        composable<Router.MusicPrototype.MenuScreen> {
            GridScreen(navController, musicPrototypeMenuButtons)
        }
        composable<Router.MusicPrototype.HomeScreen> {}
        composable<Router.MusicPrototype.PlayerScreen> {}
    }
}