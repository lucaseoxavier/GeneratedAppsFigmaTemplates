package com.lucaseox.generatedappsfigmatemplates.navigation.v3.bca

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v3.bca.HomeScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v3.bca.ProfileScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v3.bca.ReceiverSelectionScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v3.bca.SetLimitScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v3.bca.TransactionScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.GridScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.Router
import com.lucaseox.generatedappsfigmatemplates.navigation.v3BcaMenuButtons

fun NavGraphBuilder.bcaGraphV3(navController: NavHostController) {
    navigation<Router.BCAV3.Route>(startDestination = Router.BCAV3.MenuScreen) {
        composable<Router.BCAV3.MenuScreen> {
            GridScreen(navController, v3BcaMenuButtons, Router.BCAV3.MenuScreen.name)
        }
        composable<Router.BCAV3.ProfileScreen> {
            ProfileScreen()
        }
        composable<Router.BCAV3.HomeScreen> {
            HomeScreen()
        }
        composable<Router.BCAV3.TransactionScreen> {
            TransactionScreen()
        }
        composable<Router.BCAV3.ReceiverScreen> {
            ReceiverSelectionScreen()
        }
        composable<Router.BCAV3.SetLimitScreen> {
            SetLimitScreen()
        }
    }
}