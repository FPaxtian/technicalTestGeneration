/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import models.CarMod;

/**
 *
 * @author Paxtian
 */
public class Main {
    
    public static void main(String[] args) {
        CarMod car = new CarMod();
        
        for (int i = 0; i < 10; i++) {
            car.speedingUpTheCar();
        }
        
        System.out.println(car.getCurrentspeed());
        
        car.brakingCar();
        
        System.out.println(car.getCurrentspeed());
        
    }
    
}
