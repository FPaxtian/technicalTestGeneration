/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import interfaces.CarInt;

/**
 *
 * @author Paxtian
 */
public class CarMod implements CarInt{
    
    // Defining variables of the Proprietary object
    private int gearboxtype;
    
    private String model;
    private String color;
    private String anio;
    private String brand;
    private String chasis;
    private ProprietaryMod proprietary;
    private float maximumspeed;
    private float currentspeed = 0;
    private int nodoors;
    private int slidingroof;
    private float fuel;
    private int gearbox;
    private int nochange = 0; 
    

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public ProprietaryMod getProprietary() {
        return proprietary;
    }

    public void setProprietary(ProprietaryMod proprietary) {
        this.proprietary = proprietary;
    }

    public float getMaximumspeed() {
        return maximumspeed;
    }

    public void setMaximumspeed(float maximumspeed) {
        this.maximumspeed = maximumspeed;
    }

    public float getCurrentspeed() {
        return currentspeed;
    }

    public void setCurrentspeed(float currentspeed) {
        this.currentspeed = currentspeed;
    }

    public int getNodoors() {
        return nodoors;
    }

    public void setNodoors(int nodoors) {
        this.nodoors = nodoors;
    }

    public int getSlidingroof() {
        return slidingroof;
    }

    public void setSlidingroof(int slidingroof) {
        this.slidingroof = slidingroof;
    }

    public float getFuel() {
        return fuel;
    }

    public void setFuel(float fuel) {
        this.fuel = fuel;
    }

    public int getGearbox() {
        return gearbox;
    }

    public void setGearbox(int gearbox) {
        this.gearbox = gearbox;
    }

    public int getNochange() {
        return nochange;
    }

    public void setNochange(int nochange) {
        this.nochange = nochange;
    }

    @Override
    public void speedingUpTheCar() {
        this.currentspeed = this.currentspeed +1;        
    }

    @Override
    public void brakingCar() {
        this.currentspeed = 0;
    }

    @Override
    public void gearUp() {
        this.nochange = this.nochange +1;
    }

    @Override
    public void gearDown() {
        this.nochange = this.nochange-1;
    }
    
}
