package com.padcmyanmar.padc9plantassignment9.mvp.presenters

import com.padcmyanmar.padc9plantassignment9.mvp.views.BaseView

abstract class BasePresenter<T : BaseView> {

    protected lateinit var mView: T

    open fun initPresenter(view: T){
        this.mView=view
    }

    open fun onStart(){}
    open fun onCreate(){}
    open fun onResume(){}
    open fun onPause(){}
    open fun onStop(){}
    open fun onDestroy(){}
}