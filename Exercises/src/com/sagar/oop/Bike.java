package com.sagar.oop;

public class Bike extends Vehicle{
    private boolean digitalSpeedoMeter = false;

    public Bike (String name, String color, String model, String company, String engine, boolean digitalSpeedoMeter){
        super(name, color, model, company, engine);
        this.digitalSpeedoMeter = digitalSpeedoMeter;
    }

    public String getName() {
        return "Your bike name: " + super.getName();
    }

    public boolean getDigitalSpeedoMeter() {
        return digitalSpeedoMeter;
    }

    public void setDigitalSpeedoMeter(boolean digitalSpeedoMeter) {
        this.digitalSpeedoMeter = digitalSpeedoMeter;
    }
}
