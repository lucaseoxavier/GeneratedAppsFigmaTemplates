package com.lucaseox.generatedappsfigmatemplates.navigation.v2.bca

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v2.bca.HomeScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v2.bca.ProfileScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v2.bca.ReceiverScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v2.bca.SetLimitScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v2.bca.TransactionScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.GridScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.Router
import com.lucaseox.generatedappsfigmatemplates.navigation.v2BcaMenuButtons

fun NavGraphBuilder.bcaGraphV2(navController: NavHostController) {
    navigation<Router.BCAV2.Route>(startDestination = Router.BCAV2.MenuScreen) {
        composable<Router.BCAV2.MenuScreen> {
            GridScreen(navController, v2BcaMenuButtons, Router.BCAV2.MenuScreen.name)
        }
        composable<Router.BCAV2.ProfileScreen> {
            ProfileScreen()
        }
        composable<Router.BCAV2.HomeScreen> {
            HomeScreen()
        }
        composable<Router.BCAV2.TransactionScreen> {
            TransactionScreen()
        }
        composable<Router.BCAV2.ReceiverScreen> {
            ReceiverScreen()
        }
        composable<Router.BCAV2.SetLimitScreen> {
            SetLimitScreen()
        }
    }
}