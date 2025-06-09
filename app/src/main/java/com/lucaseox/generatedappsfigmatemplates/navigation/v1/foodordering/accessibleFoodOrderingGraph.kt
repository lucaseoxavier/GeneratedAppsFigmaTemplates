package com.lucaseox.generatedappsfigmatemplates.navigation.v1.foodordering

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredfoodordering.AccessibleBurgerDetailScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredfoodordering.CartScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredfoodordering.HomeScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredfoodordering.RateServiceScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.GridScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.Router
import com.lucaseox.generatedappsfigmatemplates.navigation.refactoredFoodOrderingMenuButtons

fun NavGraphBuilder.accessibleFoodOrderingGraph(navController: NavHostController) {
    navigation<Router.RefactoredFoodOrdering.Route>(startDestination = Router.RefactoredFoodOrdering.MenuScreen) {
        composable<Router.RefactoredFoodOrdering.MenuScreen> {
            GridScreen(navController, refactoredFoodOrderingMenuButtons, Router.RefactoredFoodOrdering.MenuScreen.name)
        }
        composable<Router.RefactoredFoodOrdering.HomeScreen> {
            HomeScreen()
        }
        composable<Router.RefactoredFoodOrdering.OrderScreen> {
            AccessibleBurgerDetailScreen()
        }
        composable<Router.RefactoredFoodOrdering.CartScreen> {
            CartScreen()
        }
        composable<Router.RefactoredFoodOrdering.RateScreen> {
            RateServiceScreen()
        }
    }
}