package com.lucaseox.generatedappsfigmatemplates.navigation.v2.rspca

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.lucaseox.generatedappsfigmatemplates.navigation.GridScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.Router
import com.lucaseox.generatedappsfigmatemplates.navigation.v2RSPCAMenuButtons

fun NavGraphBuilder.rspcaGraphV2(navController: NavHostController) {
    navigation<Router.RSPCAV2.Route>(startDestination = Router.RSPCAV2.MenuScreen) {
        composable<Router.RSPCAV2.MenuScreen> {
            GridScreen(navController, v2RSPCAMenuButtons, Router.RSPCAV2.MenuScreen.name)
        }
        composable<Router.RSPCAV2.VetScreen> {
        }
    }
}