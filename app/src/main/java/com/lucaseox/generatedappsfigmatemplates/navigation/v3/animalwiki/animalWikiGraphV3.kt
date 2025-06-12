package com.lucaseox.generatedappsfigmatemplates.navigation.v3.animalwiki

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v3.animalwiki.AnimalWikiScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.GridScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.Router
import com.lucaseox.generatedappsfigmatemplates.navigation.V3AnimalWikiMenuButtons

fun NavGraphBuilder.animalWikiGraphV3(navController: NavHostController) {
    navigation<Router.AnimalWikiV3.Route>(startDestination = Router.AnimalWikiV3.MenuScreen) {
        composable<Router.AnimalWikiV3.MenuScreen> {
            GridScreen(navController, V3AnimalWikiMenuButtons, Router.AnimalWikiV3.MenuScreen.name)
        }
        composable<Router.AnimalWikiV3.DashboardScreen> {
            AnimalWikiScreen()
        }
    }
}