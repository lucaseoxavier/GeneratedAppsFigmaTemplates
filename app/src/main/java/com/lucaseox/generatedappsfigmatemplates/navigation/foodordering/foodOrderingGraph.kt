package com.lucaseox.generatedappsfigmatemplates.navigation.foodordering

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.foodordering.BurgerDetailScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.foodordering.CartScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.foodordering.HomeScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.foodordering.RateServiceScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.GridScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.Router
import com.lucaseox.generatedappsfigmatemplates.navigation.foodOrderingMenuButtons

fun NavGraphBuilder.foodOrderingGraph(navController: NavHostController) {
    navigation<Router.FoodOrdering.Route>(startDestination = Router.FoodOrdering.MenuScreen) {
        composable<Router.FoodOrdering.MenuScreen> {
            GridScreen(navController, foodOrderingMenuButtons)
        }
        composable<Router.FoodOrdering.HomeScreen> {
            HomeScreen()
        }
        composable<Router.FoodOrdering.OrderScreen> {
            BurgerDetailScreen()
        }
        composable<Router.FoodOrdering.CartScreen> {
            CartScreen()
        }
        composable<Router.FoodOrdering.RateScreen> {
            RateServiceScreen()
        }
    }
}