package com.lucaseox.generatedappsfigmatemplates.navigation.v2.bca

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v2.refactoredbca.HomeScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v2.refactoredbca.ProfileScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v2.refactoredbca.ReceiverScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v2.refactoredbca.SetLimitScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v2.refactoredbca.TransactionScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.GridScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.Router
import com.lucaseox.generatedappsfigmatemplates.navigation.refactoredV2BcaMenuButtons

fun NavGraphBuilder.refactoredBcaGraphV2(navController: NavHostController) {
    navigation<Router.RefactoredBCAV2.Route>(startDestination = Router.RefactoredBCAV2.MenuScreen) {
        composable<Router.RefactoredBCAV2.MenuScreen> {
            GridScreen(navController, refactoredV2BcaMenuButtons, Router.RefactoredBCAV2.MenuScreen.name)
        }
        composable<Router.RefactoredBCAV2.ProfileScreen> {
            ProfileScreen()
        }
        composable<Router.RefactoredBCAV2.HomeScreen> {
            HomeScreen()
        }
        composable<Router.RefactoredBCAV2.TransactionScreen> {
            TransactionScreen()
        }
        composable<Router.RefactoredBCAV2.ReceiverScreen> {
            ReceiverScreen()
        }
        composable<Router.RefactoredBCAV2.SetLimitScreen> {
            SetLimitScreen()
        }
    }
}