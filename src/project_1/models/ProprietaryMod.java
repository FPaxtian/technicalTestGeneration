/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_1.models;

/**
 *
 * @author Paxtian
 */
public class ProprietaryMod {
    
    // Defining variables of the Proprietary object
        
    private String name;
    private String cpf; // Registro de persona fisica
    private String rg; // Identity card
    private DirectionMod direction;
    private String complement;
    
    // Defining the constructor method ( name , cpf , rg )

    public ProprietaryMod(String name, String cpf, String rg, DirectionMod direction) {
        this.name = name;
        this.cpf = cpf;
        this.rg = rg;
        this.direction = direction;
    }

    // Encapsulating the class with the methods getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }            

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public DirectionMod getDirection() {
        return direction;
    }

    public void setDirection(DirectionMod direction) {
        this.direction = direction;
    }
        
    
    
}
