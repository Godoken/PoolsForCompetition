package com.example.poolsforcompetition.features.welcome

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModel : ViewModel() {

    var liveClickEnter: MutableLiveData<Boolean> = MutableLiveData()
    var liveClickRegistration: MutableLiveData<Boolean> = MutableLiveData()

    fun onEnterClick(login: String, password: String) {
        liveClickEnter.value = true
    }

    fun onRegistrationClick() {
        liveClickRegistration.value = true
    }
}