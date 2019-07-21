package com.example.poolsforcompetition.features.welcome.presentation.registration

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RegistrationViewModel : ViewModel() {

    var registrationFragmentEnter: MutableLiveData<String> = MutableLiveData()

    fun onRegistrationFragmentEnterClick(title: String) {
        registrationFragmentEnter.value = title
    }
}