package com.lucaseox.generatedappsfigmatemplates.navigation

import kotlinx.serialization.Serializable

sealed class Router {
    @Serializable
    data object MainAppMenu: Router()

    @Serializable
    sealed class V1(val name: String) : Router() {
        @Serializable data object Route : V1("V1 Route")
        @Serializable data object MenuScreen : V1("V1 Menu")
    }

    @Serializable
    sealed class V2(val name: String) : Router() {
        @Serializable data object Route : V2("V2 Route")
        @Serializable data object MenuScreen : V2("V2 Menu")
    }

    @Serializable
    sealed class V3(val name: String) : Router() {
        @Serializable data object Route : V3("V3 Route")
        @Serializable data object MenuScreen : V3("V3 Menu")
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
    sealed class RefactoredAnimalWiki(val name: String) : Router() {
        @Serializable data object Route : RefactoredAnimalWiki("Accessible Animal Wiki Route")
        @Serializable data object MenuScreen : RefactoredAnimalWiki("Accessible Animal Wiki Menu")
        @Serializable data object SplashScreen : RefactoredAnimalWiki("Splash Screen")
        @Serializable data object LoginScreen : RefactoredAnimalWiki("Login Screen")
        @Serializable data object DashboardScreen : RefactoredAnimalWiki("Dashboard Screen")
        @Serializable data object AnimalScreen : RefactoredAnimalWiki("Animal Screen")
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
    sealed class RefactoredBCA(val name: String) : Router() {
        @Serializable data object Route : RefactoredBCA("Accessible BCA Route")
        @Serializable data object MenuScreen : RefactoredBCA("Accessible BCA Menu")
        @Serializable data object LoginScreen : RefactoredBCA("Login Screen")
        @Serializable data object HomeScreen : RefactoredBCA("Home Screen")
        @Serializable data object ScanQrScreen : RefactoredBCA("Scan Qr Screen")
        @Serializable data object ShowQrScreen : RefactoredBCA("Show Qr Screen")
        @Serializable data object TransactionScreen : RefactoredBCA("Transaction Screen")
        @Serializable data object FullTransactionScreen : RefactoredBCA("Full Transaction Screen")
        @Serializable data object FlazzScreen : RefactoredBCA("Flazz Screen")
        @Serializable data object FlazzBalanceScreen : RefactoredBCA("Flazz Balance Screen")
        @Serializable data object FlazzTopUpScreen : RefactoredBCA("Flazz Top Up Screen")
        @Serializable data object FlazzCompletedScreen : RefactoredBCA("Flazz Completed Screen")
        @Serializable data object InfoScreen : RefactoredBCA("Info Screen")
        @Serializable data object NotificationScreen : RefactoredBCA("Notification Screen")
        @Serializable data object MessageScreen : RefactoredBCA("Message Screen")
        @Serializable data object ReceiverScreen : RefactoredBCA("Receiver Screen")
        @Serializable data object AmountScreen : RefactoredBCA("Amount Screen")
        @Serializable data object TransferCompletedScreen : RefactoredBCA("Transfer Completed Screen")
        @Serializable data object NewAccountScreen : RefactoredBCA("New Account Screen")
        @Serializable data object ProfileScreen : RefactoredBCA("Profile Screen")
        @Serializable data object ControlScreen : RefactoredBCA("Control Screen")
        @Serializable data object SetLimitScreen : RefactoredBCA("Set Limit Screen")
        @Serializable data object BlockScreen : RefactoredBCA("Block Screen")
    }

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
    sealed class RefactoredBestBuy(val name: String) : Router() {
        @Serializable data object Route : RefactoredBestBuy("Accessible Best Buy Route")
        @Serializable data object MenuScreen : RefactoredBestBuy("Accessible Best Buy Menu")
        @Serializable data object HomeScreen : RefactoredBestBuy("Home Screen")
        @Serializable data object ProductScreen : RefactoredBestBuy("Product Screen")
        @Serializable data object CartScreen : RefactoredBestBuy("Cart Screen")
        @Serializable data object CheckoutScreen : RefactoredBestBuy("Checkout Screen")
    }

    @Serializable
    sealed class FoodOrdering (val name: String) : Router() {
        @Serializable data object Route : FoodOrdering("Food Ordering Route")
        @Serializable data object MenuScreen : FoodOrdering("Food Ordering Menu")
        @Serializable data object HomeScreen : FoodOrdering("Home Screen")
        @Serializable data object OrderScreen : FoodOrdering("Order Screen")
        @Serializable data object CartScreen : FoodOrdering("Cart Screen")
        @Serializable data object RateScreen : FoodOrdering("Rate Screen")
    }

    @Serializable
    sealed class RefactoredFoodOrdering(val name: String) : Router() {
        @Serializable data object Route : RefactoredFoodOrdering("Accessible Food Ordering Route")
        @Serializable data object MenuScreen : RefactoredFoodOrdering("Accessible Food Ordering Menu")
        @Serializable data object HomeScreen : RefactoredFoodOrdering("Home Screen")
        @Serializable data object OrderScreen : RefactoredFoodOrdering("Order Screen")
        @Serializable data object CartScreen : RefactoredFoodOrdering("Cart Screen")
        @Serializable data object RateScreen : RefactoredFoodOrdering("Rate Screen")
    }

    @Serializable
    sealed class KapuhaMusic (val name: String) : Router() {
        @Serializable data object Route : KapuhaMusic("Kapuha Music Route")
        @Serializable data object MenuScreen : KapuhaMusic("Kapuha Music Menu")
        @Serializable data object StartScreen : KapuhaMusic("Start Screen")
        @Serializable data object HomeScreen : KapuhaMusic("Home Screen")
    }

    @Serializable
    sealed class RefactoredKapuhaMusic(val name: String) : Router() {
        @Serializable data object Route : RefactoredKapuhaMusic("Accessible Kapuha Music Route")
        @Serializable data object MenuScreen : RefactoredKapuhaMusic("Accessible Kapuha Music Menu")
        @Serializable data object StartScreen : RefactoredKapuhaMusic("Start Screen")
        @Serializable data object HomeScreen : RefactoredKapuhaMusic("Home Screen")
    }

    @Serializable
    sealed class MusicPrototype (val name: String) : Router() {
        @Serializable data object Route : MusicPrototype("Music Prototype Route")
        @Serializable data object MenuScreen : MusicPrototype("Music Prototype Menu")
        @Serializable data object HomeScreen : MusicPrototype("Home Screen")
        @Serializable data object PlayerScreen : MusicPrototype("Player Screen")
    }

    @Serializable
    sealed class RefactoredMusicPrototype(val name: String) : Router() {
        @Serializable data object Route : RefactoredMusicPrototype("Accessible Music Prototype Route")
        @Serializable data object MenuScreen : RefactoredMusicPrototype("Accessible Music Prototype Menu")
        @Serializable data object HomeScreen : RefactoredMusicPrototype("Home Screen")
        @Serializable data object PlayerScreen : RefactoredMusicPrototype("Player Screen")
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
    sealed class RefactoredRSPCA(val name: String) : Router() {
        @Serializable data object Route : RefactoredRSPCA("Accessible RSPCA Route")
        @Serializable data object MenuScreen : RefactoredRSPCA("Accessible RSPCA Menu")
        @Serializable data object StartScreen : RefactoredRSPCA("Start Screen")
        @Serializable data object LoginScreen : RefactoredRSPCA("Login Screen")
        @Serializable data object HomeScreen : RefactoredRSPCA("Home Screen")
        @Serializable data object RegisterPetScreen : RefactoredRSPCA("Register Pet Screen")
        @Serializable data object DogScreen : RefactoredRSPCA("Dog Screen")
        @Serializable data object RegisterDogScreen : RefactoredRSPCA("Register Dog Screen")
        @Serializable data object AdoptionScreen : RefactoredRSPCA("Adoption Screen")
        @Serializable data object AdoptionFormScreen : RefactoredRSPCA("Adoption Form Screen")
        @Serializable data object ServicesScreen : RefactoredRSPCA("Services Screen")
        @Serializable data object CurrentPetsScreen : RefactoredRSPCA("Current Pets Screen")
        @Serializable data object VetScreen : RefactoredRSPCA("Vet Screen")
        @Serializable data object GroomingScreen : RefactoredRSPCA("Grooming Screen")
        @Serializable data object MapScreen : RefactoredRSPCA("Map Screen")
        @Serializable data object PetInfoScreen : RefactoredRSPCA("Pet Info Screen")
        @Serializable data object DietScreen : RefactoredRSPCA("Diet Screen")
        @Serializable data object BMIScreen : RefactoredRSPCA("BMI Screen")
        @Serializable data object ExerciseScreen : RefactoredRSPCA("Exercise Screen")
        @Serializable data object WalkScreen : RefactoredRSPCA("Walk Screen")
        @Serializable data object WalkRecordScreen : RefactoredRSPCA("Walk Record Screen")
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
    sealed class RefactoredToDo(val name: String) : Router() {
        @Serializable data object Route : RefactoredToDo("Accessible ToDo Route")
        @Serializable data object MenuScreen : RefactoredToDo("Accessible ToDo Menu")
        @Serializable data object StartScreen : RefactoredToDo("Start Screen")
        @Serializable data object RegisterScreen : RefactoredToDo("Register Screen")
        @Serializable data object LoginScreen : RefactoredToDo("Login Screen")
        @Serializable data object ToDoScreen : RefactoredToDo("ToDo Screen")
    }
}