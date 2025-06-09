package com.lucaseox.generatedappsfigmatemplates.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.lucaseox.generatedappsfigmatemplates.navigation.v1.animalwiki.accessibleAnimalWikiGraph
import com.lucaseox.generatedappsfigmatemplates.navigation.v1.animalwiki.animalWikiGraph
import com.lucaseox.generatedappsfigmatemplates.navigation.v1.bca.accessibleBcaGraph
import com.lucaseox.generatedappsfigmatemplates.navigation.v1.bca.bcaGraph
import com.lucaseox.generatedappsfigmatemplates.navigation.v1.bestbuy.accessibleBestBuyGraph
import com.lucaseox.generatedappsfigmatemplates.navigation.v1.bestbuy.bestBuyGraph
import com.lucaseox.generatedappsfigmatemplates.navigation.v1.foodordering.accessibleFoodOrderingGraph
import com.lucaseox.generatedappsfigmatemplates.navigation.v1.foodordering.foodOrderingGraph
import com.lucaseox.generatedappsfigmatemplates.navigation.v1.kapuhamusic.accessibleKapuhaMusicGraph
import com.lucaseox.generatedappsfigmatemplates.navigation.v1.kapuhamusic.kapuhaMusicGraph
import com.lucaseox.generatedappsfigmatemplates.navigation.v1.musicprototype.accessibleMusicPrototypeGraph
import com.lucaseox.generatedappsfigmatemplates.navigation.v1.musicprototype.musicPrototypeGraph
import com.lucaseox.generatedappsfigmatemplates.navigation.v1.rspca.accessibleRspcaGraph
import com.lucaseox.generatedappsfigmatemplates.navigation.v1.rspca.rspcaGraph
import com.lucaseox.generatedappsfigmatemplates.navigation.v1.todo.accessibleToDoGraph
import com.lucaseox.generatedappsfigmatemplates.navigation.v1.todo.toDoGraph
import com.lucaseox.generatedappsfigmatemplates.navigation.v1.v1Graph
import com.lucaseox.generatedappsfigmatemplates.navigation.v2.v2Graph
import com.lucaseox.generatedappsfigmatemplates.navigation.v3.v3Graph

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

        v1Graph(navController)

        v2Graph(navController)

        v3Graph(navController)

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
