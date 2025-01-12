package com.lucaseox.generatedfromfigmatemplates.navigation.foodordering

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.lucaseox.generatedfromfigmatemplates.GridScreen
import com.lucaseox.generatedfromfigmatemplates.navigation.Router
import com.lucaseox.generatedfromfigmatemplates.navigation.accessibleFoodOrderingMenuButtons

fun NavGraphBuilder.accessibleFoodOrderingGraph(navController: NavHostController) {
    navigation<Router.AccessibleFoodOrdering.Route>(startDestination = Router.AccessibleFoodOrdering.MenuScreen) {
        composable<Router.AccessibleFoodOrdering.MenuScreen> {
            GridScreen(navController, accessibleFoodOrderingMenuButtons)
        }
    }
}