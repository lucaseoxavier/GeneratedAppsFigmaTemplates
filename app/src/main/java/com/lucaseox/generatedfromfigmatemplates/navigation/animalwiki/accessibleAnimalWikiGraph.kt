package com.lucaseox.generatedfromfigmatemplates.navigation.animalwiki

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.lucaseox.generatedfromfigmatemplates.GridScreen
import com.lucaseox.generatedfromfigmatemplates.animalwikiaccessible.AnimalScreen
import com.lucaseox.generatedfromfigmatemplates.animalwikiaccessible.DashboardScreen
import com.lucaseox.generatedfromfigmatemplates.animalwikiaccessible.LoginScreen
import com.lucaseox.generatedfromfigmatemplates.animalwikiaccessible.SplashScreen
import com.lucaseox.generatedfromfigmatemplates.navigation.Router
import com.lucaseox.generatedfromfigmatemplates.navigation.accessibleAnimalWikiMenuButtons

fun NavGraphBuilder.accessibleAnimalWikiGraph(navController: NavHostController) {
    navigation<Router.AccessibleAnimalWiki.Route>(startDestination = Router.AccessibleAnimalWiki.MenuScreen) {
        composable<Router.AccessibleAnimalWiki.MenuScreen> {
            GridScreen(navController, accessibleAnimalWikiMenuButtons)
        }
        composable<Router.AccessibleAnimalWiki.SplashScreen> {
            SplashScreen()
        }
        composable<Router.AccessibleAnimalWiki.LoginScreen> {
            LoginScreen()
        }
        composable<Router.AccessibleAnimalWiki.DashboardScreen> {
            DashboardScreen()
        }
        composable<Router.AccessibleAnimalWiki.AnimalScreen> {
            AnimalScreen()
        }
    }
}