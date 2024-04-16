package com.assignmentone;

public class Hero  extends  MileageVehicle{


    public String heroVehicleName ;
    public String heroPrice;
    public String heroGear;

    public  Hero(String vehicleName,String price,String gear)
    {
        this.heroVehicleName =vehicleName;
        this.heroPrice=price;
        this.heroGear=gear;
    }


    @Override
    public void withGearVehicle()
    {
        super.withGearVehicle();
        System.out.println("Vehicle Name " + ":"+ heroVehicleName);
        System.out.println("Price " + ":"+ heroPrice);
        System.out.println("Gears " + ":"+ heroGear);
    }


    @Override
    public void withoutGearVehicle()
    {
        System.out.println("Vehicle Name " + ":"+ heroVehicleName);
        System.out.println("Price " + ":"+ heroPrice);
        System.out.println("Gears " + ":"+ heroGear);
    }

}
