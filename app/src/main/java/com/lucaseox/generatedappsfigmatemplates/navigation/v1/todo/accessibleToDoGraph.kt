package com.lucaseox.generatedappsfigmatemplates.navigation.v1.todo

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredtodo.LoginScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredtodo.OnboardingScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredtodo.RegisterScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredtodo.TaskHomeScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.GridScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.Router
import com.lucaseox.generatedappsfigmatemplates.navigation.refactoredToDoMenuButtons

fun NavGraphBuilder.accessibleToDoGraph(navController: NavHostController) {
    navigation<Router.RefactoredToDo.Route>(startDestination = Router.RefactoredToDo.MenuScreen) {
        composable<Router.RefactoredToDo.MenuScreen> {
            GridScreen(navController, refactoredToDoMenuButtons)
        }
        composable<Router.RefactoredToDo.StartScreen> {
            OnboardingScreen()
        }
        composable<Router.RefactoredToDo.RegisterScreen> {
            RegisterScreen()
        }
        composable<Router.RefactoredToDo.LoginScreen> {
            LoginScreen()
        }
        composable<Router.RefactoredToDo.ToDoScreen> {
            TaskHomeScreen()
        }
    }
}