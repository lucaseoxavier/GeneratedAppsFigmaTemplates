package com.lucaseox.generatedappsfigmatemplates.navigation.animalwiki

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.lucaseox.generatedappsfigmatemplates.navigation.GridScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.Router
import com.lucaseox.generatedappsfigmatemplates.navigation.accessibleAnimalWikiMenuButtons

fun NavGraphBuilder.accessibleAnimalWikiGraph(navController: NavHostController) {
    navigation<Router.AccessibleAnimalWiki.Route>(startDestination = Router.AccessibleAnimalWiki.MenuScreen) {
        composable<Router.AccessibleAnimalWiki.MenuScreen> {
            GridScreen(navController, accessibleAnimalWikiMenuButtons)
        }
        composable<Router.AccessibleAnimalWiki.SplashScreen> {}
        composable<Router.AccessibleAnimalWiki.LoginScreen> {}
        composable<Router.AccessibleAnimalWiki.DashboardScreen> {}
        composable<Router.AccessibleAnimalWiki.AnimalScreen> {}
    }
}