package com.example.schooltest1.ui.tuesday

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.schooltest1.R

class TuesdayFragment : Fragment() {

    companion object {
        fun newInstance() = TuesdayFragment()
    }

    private lateinit var viewModel: TuesdayViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_tuesday, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(TuesdayViewModel::class.java)
        // TODO: Use the ViewModel
    }

}