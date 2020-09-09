package com.sagar.oop;

public class Car extends Vehicle{
    private boolean powerSteering = false;
    private boolean ledScreen = true;

    public Car(String name, String color, String model, String company, String engine, boolean powerSteering, boolean ledScreen){
        super(name, color, model, company, engine);
        this.powerSteering = powerSteering;
        this.ledScreen = ledScreen;
    }

    public String getName() {
        return " your car name: " + super.getName();
    }

    public boolean getPowerSteering() {
        return powerSteering;
    }

    public void setPowerSteering(boolean powerSteering) {
        this.powerSteering = powerSteering;
    }

    public boolean getLedScreen() {
        return ledScreen;
    }

    public void setLedScreen(boolean ledScreen) {
        this.ledScreen = ledScreen;
    }
}
