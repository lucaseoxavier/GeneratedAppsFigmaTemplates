package com.lucaseox.generatedappsfigmatemplates.navigation.v1.animalwiki

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
import com.lucaseox.generatedappsfigmatemplates.navigation.refactoredAnimalWikiMenuButtons

fun NavGraphBuilder.accessibleAnimalWikiGraph(navController: NavHostController) {
    navigation<Router.RefactoredAnimalWiki.Route>(startDestination = Router.RefactoredAnimalWiki.MenuScreen) {
        composable<Router.RefactoredAnimalWiki.MenuScreen> {
            GridScreen(navController, refactoredAnimalWikiMenuButtons)
        }
        composable<Router.RefactoredAnimalWiki.SplashScreen> {
            SplashScreen()
        }
        composable<Router.RefactoredAnimalWiki.LoginScreen> {
            AccessibleLoginScreen()
        }
        composable<Router.RefactoredAnimalWiki.DashboardScreen> {
            AnimalWikiScreen()
        }
        composable<Router.RefactoredAnimalWiki.AnimalScreen> {
            AnimalCardScreen()
        }
    }
}