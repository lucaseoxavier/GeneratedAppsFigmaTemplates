package com.lucaseox.generatedappsfigmatemplates.navigation.animalwiki

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.animalwiki.AnimalCardScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.animalwiki.AnimalWikiScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.animalwiki.LoginScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.animalwiki.SplashScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.GridScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.Router
import com.lucaseox.generatedappsfigmatemplates.navigation.animalWikiMenuButtons


fun NavGraphBuilder.animalWikiGraph(navController: NavHostController) {
    navigation<Router.AnimalWiki.Route>(startDestination = Router.AnimalWiki.MenuScreen) {
        composable<Router.AnimalWiki.MenuScreen> {
            GridScreen(navController, animalWikiMenuButtons)
        }
        composable<Router.AnimalWiki.SplashScreen> {
            SplashScreen()
        }
        composable<Router.AnimalWiki.LoginScreen> {
            LoginScreen()
        }
        composable<Router.AnimalWiki.DashboardScreen> {
            AnimalWikiScreen()
        }
        composable<Router.AnimalWiki.AnimalScreen> {
            AnimalCardScreen()
        }
    }
}