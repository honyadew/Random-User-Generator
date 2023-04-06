package com.honey.randomusergenerator.ui.navigation.navscreen

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.honey.randomusergenerator.ui.navigation.TopLevelDestination
import com.honey.randomusergenerator.ui.navigation.route.GeneratorRoute

const val generatorNavigationRoute = "generator_route"

fun NavController.navigateToGenerator(navOptions: NavOptions? = null){
    this.navigate(TopLevelDestination.Generator.route,navOptions)
}

fun NavGraphBuilder.generatorScreen(onSettingsClick: (String)-> Unit){
    composable(route = TopLevelDestination.Generator.route){
        GeneratorRoute(onSettingsClick = onSettingsClick)
    }
}