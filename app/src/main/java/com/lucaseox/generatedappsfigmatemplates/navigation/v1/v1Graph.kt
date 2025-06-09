package com.lucaseox.generatedappsfigmatemplates.navigation.v1

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.lucaseox.generatedappsfigmatemplates.navigation.GridScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.Router
import com.lucaseox.generatedappsfigmatemplates.navigation.v1AppMenuButtons

fun NavGraphBuilder.v1Graph(navController: NavHostController) {
    navigation<Router.V1.Route>(startDestination = Router.V1.MenuScreen) {
        composable<Router.V1.MenuScreen> {
            GridScreen(navController, v1AppMenuButtons, Router.V1.Route.name)
        }
    }
}