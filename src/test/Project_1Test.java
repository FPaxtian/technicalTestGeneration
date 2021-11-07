/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import project_1.models.CarMod;
import project_1.models.DirectionMod;
import project_1.models.ProprietaryMod;

/**
 *
 * @author Paxtian
 */
public class Project_1Test {
    
    public static void main(String[] args) {
        
        DirectionMod direction = new DirectionMod(9670);        
        direction.setStreet("Lerdo");
        direction.setNeighborhood("Centro");
        direction.setCity("Minatitlan");
        CarMod car = new CarMod(new ProprietaryMod("Jack Antonio Jr Paxtian", "12345678","IPF1999", direction));
        
        for (int i = 0; i < 10; i++) {
            car.speedingUpTheCar();
        }
        
        System.out.println(car.getCurrentspeed());
        
        car.brakingCar();
        
        System.out.println(car.getCurrentspeed());
        
        System.out.println(car.getProprietary().getName());
    }
    
}
