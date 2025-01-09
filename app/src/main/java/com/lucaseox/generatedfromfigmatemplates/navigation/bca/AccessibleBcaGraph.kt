package com.lucaseox.generatedfromfigmatemplates.navigation.bca

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.lucaseox.generatedfromfigmatemplates.GridScreen
import com.lucaseox.generatedfromfigmatemplates.navigation.Router
import com.lucaseox.generatedfromfigmatemplates.navigation.accessibleBcaMenuButtons

fun NavGraphBuilder.accessibleBcaGraph(navController: NavHostController) {
    navigation<Router.AccessibleBCA.Route>(startDestination = Router.AccessibleBCA.MenuScreen) {
        composable<Router.AccessibleBCA.MenuScreen> {
            GridScreen(navController, accessibleBcaMenuButtons)
        }
    }
}