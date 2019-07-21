package com.example.poolsforcompetition.application

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.poolsforcompetition.R
import com.example.poolsforcompetition.features.competitions.domain.model.Competition
import com.example.poolsforcompetition.features.competitions.presentation.all.AllCompetitions
import com.example.poolsforcompetition.features.competitions.presentation.our.OurCompetitions
import com.example.poolsforcompetition.features.welcome.presentation.login.LoginViewModel
import com.example.poolsforcompetition.features.welcome.presentation.registration.RegistrationViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), InterfaceView, OurCompetitions.OurCompetitionOnClick, AllCompetitions.AllCompetitionOnClick {

    lateinit var navigator: NavController
    lateinit var viewModel: ViewModel

    lateinit var loginViewModel: LoginViewModel
    lateinit var registrationViewModel: RegistrationViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)

        viewModel = ViewModelProviders.of(this).get(ViewModel::class.java)
        loginViewModel = ViewModelProviders.of(this).get(LoginViewModel::class.java)
        registrationViewModel = ViewModelProviders.of(this).get(RegistrationViewModel::class.java)

        navigator = Navigation.findNavController(this, R.id.fragment)

        loginViewModel.loginFragmentEnter.observe(this, Observer {
            showToolbar(it)
            viewModel.navigateToOurCompetition(navigator)
        })

        loginViewModel.loginFragmentRegistration.observe(this, Observer {
            viewModel.navigateToRegistrationFragment(navigator)
        })

        registrationViewModel.registrationFragmentEnter.observe(this,  Observer {
            showToolbar(it)
            viewModel.navigateToAllCompetition(navigator)
        })
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.app_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        showToolbar(item.title.toString())
        viewModel.onOptionsItemSelected(item.itemId, navigator)
        return super.onOptionsItemSelected(item)
    }

    override fun ourCompetitionOnClick(item: Competition) {
        // Информация о нашем мероприятии
    }

    override fun allCompetitionOnClick(item: Competition?) {
        // Информация об общем мероприятии
    }

    override fun showProgress() {
        progressBar.visibility = View.VISIBLE
    }

    override fun hideProgress() {
        progressBar.visibility = View.GONE
    }

    override fun showError(textError: String) {
        val toast: Toast = Toast.makeText(this, textError, Toast.LENGTH_LONG)
        toast.show()
    }

    override fun showToolbar(title: String) {
        toolbar.title = title
        toolbar.visibility = View.VISIBLE
    }

    override fun hideToolbar() {
        toolbar.visibility = View.GONE
    }
}
