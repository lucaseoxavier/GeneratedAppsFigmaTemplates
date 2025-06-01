package com.lucaseox.generatedappsfigmatemplates.navigation.rspca

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessiblerspca.AccessibleExerciseScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessiblerspca.AdoptionScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessiblerspca.BmiCheckerScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessiblerspca.DietScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessiblerspca.DogScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessiblerspca.GroomingServicesScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessiblerspca.HomeScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessiblerspca.LoginScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessiblerspca.MapScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessiblerspca.PetInfoScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessiblerspca.RegisterDogScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessiblerspca.RegisterPetScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessiblerspca.ServicesScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessiblerspca.SignUpScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessiblerspca.StartScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessiblerspca.VetServicesScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessiblerspca.WalkRecordScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessiblerspca.WalkScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.GridScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.Router
import com.lucaseox.generatedappsfigmatemplates.navigation.accessibleRSPCAMenuButtons

fun NavGraphBuilder.accessibleRspcaGraph(navController: NavHostController) {
    navigation<Router.AccessibleRSPCA.Route>(startDestination = Router.AccessibleRSPCA.MenuScreen) {
        composable<Router.AccessibleRSPCA.MenuScreen> {
            GridScreen(navController, accessibleRSPCAMenuButtons)
        }
        composable<Router.AccessibleRSPCA.StartScreen> {
            StartScreen()
        }
        composable<Router.AccessibleRSPCA.LoginScreen> {
            LoginScreen()
        }
        composable<Router.AccessibleRSPCA.HomeScreen> {
            HomeScreen()
        }
        composable<Router.AccessibleRSPCA.RegisterPetScreen> {
            RegisterPetScreen()   
        }
        composable<Router.AccessibleRSPCA.DogScreen> {
            DogScreen()
        }
        composable<Router.AccessibleRSPCA.RegisterDogScreen> {
            RegisterDogScreen()
        }
        composable<Router.AccessibleRSPCA.AdoptionScreen> {
            AdoptionScreen()
        }
        composable<Router.AccessibleRSPCA.AdoptionFormScreen> {
            SignUpScreen()
        }
        composable<Router.AccessibleRSPCA.ServicesScreen> {
            ServicesScreen()
        }
        composable<Router.AccessibleRSPCA.CurrentPetsScreen> {
            // no accessibility errors
        }
        composable<Router.AccessibleRSPCA.VetScreen> {
            VetServicesScreen()
        }
        composable<Router.AccessibleRSPCA.GroomingScreen> {
            GroomingServicesScreen()
        }
        composable<Router.AccessibleRSPCA.MapScreen> {
            MapScreen()
        }
        composable<Router.AccessibleRSPCA.PetInfoScreen> {
            PetInfoScreen()
        }
        composable<Router.AccessibleRSPCA.DietScreen> {
            DietScreen()
        }
        composable<Router.AccessibleRSPCA.BMIScreen> {
            BmiCheckerScreen()
        }
        composable<Router.AccessibleRSPCA.ExerciseScreen> {
            AccessibleExerciseScreen()
        }
        composable<Router.AccessibleRSPCA.WalkScreen> {
            WalkScreen()
        }
        composable<Router.AccessibleRSPCA.WalkRecordScreen> {
            WalkRecordScreen()
        }
    }
}