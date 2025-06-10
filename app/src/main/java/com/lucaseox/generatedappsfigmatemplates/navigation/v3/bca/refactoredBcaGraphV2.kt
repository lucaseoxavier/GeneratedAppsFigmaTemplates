package com.lucaseox.generatedappsfigmatemplates.navigation.v3.bca

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.lucaseox.generatedappsfigmatemplates.navigation.GridScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.Router
import com.lucaseox.generatedappsfigmatemplates.navigation.refactoredV3BcaMenuButtons

fun NavGraphBuilder.refactoredBcaGraphV3(navController: NavHostController) {
    navigation<Router.RefactoredBCAV3.Route>(startDestination = Router.RefactoredBCAV3.MenuScreen) {
        composable<Router.RefactoredBCAV3.MenuScreen> {
            GridScreen(navController, refactoredV3BcaMenuButtons, Router.RefactoredBCAV3.MenuScreen.name)
        }
        composable<Router.RefactoredBCAV3.ProfileScreen> {
        }
        composable<Router.RefactoredBCAV3.HomeScreen> {
        }
        composable<Router.RefactoredBCAV3.TransactionScreen> {
        }
        composable<Router.RefactoredBCAV3.ReceiverScreen> {
        }
        composable<Router.RefactoredBCAV3.SetLimitScreen> {
        }
    }
}