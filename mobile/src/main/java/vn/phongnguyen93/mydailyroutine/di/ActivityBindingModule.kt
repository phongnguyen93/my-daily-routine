package vn.phongnguyen93.mydailyroutine.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import vn.phongnguyen93.mydailyroutine.MainActivity
import vn.phongnguyen93.mydailyroutine.di.scope.ActivityScoped
import vn.phongnguyen93.mydailyroutine.ui.MainActivityModule

@Module
abstract class ActivityBindingModule {

    @ActivityScoped
    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    internal abstract fun mainActivity() : MainActivity
}