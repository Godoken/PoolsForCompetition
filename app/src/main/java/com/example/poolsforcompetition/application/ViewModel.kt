package com.example.poolsforcompetition.application

import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.example.poolsforcompetition.R

class ViewModel : ViewModel() {

    fun navigateToOurCompetition(navigator: NavController) {
        navigator.navigate(R.id.ourCompetitions)
    }

    fun navigateToRegistrationFragment(navigator: NavController){
        navigator.navigate(R.id.registrationFragment)
    }

    fun navigateToAllCompetition(navigator: NavController) {
        navigator.navigate(R.id.allCompetitions)
    }

    fun onOptionsItemSelected(itemId: Int, navigator: NavController){
        when (itemId) {
            R.id.action_our_competitions -> {navigateToOurCompetition(navigator)}
            R.id.action_all_competitions -> {navigateToAllCompetition(navigator)}
            R.id.action_app_settings -> {}
            R.id.action_exist -> {}
        }
    }
}