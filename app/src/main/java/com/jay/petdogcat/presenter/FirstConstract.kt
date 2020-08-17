package com.jay.petdogcat.presenter

import com.jay.petdogcat.base.BasePresenter
import com.jay.petdogcat.base.BaseView

interface FirstConstract {
    interface View : BaseView<Presenter> {
        fun showList(list : List<Any>)
    }

    interface Presenter : BasePresenter<View> {
        fun buttonClickAction()
    }
}