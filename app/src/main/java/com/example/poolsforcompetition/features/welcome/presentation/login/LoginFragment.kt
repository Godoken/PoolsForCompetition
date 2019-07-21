package com.example.poolsforcompetition.features.welcome.presentation.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.poolsforcompetition.R
import kotlinx.android.synthetic.main.login_fragment.*
import kotlinx.android.synthetic.main.login_fragment.view.*

class LoginFragment : Fragment() {

    private lateinit var viewModel: LoginViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view: View =  inflater.inflate(R.layout.login_fragment, container, false)

        viewModel = ViewModelProviders.of(activity!!).get(LoginViewModel::class.java)
        view.enter_button.setOnClickListener {
            viewModel.onLoginFragmentEnterClick(login_text.text.toString(), password_text.text.toString(), "Ваши мероприятия")
        }
        view.registration_button.setOnClickListener {
            viewModel.onLoginFragmentRegistrationClick("Регистрация")
        }
        return view
    }
}
