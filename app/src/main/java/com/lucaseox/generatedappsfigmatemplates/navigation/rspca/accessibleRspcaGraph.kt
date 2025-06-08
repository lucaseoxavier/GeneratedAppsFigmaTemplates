package com.lucaseox.generatedappsfigmatemplates.navigation.rspca

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredrspca.AccessibleExerciseScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredrspca.AdoptionScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredrspca.BmiCheckerScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredrspca.DietScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredrspca.DogScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredrspca.GroomingServicesScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredrspca.HomeScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredrspca.LoginScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredrspca.MapScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredrspca.PetInfoScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredrspca.RegisterDogScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredrspca.RegisterPetScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredrspca.ServicesScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredrspca.SignUpScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredrspca.StartScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredrspca.VetServicesScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredrspca.WalkRecordScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredrspca.WalkScreen
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