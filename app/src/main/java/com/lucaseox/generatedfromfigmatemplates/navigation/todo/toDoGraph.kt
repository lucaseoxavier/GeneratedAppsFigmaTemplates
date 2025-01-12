package com.lucaseox.generatedfromfigmatemplates.navigation.todo

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.lucaseox.generatedfromfigmatemplates.GridScreen
import com.lucaseox.generatedfromfigmatemplates.navigation.Router
import com.lucaseox.generatedfromfigmatemplates.navigation.toDoMenuButtons

fun NavGraphBuilder.toDoGraph(navController: NavHostController) {
    navigation<Router.ToDo.Route>(startDestination = Router.ToDo.MenuScreen) {
        composable<Router.ToDo.MenuScreen> {
            GridScreen(navController, toDoMenuButtons)
        }
    }
}