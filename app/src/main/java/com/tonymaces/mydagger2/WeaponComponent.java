package com.tonymaces.mydagger2;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Tony Macavilca Estrada on 14/09/2017.
 */

@Singleton
@Component(modules = WeaponModule.class)
public interface WeaponComponent {
    void inject(MainActivity activity);
}
