package com.honey.randomusergenerator.ui.navigation.route

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.navigation.NavController
import com.honey.randomusergenerator.ui.screens.favorite.FavoriteScreen
import com.honey.randomusergenerator.ui.screens.favorite.FavoriteViewModel
import org.koin.androidx.compose.getViewModel

@Composable
fun FavoriteRoute(onSettingsClick: (String)-> Unit){
    val viewModel = getViewModel<FavoriteViewModel>()

    FavoriteScreen(
        state = viewModel.getViewState().collectAsState(),
        effect = viewModel.getEffect().collectAsState(initial = null),
        onEventSend = {event -> viewModel.obtainEvent(event) },
        onSettingsClick = onSettingsClick
    )
}