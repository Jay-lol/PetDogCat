package com.jay.petdogcat.presenter

import com.jay.petdogcat.base.BasePresenter
import com.jay.petdogcat.base.BaseView

interface MainConstract {

    interface View : BaseView<Presenter> {
        fun showLoading()
    }

    interface Presenter : BasePresenter<View> {
        fun welcome()
    }


}