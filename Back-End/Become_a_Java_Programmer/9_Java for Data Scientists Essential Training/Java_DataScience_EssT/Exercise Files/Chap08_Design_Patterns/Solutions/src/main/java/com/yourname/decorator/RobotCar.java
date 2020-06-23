package com.yourname.decorator;

/**
 * Created by Charles Kelly.
 */
public class RobotCar implements CarInf
{

    private String driverType = "robot plus First Guidance API";
    private String favoriteSaying = "where shall we go next?";

    private OrdinaryCar ordinaryCar = new OrdinaryCar();
    public RobotCar()
    {

    }
    /**
     *  We can "decorate" an ordinary car with robotic equipment
     * @return
     */
    public String getDriverType()
    {
        return driverType;
    }

    public String getFavoriteSaying()
    {
        return favoriteSaying;
    }

    /**
     * RobotCar "has a" instance of OrdinaryCar and access to its methods.
     * @return
     */
    public String getOrdinaryDriverType()
    {
        return ordinaryCar.getDriverType();
    }
}
