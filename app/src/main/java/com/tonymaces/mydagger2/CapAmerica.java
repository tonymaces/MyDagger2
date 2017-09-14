package com.tonymaces.mydagger2;

import javax.inject.Inject;

/**
 * Created by Tony Macavilca Estrada on 14/09/2017.
 */

public class CapAmerica {
    Shield mShield;

    @Inject
    public CapAmerica(Shield mShield) {
        this.mShield = mShield;
    }
    public String getWeaponName(){
        return mShield.getName();
    }
}
