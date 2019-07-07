package com.example.poolsforcompetition.features.welcome

interface InterfaceView {
    fun onLoginFragmentEnterClick(value: Boolean)
    fun onLoginFragmentRegistrationClick(value: Boolean)
    fun showProgress()
    fun hideProgress()
    fun showError(textError: String)
}