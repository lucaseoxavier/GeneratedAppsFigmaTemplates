package com.lucaseox.generatedappsfigmatemplates.navigation.bca

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.bca.AmountScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.bca.CardBlockageScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.bca.CardSettingsScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.bca.FlazzBalanceScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.bca.FlazzNfcScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.bca.FlazzTopUpScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.bca.FullTransactionScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.bca.HomeScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.bca.InfoScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.bca.LoginScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.bca.MessageScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.bca.NewAccountScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.bca.NotificationScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.bca.ProfileScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.bca.QRScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.bca.ReceiverScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.bca.ScanQrScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.bca.SetLimitScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.bca.TopUpCompletedScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.bca.TransactionScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.bca.TransferCompleteScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.GridScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.Router
import com.lucaseox.generatedappsfigmatemplates.navigation.bcaMenuButtons

fun NavGraphBuilder.bcaGraph(navController: NavHostController) {
    navigation<Router.BCA.Route>(startDestination = Router.BCA.MenuScreen) {
        composable<Router.BCA.MenuScreen> {
            GridScreen(navController, bcaMenuButtons)
        }
        composable<Router.BCA.LoginScreen> {
            LoginScreen()
        }
        composable<Router.BCA.HomeScreen> {
            HomeScreen()
        }
        composable<Router.BCA.ScanQrScreen> {
            ScanQrScreen()
        }
        composable<Router.BCA.ShowQrScreen> {
            QRScreen()
        }
        composable<Router.BCA.TransactionScreen> {
            TransactionScreen()
        }
        composable<Router.BCA.FullTransactionScreen> {
            FullTransactionScreen()
        }
        composable<Router.BCA.FlazzScreen> {
            FlazzNfcScreen()
        }
        composable<Router.BCA.FlazzBalanceScreen> {
            FlazzBalanceScreen()
        }
        composable<Router.BCA.FlazzTopUpScreen> {
            FlazzTopUpScreen()
        }
        composable<Router.BCA.FlazzCompletedScreen> {
            TopUpCompletedScreen()
        }
        composable<Router.BCA.InfoScreen> {
            InfoScreen()
        }
        composable<Router.BCA.NotificationScreen> {
            NotificationScreen()
        }
        composable<Router.BCA.MessageScreen> {
            MessageScreen()
        }
        composable<Router.BCA.ReceiverScreen> {
            ReceiverScreen()
        }
        composable<Router.BCA.AmountScreen> {
            AmountScreen()
        }
        composable<Router.BCA.TransferCompletedScreen> {
            TransferCompleteScreen()
        }
        composable<Router.BCA.NewAccountScreen> {
            NewAccountScreen()
        }
        composable<Router.BCA.ProfileScreen> {
            ProfileScreen()
        }
        composable<Router.BCA.ControlScreen> {
            CardSettingsScreen()
        }
        composable<Router.BCA.SetLimitScreen> {
            SetLimitScreen()
        }
        composable<Router.BCA.BlockScreen> {
            CardBlockageScreen()
        }
    }
}