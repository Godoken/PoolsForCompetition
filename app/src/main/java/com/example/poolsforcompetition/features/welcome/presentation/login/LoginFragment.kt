package com.example.poolsforcompetition.features.welcome.presentation.login

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.poolsforcompetition.R
import com.example.poolsforcompetition.features.welcome.ViewModel
import kotlinx.android.synthetic.main.login_fragment.*
import kotlinx.android.synthetic.main.login_fragment.view.*

class LoginFragment : Fragment() {

    private lateinit var viewModel: ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view: View =  inflater.inflate(R.layout.login_fragment, container, false)

        viewModel = ViewModelProviders.of(activity!!).get(ViewModel::class.java)
        view.enter_button.setOnClickListener {
            viewModel.onEnterClick(login_text.text.toString(), password_text.text.toString())
        }
        view.registration_button.setOnClickListener {
            viewModel.onRegistrationClick()
        }

        return view
    }
}
