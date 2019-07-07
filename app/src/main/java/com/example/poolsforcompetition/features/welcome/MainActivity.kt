package com.example.poolsforcompetition.features.welcome

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.poolsforcompetition.R
import com.example.poolsforcompetition.features.competitions.domain.model.Competition
import com.example.poolsforcompetition.features.competitions.presentation.our.OurCompetitions
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), InterfaceView, OurCompetitions.OnListFragmentInteractionListener {

    lateinit var navigator: NavController
    lateinit var viewModel: ViewModel

    lateinit var liveClickEnter: LiveData<Boolean>
    lateinit var liveClickRegistration: LiveData<Boolean>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProviders.of(this).get(ViewModel::class.java)
        navigator = Navigation.findNavController(this, R.id.fragment)

        liveClickEnter = viewModel.liveClickEnter
        liveClickEnter.observe(this, Observer {onLoginFragmentEnterClick(liveClickEnter.value!!)})

        liveClickRegistration = viewModel.liveClickRegistration
        liveClickRegistration.observe(this,  Observer { onLoginFragmentRegistrationClick(liveClickRegistration.value!!) })
    }

    override fun onLoginFragmentEnterClick(value: Boolean) {
        if (value){
            navigator.navigate(R.id.ourCompetitions)
        }
    }

    override fun onLoginFragmentRegistrationClick(value: Boolean) {
        if (value){
            navigator.navigate(R.id.registrationFragment)
        }
    }

    override fun onListFragmentInteraction(item: Competition) {
        // Информация о нашем мероприятии
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
}
