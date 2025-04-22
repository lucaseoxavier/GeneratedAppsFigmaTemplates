package com.lucaseox.generatedappsfigmatemplates.navigation

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
        @Serializable data object SplashScreen : AnimalWiki("Splash Screen")
        @Serializable data object LoginScreen : AnimalWiki("Login Screen")
        @Serializable data object DashboardScreen : AnimalWiki("Dashboard Screen")
        @Serializable data object AnimalScreen : AnimalWiki("Animal Screen")
    }

    @Serializable
    sealed class AccessibleAnimalWiki(val name: String) : Router() {
        @Serializable data object Route : AccessibleAnimalWiki("Accessible Animal Wiki Route")
        @Serializable data object MenuScreen : AccessibleAnimalWiki("Accessible Animal Wiki Menu")
        @Serializable data object SplashScreen : AccessibleAnimalWiki("Splash Screen")
        @Serializable data object LoginScreen : AccessibleAnimalWiki("Login Screen")
        @Serializable data object DashboardScreen : AccessibleAnimalWiki("Dashboard Screen")
        @Serializable data object AnimalScreen : AccessibleAnimalWiki("Animal Screen")
    }

    @Serializable
    sealed class RSPCA(val name: String) : Router() {
        @Serializable data object Route : RSPCA("RSPCA Route")
        @Serializable data object MenuScreen : RSPCA("RSPCA Menu")
        @Serializable data object StartScreen : RSPCA("Start Screen")
        @Serializable data object LoginScreen : RSPCA("Login Screen")
        @Serializable data object HomeScreen : RSPCA("Home Screen")
        @Serializable data object RegisterPetScreen : RSPCA("Register Pet Screen")
        @Serializable data object DogScreen : RSPCA("Dog Screen")
        @Serializable data object RegisterDogScreen : RSPCA("Register Dog Screen")
        @Serializable data object AdoptionScreen : RSPCA("Adoption Screen")
        @Serializable data object AdoptionFormScreen : RSPCA("Adoption Form Screen")
        @Serializable data object ServicesScreen : RSPCA("Services Screen")
        @Serializable data object CurrentPetsScreen : RSPCA("Current Pets Screen")
        @Serializable data object VetScreen : RSPCA("Vet Screen")
        @Serializable data object GroomingScreen : RSPCA("Grooming Screen")
        @Serializable data object MapScreen : RSPCA("Map Screen")
        @Serializable data object PetInfoScreen : RSPCA("Pet Info Screen")
        @Serializable data object DietScreen : RSPCA("Diet Screen")
        @Serializable data object BMIScreen : RSPCA("BMI Screen")
        @Serializable data object ExerciseScreen : RSPCA("Exercise Screen")
        @Serializable data object WalkScreen : RSPCA("Walk Screen")
        @Serializable data object WalkRecordScreen : RSPCA("Walk Record Screen")
    }

    @Serializable
    sealed class AccessibleRSPCA(val name: String) : Router() {
        @Serializable data object Route : AccessibleRSPCA("Accessible RSPCA Route")
        @Serializable data object MenuScreen : AccessibleRSPCA("Accessible RSPCA Menu")
        @Serializable data object StartScreen : AccessibleRSPCA("Start Screen")
        @Serializable data object LoginScreen : AccessibleRSPCA("Login Screen")
        @Serializable data object HomeScreen : AccessibleRSPCA("Home Screen")
        @Serializable data object RegisterPetScreen : AccessibleRSPCA("Register Pet Screen")
        @Serializable data object DogScreen : AccessibleRSPCA("Dog Screen")
        @Serializable data object RegisterDogScreen : AccessibleRSPCA("Register Dog Screen")
        @Serializable data object AdoptionScreen : AccessibleRSPCA("Adoption Screen")
        @Serializable data object AdoptionFormScreen : AccessibleRSPCA("Adoption Form Screen")
        @Serializable data object ServicesScreen : AccessibleRSPCA("Services Screen")
        @Serializable data object CurrentPetsScreen : AccessibleRSPCA("Current Pets Screen")
        @Serializable data object VetScreen : AccessibleRSPCA("Vet Screen")
        @Serializable data object GroomingScreen : AccessibleRSPCA("Grooming Screen")
        @Serializable data object MapScreen : AccessibleRSPCA("Map Screen")
        @Serializable data object PetInfoScreen : AccessibleRSPCA("Pet Info Screen")
        @Serializable data object DietScreen : AccessibleRSPCA("Diet Screen")
        @Serializable data object BMIScreen : AccessibleRSPCA("BMI Screen")
        @Serializable data object ExerciseScreen : AccessibleRSPCA("Exercise Screen")
        @Serializable data object WalkScreen : AccessibleRSPCA("Walk Screen")
        @Serializable data object WalkRecordScreen : AccessibleRSPCA("Walk Record Screen")
    }

    @Serializable
    sealed class ToDo(val name: String) : Router() {
        @Serializable data object Route : ToDo("ToDo Route")
        @Serializable data object MenuScreen : ToDo("ToDo Menu")
        @Serializable data object StartScreen : ToDo("Start Screen")
        @Serializable data object RegisterScreen : ToDo("Register Screen")
        @Serializable data object LoginScreen : ToDo("Login Screen")
        @Serializable data object ToDoScreen : ToDo("ToDo Screen")
    }

    @Serializable
    sealed class AccessibleToDo(val name: String) : Router() {
        @Serializable data object Route : AccessibleToDo("Accessible ToDo Route")
        @Serializable data object MenuScreen : AccessibleToDo("Accessible ToDo Menu")
        @Serializable data object StartScreen : AccessibleToDo("Start Screen")
        @Serializable data object RegisterScreen : AccessibleToDo("Register Screen")
        @Serializable data object LoginScreen : AccessibleToDo("Login Screen")
        @Serializable data object ToDoScreen : AccessibleToDo("ToDo Screen")
    }

    @Serializable
    sealed class MusicPrototype (val name: String) : Router() {
        @Serializable data object Route : MusicPrototype("Music Prototype Route")
        @Serializable data object MenuScreen : MusicPrototype("Music Prototype Menu")
        @Serializable data object HomeScreen : MusicPrototype("Home Screen")
        @Serializable data object PlayerScreen : MusicPrototype("Player Screen")
    }

    @Serializable
    sealed class AccessibleMusicPrototype(val name: String) : Router() {
        @Serializable data object Route : AccessibleMusicPrototype("Accessible Music Prototype Route")
        @Serializable data object MenuScreen : AccessibleMusicPrototype("Accessible Music Prototype Menu")
        @Serializable data object HomeScreen : AccessibleMusicPrototype("Home Screen")
        @Serializable data object PlayerScreen : AccessibleMusicPrototype("Player Screen")
    }

    @Serializable
    sealed class FoodOrdering (val name: String) : Router() {
        @Serializable data object Route : FoodOrdering("Food Ordering Route")
        @Serializable data object MenuScreen : FoodOrdering("Food Ordering Menu Screen")
        @Serializable data object HomeScreen : FoodOrdering("Home Screen")
        @Serializable data object OrderScreen : FoodOrdering("Order Screen")
        @Serializable data object CartScreen : FoodOrdering("Cart Screen")
        @Serializable data object RateScreen : FoodOrdering("Rate Screen")
    }

    @Serializable
    sealed class AccessibleFoodOrdering(val name: String) : Router() {
        @Serializable data object Route : AccessibleFoodOrdering("Accessible Food Ordering Route")
        @Serializable data object MenuScreen : AccessibleFoodOrdering("Accessible Food Ordering Menu")
        @Serializable data object HomeScreen : AccessibleFoodOrdering("Home Screen")
        @Serializable data object OrderScreen : AccessibleFoodOrdering("Order Screen")
        @Serializable data object CartScreen : AccessibleFoodOrdering("Cart Screen")
        @Serializable data object RateScreen : AccessibleFoodOrdering("Rate Screen")
    }

    @Serializable
    sealed class KapuhaMusic (val name: String) : Router() {
        @Serializable data object Route : KapuhaMusic("Kapuha Music Route")
        @Serializable data object MenuScreen : KapuhaMusic("Kapuha Music Menu")
        @Serializable data object StartScreen : KapuhaMusic("Start Screen")
        @Serializable data object HomeScreen : KapuhaMusic("Home Screen")
    }

    @Serializable
    sealed class AccessibleKapuhaMusic(val name: String) : Router() {
        @Serializable data object Route : AccessibleKapuhaMusic("Accessible Kapuha Music Route")
        @Serializable data object MenuScreen : AccessibleKapuhaMusic("Accessible Kapuha Music Menu")
        @Serializable data object StartScreen : AccessibleKapuhaMusic("Start Screen")
        @Serializable data object HomeScreen : AccessibleKapuhaMusic("Home Screen")
    }
}