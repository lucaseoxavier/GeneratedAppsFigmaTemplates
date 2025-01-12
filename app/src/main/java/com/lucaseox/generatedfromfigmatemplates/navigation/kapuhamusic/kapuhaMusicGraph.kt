package com.lucaseox.generatedfromfigmatemplates.navigation.kapuhamusic

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.lucaseox.generatedfromfigmatemplates.GridScreen
import com.lucaseox.generatedfromfigmatemplates.navigation.Router
import com.lucaseox.generatedfromfigmatemplates.navigation.kapuhaMusicMenuButtons

fun NavGraphBuilder.kapuhaMusicGraph(navController: NavHostController) {
    navigation<Router.KapuhaMusic.Route>(startDestination = Router.KapuhaMusic.MenuScreen) {
        composable<Router.KapuhaMusic.MenuScreen> {
            GridScreen(navController, kapuhaMusicMenuButtons)
        }
    }
}