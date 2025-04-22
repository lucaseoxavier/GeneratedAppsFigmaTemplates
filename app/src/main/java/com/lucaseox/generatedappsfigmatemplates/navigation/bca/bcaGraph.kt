package com.lucaseox.generatedappsfigmatemplates.navigation.bca

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.lucaseox.generatedappsfigmatemplates.navigation.GridScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.Router
import com.lucaseox.generatedappsfigmatemplates.navigation.bcaMenuButtons

fun NavGraphBuilder.bcaGraph(navController: NavHostController) {
    navigation<Router.BCA.Route>(startDestination = Router.BCA.MenuScreen) {
        composable<Router.BCA.MenuScreen> {
            GridScreen(navController, bcaMenuButtons)
        }
        composable<Router.BCA.LoginScreen> {}
        composable<Router.BCA.HomeScreen> {}
        composable<Router.BCA.ScanQrScreen> {}
        composable<Router.BCA.ShowQrScreen> {}
        composable<Router.BCA.TransactionScreen> {}
        composable<Router.BCA.FullTransactionScreen> {}
        composable<Router.BCA.FlazzScreen> {}
        composable<Router.BCA.FlazzBalanceScreen> {}
        composable<Router.BCA.FlazzTopUpScreen> {}
        composable<Router.BCA.FlazzCompletedScreen> {}
        composable<Router.BCA.InfoScreen> {}
        composable<Router.BCA.NotificationScreen> {}
        composable<Router.BCA.MessageScreen> {}
        composable<Router.BCA.ReceiverScreen> {}
        composable<Router.BCA.AmountScreen> {}
        composable<Router.BCA.TransferCompletedScreen> {}
        composable<Router.BCA.NewAccountScreen> {}
        composable<Router.BCA.ProfileScreen> {}
        composable<Router.BCA.ControlScreen> {}
        composable<Router.BCA.SetLimitScreen> {}
        composable<Router.BCA.BlockScreen> {}
    }
}