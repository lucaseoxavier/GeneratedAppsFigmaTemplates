package com.lucaseox.generatedappsfigmatemplates.navigation.v3.rspca

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v3.rspca.VetScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.GridScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.Router
import com.lucaseox.generatedappsfigmatemplates.navigation.refactoredV3RSPCAMenuButtons

fun NavGraphBuilder.refactoredRspcaGraphV3(navController: NavHostController) {
    navigation<Router.RefactoredRSPCAV3.Route>(startDestination = Router.RefactoredRSPCAV3.MenuScreen) {
        composable<Router.RefactoredRSPCAV3.MenuScreen> {
            GridScreen(navController, refactoredV3RSPCAMenuButtons, Router.RefactoredRSPCAV3.MenuScreen.name)
        }
        composable<Router.RefactoredRSPCAV3.VetScreen> {
            VetScreen()
        }
    }
}