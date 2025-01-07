package com.lucaseox.generatedfromfigmatemplates.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.lucaseox.generatedfromfigmatemplates.GridScreen

@Composable
fun AppNavigation(
    navController: NavHostController,
) {
    NavHost(
        navController = navController,
        startDestination = Router.MainAppMenu
    ) {
        composable<Router.MainAppMenu> {
            GridScreen(navController, mainAppMenuButtons)
        }
        bestBuyGraph(navController)
        accessibleBestBuyGraph(navController)
    }
}
