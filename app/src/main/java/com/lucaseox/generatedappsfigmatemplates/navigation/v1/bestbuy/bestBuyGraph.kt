package com.lucaseox.generatedappsfigmatemplates.navigation.v1.bestbuy

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v1.bestbuy.CartScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v1.bestbuy.CheckoutScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v1.bestbuy.HomeScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v1.bestbuy.ProductDetailScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.GridScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.Router
import com.lucaseox.generatedappsfigmatemplates.navigation.bestBuyMenuButtons

fun NavGraphBuilder.bestBuyGraph(navController: NavHostController) {
    navigation<Router.BestBuy.Route>(startDestination = Router.BestBuy.MenuScreen) {
        composable<Router.BestBuy.MenuScreen> {
            GridScreen(navController, bestBuyMenuButtons)
        }
        composable<Router.BestBuy.HomeScreen> {
            HomeScreen()
        }
        composable<Router.BestBuy.ProductScreen> {
            ProductDetailScreen()
        }
        composable<Router.BestBuy.CartScreen> {
            CartScreen()
        }
        composable<Router.BestBuy.CheckoutScreen> {
            CheckoutScreen()
        }
    }
}