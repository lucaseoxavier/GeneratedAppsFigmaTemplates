package com.lucaseox.generatedappsfigmatemplates.navigation

val mainAppMenuButtons = listOf(
    Router.V1.MenuScreen.name to Router.V1.Route,
    Router.V2.MenuScreen.name to Router.V2.Route,
    Router.V3.MenuScreen.name to Router.V3.Route
)

val v1AppMenuButtons = listOf(
    Router.AnimalWiki.MenuScreen.name to                Router.AnimalWiki.Route,
    Router.RefactoredAnimalWiki.MenuScreen.name to      Router.RefactoredAnimalWiki.Route,
    Router.BCA.MenuScreen.name to                       Router.BCA.Route,
    Router.RefactoredBCA.MenuScreen.name to             Router.RefactoredBCA.Route,
    Router.BestBuy.MenuScreen.name to                   Router.BestBuy.Route,
    Router.RefactoredBestBuy.MenuScreen.name to         Router.RefactoredBestBuy.Route,
    Router.FoodOrdering.MenuScreen.name to              Router.FoodOrdering.Route,
    Router.RefactoredFoodOrdering.MenuScreen.name to    Router.RefactoredFoodOrdering.Route,
    Router.KapuhaMusic.MenuScreen.name to               Router.KapuhaMusic.Route,
    Router.RefactoredKapuhaMusic.MenuScreen.name to     Router.RefactoredKapuhaMusic.Route,
    Router.MusicPrototype.MenuScreen.name to            Router.MusicPrototype.Route,
    Router.RefactoredMusicPrototype.MenuScreen.name to  Router.RefactoredMusicPrototype.Route,
    Router.RSPCA.MenuScreen.name to                     Router.RSPCA.Route,
    Router.RefactoredRSPCA.MenuScreen.name to           Router.RefactoredRSPCA.Route,
    Router.ToDo.MenuScreen.name to                      Router.ToDo.Route,
    Router.RefactoredToDo.MenuScreen.name to            Router.RefactoredToDo.Route
)

val v2AppMenuButtons = emptyList<Pair<String, Router>>()

val v3AppMenuButtons = emptyList<Pair<String, Router>>()

val bestBuyMenuButtons = listOf(
    Router.BestBuy.HomeScreen.name to       Router.BestBuy.HomeScreen,
    Router.BestBuy.ProductScreen.name to    Router.BestBuy.ProductScreen,
    Router.BestBuy.CartScreen.name to       Router.BestBuy.CartScreen,
    Router.BestBuy.CheckoutScreen.name to   Router.BestBuy.CheckoutScreen
)

val refactoredBestBuyMenuButtons = listOf(
    Router.RefactoredBestBuy.HomeScreen.name to     Router.RefactoredBestBuy.HomeScreen,
    Router.RefactoredBestBuy.ProductScreen.name to  Router.RefactoredBestBuy.ProductScreen,
    Router.RefactoredBestBuy.CartScreen.name to     Router.RefactoredBestBuy.CartScreen,
    Router.RefactoredBestBuy.CheckoutScreen.name to Router.RefactoredBestBuy.CheckoutScreen
)

val bcaMenuButtons = listOf(
    Router.BCA.LoginScreen.name to              Router.BCA.LoginScreen,
    Router.BCA.HomeScreen.name to               Router.BCA.HomeScreen,
    Router.BCA.ScanQrScreen.name to             Router.BCA.ScanQrScreen,
    Router.BCA.ShowQrScreen.name to             Router.BCA.ShowQrScreen,
    Router.BCA.TransactionScreen.name to        Router.BCA.TransactionScreen,
    Router.BCA.FullTransactionScreen.name to    Router.BCA.FullTransactionScreen,
    Router.BCA.FlazzScreen.name to              Router.BCA.FlazzScreen,
    Router.BCA.FlazzBalanceScreen.name to       Router.BCA.FlazzBalanceScreen,
    Router.BCA.FlazzTopUpScreen.name to         Router.BCA.FlazzTopUpScreen,
    Router.BCA.FlazzCompletedScreen.name to     Router.BCA.FlazzCompletedScreen,
    Router.BCA.InfoScreen.name to               Router.BCA.InfoScreen,
    Router.BCA.NotificationScreen.name to       Router.BCA.NotificationScreen,
    Router.BCA.MessageScreen.name to            Router.BCA.MessageScreen,
    Router.BCA.ReceiverScreen.name to           Router.BCA.ReceiverScreen,
    Router.BCA.AmountScreen.name to             Router.BCA.AmountScreen,
    Router.BCA.TransferCompletedScreen.name to  Router.BCA.TransferCompletedScreen,
    Router.BCA.NewAccountScreen.name to         Router.BCA.NewAccountScreen,
    Router.BCA.ProfileScreen.name to            Router.BCA.ProfileScreen,
    Router.BCA.ControlScreen.name to            Router.BCA.ControlScreen,
    Router.BCA.SetLimitScreen.name to           Router.BCA.SetLimitScreen,
    Router.BCA.BlockScreen.name to              Router.BCA.BlockScreen
)

val refactoredBcaMenuButtons = listOf(
    Router.RefactoredBCA.LoginScreen.name to              Router.RefactoredBCA.LoginScreen,
    Router.RefactoredBCA.HomeScreen.name to               Router.RefactoredBCA.HomeScreen,
    Router.RefactoredBCA.ScanQrScreen.name to             Router.RefactoredBCA.ScanQrScreen,
    Router.RefactoredBCA.ShowQrScreen.name to             Router.RefactoredBCA.ShowQrScreen,
    Router.RefactoredBCA.TransactionScreen.name to        Router.RefactoredBCA.TransactionScreen,
    Router.RefactoredBCA.FullTransactionScreen.name to    Router.RefactoredBCA.FullTransactionScreen,
    Router.RefactoredBCA.FlazzScreen.name to              Router.RefactoredBCA.FlazzScreen,
    Router.RefactoredBCA.FlazzBalanceScreen.name to       Router.RefactoredBCA.FlazzBalanceScreen,
    Router.RefactoredBCA.FlazzTopUpScreen.name to         Router.RefactoredBCA.FlazzTopUpScreen,
    Router.RefactoredBCA.FlazzCompletedScreen.name to     Router.RefactoredBCA.FlazzCompletedScreen,
    Router.RefactoredBCA.InfoScreen.name to               Router.RefactoredBCA.InfoScreen,
    Router.RefactoredBCA.NotificationScreen.name to       Router.RefactoredBCA.NotificationScreen,
    Router.RefactoredBCA.MessageScreen.name to            Router.RefactoredBCA.MessageScreen,
    Router.RefactoredBCA.ReceiverScreen.name to           Router.RefactoredBCA.ReceiverScreen,
    Router.RefactoredBCA.AmountScreen.name to             Router.RefactoredBCA.AmountScreen,
    Router.RefactoredBCA.TransferCompletedScreen.name to  Router.RefactoredBCA.TransferCompletedScreen,
    Router.RefactoredBCA.NewAccountScreen.name to         Router.RefactoredBCA.NewAccountScreen,
    Router.RefactoredBCA.ProfileScreen.name to            Router.RefactoredBCA.ProfileScreen,
    Router.RefactoredBCA.ControlScreen.name to            Router.RefactoredBCA.ControlScreen,
    Router.RefactoredBCA.SetLimitScreen.name to           Router.RefactoredBCA.SetLimitScreen,
    Router.RefactoredBCA.BlockScreen.name to              Router.RefactoredBCA.BlockScreen
)

val animalWikiMenuButtons = listOf(
    Router.AnimalWiki.SplashScreen.name to      Router.AnimalWiki.SplashScreen,
    Router.AnimalWiki.LoginScreen.name to       Router.AnimalWiki.LoginScreen,
    Router.AnimalWiki.DashboardScreen.name to   Router.AnimalWiki.DashboardScreen,
    Router.AnimalWiki.AnimalScreen.name to      Router.AnimalWiki.AnimalScreen
)

val refactoredAnimalWikiMenuButtons = listOf(
    Router.RefactoredAnimalWiki.SplashScreen.name to      Router.RefactoredAnimalWiki.SplashScreen,
    Router.RefactoredAnimalWiki.LoginScreen.name to       Router.RefactoredAnimalWiki.LoginScreen,
    Router.RefactoredAnimalWiki.DashboardScreen.name to   Router.RefactoredAnimalWiki.DashboardScreen,
    Router.RefactoredAnimalWiki.AnimalScreen.name to      Router.RefactoredAnimalWiki.AnimalScreen
)

val RSPCAMenuButtons = listOf(
    Router.RSPCA.StartScreen.name to            Router.RSPCA.StartScreen,
    Router.RSPCA.LoginScreen.name to            Router.RSPCA.LoginScreen,
    Router.RSPCA.HomeScreen.name to             Router.RSPCA.HomeScreen,
    Router.RSPCA.RegisterPetScreen.name to      Router.RSPCA.RegisterPetScreen,
    Router.RSPCA.DogScreen.name to              Router.RSPCA.DogScreen,
    Router.RSPCA.RegisterDogScreen.name to      Router.RSPCA.RegisterDogScreen,
    Router.RSPCA.AdoptionScreen.name to         Router.RSPCA.AdoptionScreen,
    Router.RSPCA.AdoptionFormScreen.name to     Router.RSPCA.AdoptionFormScreen,
    Router.RSPCA.ServicesScreen.name to         Router.RSPCA.ServicesScreen,
    Router.RSPCA.CurrentPetsScreen.name to      Router.RSPCA.CurrentPetsScreen,
    Router.RSPCA.VetScreen.name to              Router.RSPCA.VetScreen,
    Router.RSPCA.GroomingScreen.name to         Router.RSPCA.GroomingScreen,
    Router.RSPCA.MapScreen.name to              Router.RSPCA.MapScreen,
    Router.RSPCA.PetInfoScreen.name to          Router.RSPCA.PetInfoScreen,
    Router.RSPCA.DietScreen.name to             Router.RSPCA.DietScreen,
    Router.RSPCA.BMIScreen.name to              Router.RSPCA.BMIScreen,
    Router.RSPCA.ExerciseScreen.name to         Router.RSPCA.ExerciseScreen,
    Router.RSPCA.WalkScreen.name to             Router.RSPCA.WalkScreen,
    Router.RSPCA.WalkRecordScreen.name to       Router.RSPCA.WalkRecordScreen
)

val refactoredRSPCAMenuButtons = listOf(
    Router.RefactoredRSPCA.StartScreen.name to            Router.RefactoredRSPCA.StartScreen,
    Router.RefactoredRSPCA.LoginScreen.name to            Router.RefactoredRSPCA.LoginScreen,
    Router.RefactoredRSPCA.HomeScreen.name to             Router.RefactoredRSPCA.HomeScreen,
    Router.RefactoredRSPCA.RegisterPetScreen.name to      Router.RefactoredRSPCA.RegisterPetScreen,
    Router.RefactoredRSPCA.DogScreen.name to              Router.RefactoredRSPCA.DogScreen,
    Router.RefactoredRSPCA.RegisterDogScreen.name to      Router.RefactoredRSPCA.RegisterDogScreen,
    Router.RefactoredRSPCA.AdoptionScreen.name to         Router.RefactoredRSPCA.AdoptionScreen,
    Router.RefactoredRSPCA.AdoptionFormScreen.name to     Router.RefactoredRSPCA.AdoptionFormScreen,
    Router.RefactoredRSPCA.ServicesScreen.name to         Router.RefactoredRSPCA.ServicesScreen,
    Router.RefactoredRSPCA.CurrentPetsScreen.name to      Router.RefactoredRSPCA.CurrentPetsScreen,
    Router.RefactoredRSPCA.VetScreen.name to              Router.RefactoredRSPCA.VetScreen,
    Router.RefactoredRSPCA.GroomingScreen.name to         Router.RefactoredRSPCA.GroomingScreen,
    Router.RefactoredRSPCA.MapScreen.name to              Router.RefactoredRSPCA.MapScreen,
    Router.RefactoredRSPCA.PetInfoScreen.name to          Router.RefactoredRSPCA.PetInfoScreen,
    Router.RefactoredRSPCA.DietScreen.name to             Router.RefactoredRSPCA.DietScreen,
    Router.RefactoredRSPCA.BMIScreen.name to              Router.RefactoredRSPCA.BMIScreen,
    Router.RefactoredRSPCA.ExerciseScreen.name to         Router.RefactoredRSPCA.ExerciseScreen,
    Router.RefactoredRSPCA.WalkScreen.name to             Router.RefactoredRSPCA.WalkScreen,
    Router.RefactoredRSPCA.WalkRecordScreen.name to       Router.RefactoredRSPCA.WalkRecordScreen
)

val toDoMenuButtons = listOf(
    Router.ToDo.StartScreen.name to         Router.ToDo.StartScreen,
    Router.ToDo.RegisterScreen.name to      Router.ToDo.RegisterScreen,
    Router.ToDo.LoginScreen.name to         Router.ToDo.LoginScreen,
    Router.ToDo.ToDoScreen.name to          Router.ToDo.ToDoScreen
)

val refactoredToDoMenuButtons = listOf(
    Router.RefactoredToDo.StartScreen.name to         Router.RefactoredToDo.StartScreen,
    Router.RefactoredToDo.RegisterScreen.name to      Router.RefactoredToDo.RegisterScreen,
    Router.RefactoredToDo.LoginScreen.name to         Router.RefactoredToDo.LoginScreen,
    Router.RefactoredToDo.ToDoScreen.name to          Router.RefactoredToDo.ToDoScreen
)

val musicPrototypeMenuButtons = listOf(
    Router.MusicPrototype.HomeScreen.name to        Router.MusicPrototype.HomeScreen,
    Router.MusicPrototype.PlayerScreen.name to      Router.MusicPrototype.PlayerScreen
)

val refactoredMusicPrototypeMenuButtons = listOf(
    Router.RefactoredMusicPrototype.HomeScreen.name to        Router.RefactoredMusicPrototype.HomeScreen,
    Router.RefactoredMusicPrototype.PlayerScreen.name to      Router.RefactoredMusicPrototype.PlayerScreen
)

val foodOrderingMenuButtons = listOf(
    Router.FoodOrdering.HomeScreen.name to  Router.FoodOrdering.HomeScreen,
    Router.FoodOrdering.OrderScreen.name to Router.FoodOrdering.OrderScreen,
    Router.FoodOrdering.CartScreen.name to  Router.FoodOrdering.CartScreen,
    Router.FoodOrdering.RateScreen.name to  Router.FoodOrdering.RateScreen
)

val refactoredFoodOrderingMenuButtons = listOf(
    Router.RefactoredFoodOrdering.HomeScreen.name to  Router.RefactoredFoodOrdering.HomeScreen,
    Router.RefactoredFoodOrdering.OrderScreen.name to Router.RefactoredFoodOrdering.OrderScreen,
    Router.RefactoredFoodOrdering.CartScreen.name to  Router.RefactoredFoodOrdering.CartScreen,
    Router.RefactoredFoodOrdering.RateScreen.name to  Router.RefactoredFoodOrdering.RateScreen
)

val kapuhaMusicMenuButtons = listOf(
    Router.KapuhaMusic.StartScreen.name to  Router.KapuhaMusic.StartScreen,
    Router.KapuhaMusic.HomeScreen.name to   Router.KapuhaMusic.HomeScreen
)

val refactoredKapuhaMusicMenuButtons = listOf(
    Router.RefactoredKapuhaMusic.StartScreen.name to  Router.RefactoredKapuhaMusic.StartScreen,
    Router.RefactoredKapuhaMusic.HomeScreen.name to   Router.RefactoredKapuhaMusic.HomeScreen
)