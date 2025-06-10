package com.lucaseox.generatedappsfigmatemplates.navigation.v2.bca

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.lucaseox.generatedappsfigmatemplates.navigation.GridScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.Router
import com.lucaseox.generatedappsfigmatemplates.navigation.v2BcaMenuButtons

fun NavGraphBuilder.bcaGraphV2(navController: NavHostController) {
    navigation<Router.BCAV2.Route>(startDestination = Router.BCAV2.MenuScreen) {
        composable<Router.BCAV2.MenuScreen> {
            GridScreen(navController, v2BcaMenuButtons, Router.BCAV2.MenuScreen.name)
        }
        composable<Router.BCAV2.ProfileScreen> {
        }
        composable<Router.BCAV2.HomeScreen> {
        }
        composable<Router.BCAV2.TransactionScreen> {
        }
        composable<Router.BCAV2.ReceiverScreen> {
        }
        composable<Router.BCAV2.SetLimitScreen> {
        }
    }
}