package com.jay.petdogcat.base

interface BasePresenter<T> {
    fun takeView(view : T){}
}