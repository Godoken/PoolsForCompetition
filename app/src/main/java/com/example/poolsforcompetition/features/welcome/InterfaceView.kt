package com.example.poolsforcompetition.features.welcome

interface InterfaceView {
    fun showProgress()
    fun hideProgress()
    fun showError(textError: String)
}