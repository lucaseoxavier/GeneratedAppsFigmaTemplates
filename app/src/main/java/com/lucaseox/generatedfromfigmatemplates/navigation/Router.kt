package com.lucaseox.generatedfromfigmatemplates.navigation

import kotlinx.serialization.Serializable

sealed class Router {
    @Serializable
    data object MainAppMenu: Router()

    @Serializable
    sealed class BestBuy(val name: String) : Router() {
        @Serializable data object Route : BestBuy("Best Buy Route")
        @Serializable data object MenuScreen : BestBuy("Best Buy Menu")
        @Serializable data object HomeScreen : BestBuy("Home Screen")
        @Serializable data object ProductScreen : BestBuy("Product Screen")
        @Serializable data object CartScreen : BestBuy("Cart Screen")
        @Serializable data object CheckoutScreen : BestBuy("Checkout Screen")
    }

    @Serializable
    sealed class AccessibleBestBuy(val name: String) : Router() {
        @Serializable data object Route : AccessibleBestBuy("Accessible Best Buy Route")
        @Serializable data object MenuScreen : AccessibleBestBuy("Accessible Best Buy Menu")
        @Serializable data object HomeScreen : AccessibleBestBuy("Home Screen")
        @Serializable data object ProductScreen : AccessibleBestBuy("Product Screen")
        @Serializable data object CartScreen : AccessibleBestBuy("Cart Screen")
        @Serializable data object CheckoutScreen : AccessibleBestBuy("Checkout Screen")
    }

    @Serializable
    sealed class BCA(val name: String) : Router() {
        @Serializable data object Route : BCA("BCA Route")
        @Serializable data object MenuScreen : BCA("BCA Menu")
        @Serializable data object LoginScreen : BCA("Login Screen")
        @Serializable data object HomeScreen : BCA("Home Screen")
        @Serializable data object ScanQrScreen : BCA("Scan Qr Screen")
        @Serializable data object ShowQrScreen : BCA("Show Qr Screen")
        @Serializable data object TransactionScreen : BCA("Transaction Screen")
        @Serializable data object FullTransactionScreen : BCA("Full Transaction Screen")
        @Serializable data object FlazzScreen : BCA("Flazz Screen")
        @Serializable data object FlazzBalanceScreen : BCA("Flazz Balance Screen")
        @Serializable data object FlazzTopUpScreen : BCA("Flazz Top Up Screen")
        @Serializable data object FlazzCompletedScreen : BCA("Flazz Completed Screen")
        @Serializable data object InfoScreen : BCA("Info Screen")
        @Serializable data object NotificationScreen : BCA("Notification Screen")
        @Serializable data object MessageScreen : BCA("Message Screen")
        @Serializable data object ReceiverScreen : BCA("Receiver Screen")
        @Serializable data object AmountScreen : BCA("Amount Screen")
        @Serializable data object TransferCompletedScreen : BCA("Transfer Completed Screen")
        @Serializable data object NewAccountScreen : BCA("New Account Screen")
        @Serializable data object ProfileScreen : BCA("Profile Screen")
        @Serializable data object ControlScreen : BCA("Control Screen")
        @Serializable data object SetLimitScreen : BCA("Set Limit Screen")
        @Serializable data object BlockScreen : BCA("Block Screen")
    }

    @Serializable
    sealed class AccessibleBCA(val name: String) : Router() {
        @Serializable data object Route : AccessibleBCA("Accessible BCA Route")
        @Serializable data object MenuScreen : AccessibleBCA("Accessible BCA Menu")
        @Serializable data object LoginScreen : AccessibleBCA("Login Screen")
        @Serializable data object HomeScreen : AccessibleBCA("Home Screen")
        @Serializable data object ScanQrScreen : AccessibleBCA("Scan Qr Screen")
        @Serializable data object ShowQrScreen : AccessibleBCA("Show Qr Screen")
        @Serializable data object TransactionScreen : AccessibleBCA("Transaction Screen")
        @Serializable data object FullTransactionScreen : AccessibleBCA("Full Transaction Screen")
        @Serializable data object FlazzScreen : AccessibleBCA("Flazz Screen")
        @Serializable data object FlazzBalanceScreen : AccessibleBCA("Flazz Balance Screen")
        @Serializable data object FlazzTopUpScreen : AccessibleBCA("Flazz Top Up Screen")
        @Serializable data object FlazzCompletedScreen : AccessibleBCA("Flazz Completed Screen")
        @Serializable data object InfoScreen : AccessibleBCA("Info Screen")
        @Serializable data object NotificationScreen : AccessibleBCA("Notification Screen")
        @Serializable data object MessageScreen : AccessibleBCA("Message Screen")
        @Serializable data object ReceiverScreen : AccessibleBCA("Receiver Screen")
        @Serializable data object AmountScreen : AccessibleBCA("Amount Screen")
        @Serializable data object TransferCompletedScreen : AccessibleBCA("Transfer Completed Screen")
        @Serializable data object NewAccountScreen : AccessibleBCA("New Account Screen")
        @Serializable data object ProfileScreen : AccessibleBCA("Profile Screen")
        @Serializable data object ControlScreen : AccessibleBCA("Control Screen")
        @Serializable data object SetLimitScreen : AccessibleBCA("Set Limit Screen")
        @Serializable data object BlockScreen : AccessibleBCA("Block Screen")
    }

    @Serializable
    sealed class AnimalWiki(val name: String) : Router() {
        @Serializable data object Route : AnimalWiki("Animal Wiki Route")
        @Serializable data object MenuScreen : AnimalWiki("Animal Wiki Menu")
    }

    @Serializable
    sealed class AccessibleAnimalWiki(val name: String) : Router() {
        @Serializable data object Route : AccessibleAnimalWiki("Accessible Animal Wiki Route")
        @Serializable data object MenuScreen : AccessibleAnimalWiki("Accessible Animal Wiki Menu")
    }

    @Serializable
    sealed class RSPCA(val name: String) : Router() {
        @Serializable data object Route : RSPCA("RSPCA Route")
        @Serializable data object MenuScreen : RSPCA("RSPCA Menu")
    }

    @Serializable
    sealed class AccessibleRSPCA(val name: String) : Router() {
        @Serializable data object Route : AccessibleRSPCA("Accessible RSPCA Route")
        @Serializable data object MenuScreen : AccessibleRSPCA("Accessible RSPCA Menu")
    }

    @Serializable
    sealed class ToDo(val name: String) : Router() {
        @Serializable data object Route : ToDo("ToDo Route")
        @Serializable data object MenuScreen : ToDo("ToDo Menu")
    }

    @Serializable
    sealed class AccessibleToDo(val name: String) : Router() {
        @Serializable data object Route : AccessibleToDo("Accessible ToDo Route")
        @Serializable data object MenuScreen : AccessibleToDo("Accessible ToDo Menu")
    }

    @Serializable
    sealed class MusicPrototype (val name: String) : Router() {
        @Serializable data object Route : MusicPrototype("Music Prototype Route")
        @Serializable data object MenuScreen : MusicPrototype("Music Prototype Menu")
    }

    @Serializable
    sealed class AccessibleMusicPrototype(val name: String) : Router() {
        @Serializable data object Route : AccessibleMusicPrototype("Accessible Music Prototype Route")
        @Serializable data object MenuScreen : AccessibleMusicPrototype("Accessible Music Prototype Menu")
    }

    @Serializable
    sealed class FoodOrdering (val name: String) : Router() {
        @Serializable data object Route : FoodOrdering("Food Ordering Route")
        @Serializable data object MenuScreen : FoodOrdering("Food Ordering Menu Screen")
    }

    @Serializable
    sealed class AccessibleFoodOrdering(val name: String) : Router() {
        @Serializable data object Route : AccessibleFoodOrdering("Accessible Food Ordering Route")
        @Serializable data object MenuScreen : AccessibleFoodOrdering("Accessible Food Ordering Menu")
    }

    @Serializable
    sealed class KapuhaMusic (val name: String) : Router() {
        @Serializable data object Route : KapuhaMusic("Kapuha Music Route")
        @Serializable data object MenuScreen : KapuhaMusic("Kapuha Music Menu")
    }

    @Serializable
    sealed class AccessibleKapuhaMusic(val name: String) : Router() {
        @Serializable data object Route : AccessibleKapuhaMusic("Accessible Kapuha Music Route")
        @Serializable data object MenuScreen : AccessibleKapuhaMusic("Accessible Kapuha Music Menu")
    }
}