package com.lucaseox.generatedappsfigmatemplates.navigation.v2.rspca

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v2.rspca.VetServicesScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.GridScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.Router
import com.lucaseox.generatedappsfigmatemplates.navigation.refactoredV2RSPCAMenuButtons

fun NavGraphBuilder.refactoredRspcaGraphV2(navController: NavHostController) {
    navigation<Router.RefactoredRSPCAV2.Route>(startDestination = Router.RefactoredRSPCAV2.MenuScreen) {
        composable<Router.RefactoredRSPCAV2.MenuScreen> {
            GridScreen(navController, refactoredV2RSPCAMenuButtons, Router.RefactoredRSPCAV2.MenuScreen.name)
        }
        composable<Router.RefactoredRSPCAV2.VetScreen> {
            VetServicesScreen()
        }
    }
}