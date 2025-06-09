package com.lucaseox.generatedappsfigmatemplates.navigation.v2

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.lucaseox.generatedappsfigmatemplates.navigation.GridScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.Router
import com.lucaseox.generatedappsfigmatemplates.navigation.v2AppMenuButtons

fun NavGraphBuilder.v2Graph(navController: NavHostController) {
    navigation<Router.V2.Route>(startDestination = Router.V2.MenuScreen) {
        composable<Router.V2.MenuScreen> {
            GridScreen(navController, v2AppMenuButtons, Router.V2.Route.name)
        }
    }
}