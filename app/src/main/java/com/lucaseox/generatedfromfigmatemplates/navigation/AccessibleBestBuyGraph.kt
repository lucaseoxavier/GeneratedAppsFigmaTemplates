package com.lucaseox.generatedfromfigmatemplates.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.lucaseox.generatedfromfigmatemplates.GridScreen

fun NavGraphBuilder.accessibleBestBuyGraph(navController: NavHostController) {
    navigation<Router.AccessibleBestBuy.Route>(startDestination = Router.AccessibleBestBuy.MenuScreen) {
        composable<Router.AccessibleBestBuy.MenuScreen> {
            GridScreen(navController, accessibleBestBuyMenuButtons)
        }
    }
}