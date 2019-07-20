package com.example.poolsforcompetition.features.welcome.presentation.login

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {

    var loginFragmentEnter: MutableLiveData<Boolean> = MutableLiveData()
    var loginFragmentRegistration: MutableLiveData<Boolean> = MutableLiveData()

    fun onLoginFragmentEnterClick(login: String, password: String) {
        loginFragmentEnter.value = true
    }

    fun onLoginFragmentRegistrationClick() {
        loginFragmentRegistration.value = true
    }

}