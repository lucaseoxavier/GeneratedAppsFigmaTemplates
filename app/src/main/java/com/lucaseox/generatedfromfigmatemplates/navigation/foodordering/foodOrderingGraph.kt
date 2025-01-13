package com.lucaseox.generatedfromfigmatemplates.navigation.foodordering

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.lucaseox.generatedfromfigmatemplates.GridScreen
import com.lucaseox.generatedfromfigmatemplates.navigation.Router
import com.lucaseox.generatedfromfigmatemplates.navigation.foodOrderingMenuButtons

fun NavGraphBuilder.foodOrderingGraph(navController: NavHostController) {
    navigation<Router.FoodOrdering.Route>(startDestination = Router.FoodOrdering.MenuScreen) {
        composable<Router.FoodOrdering.MenuScreen> {
            GridScreen(navController, foodOrderingMenuButtons)
        }
        composable<Router.FoodOrdering.HomeScreen> {}
        composable<Router.FoodOrdering.OrderScreen> {}
        composable<Router.FoodOrdering.CartScreen> {}
        composable<Router.FoodOrdering.RateScreen> {}
    }
}