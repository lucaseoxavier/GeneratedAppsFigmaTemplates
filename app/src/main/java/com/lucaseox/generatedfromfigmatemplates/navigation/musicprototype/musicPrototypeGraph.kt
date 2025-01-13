package com.lucaseox.generatedfromfigmatemplates.navigation.musicprototype

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.lucaseox.generatedfromfigmatemplates.GridScreen
import com.lucaseox.generatedfromfigmatemplates.navigation.Router
import com.lucaseox.generatedfromfigmatemplates.navigation.musicPrototypeMenuButtons

fun NavGraphBuilder.musicPrototypeGraph(navController: NavHostController) {
    navigation<Router.MusicPrototype.Route>(startDestination = Router.MusicPrototype.MenuScreen) {
        composable<Router.MusicPrototype.MenuScreen> {
            GridScreen(navController, musicPrototypeMenuButtons)
        }
        composable<Router.MusicPrototype.HomeScreen> {}
        composable<Router.MusicPrototype.PlayerScreen> {}
    }
}