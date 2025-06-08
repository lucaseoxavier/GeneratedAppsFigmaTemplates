package com.lucaseox.generatedappsfigmatemplates.navigation.animalwiki

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredanimalwiki.AccessibleLoginScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredanimalwiki.AnimalCardScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredanimalwiki.AnimalWikiScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredanimalwiki.SplashScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.GridScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.Router
import com.lucaseox.generatedappsfigmatemplates.navigation.accessibleAnimalWikiMenuButtons

fun NavGraphBuilder.accessibleAnimalWikiGraph(navController: NavHostController) {
    navigation<Router.AccessibleAnimalWiki.Route>(startDestination = Router.AccessibleAnimalWiki.MenuScreen) {
        composable<Router.AccessibleAnimalWiki.MenuScreen> {
            GridScreen(navController, accessibleAnimalWikiMenuButtons)
        }
        composable<Router.AccessibleAnimalWiki.SplashScreen> {
            SplashScreen()
        }
        composable<Router.AccessibleAnimalWiki.LoginScreen> {
            AccessibleLoginScreen()
        }
        composable<Router.AccessibleAnimalWiki.DashboardScreen> {
            AnimalWikiScreen()
        }
        composable<Router.AccessibleAnimalWiki.AnimalScreen> {
            AnimalCardScreen()
        }
    }
}