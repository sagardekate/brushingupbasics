package com.sagar.oop;

public class main {
    public static void main(String[] args) {
        /*Vehicle vehicle1 = new Vehicle();
        System.out.println(vehicle1.getColor());
        System.out.println(vehicle1.count);
        Vehicle vehicle2 = new Vehicle("Jetta" , "Black", "2019", "VolksWagon", "900");
        System.out.println(vehicle2.getColor());
        System.out.println(vehicle2.count);
        vehicle2.setColor("Red");
        System.out.println(vehicle2.getColor());
        Vehicle vehicle3 = new Vehicle("Enzo");
        System.out.println(vehicle3.getName());
        vehicle3.setName(vehicle2.getName());
        System.out.println(vehicle3.getName());
        System.out.println(vehicle2.getSpeed());
        System.out.println(Vehicle.getVehicle());*/
        Car car = new Car("Jetta" , "Black", "2019", "VolksWagon", "900", true, false);
        System.out.println(car.getLedScreen());
        System.out.println(car.getName());
        Vehicle vehicle1 = new Bike("R1", "Blue", "2020", "Yahama", "6000", true);
        System.out.println(vehicle1.getName());
        Shape shape = new Circle();
        shape.draw();
    }
}
