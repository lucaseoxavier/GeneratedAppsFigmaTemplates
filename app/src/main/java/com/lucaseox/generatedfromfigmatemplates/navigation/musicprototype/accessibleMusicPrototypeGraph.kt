package com.lucaseox.generatedfromfigmatemplates.navigation.musicprototype

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.lucaseox.generatedfromfigmatemplates.GridScreen
import com.lucaseox.generatedfromfigmatemplates.navigation.Router
import com.lucaseox.generatedfromfigmatemplates.navigation.accessibleMusicPrototypeMenuButtons

fun NavGraphBuilder.accessibleMusicPrototypeGraph(navController: NavHostController) {
    navigation<Router.AccessibleMusicPrototype.Route>(startDestination = Router.AccessibleMusicPrototype.MenuScreen) {
        composable<Router.AccessibleMusicPrototype.MenuScreen> {
            GridScreen(navController, accessibleMusicPrototypeMenuButtons)
        }
    }
}