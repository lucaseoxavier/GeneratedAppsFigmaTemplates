package com.lucaseox.generatedappsfigmatemplates.navigation.bestbuy

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessiblebestbuy.CartScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessiblebestbuy.CheckoutScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessiblebestbuy.HomeScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessiblebestbuy.ProductDetailScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.GridScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.Router
import com.lucaseox.generatedappsfigmatemplates.navigation.accessibleBestBuyMenuButtons

fun NavGraphBuilder.accessibleBestBuyGraph(navController: NavHostController) {
    navigation<Router.AccessibleBestBuy.Route>(startDestination = Router.AccessibleBestBuy.MenuScreen) {
        composable<Router.AccessibleBestBuy.MenuScreen> {
            GridScreen(navController, accessibleBestBuyMenuButtons)
        }
        composable<Router.AccessibleBestBuy.HomeScreen> {
            HomeScreen()
        }
        composable<Router.AccessibleBestBuy.ProductScreen> {
            ProductDetailScreen()
        }
        composable<Router.AccessibleBestBuy.CartScreen> {
            CartScreen()
        }
        composable<Router.AccessibleBestBuy.CheckoutScreen> {
            CheckoutScreen()
        }
    }
}