package com.lucaseox.generatedappsfigmatemplates.navigation.rspca

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.lucaseox.generatedappsfigmatemplates.navigation.GridScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.RSPCAMenuButtons
import com.lucaseox.generatedappsfigmatemplates.navigation.Router

fun NavGraphBuilder.rspcaGraph(navController: NavHostController) {
    navigation<Router.RSPCA.Route>(startDestination = Router.RSPCA.MenuScreen) {
        composable<Router.RSPCA.MenuScreen> {
            GridScreen(navController, RSPCAMenuButtons)
        }
        composable<Router.RSPCA.StartScreen> {}
        composable<Router.RSPCA.LoginScreen> {}
        composable<Router.RSPCA.HomeScreen> {}
        composable<Router.RSPCA.RegisterPetScreen> {}
        composable<Router.RSPCA.DogScreen> {}
        composable<Router.RSPCA.RegisterDogScreen> {}
        composable<Router.RSPCA.AdoptionScreen> {}
        composable<Router.RSPCA.AdoptionFormScreen> {}
        composable<Router.RSPCA.ServicesScreen> {}
        composable<Router.RSPCA.CurrentPetsScreen> {}
        composable<Router.RSPCA.VetScreen> {}
        composable<Router.RSPCA.GroomingScreen> {}
        composable<Router.RSPCA.MapScreen> {}
        composable<Router.RSPCA.PetInfoScreen> {}
        composable<Router.RSPCA.DietScreen> {}
        composable<Router.RSPCA.BMIScreen> {}
        composable<Router.RSPCA.ExerciseScreen> {}
        composable<Router.RSPCA.WalkScreen> {}
        composable<Router.RSPCA.WalkRecordScreen> {}
    }
}