package com.lucaseox.generatedfromfigmatemplates.navigation.bca

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.lucaseox.generatedfromfigmatemplates.GridScreen
import com.lucaseox.generatedfromfigmatemplates.navigation.Router
import com.lucaseox.generatedfromfigmatemplates.navigation.bcaMenuButtons

fun NavGraphBuilder.bcaGraph(navController: NavHostController) {
    navigation<Router.BCA.Route>(startDestination = Router.BCA.MenuScreen) {
        composable<Router.BCA.MenuScreen> {
            GridScreen(navController, bcaMenuButtons)
        }
    }
}