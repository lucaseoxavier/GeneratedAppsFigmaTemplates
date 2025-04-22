package com.lucaseox.generatedappsfigmatemplates.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.lucaseox.generatedappsfigmatemplates.navigation.animalwiki.accessibleAnimalWikiGraph
import com.lucaseox.generatedappsfigmatemplates.navigation.animalwiki.animalWikiGraph
import com.lucaseox.generatedappsfigmatemplates.navigation.bca.accessibleBcaGraph
import com.lucaseox.generatedappsfigmatemplates.navigation.bca.bcaGraph
import com.lucaseox.generatedappsfigmatemplates.navigation.bestbuy.accessibleBestBuyGraph
import com.lucaseox.generatedappsfigmatemplates.navigation.bestbuy.bestBuyGraph
import com.lucaseox.generatedappsfigmatemplates.navigation.foodordering.accessibleFoodOrderingGraph
import com.lucaseox.generatedappsfigmatemplates.navigation.foodordering.foodOrderingGraph
import com.lucaseox.generatedappsfigmatemplates.navigation.kapuhamusic.accessibleKapuhaMusicGraph
import com.lucaseox.generatedappsfigmatemplates.navigation.kapuhamusic.kapuhaMusicGraph
import com.lucaseox.generatedappsfigmatemplates.navigation.musicprototype.accessibleMusicPrototypeGraph
import com.lucaseox.generatedappsfigmatemplates.navigation.musicprototype.musicPrototypeGraph
import com.lucaseox.generatedappsfigmatemplates.navigation.rspca.accessibleRspcaGraph
import com.lucaseox.generatedappsfigmatemplates.navigation.rspca.rspcaGraph
import com.lucaseox.generatedappsfigmatemplates.navigation.todo.accessibleToDoGraph
import com.lucaseox.generatedappsfigmatemplates.navigation.todo.toDoGraph

@Composable
fun AppNavigation(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Router.MainAppMenu
    ) {
        composable<Router.MainAppMenu> {
            GridScreen(navController, mainAppMenuButtons)
        }

        animalWikiGraph(navController)
        accessibleAnimalWikiGraph(navController)

        bcaGraph(navController)
        accessibleBcaGraph(navController)

        bestBuyGraph(navController)
        accessibleBestBuyGraph(navController)

        foodOrderingGraph(navController)
        accessibleFoodOrderingGraph(navController)

        kapuhaMusicGraph(navController)
        accessibleKapuhaMusicGraph(navController)

        musicPrototypeGraph(navController)
        accessibleMusicPrototypeGraph(navController)

        rspcaGraph(navController)
        accessibleRspcaGraph(navController)

        toDoGraph(navController)
        accessibleToDoGraph(navController)
    }
}
