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
    }

    @Serializable
    sealed class AccessibleBCA(val name: String) : Router() {
        @Serializable data object Route : AccessibleBCA("Accessible BCA Route")
        @Serializable data object MenuScreen : AccessibleBCA("Accessible BCA Menu")
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