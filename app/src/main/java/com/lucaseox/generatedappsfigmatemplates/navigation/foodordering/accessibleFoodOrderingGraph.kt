package com.lucaseox.generatedappsfigmatemplates.navigation.foodordering

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.lucaseox.generatedappsfigmatemplates.navigation.GridScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.Router
import com.lucaseox.generatedappsfigmatemplates.navigation.accessibleFoodOrderingMenuButtons

fun NavGraphBuilder.accessibleFoodOrderingGraph(navController: NavHostController) {
    navigation<Router.AccessibleFoodOrdering.Route>(startDestination = Router.AccessibleFoodOrdering.MenuScreen) {
        composable<Router.AccessibleFoodOrdering.MenuScreen> {
            GridScreen(navController, accessibleFoodOrderingMenuButtons)
        }
        composable<Router.AccessibleFoodOrdering.HomeScreen> {}
        composable<Router.AccessibleFoodOrdering.OrderScreen> {}
        composable<Router.AccessibleFoodOrdering.CartScreen> {}
        composable<Router.AccessibleFoodOrdering.RateScreen> {}
    }
}