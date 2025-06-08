package com.lucaseox.generatedappsfigmatemplates.navigation.todo

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessibletodo.LoginScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessibletodo.OnboardingScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessibletodo.RegisterScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessibletodo.TaskHomeScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.GridScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.Router
import com.lucaseox.generatedappsfigmatemplates.navigation.accessibleToDoMenuButtons

fun NavGraphBuilder.accessibleToDoGraph(navController: NavHostController) {
    navigation<Router.AccessibleToDo.Route>(startDestination = Router.AccessibleToDo.MenuScreen) {
        composable<Router.AccessibleToDo.MenuScreen> {
            GridScreen(navController, accessibleToDoMenuButtons)
        }
        composable<Router.AccessibleToDo.StartScreen> {
            OnboardingScreen()
        }
        composable<Router.AccessibleToDo.RegisterScreen> {
            RegisterScreen()
        }
        composable<Router.AccessibleToDo.LoginScreen> {
            LoginScreen()
        }
        composable<Router.AccessibleToDo.ToDoScreen> {
            TaskHomeScreen()
        }
    }
}