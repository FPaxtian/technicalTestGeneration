/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_3.models;

import java.util.ArrayList;

/**
 *
 * @author Paxtian
 */
public class Employee {
    
    private static Employee instance = new Employee();
    
    ArrayList<Employee> listEmployee = new ArrayList<>();
    private String name;
    private String lastname;
    private double salary;    
    
    
    public synchronized static Employee getInstance() {
       if (instance == null) {
           instance = new Employee();
       }
       return instance;
   }
    public Employee(){}
    
    public Employee(String name, String lastname, double salary) {
        this.name = name;
        this.lastname = lastname;
        this.salary = salary;
    }

    
    public ArrayList<Employee> getListEmployee() {
        return listEmployee;
    }

    public void setListEmployee(ArrayList<Employee> listEmployee) {
        this.listEmployee = listEmployee;
    }
        

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void addListEmployee(Employee employee){
        this.listEmployee.add(employee);
    }
    
    
    
}
