package com.lucaseox.generatedfromfigmatemplates.navigation.rspca

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.lucaseox.generatedfromfigmatemplates.GridScreen
import com.lucaseox.generatedfromfigmatemplates.navigation.RSPCAMenuButtons
import com.lucaseox.generatedfromfigmatemplates.navigation.Router

fun NavGraphBuilder.rspcaGraph(navController: NavHostController) {
    navigation<Router.RSPCA.Route>(startDestination = Router.RSPCA.MenuScreen) {
        composable<Router.RSPCA.MenuScreen> {
            GridScreen(navController, RSPCAMenuButtons)
        }
    }
}