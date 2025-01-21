package com.lucaseox.generatedfromfigmatemplates.navigation.animalwiki

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.lucaseox.generatedfromfigmatemplates.GridScreen
import com.lucaseox.generatedfromfigmatemplates.animalwiki.AnimalScreen
import com.lucaseox.generatedfromfigmatemplates.animalwiki.DashboardScreen
import com.lucaseox.generatedfromfigmatemplates.animalwiki.LoginScreen
import com.lucaseox.generatedfromfigmatemplates.animalwiki.SplashScreen
import com.lucaseox.generatedfromfigmatemplates.navigation.Router
import com.lucaseox.generatedfromfigmatemplates.navigation.animalWikiMenuButtons

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
            DashboardScreen()
        }
        composable<Router.AnimalWiki.AnimalScreen> {
            AnimalScreen()
        }
    }
}