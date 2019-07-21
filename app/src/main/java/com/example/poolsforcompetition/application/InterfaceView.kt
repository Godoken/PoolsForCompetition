package com.example.poolsforcompetition.application

interface InterfaceView {
    fun showProgress()
    fun hideProgress()
    fun showError(textError: String)
    fun showToolbar(title: String)
    fun hideToolbar()
}