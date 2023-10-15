package com.example.schooltest1.ui.friday

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.schooltest1.R

class FridayFragment : Fragment() {

    companion object {
        fun newInstance() = FridayFragment()
    }

    private lateinit var viewModel: FridayViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_friday, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FridayViewModel::class.java)
        // TODO: Use the ViewModel
    }

}