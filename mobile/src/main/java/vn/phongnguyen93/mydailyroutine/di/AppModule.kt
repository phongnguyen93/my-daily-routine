package vn.phongnguyen93.mydailyroutine.di

import android.content.Context
import dagger.Module
import dagger.Provides
import vn.phongnguyen93.mydailyroutine.MainApplication

@Module
class AppModule{

    @Provides
    fun provideContext(application: MainApplication) : Context {
        return application.applicationContext
    }
}