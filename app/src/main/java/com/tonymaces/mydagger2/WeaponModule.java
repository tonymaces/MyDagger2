package com.tonymaces.mydagger2;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Tony Macavilca Estrada on 14/09/2017.
 */

@Module
public class WeaponModule {

    @Provides
    @Singleton
    public Shield provideShield(){
        return new Shield();
    }

    @Provides
    @Singleton
    public  CapAmerica provideHero(Shield shield){
        return  new CapAmerica(shield);
    }

}
