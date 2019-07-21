package com.example.poolsforcompetition.features.welcome.presentation.login

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {

    var loginFragmentEnter: MutableLiveData<String> = MutableLiveData()
    var loginFragmentRegistration: MutableLiveData<String> = MutableLiveData()

    fun onLoginFragmentEnterClick(login: String, password: String, title: String) {
        loginFragmentEnter.value = title
    }

    fun onLoginFragmentRegistrationClick(title: String) {
        loginFragmentRegistration.value = title
    }

}