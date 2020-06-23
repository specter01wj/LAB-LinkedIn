package com.yourname.decorator;

/**
 * Created by Charles Kelly.
 */
public final class OrdinaryCar implements CarInf
{
    private String driverType = "human";
    private String favoriteSaying = "if I ain't broke, don't fix me";
    public OrdinaryCar()
    {

    }
    public String getDriverType()
    {
        return driverType;
    }

    public String getFavoriteSaying()
    {
        return favoriteSaying;
    }
}
