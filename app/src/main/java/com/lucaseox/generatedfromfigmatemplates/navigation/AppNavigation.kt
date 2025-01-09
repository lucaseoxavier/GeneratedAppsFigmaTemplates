package com.lucaseox.generatedfromfigmatemplates.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.lucaseox.generatedfromfigmatemplates.GridScreen
import com.lucaseox.generatedfromfigmatemplates.navigation.bca.accessibleBcaGraph
import com.lucaseox.generatedfromfigmatemplates.navigation.bca.bcaGraph
import com.lucaseox.generatedfromfigmatemplates.navigation.bestbuy.accessibleBestBuyGraph
import com.lucaseox.generatedfromfigmatemplates.navigation.bestbuy.bestBuyGraph

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

        bcaGraph(navController)
        accessibleBcaGraph(navController)
    }
}
