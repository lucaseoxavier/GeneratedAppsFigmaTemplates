package com.lucaseox.generatedfromfigmatemplates.navigation.rspca

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.lucaseox.generatedfromfigmatemplates.GridScreen
import com.lucaseox.generatedfromfigmatemplates.navigation.Router
import com.lucaseox.generatedfromfigmatemplates.navigation.accessibleRSPCAMenuButtons

fun NavGraphBuilder.accessibleRspcaGraph(navController: NavHostController) {
    navigation<Router.AccessibleRSPCA.Route>(startDestination = Router.AccessibleRSPCA.MenuScreen) {
        composable<Router.AccessibleRSPCA.MenuScreen> {
            GridScreen(navController, accessibleRSPCAMenuButtons)
            composable<Router.AccessibleRSPCA.StartScreen> {}
            composable<Router.AccessibleRSPCA.LoginScreen> {}
            composable<Router.AccessibleRSPCA.HomeScreen> {}
            composable<Router.AccessibleRSPCA.RegisterPetScreen> {}
            composable<Router.AccessibleRSPCA.DogScreen> {}
            composable<Router.AccessibleRSPCA.RegisterDogScreen> {}
            composable<Router.AccessibleRSPCA.AdoptionScreen> {}
            composable<Router.AccessibleRSPCA.AdoptionFormScreen> {}
            composable<Router.AccessibleRSPCA.ServicesScreen> {}
            composable<Router.AccessibleRSPCA.CurrentPetsScreen> {}
            composable<Router.AccessibleRSPCA.VetScreen> {}
            composable<Router.AccessibleRSPCA.GroomingScreen> {}
            composable<Router.AccessibleRSPCA.MapScreen> {}
            composable<Router.AccessibleRSPCA.PetInfoScreen> {}
            composable<Router.AccessibleRSPCA.DietScreen> {}
            composable<Router.AccessibleRSPCA.BMIScreen> {}
            composable<Router.AccessibleRSPCA.ExerciseScreen> {}
            composable<Router.AccessibleRSPCA.WalkScreen> {}
            composable<Router.AccessibleRSPCA.WalkRecordScreen> {}
        }
    }
}