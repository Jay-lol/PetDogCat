package com.jay.petdogcat.presenter

class SecondPresenter(view : SecondConstract.View) : SecondConstract.Presenter {
    private val searchView = view
    private val TAG = "SecondPresenter"

    init {
        searchView.setPresenter(this)
    }

    override fun buttonClickAction() {

    }
}