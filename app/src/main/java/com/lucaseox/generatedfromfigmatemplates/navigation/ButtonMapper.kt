package com.lucaseox.generatedfromfigmatemplates.navigation

val mainAppMenuButtons = listOf(
    Router.BestBuy.MenuScreen.name to                   Router.BestBuy.Route,
    Router.AccessibleBestBuy.MenuScreen.name to         Router.AccessibleBestBuy.Route,
    Router.BCA.MenuScreen.name to                       Router.BCA.Route,
    Router.AccessibleBCA.MenuScreen.name to             Router.AccessibleBCA.Route,
    Router.AnimalWiki.MenuScreen.name to                Router.AnimalWiki.Route,
    Router.AccessibleAnimalWiki.MenuScreen.name to      Router.AccessibleAnimalWiki.Route,
    Router.RSPCA.MenuScreen.name to                     Router.RSPCA.Route,
    Router.AccessibleRSPCA.MenuScreen.name to           Router.AccessibleRSPCA.Route,
    Router.ToDo.MenuScreen.name to                      Router.ToDo.Route,
    Router.AccessibleToDo.MenuScreen.name to            Router.AccessibleToDo.Route,
    Router.MusicPrototype.MenuScreen.name to            Router.MusicPrototype.Route,
    Router.AccessibleMusicPrototype.MenuScreen.name to  Router.AccessibleMusicPrototype.Route,
    Router.FoodOrdering.MenuScreen.name to              Router.FoodOrdering.Route,
    Router.AccessibleFoodOrdering.MenuScreen.name to    Router.AccessibleFoodOrdering.Route,
    Router.KapuhaMusic.MenuScreen.name to               Router.KapuhaMusic.Route,
    Router.AccessibleKapuhaMusic.MenuScreen.name to     Router.AccessibleKapuhaMusic.Route,
)

val bestBuyMenuButtons = listOf(
    Router.BestBuy.HomeScreen.name to       Router.BestBuy.HomeScreen,
    Router.BestBuy.ProductScreen.name to    Router.BestBuy.ProductScreen,
    Router.BestBuy.CartScreen.name to       Router.BestBuy.CartScreen,
    Router.BestBuy.CheckoutScreen.name to   Router.BestBuy.CheckoutScreen
)

val accessibleBestBuyMenuButtons = listOf(
    Router.AccessibleBestBuy.HomeScreen.name to     Router.AccessibleBestBuy.HomeScreen,
    Router.AccessibleBestBuy.ProductScreen.name to  Router.AccessibleBestBuy.ProductScreen,
    Router.AccessibleBestBuy.CartScreen.name to     Router.AccessibleBestBuy.CartScreen,
    Router.AccessibleBestBuy.CheckoutScreen.name to Router.AccessibleBestBuy.CheckoutScreen
)