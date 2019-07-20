package com.example.poolsforcompetition.features.welcome.presentation.registration

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RegistrationViewModel : ViewModel() {

    var registrationFragmentEnter: MutableLiveData<Boolean> = MutableLiveData()

    fun onRegistrationFragmentEnterClick() {
        registrationFragmentEnter.value = true
    }
}