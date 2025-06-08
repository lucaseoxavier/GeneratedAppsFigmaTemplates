package com.lucaseox.generatedappsfigmatemplates.navigation.bca

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredbca.AmountScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredbca.CardBlockageScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredbca.CardSettingsScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredbca.FlazzBalanceScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredbca.FlazzNfcScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredbca.FlazzTopUpScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredbca.FullTransactionScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredbca.HomeScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredbca.InfoScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredbca.LoginScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredbca.MessageScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredbca.NewAccountScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredbca.NotificationScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredbca.ProfileScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredbca.QRScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredbca.ReceiverScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredbca.SetLimitScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredbca.TopUpCompletedScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredbca.TransactionScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredbca.TransferCompleteScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.GridScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.Router
import com.lucaseox.generatedappsfigmatemplates.navigation.accessibleBcaMenuButtons

fun NavGraphBuilder.accessibleBcaGraph(navController: NavHostController) {
    navigation<Router.AccessibleBCA.Route>(startDestination = Router.AccessibleBCA.MenuScreen) {
        composable<Router.AccessibleBCA.MenuScreen> {
            GridScreen(navController, accessibleBcaMenuButtons)
        }
        composable<Router.AccessibleBCA.LoginScreen> {
            LoginScreen()
        }
        composable<Router.AccessibleBCA.HomeScreen> {
            HomeScreen()
        }
        composable<Router.AccessibleBCA.ScanQrScreen> {
            // no accessibility errors
        }
        composable<Router.AccessibleBCA.ShowQrScreen> {
            QRScreen()
        }
        composable<Router.AccessibleBCA.TransactionScreen> {
            TransactionScreen()
        }
        composable<Router.AccessibleBCA.FullTransactionScreen> {
            FullTransactionScreen()
        }
        composable<Router.AccessibleBCA.FlazzScreen> {
            FlazzNfcScreen()
        }
        composable<Router.AccessibleBCA.FlazzBalanceScreen> {
            FlazzBalanceScreen()
        }
        composable<Router.AccessibleBCA.FlazzTopUpScreen> {
            FlazzTopUpScreen()
        }
        composable<Router.AccessibleBCA.FlazzCompletedScreen> {
            TopUpCompletedScreen()
        }
        composable<Router.AccessibleBCA.InfoScreen> {
            InfoScreen()
        }
        composable<Router.AccessibleBCA.NotificationScreen> {
            NotificationScreen()
        }
        composable<Router.AccessibleBCA.MessageScreen> {
            MessageScreen()
        }
        composable<Router.AccessibleBCA.ReceiverScreen> {
            ReceiverScreen()
        }
        composable<Router.AccessibleBCA.AmountScreen> {
            AmountScreen()
        }
        composable<Router.AccessibleBCA.TransferCompletedScreen> {
            TransferCompleteScreen()
        }
        composable<Router.AccessibleBCA.NewAccountScreen> {
            NewAccountScreen()
        }
        composable<Router.AccessibleBCA.ProfileScreen> {
            ProfileScreen()
        }
        composable<Router.AccessibleBCA.ControlScreen> {
            CardSettingsScreen()
        }
        composable<Router.AccessibleBCA.SetLimitScreen> {
            SetLimitScreen()
        }
        composable<Router.AccessibleBCA.BlockScreen> {
            CardBlockageScreen()
        }
    }
}