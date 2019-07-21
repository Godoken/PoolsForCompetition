package com.example.poolsforcompetition.features.welcome.presentation.registration

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.poolsforcompetition.R
import kotlinx.android.synthetic.main.registration_fragment.view.*

class RegistrationFragment : Fragment() {

    private lateinit var viewModel: RegistrationViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view: View = inflater.inflate(R.layout.registration_fragment, container, false)

        viewModel = ViewModelProviders.of(activity!!).get(RegistrationViewModel::class.java)
        view.button_registration_ok.setOnClickListener {
            viewModel.onRegistrationFragmentEnterClick("Все мероприятия")
        }
        return view
    }
}
