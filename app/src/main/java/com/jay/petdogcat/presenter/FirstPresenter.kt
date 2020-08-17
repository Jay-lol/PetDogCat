package com.jay.petdogcat.presenter

import androidx.fragment.app.Fragment

class FirstPresenter(view : FirstConstract.View) : FirstConstract.Presenter {
    private val searchView = view
    private val TAG = "FriendPresenter"

    init {
        searchView.setPresenter(this)
    }

    override fun buttonClickAction() {

    }
}