package com.lucaseox.generatedappsfigmatemplates.navigation.v1.bca

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
import com.lucaseox.generatedappsfigmatemplates.navigation.refactoredBcaMenuButtons

fun NavGraphBuilder.refactoredBcaGraph(navController: NavHostController) {
    navigation<Router.RefactoredBCA.Route>(startDestination = Router.RefactoredBCA.MenuScreen) {
        composable<Router.RefactoredBCA.MenuScreen> {
            GridScreen(navController, refactoredBcaMenuButtons, Router.RefactoredBCA.MenuScreen.name)
        }
        composable<Router.RefactoredBCA.LoginScreen> {
            LoginScreen()
        }
        composable<Router.RefactoredBCA.HomeScreen> {
            HomeScreen()
        }
        composable<Router.RefactoredBCA.ScanQrScreen> {
            // no accessibility errors
        }
        composable<Router.RefactoredBCA.ShowQrScreen> {
            QRScreen()
        }
        composable<Router.RefactoredBCA.TransactionScreen> {
            TransactionScreen()
        }
        composable<Router.RefactoredBCA.FullTransactionScreen> {
            FullTransactionScreen()
        }
        composable<Router.RefactoredBCA.FlazzScreen> {
            FlazzNfcScreen()
        }
        composable<Router.RefactoredBCA.FlazzBalanceScreen> {
            FlazzBalanceScreen()
        }
        composable<Router.RefactoredBCA.FlazzTopUpScreen> {
            FlazzTopUpScreen()
        }
        composable<Router.RefactoredBCA.FlazzCompletedScreen> {
            TopUpCompletedScreen()
        }
        composable<Router.RefactoredBCA.InfoScreen> {
            InfoScreen()
        }
        composable<Router.RefactoredBCA.NotificationScreen> {
            NotificationScreen()
        }
        composable<Router.RefactoredBCA.MessageScreen> {
            MessageScreen()
        }
        composable<Router.RefactoredBCA.ReceiverScreen> {
            ReceiverScreen()
        }
        composable<Router.RefactoredBCA.AmountScreen> {
            AmountScreen()
        }
        composable<Router.RefactoredBCA.TransferCompletedScreen> {
            TransferCompleteScreen()
        }
        composable<Router.RefactoredBCA.NewAccountScreen> {
            NewAccountScreen()
        }
        composable<Router.RefactoredBCA.ProfileScreen> {
            ProfileScreen()
        }
        composable<Router.RefactoredBCA.ControlScreen> {
            CardSettingsScreen()
        }
        composable<Router.RefactoredBCA.SetLimitScreen> {
            SetLimitScreen()
        }
        composable<Router.RefactoredBCA.BlockScreen> {
            CardBlockageScreen()
        }
    }
}