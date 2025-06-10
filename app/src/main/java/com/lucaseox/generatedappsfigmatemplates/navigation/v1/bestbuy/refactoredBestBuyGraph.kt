package com.lucaseox.generatedappsfigmatemplates.navigation.v1.bestbuy

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredbestbuy.CartScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredbestbuy.CheckoutScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredbestbuy.HomeScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredbestbuy.ProductDetailScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.GridScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.Router
import com.lucaseox.generatedappsfigmatemplates.navigation.refactoredBestBuyMenuButtons

fun NavGraphBuilder.refactoredBestBuyGraph(navController: NavHostController) {
    navigation<Router.RefactoredBestBuy.Route>(startDestination = Router.RefactoredBestBuy.MenuScreen) {
        composable<Router.RefactoredBestBuy.MenuScreen> {
            GridScreen(navController, refactoredBestBuyMenuButtons, Router.RefactoredBestBuy.MenuScreen.name)
        }
        composable<Router.RefactoredBestBuy.HomeScreen> {
            HomeScreen()
        }
        composable<Router.RefactoredBestBuy.ProductScreen> {
            ProductDetailScreen()
        }
        composable<Router.RefactoredBestBuy.CartScreen> {
            CartScreen()
        }
        composable<Router.RefactoredBestBuy.CheckoutScreen> {
            CheckoutScreen()
        }
    }
}