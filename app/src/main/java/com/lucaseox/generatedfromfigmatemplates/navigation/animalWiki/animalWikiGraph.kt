package com.lucaseox.generatedfromfigmatemplates.navigation.animalWiki

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.lucaseox.generatedfromfigmatemplates.GridScreen
import com.lucaseox.generatedfromfigmatemplates.navigation.Router
import com.lucaseox.generatedfromfigmatemplates.navigation.animalWikiMenuButtons

fun NavGraphBuilder.animalWikiGraph(navController: NavHostController) {
    navigation<Router.AnimalWiki.Route>(startDestination = Router.AnimalWiki.MenuScreen) {
        composable<Router.AnimalWiki.MenuScreen> {
            GridScreen(navController, animalWikiMenuButtons)
        }
        composable<Router.AnimalWiki.SplashScreen> {}
        composable<Router.AnimalWiki.LoginScreen> {}
        composable<Router.AnimalWiki.DashboardScreen> {}
        composable<Router.AnimalWiki.AnimalScreen> {}
    }
}