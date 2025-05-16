package com.lucaseox.generatedappsfigmatemplates.navigation.foodordering

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessiblefoodordering.AccessibleBurgerDetailScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessiblefoodordering.CartScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessiblefoodordering.HomeScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessiblefoodordering.RateServiceScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.GridScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.Router
import com.lucaseox.generatedappsfigmatemplates.navigation.accessibleFoodOrderingMenuButtons

fun NavGraphBuilder.accessibleFoodOrderingGraph(navController: NavHostController) {
    navigation<Router.AccessibleFoodOrdering.Route>(startDestination = Router.AccessibleFoodOrdering.MenuScreen) {
        composable<Router.AccessibleFoodOrdering.MenuScreen> {
            GridScreen(navController, accessibleFoodOrderingMenuButtons)
        }
        composable<Router.AccessibleFoodOrdering.HomeScreen> {
            HomeScreen()
        }
        composable<Router.AccessibleFoodOrdering.OrderScreen> {
            AccessibleBurgerDetailScreen()
        }
        composable<Router.AccessibleFoodOrdering.CartScreen> {
            CartScreen()
        }
        composable<Router.AccessibleFoodOrdering.RateScreen> {
            RateServiceScreen()
        }
    }
}