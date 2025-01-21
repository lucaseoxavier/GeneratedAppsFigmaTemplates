package com.lucaseox.generatedfromfigmatemplates.navigation.bca

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.lucaseox.generatedfromfigmatemplates.GridScreen
import com.lucaseox.generatedfromfigmatemplates.bcaaccessible.BlockScreen
import com.lucaseox.generatedfromfigmatemplates.bcaaccessible.ControlScreen
import com.lucaseox.generatedfromfigmatemplates.bcaaccessible.FlazzBalanceScreen
import com.lucaseox.generatedfromfigmatemplates.bcaaccessible.FlazzCompletedScreen
import com.lucaseox.generatedfromfigmatemplates.bcaaccessible.FlazzScreen
import com.lucaseox.generatedfromfigmatemplates.bcaaccessible.FlazzTopUpScreen
import com.lucaseox.generatedfromfigmatemplates.bcaaccessible.FullTransactionScreen
import com.lucaseox.generatedfromfigmatemplates.bcaaccessible.HomeScreen
import com.lucaseox.generatedfromfigmatemplates.bcaaccessible.InfoScreen
import com.lucaseox.generatedfromfigmatemplates.bcaaccessible.LoginScreen
import com.lucaseox.generatedfromfigmatemplates.bcaaccessible.MessageScreen
import com.lucaseox.generatedfromfigmatemplates.bcaaccessible.NewAccountScreen
import com.lucaseox.generatedfromfigmatemplates.bcaaccessible.NotificationScreen
import com.lucaseox.generatedfromfigmatemplates.bcaaccessible.ProfileScreen
import com.lucaseox.generatedfromfigmatemplates.bcaaccessible.QRCodeScannerScreen
import com.lucaseox.generatedfromfigmatemplates.bcaaccessible.QRCodeScreen
import com.lucaseox.generatedfromfigmatemplates.bcaaccessible.ReceiverScreen
import com.lucaseox.generatedfromfigmatemplates.bcaaccessible.SetLimitScreen
import com.lucaseox.generatedfromfigmatemplates.bcaaccessible.TransactionScreen
import com.lucaseox.generatedfromfigmatemplates.bcaaccessible.TransferCompletedScreen
import com.lucaseox.generatedfromfigmatemplates.navigation.Router
import com.lucaseox.generatedfromfigmatemplates.navigation.accessibleBcaMenuButtons

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
            QRCodeScannerScreen()
        }
        composable<Router.AccessibleBCA.ShowQrScreen> {
            QRCodeScreen()
        }
        composable<Router.AccessibleBCA.TransactionScreen> {
            TransactionScreen()
        }
        composable<Router.AccessibleBCA.FullTransactionScreen> {
            FullTransactionScreen()
        }
        composable<Router.AccessibleBCA.FlazzScreen> {
            FlazzScreen()
        }
        composable<Router.AccessibleBCA.FlazzBalanceScreen> {
            FlazzBalanceScreen()
        }
        composable<Router.AccessibleBCA.FlazzTopUpScreen> {
            FlazzTopUpScreen()
        }
        composable<Router.AccessibleBCA.FlazzCompletedScreen> {
            FlazzCompletedScreen()
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
            // No accessibility issues found
        }
        composable<Router.AccessibleBCA.TransferCompletedScreen> {
            TransferCompletedScreen()
        }
        composable<Router.AccessibleBCA.NewAccountScreen> {
            NewAccountScreen()
        }
        composable<Router.AccessibleBCA.ProfileScreen> {
            ProfileScreen()
        }
        composable<Router.AccessibleBCA.ControlScreen> {
            ControlScreen()
        }
        composable<Router.AccessibleBCA.SetLimitScreen> {
            SetLimitScreen()
        }
        composable<Router.AccessibleBCA.BlockScreen> {
            BlockScreen()
        }
    }
}