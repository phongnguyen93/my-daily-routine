package vn.phongnguyen93.mydailyroutine.ui

import android.content.Context
import android.util.Log
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class MainActivityViewModel @Inject constructor(context : Context) : ViewModel() {

    fun onLoaded () {
        Log.d("ViewModel","LOADED")
    }
}