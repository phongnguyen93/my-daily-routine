package vn.phongnguyen93.mydailyroutine

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import vn.phongnguyen93.mydailyroutine.di.DaggerAppComponent

class MainApplication : DaggerApplication() {


    override fun onCreate() {
        super.onCreate()
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().create(this)
    }



}