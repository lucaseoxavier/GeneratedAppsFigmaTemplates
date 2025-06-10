package com.lucaseox.generatedappsfigmatemplates.navigation.v3.rspca

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.lucaseox.generatedappsfigmatemplates.navigation.GridScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.Router
import com.lucaseox.generatedappsfigmatemplates.navigation.v3RSPCAMenuButtons

fun NavGraphBuilder.rspcaGraphV3(navController: NavHostController) {
    navigation<Router.RSPCAV3.Route>(startDestination = Router.RSPCAV3.MenuScreen) {
        composable<Router.RSPCAV3.MenuScreen> {
            GridScreen(navController, v3RSPCAMenuButtons, Router.RSPCAV3.MenuScreen.name)
        }
        composable<Router.RSPCAV3.VetScreen> {
        }
    }
}