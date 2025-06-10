package com.lucaseox.generatedappsfigmatemplates.navigation.v3.animalwiki

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.lucaseox.generatedappsfigmatemplates.navigation.GridScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.Router
import com.lucaseox.generatedappsfigmatemplates.navigation.refactoredV3AnimalWikiMenuButtons

fun NavGraphBuilder.refactoredAnimalWikiGraphV3(navController: NavHostController) {
    navigation<Router.RefactoredAnimalWikiV3.Route>(startDestination = Router.RefactoredAnimalWikiV3.MenuScreen) {
        composable<Router.RefactoredAnimalWikiV3.MenuScreen> {
            GridScreen(navController, refactoredV3AnimalWikiMenuButtons, Router.RefactoredAnimalWikiV3.MenuScreen.name)
        }
        composable<Router.RefactoredAnimalWikiV3.DashboardScreen> {
        }
    }
}