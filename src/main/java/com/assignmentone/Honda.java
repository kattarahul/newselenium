package com.assignmentone;

public class Honda {

    public  String hondaModel;
    public String hondaCost;

    public String hondaGearBox;

    public void twoWheeledVehicles(String model)
    {
        this.hondaModel=model;
        System.out.println("Model " + ":" + model);

    }
    public void twoWheeledVehicles( String model,String cost)
    {

        this.hondaModel = model;
        this.hondaCost = cost;
        System.out.println("Model " + ":" + model);
        System.out.println("Cost " + ":" + cost);
    }
    public void twoWheeledVehicles( String model ,String cost, String gearBox )
    {

        this.hondaModel = model;
        this.hondaCost= cost;
        this.hondaGearBox = gearBox;
        System.out.println("Model " + ":" + model);
        System.out.println("Cost " + ":" + cost);
        System.out.println("GearBox " + ":" + gearBox);
    }
}
