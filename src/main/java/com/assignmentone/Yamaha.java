package com.assignmentone;

public class Yamaha {


    private String yamahaModel;

    private String yamahaPrice;

    private  String yamahaGear;


    public void setVehicleDetails(String yamahaModel ,String yamahaPrice, String yamahaGear)
    {
        this.yamahaModel = yamahaModel;
        this.yamahaPrice = yamahaPrice;
        this.yamahaGear = yamahaGear;

    }



    public String getYamahaModel()
    {
        return yamahaModel;

    }

    public String getYamahaPrice()
    {
        return yamahaPrice;
    }


    public String getYamahaGear()
    {
        return yamahaGear;
    }



    public void getVehicleDetails()
    {

        System.out.println("Vehicle Model " + ": " + getYamahaModel());
        System.out.println("Price " + ": " + getYamahaPrice());
        System.out.println("Gears "+ ": " +  getYamahaGear());

    }

}
