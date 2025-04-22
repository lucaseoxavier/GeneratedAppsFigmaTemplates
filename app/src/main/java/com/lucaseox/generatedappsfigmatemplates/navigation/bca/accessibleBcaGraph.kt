package com.lucaseox.generatedappsfigmatemplates.navigation.bca

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.lucaseox.generatedappsfigmatemplates.navigation.GridScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.Router
import com.lucaseox.generatedappsfigmatemplates.navigation.accessibleBcaMenuButtons

fun NavGraphBuilder.accessibleBcaGraph(navController: NavHostController) {
    navigation<Router.AccessibleBCA.Route>(startDestination = Router.AccessibleBCA.MenuScreen) {
        composable<Router.AccessibleBCA.MenuScreen> {
            GridScreen(navController, accessibleBcaMenuButtons)
        }
        composable<Router.AccessibleBCA.LoginScreen> {}
        composable<Router.AccessibleBCA.HomeScreen> {}
        composable<Router.AccessibleBCA.ScanQrScreen> {}
        composable<Router.AccessibleBCA.ShowQrScreen> {}
        composable<Router.AccessibleBCA.TransactionScreen> {}
        composable<Router.AccessibleBCA.FullTransactionScreen> {}
        composable<Router.AccessibleBCA.FlazzScreen> {}
        composable<Router.AccessibleBCA.FlazzBalanceScreen> {}
        composable<Router.AccessibleBCA.FlazzTopUpScreen> {}
        composable<Router.AccessibleBCA.FlazzCompletedScreen> {}
        composable<Router.AccessibleBCA.InfoScreen> {}
        composable<Router.AccessibleBCA.NotificationScreen> {}
        composable<Router.AccessibleBCA.MessageScreen> {}
        composable<Router.AccessibleBCA.ReceiverScreen> {}
        composable<Router.AccessibleBCA.AmountScreen> {}
        composable<Router.AccessibleBCA.TransferCompletedScreen> {}
        composable<Router.AccessibleBCA.NewAccountScreen> {}
        composable<Router.AccessibleBCA.ProfileScreen> {}
        composable<Router.AccessibleBCA.ControlScreen> {}
        composable<Router.AccessibleBCA.SetLimitScreen> {}
        composable<Router.AccessibleBCA.BlockScreen> {}
    }
}