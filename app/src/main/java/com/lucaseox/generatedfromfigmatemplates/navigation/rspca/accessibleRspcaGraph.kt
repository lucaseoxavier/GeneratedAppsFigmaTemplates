package com.lucaseox.generatedfromfigmatemplates.navigation.rspca

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.lucaseox.generatedfromfigmatemplates.GridScreen
import com.lucaseox.generatedfromfigmatemplates.navigation.Router
import com.lucaseox.generatedfromfigmatemplates.navigation.accessibleRSPCAMenuButtons

fun NavGraphBuilder.accessibleRspcaGraph(navController: NavHostController) {
    navigation<Router.AccessibleRSPCA.Route>(startDestination = Router.AccessibleRSPCA.MenuScreen) {
        composable<Router.AccessibleRSPCA.MenuScreen> {
            GridScreen(navController, accessibleRSPCAMenuButtons)
        }
    }
}