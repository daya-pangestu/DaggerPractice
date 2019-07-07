package com.daya.daggerpractice;


import com.daya.daggerpractice.di.DaggerAppcomponent;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;

public class BaseApplication extends DaggerApplication {

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppcomponent.builder().applicaion(this).build();
    }

}
