package com.jay.petdogcat.presenter

import android.util.Log

class MainPresenter : MainConstract.Presenter {
    override fun welcome() {
        Log.d("WEL", "COME")
    }
}