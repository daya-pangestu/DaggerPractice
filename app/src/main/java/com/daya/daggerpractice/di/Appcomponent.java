package com.daya.daggerpractice.di;

import android.app.Application;
import android.app.ApplicationErrorReport;

import com.daya.daggerpractice.BaseApplication;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Component(modules = {AndroidSupportInjectionModule.class})
public interface Appcomponent extends AndroidInjector<BaseApplication> {

    @Component.Builder
    interface Builder{
        @BindsInstance
        Builder applicaion(Application application);

        Appcomponent build();
    }
}
