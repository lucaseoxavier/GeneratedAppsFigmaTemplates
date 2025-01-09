package com.lucaseox.generatedfromfigmatemplates.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.lucaseox.generatedfromfigmatemplates.GridScreen
import com.lucaseox.generatedfromfigmatemplates.bestbuy.BestBuyHome
import com.lucaseox.generatedfromfigmatemplates.bestbuy.CartScreen
import com.lucaseox.generatedfromfigmatemplates.bestbuy.CheckoutScreen
import com.lucaseox.generatedfromfigmatemplates.bestbuy.ProductDetailsScreen

fun NavGraphBuilder.bestBuyGraph(navController: NavHostController) {
    navigation<Router.BestBuy.Route>(startDestination = Router.BestBuy.MenuScreen) {
        composable<Router.BestBuy.MenuScreen> {
            GridScreen(navController, bestBuyMenuButtons)
        }
        composable<Router.BestBuy.HomeScreen> {
            BestBuyHome()
        }
        composable<Router.BestBuy.ProductScreen> {
            ProductDetailsScreen()
        }
        composable<Router.BestBuy.CartScreen> {
            CartScreen()
        }
        composable<Router.BestBuy.CheckoutScreen> {
            CheckoutScreen()
        }
    }
}