package com.lucaseox.generatedfromfigmatemplates.navigation.todo

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.lucaseox.generatedfromfigmatemplates.GridScreen
import com.lucaseox.generatedfromfigmatemplates.navigation.Router
import com.lucaseox.generatedfromfigmatemplates.navigation.accessibleToDoMenuButtons

fun NavGraphBuilder.accessibleToDoGraph(navController: NavHostController) {
    navigation<Router.AccessibleToDo.Route>(startDestination = Router.AccessibleToDo.MenuScreen) {
        composable<Router.AccessibleToDo.MenuScreen> {
            GridScreen(navController, accessibleToDoMenuButtons)
        }
        composable<Router.AccessibleToDo.StartScreen> {}
        composable<Router.AccessibleToDo.RegisterScreen> {}
        composable<Router.AccessibleToDo.LoginScreen> {}
        composable<Router.AccessibleToDo.ToDoScreen> {}
    }
}