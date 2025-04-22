package com.lucaseox.generatedappsfigmatemplates.navigation.bestbuy

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.lucaseox.generatedappsfigmatemplates.navigation.GridScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.Router
import com.lucaseox.generatedappsfigmatemplates.navigation.accessibleBestBuyMenuButtons

fun NavGraphBuilder.accessibleBestBuyGraph(navController: NavHostController) {
    navigation<Router.AccessibleBestBuy.Route>(startDestination = Router.AccessibleBestBuy.MenuScreen) {
        composable<Router.AccessibleBestBuy.MenuScreen> {
            GridScreen(navController, accessibleBestBuyMenuButtons)
        }
        composable<Router.AccessibleBestBuy.HomeScreen> {}
        composable<Router.AccessibleBestBuy.ProductScreen> {}
        composable<Router.AccessibleBestBuy.CartScreen> {}
        composable<Router.AccessibleBestBuy.CheckoutScreen> {}
    }
}