package com.example.schooltest1.ui.monday

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MondayViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is Monday Fragment"
    }
    val text: LiveData<String> = _text}