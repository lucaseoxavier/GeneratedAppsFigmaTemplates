package com.lucaseox.generatedappsfigmatemplates.navigation.v2.animalwiki

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.lucaseox.generatedappsfigmatemplates.navigation.GridScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.Router
import com.lucaseox.generatedappsfigmatemplates.navigation.V2AnimalWikiMenuButtons

fun NavGraphBuilder.animalWikiGraphV2(navController: NavHostController) {
    navigation<Router.AnimalWikiV2.Route>(startDestination = Router.AnimalWikiV2.MenuScreen) {
        composable<Router.AnimalWikiV2.MenuScreen> {
            GridScreen(navController, V2AnimalWikiMenuButtons, Router.AnimalWikiV2.MenuScreen.name)
        }
        composable<Router.AnimalWikiV2.DashboardScreen> {
        }
    }
}