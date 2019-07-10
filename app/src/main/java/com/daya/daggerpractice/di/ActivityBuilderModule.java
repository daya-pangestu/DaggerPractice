package com.daya.daggerpractice.di;

import com.daya.daggerpractice.AuthActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilderModule {

    @ContributesAndroidInjector
    abstract AuthActivity contributeAuthActivity();


}
