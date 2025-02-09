package com.lucaseox.generatedfromfigmatemplates.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.lucaseox.generatedfromfigmatemplates.GridScreen
import com.lucaseox.generatedfromfigmatemplates.navigation.animalwiki.accessibleAnimalWikiGraph
import com.lucaseox.generatedfromfigmatemplates.navigation.animalwiki.animalWikiGraph
import com.lucaseox.generatedfromfigmatemplates.navigation.bca.accessibleBcaGraph
import com.lucaseox.generatedfromfigmatemplates.navigation.bca.bcaGraph
import com.lucaseox.generatedfromfigmatemplates.navigation.bestbuy.accessibleBestBuyGraph
import com.lucaseox.generatedfromfigmatemplates.navigation.bestbuy.bestBuyGraph
import com.lucaseox.generatedfromfigmatemplates.navigation.foodordering.accessibleFoodOrderingGraph
import com.lucaseox.generatedfromfigmatemplates.navigation.foodordering.foodOrderingGraph
import com.lucaseox.generatedfromfigmatemplates.navigation.kapuhamusic.accessibleKapuhaMusicGraph
import com.lucaseox.generatedfromfigmatemplates.navigation.kapuhamusic.kapuhaMusicGraph
import com.lucaseox.generatedfromfigmatemplates.navigation.musicprototype.accessibleMusicPrototypeGraph
import com.lucaseox.generatedfromfigmatemplates.navigation.musicprototype.musicPrototypeGraph
import com.lucaseox.generatedfromfigmatemplates.navigation.rspca.accessibleRspcaGraph
import com.lucaseox.generatedfromfigmatemplates.navigation.rspca.rspcaGraph
import com.lucaseox.generatedfromfigmatemplates.navigation.todo.accessibleToDoGraph
import com.lucaseox.generatedfromfigmatemplates.navigation.todo.toDoGraph

@Composable
fun AppNavigation(
    navController: NavHostController,
) {
    NavHost(
        navController = navController,
        startDestination = Router.MainAppMenu
    ) {
        composable<Router.MainAppMenu> {
            GridScreen(navController, mainAppMenuButtons)
        }

        bestBuyGraph(navController)
        accessibleBestBuyGraph(navController)

        bcaGraph(navController)
        accessibleBcaGraph(navController)

        animalWikiGraph(navController)
        accessibleAnimalWikiGraph(navController)

        rspcaGraph(navController)
        accessibleRspcaGraph(navController)

        toDoGraph(navController)
        accessibleToDoGraph(navController)

        musicPrototypeGraph(navController)
        accessibleMusicPrototypeGraph(navController)

        foodOrderingGraph(navController)
        accessibleFoodOrderingGraph(navController)

        kapuhaMusicGraph(navController)
        accessibleKapuhaMusicGraph(navController)
    }
}
