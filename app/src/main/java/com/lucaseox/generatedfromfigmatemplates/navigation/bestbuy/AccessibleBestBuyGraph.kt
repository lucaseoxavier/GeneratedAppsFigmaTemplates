package com.lucaseox.generatedfromfigmatemplates.navigation.bestbuy

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.lucaseox.generatedfromfigmatemplates.GridScreen
import com.lucaseox.generatedfromfigmatemplates.bestbuyaccessible.BestBuyHomeAccessible
import com.lucaseox.generatedfromfigmatemplates.bestbuyaccessible.CartScreenAccessible
import com.lucaseox.generatedfromfigmatemplates.bestbuyaccessible.CheckoutScreenAccessible
import com.lucaseox.generatedfromfigmatemplates.bestbuyaccessible.ProductDetailsScreenAccessible
import com.lucaseox.generatedfromfigmatemplates.navigation.Router
import com.lucaseox.generatedfromfigmatemplates.navigation.accessibleBestBuyMenuButtons

fun NavGraphBuilder.accessibleBestBuyGraph(navController: NavHostController) {
    navigation<Router.AccessibleBestBuy.Route>(startDestination = Router.AccessibleBestBuy.MenuScreen) {
        composable<Router.AccessibleBestBuy.MenuScreen> {
            GridScreen(navController, accessibleBestBuyMenuButtons)
        }
        composable<Router.AccessibleBestBuy.HomeScreen> {
            BestBuyHomeAccessible()
        }
        composable<Router.AccessibleBestBuy.ProductScreen> {
            ProductDetailsScreenAccessible()
        }
        composable<Router.AccessibleBestBuy.CartScreen> {
            CartScreenAccessible()
        }
        composable<Router.AccessibleBestBuy.CheckoutScreen> {
            CheckoutScreenAccessible()
        }
    }
}