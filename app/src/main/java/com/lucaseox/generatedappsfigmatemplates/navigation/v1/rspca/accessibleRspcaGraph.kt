package com.lucaseox.generatedappsfigmatemplates.navigation.v1.rspca

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
import com.lucaseox.generatedappsfigmatemplates.navigation.refactoredRSPCAMenuButtons

fun NavGraphBuilder.accessibleRspcaGraph(navController: NavHostController) {
    navigation<Router.RefactoredRSPCA.Route>(startDestination = Router.RefactoredRSPCA.MenuScreen) {
        composable<Router.RefactoredRSPCA.MenuScreen> {
            GridScreen(navController, refactoredRSPCAMenuButtons, Router.RefactoredRSPCA.MenuScreen.name)
        }
        composable<Router.RefactoredRSPCA.StartScreen> {
            StartScreen()
        }
        composable<Router.RefactoredRSPCA.LoginScreen> {
            LoginScreen()
        }
        composable<Router.RefactoredRSPCA.HomeScreen> {
            HomeScreen()
        }
        composable<Router.RefactoredRSPCA.RegisterPetScreen> {
            RegisterPetScreen()   
        }
        composable<Router.RefactoredRSPCA.DogScreen> {
            DogScreen()
        }
        composable<Router.RefactoredRSPCA.RegisterDogScreen> {
            RegisterDogScreen()
        }
        composable<Router.RefactoredRSPCA.AdoptionScreen> {
            AdoptionScreen()
        }
        composable<Router.RefactoredRSPCA.AdoptionFormScreen> {
            SignUpScreen()
        }
        composable<Router.RefactoredRSPCA.ServicesScreen> {
            ServicesScreen()
        }
        composable<Router.RefactoredRSPCA.CurrentPetsScreen> {
            // no accessibility errors
        }
        composable<Router.RefactoredRSPCA.VetScreen> {
            VetServicesScreen()
        }
        composable<Router.RefactoredRSPCA.GroomingScreen> {
            GroomingServicesScreen()
        }
        composable<Router.RefactoredRSPCA.MapScreen> {
            MapScreen()
        }
        composable<Router.RefactoredRSPCA.PetInfoScreen> {
            PetInfoScreen()
        }
        composable<Router.RefactoredRSPCA.DietScreen> {
            DietScreen()
        }
        composable<Router.RefactoredRSPCA.BMIScreen> {
            BmiCheckerScreen()
        }
        composable<Router.RefactoredRSPCA.ExerciseScreen> {
            AccessibleExerciseScreen()
        }
        composable<Router.RefactoredRSPCA.WalkScreen> {
            WalkScreen()
        }
        composable<Router.RefactoredRSPCA.WalkRecordScreen> {
            WalkRecordScreen()
        }
    }
}