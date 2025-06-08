package com.lucaseox.generatedappsfigmatemplates.navigation.rspca

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v1.rspca.AdoptionScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v1.rspca.BmiCheckerScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v1.rspca.CurrentPetsScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v1.rspca.DietScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v1.rspca.DogScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v1.rspca.ExerciseScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v1.rspca.GroomingServicesScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v1.rspca.HomeScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v1.rspca.LoginScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v1.rspca.MapScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v1.rspca.PetInfoScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v1.rspca.RegisterDogScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v1.rspca.RegisterPetScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v1.rspca.ServicesScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v1.rspca.SignUpScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v1.rspca.StartScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v1.rspca.VetServicesScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v1.rspca.WalkRecordScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v1.rspca.WalkScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.GridScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.RSPCAMenuButtons
import com.lucaseox.generatedappsfigmatemplates.navigation.Router

fun NavGraphBuilder.rspcaGraph(navController: NavHostController) {
    navigation<Router.RSPCA.Route>(startDestination = Router.RSPCA.MenuScreen) {
        composable<Router.RSPCA.MenuScreen> {
            GridScreen(navController, RSPCAMenuButtons)
        }
        composable<Router.RSPCA.StartScreen> {
            StartScreen()
        }
        composable<Router.RSPCA.LoginScreen> {
            LoginScreen()
        }
        composable<Router.RSPCA.HomeScreen> {
            HomeScreen()
        }
        composable<Router.RSPCA.RegisterPetScreen> {
            RegisterPetScreen()
        }
        composable<Router.RSPCA.DogScreen> {
            DogScreen()
        }
        composable<Router.RSPCA.RegisterDogScreen> {
            RegisterDogScreen()
        }
        composable<Router.RSPCA.AdoptionScreen> {
            AdoptionScreen()
        }
        composable<Router.RSPCA.AdoptionFormScreen> {
            SignUpScreen()
        }
        composable<Router.RSPCA.ServicesScreen> {
            ServicesScreen()
        }
        composable<Router.RSPCA.CurrentPetsScreen> {
            CurrentPetsScreen()
        }
        composable<Router.RSPCA.VetScreen> {
            VetServicesScreen()
        }
        composable<Router.RSPCA.GroomingScreen> {
            GroomingServicesScreen()
        }
        composable<Router.RSPCA.MapScreen> {
            MapScreen()
        }
        composable<Router.RSPCA.PetInfoScreen> {
            PetInfoScreen()
        }
        composable<Router.RSPCA.DietScreen> {
            DietScreen()
        }
        composable<Router.RSPCA.BMIScreen> {
            BmiCheckerScreen()
        }
        composable<Router.RSPCA.ExerciseScreen> {
            ExerciseScreen()
        }
        composable<Router.RSPCA.WalkScreen> {
            WalkScreen()
        }
        composable<Router.RSPCA.WalkRecordScreen> {
            WalkRecordScreen()
        }
    }
}