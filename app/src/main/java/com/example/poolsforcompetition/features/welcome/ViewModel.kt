package com.example.poolsforcompetition.features.welcome

import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.example.poolsforcompetition.R

class ViewModel : ViewModel() {

    fun navigateToOurCompetition(navigator: NavController, value: Boolean) {
        if (value) {
            navigator.navigate(R.id.ourCompetitions)
        }
    }

    fun navigateToRegistrationFragment(navigator: NavController, value: Boolean) {
        if (value) {
            navigator.navigate(R.id.registrationFragment)
        }
    }

    fun navigateToAllCompetition(navigator: NavController, value: Boolean) {
        if (value) {
            navigator.navigate(R.id.allCompetitions)
        }
    }
}