package com.jay.petdogcat.presenter

class ThirdPresenter(view : ThirdConstract.View): ThirdConstract.Presenter {
    private val searchView = view
    private val TAG = "ThirdPresenter"

    init {
        searchView.setPresenter(this)
    }

    override fun buttonClickAction() {

    }
}