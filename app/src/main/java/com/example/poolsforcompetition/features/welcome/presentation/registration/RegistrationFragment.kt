package com.example.poolsforcompetition.features.welcome.presentation.registration

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.poolsforcompetition.R
import com.example.poolsforcompetition.features.welcome.ViewModel

class RegistrationFragment : Fragment() {

    private lateinit var viewModel: ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProviders.of(activity!!).get(ViewModel::class.java)
        return inflater.inflate(R.layout.registration_fragment, container, false)
    }
}
