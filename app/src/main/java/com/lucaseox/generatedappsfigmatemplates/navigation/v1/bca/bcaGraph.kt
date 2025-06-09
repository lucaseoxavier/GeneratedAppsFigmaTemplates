package com.lucaseox.generatedappsfigmatemplates.navigation.v1.bca

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v1.bca.AmountScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v1.bca.CardBlockageScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v1.bca.CardSettingsScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v1.bca.FlazzBalanceScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v1.bca.FlazzNfcScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v1.bca.FlazzTopUpScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v1.bca.FullTransactionScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v1.bca.HomeScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v1.bca.InfoScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v1.bca.LoginScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v1.bca.MessageScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v1.bca.NewAccountScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v1.bca.NotificationScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v1.bca.ProfileScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v1.bca.QRScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v1.bca.ReceiverScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v1.bca.ScanQrScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v1.bca.SetLimitScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v1.bca.TopUpCompletedScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v1.bca.TransactionScreen
import com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v1.bca.TransferCompleteScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.GridScreen
import com.lucaseox.generatedappsfigmatemplates.navigation.Router
import com.lucaseox.generatedappsfigmatemplates.navigation.bcaMenuButtons

fun NavGraphBuilder.bcaGraph(navController: NavHostController) {
    navigation<Router.BCA.Route>(startDestination = Router.BCA.MenuScreen) {
        composable<Router.BCA.MenuScreen> {
            GridScreen(navController, bcaMenuButtons, Router.BCA.MenuScreen.name)
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