package com.lucaseox.generatedappsfigmatemplates.navigation.v2.animalwiki

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v2.animalwiki.AnimalWikiScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.GridScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.Router
import com.lucaseox.generatedappsfigmatemplates.navigation.refactoredV2AnimalWikiMenuButtons

fun NavGraphBuilder.refactoredAnimalWikiGraphV2(navController: NavHostController) {
    navigation<Router.RefactoredAnimalWikiV2.Route>(startDestination = Router.RefactoredAnimalWikiV2.MenuScreen) {
        composable<Router.RefactoredAnimalWikiV2.MenuScreen> {
            GridScreen(navController, refactoredV2AnimalWikiMenuButtons, Router.RefactoredAnimalWikiV2.MenuScreen.name)
        }
        composable<Router.RefactoredAnimalWikiV2.DashboardScreen> {
            AnimalWikiScreen()
        }
    }
}