package com.lucaseox.generatedfromfigmatemplates.navigation.kapuhamusic

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.lucaseox.generatedfromfigmatemplates.GridScreen
import com.lucaseox.generatedfromfigmatemplates.navigation.Router
import com.lucaseox.generatedfromfigmatemplates.navigation.accessibleKapuhaMusicMenuButtons

fun NavGraphBuilder.accessibleKapuhaMusicGraph(navController: NavHostController) {
    navigation<Router.AccessibleKapuhaMusic.Route>(startDestination = Router.AccessibleKapuhaMusic.MenuScreen) {
        composable<Router.AccessibleKapuhaMusic.MenuScreen> {
            GridScreen(navController, accessibleKapuhaMusicMenuButtons)
        }
    }
}