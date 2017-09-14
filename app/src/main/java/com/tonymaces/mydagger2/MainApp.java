package com.tonymaces.mydagger2;

import android.app.Application;

/**
 * Created by Tony Macavilca Estrada on 14/09/2017.
 */

public class MainApp extends Application {

    WeaponComponent mWeaponComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mWeaponComponent = DaggerWeaponComponent.builder()
                .weaponModule(new WeaponModule())
                .build();
    }

    public WeaponComponent getWeaponComponent(){
        return mWeaponComponent;
    }
}
