package com.assignmentone;

public class MainClass {


    public static void main(String[] args) {

        SportsBike sportsBike = new SportsBike();
        System.out.println("---------Sports Bike --------------");
        sportsBike.highSpeedBike();
        System.out.println("----------------------------------------");

   /*-------------------------------------------------------------------------------------------------*/

        System.out.println("---------Mileage Vehicle -------------");
        MileageVehicle mileageVehicle = new MileageVehicle();
        mileageVehicle.withoutGearVehicle();
        mileageVehicle.withGearVehicle();
        System.out.println("----------------------------------------");
        /*-----------------------------------------------------------------------------------------------------*/

        System.out.println("---------Mileage Vehicle Overriden-------------");
        Hero hero = new Hero("Access","1,25,000","0");
        hero.withoutGearVehicle();
        System.out.println("----------------------------------------");
    /*-----------------------------------------------------------------------------------------------------*/

        System.out.println("---------Two Wheeled Vehicles -------------");
        Honda honda = new Honda();
        honda.twoWheeledVehicles("Activa");
        System.out.println("---------------");
        honda.twoWheeledVehicles("Activa","1,30,000");
        System.out.println("---------------");
        honda.twoWheeledVehicles("Activa", "1,30,000","0");
        System.out.println("----------------------------------------");

   /*-----------------------------------------------------------------------------------------------------*/
        System.out.println("---------Set and Get vehicle Details -------------");
        Yamaha yamaha = new Yamaha();
        yamaha.setVehicleDetails("FZ","1,70,000","5");
        yamaha.getVehicleDetails();
        System.out.println("----------------------------------------");



    }
}
