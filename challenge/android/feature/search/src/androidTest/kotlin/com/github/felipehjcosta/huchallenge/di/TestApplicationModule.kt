package com.github.felipehjcosta.huchallenge.di

import android.content.Context
import android.support.test.InstrumentationRegistry
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class TestApplicationModule {

    @Singleton
    @Provides
    fun providesApplicationContext(): Context = InstrumentationRegistry.getTargetContext()
}