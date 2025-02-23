package com.nims.cashbook.feature.main

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MainViewModel : ViewModel() {
    private val _showContent: MutableStateFlow<Boolean> = MutableStateFlow(false)
    val showContent: StateFlow<Boolean> = _showContent.asStateFlow()

    fun updateShowContent(isShow: Boolean) {
        _showContent.update { isShow }
    }
}