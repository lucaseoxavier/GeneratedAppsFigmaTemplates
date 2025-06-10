package com.lucaseox.generatedappsfigmatemplates.navigation.v3.bca

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.lucaseox.generatedappsfigmatemplates.navigation.GridScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.Router
import com.lucaseox.generatedappsfigmatemplates.navigation.v3BcaMenuButtons

fun NavGraphBuilder.bcaGraphV3(navController: NavHostController) {
    navigation<Router.BCAV3.Route>(startDestination = Router.BCAV3.MenuScreen) {
        composable<Router.BCAV3.MenuScreen> {
            GridScreen(navController, v3BcaMenuButtons, Router.BCAV3.MenuScreen.name)
        }
        composable<Router.BCAV3.ProfileScreen> {
        }
        composable<Router.BCAV3.HomeScreen> {
        }
        composable<Router.BCAV3.TransactionScreen> {
        }
        composable<Router.BCAV3.ReceiverScreen> {
        }
        composable<Router.BCAV3.SetLimitScreen> {
        }
    }
}