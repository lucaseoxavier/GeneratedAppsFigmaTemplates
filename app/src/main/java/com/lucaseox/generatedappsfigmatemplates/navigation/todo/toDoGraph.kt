package com.lucaseox.generatedappsfigmatemplates.navigation.todo

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.todo.LoginScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.todo.OnboardingScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.todo.RegisterScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.todo.TaskHomeScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.GridScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.Router
import com.lucaseox.generatedappsfigmatemplates.navigation.toDoMenuButtons

fun NavGraphBuilder.toDoGraph(navController: NavHostController) {
    navigation<Router.ToDo.Route>(startDestination = Router.ToDo.MenuScreen) {
        composable<Router.ToDo.MenuScreen> {
            GridScreen(navController, toDoMenuButtons)
        }
        composable<Router.ToDo.StartScreen> {
            OnboardingScreen()
        }
        composable<Router.ToDo.RegisterScreen> {
            RegisterScreen()
        }
        composable<Router.ToDo.LoginScreen> {
            LoginScreen()
        }
        composable<Router.ToDo.ToDoScreen> {
            TaskHomeScreen()
        }
    }
}