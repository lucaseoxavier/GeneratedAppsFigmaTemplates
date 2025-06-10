package com.lucaseox.generatedappsfigmatemplates.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.lucaseox.generatedappsfigmatemplates.navigation.v1.animalwiki.refactoredAnimalWikiGraph
import com.lucaseox.generatedappsfigmatemplates.navigation.v1.animalwiki.animalWikiGraph
import com.lucaseox.generatedappsfigmatemplates.navigation.v1.bca.refactoredBcaGraph
import com.lucaseox.generatedappsfigmatemplates.navigation.v1.bca.bcaGraph
import com.lucaseox.generatedappsfigmatemplates.navigation.v1.bestbuy.refactoredBestBuyGraph
import com.lucaseox.generatedappsfigmatemplates.navigation.v1.bestbuy.bestBuyGraph
import com.lucaseox.generatedappsfigmatemplates.navigation.v1.foodordering.refactoredFoodOrderingGraph
import com.lucaseox.generatedappsfigmatemplates.navigation.v1.foodordering.foodOrderingGraph
import com.lucaseox.generatedappsfigmatemplates.navigation.v1.kapuhamusic.refactoredKapuhaMusicGraph
import com.lucaseox.generatedappsfigmatemplates.navigation.v1.kapuhamusic.kapuhaMusicGraph
import com.lucaseox.generatedappsfigmatemplates.navigation.v1.musicprototype.refactoredMusicPrototypeGraph
import com.lucaseox.generatedappsfigmatemplates.navigation.v1.musicprototype.musicPrototypeGraph
import com.lucaseox.generatedappsfigmatemplates.navigation.v1.rspca.refactoredRspcaGraph
import com.lucaseox.generatedappsfigmatemplates.navigation.v1.rspca.rspcaGraph
import com.lucaseox.generatedappsfigmatemplates.navigation.v1.todo.refactoredToDoGraph
import com.lucaseox.generatedappsfigmatemplates.navigation.v1.todo.toDoGraph
import com.lucaseox.generatedappsfigmatemplates.navigation.v1.v1Graph
import com.lucaseox.generatedappsfigmatemplates.navigation.v2.animalwiki.animalWikiGraphV2
import com.lucaseox.generatedappsfigmatemplates.navigation.v2.animalwiki.refactoredAnimalWikiGraphV2
import com.lucaseox.generatedappsfigmatemplates.navigation.v2.bca.bcaGraphV2
import com.lucaseox.generatedappsfigmatemplates.navigation.v2.bca.refactoredBcaGraphV2
import com.lucaseox.generatedappsfigmatemplates.navigation.v2.kapuhamusic.kapuhaMusicGraphV2
import com.lucaseox.generatedappsfigmatemplates.navigation.v2.kapuhamusic.refactoredKapuhaMusicGraphV2
import com.lucaseox.generatedappsfigmatemplates.navigation.v2.rspca.refactoredRspcaGraphV2
import com.lucaseox.generatedappsfigmatemplates.navigation.v2.rspca.rspcaGraphV2
import com.lucaseox.generatedappsfigmatemplates.navigation.v2.v2Graph
import com.lucaseox.generatedappsfigmatemplates.navigation.v3.animalwiki.animalWikiGraphV3
import com.lucaseox.generatedappsfigmatemplates.navigation.v3.animalwiki.refactoredAnimalWikiGraphV3
import com.lucaseox.generatedappsfigmatemplates.navigation.v3.bca.bcaGraphV3
import com.lucaseox.generatedappsfigmatemplates.navigation.v3.bca.refactoredBcaGraphV3
import com.lucaseox.generatedappsfigmatemplates.navigation.v3.kapuhamusic.kapuhaMusicGraphV3
import com.lucaseox.generatedappsfigmatemplates.navigation.v3.kapuhamusic.refactoredKapuhaMusicGraphV3
import com.lucaseox.generatedappsfigmatemplates.navigation.v3.rspca.refactoredRspcaGraphV3
import com.lucaseox.generatedappsfigmatemplates.navigation.v3.rspca.rspcaGraphV3
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
        refactoredAnimalWikiGraph(navController)

        bcaGraph(navController)
        refactoredBcaGraph(navController)

        bestBuyGraph(navController)
        refactoredBestBuyGraph(navController)

        foodOrderingGraph(navController)
        refactoredFoodOrderingGraph(navController)

        kapuhaMusicGraph(navController)
        refactoredKapuhaMusicGraph(navController)

        musicPrototypeGraph(navController)
        refactoredMusicPrototypeGraph(navController)

        rspcaGraph(navController)
        refactoredRspcaGraph(navController)

        toDoGraph(navController)
        refactoredToDoGraph(navController)

        bcaGraphV2(navController)
        refactoredBcaGraphV2(navController)

        animalWikiGraphV2(navController)
        refactoredAnimalWikiGraphV2(navController)

        rspcaGraphV2(navController)
        refactoredRspcaGraphV2(navController)

        kapuhaMusicGraphV2(navController)
        refactoredKapuhaMusicGraphV2(navController)

        bcaGraphV3(navController)
        refactoredBcaGraphV3(navController)

        animalWikiGraphV3(navController)
        refactoredAnimalWikiGraphV3(navController)

        rspcaGraphV3(navController)
        refactoredRspcaGraphV3(navController)

        kapuhaMusicGraphV3(navController)
        refactoredKapuhaMusicGraphV3(navController)
    }
}
