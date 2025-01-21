package com.lucaseox.generatedfromfigmatemplates.navigation.bca

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.lucaseox.generatedfromfigmatemplates.GridScreen
import com.lucaseox.generatedfromfigmatemplates.bca.AmountScreen
import com.lucaseox.generatedfromfigmatemplates.bca.BlockScreen
import com.lucaseox.generatedfromfigmatemplates.bca.ControlScreen
import com.lucaseox.generatedfromfigmatemplates.bca.FlazzBalanceScreen
import com.lucaseox.generatedfromfigmatemplates.bca.FlazzCompletedScreen
import com.lucaseox.generatedfromfigmatemplates.bca.FlazzScreen
import com.lucaseox.generatedfromfigmatemplates.bca.FlazzTopUpScreen
import com.lucaseox.generatedfromfigmatemplates.bca.FullTransactionScreen
import com.lucaseox.generatedfromfigmatemplates.bca.HomeScreen
import com.lucaseox.generatedfromfigmatemplates.bca.InfoScreen
import com.lucaseox.generatedfromfigmatemplates.bca.LoginScreen
import com.lucaseox.generatedfromfigmatemplates.bca.MessageScreen
import com.lucaseox.generatedfromfigmatemplates.bca.NewAccountScreen
import com.lucaseox.generatedfromfigmatemplates.bca.NotificationScreen
import com.lucaseox.generatedfromfigmatemplates.bca.ProfileScreen
import com.lucaseox.generatedfromfigmatemplates.bca.QRCodeScannerScreen
import com.lucaseox.generatedfromfigmatemplates.bca.QRCodeScreen
import com.lucaseox.generatedfromfigmatemplates.bca.ReceiverScreen
import com.lucaseox.generatedfromfigmatemplates.bca.SetLimitScreen
import com.lucaseox.generatedfromfigmatemplates.bca.TransactionScreen
import com.lucaseox.generatedfromfigmatemplates.bca.TransferCompletedScreen
import com.lucaseox.generatedfromfigmatemplates.navigation.Router
import com.lucaseox.generatedfromfigmatemplates.navigation.bcaMenuButtons

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
            QRCodeScannerScreen()
        }
        composable<Router.BCA.ShowQrScreen> {
            QRCodeScreen()
        }
        composable<Router.BCA.TransactionScreen> {
            TransactionScreen()
        }
        composable<Router.BCA.FullTransactionScreen> {
            FullTransactionScreen()
        }
        composable<Router.BCA.FlazzScreen> {
            FlazzScreen()
        }
        composable<Router.BCA.FlazzBalanceScreen> {
            FlazzBalanceScreen()
        }
        composable<Router.BCA.FlazzTopUpScreen> {
            FlazzTopUpScreen()
        }
        composable<Router.BCA.FlazzCompletedScreen> {
            FlazzCompletedScreen()
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
            TransferCompletedScreen()
        }
        composable<Router.BCA.NewAccountScreen> {
            NewAccountScreen()
        }
        composable<Router.BCA.ProfileScreen> {
            ProfileScreen()
        }
        composable<Router.BCA.ControlScreen> {
            ControlScreen()
        }
        composable<Router.BCA.SetLimitScreen> {
            SetLimitScreen()
        }
        composable<Router.BCA.BlockScreen> {
            BlockScreen()
        }
    }
}