package com.lucaseox.generatedappsfigmatemplates.navigation.v3

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.lucaseox.generatedappsfigmatemplates.navigation.GridScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.Router
import com.lucaseox.generatedappsfigmatemplates.navigation.v3AppMenuButtons

fun NavGraphBuilder.v3Graph(navController: NavHostController) {
    navigation<Router.V3.Route>(startDestination = Router.V3.MenuScreen) {
        composable<Router.V3.MenuScreen> {
            GridScreen(navController, v3AppMenuButtons, Router.V3.Route.name)
        }
    }
}