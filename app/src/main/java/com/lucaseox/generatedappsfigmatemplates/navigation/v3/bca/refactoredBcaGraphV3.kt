package com.lucaseox.generatedappsfigmatemplates.navigation.v3.bca

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v3.bca.HomeScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v3.bca.ProfileScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v3.bca.ReceiverSelectionScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v3.bca.SetLimitScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v3.bca.TransactionScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.GridScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.Router
import com.lucaseox.generatedappsfigmatemplates.navigation.refactoredV3BcaMenuButtons

fun NavGraphBuilder.refactoredBcaGraphV3(navController: NavHostController) {
    navigation<Router.RefactoredBCAV3.Route>(startDestination = Router.RefactoredBCAV3.MenuScreen) {
        composable<Router.RefactoredBCAV3.MenuScreen> {
            GridScreen(navController, refactoredV3BcaMenuButtons, Router.RefactoredBCAV3.MenuScreen.name)
        }
        composable<Router.RefactoredBCAV3.ProfileScreen> {
            ProfileScreen()
        }
        composable<Router.RefactoredBCAV3.HomeScreen> {
            HomeScreen()
        }
        composable<Router.RefactoredBCAV3.TransactionScreen> {
            TransactionScreen()
        }
        composable<Router.RefactoredBCAV3.ReceiverScreen> {
            ReceiverSelectionScreen()
        }
        composable<Router.RefactoredBCAV3.SetLimitScreen> {
            SetLimitScreen()
        }
    }
}