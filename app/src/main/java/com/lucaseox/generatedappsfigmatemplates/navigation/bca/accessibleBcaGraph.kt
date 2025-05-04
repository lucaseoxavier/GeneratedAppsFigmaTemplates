package com.lucaseox.generatedappsfigmatemplates.navigation.bca

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessiblebca.AmountScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessiblebca.CardBlockageScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessiblebca.CardSettingsScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessiblebca.FlazzBalanceScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessiblebca.FlazzNfcScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessiblebca.FlazzTopUpScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessiblebca.FullTransactionScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessiblebca.HomeScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessiblebca.InfoScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessiblebca.LoginScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessiblebca.MessageScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessiblebca.NewAccountScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessiblebca.NotificationScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessiblebca.ProfileScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessiblebca.QRScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessiblebca.ReceiverScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessiblebca.SetLimitScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessiblebca.TopUpCompletedScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessiblebca.TransactionScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessiblebca.TransferCompleteScreen
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