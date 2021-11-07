/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import project_3.models.Employee;

/**
 *
 * @author Paxtian
 */
public class Project_3Test {
    
    public static void main(String[] args) {
        
        Employee employees = new Employee();
        employees.addListEmployee(new Employee("Francisco","Paxtian",12));
        employees.addListEmployee(new Employee("Jr","Izquierdo",1));
        
        double salaryMes_1 = employees.getListEmployee().get(0).getSalary();        
        int salaryAnio_1 = (int) (salaryMes_1 * 12);
        int salaryAnio10_1 = (int) (salaryAnio_1 * 0.10);
        int salaryComplete_1 = salaryAnio_1 + salaryAnio10_1;
        double salaryMes_2 = employees.getListEmployee().get(1).getSalary();        
        int salaryAnio_2 = (int) (salaryMes_2 * 12);
        int salaryAnio10_2 = (int) (salaryAnio_2 * 0.10);
        int salaryComplete_2 = salaryAnio_2 + salaryAnio10_2;        
        System.out.println(employees.getListEmployee().get(0).getName()+" Gano al año con su aumento del 10% " +salaryComplete_1);
        System.out.println(employees.getListEmployee().get(1).getName()+" Gano al año con su aumento del 10% " +salaryComplete_2);
        
        System.out.println("No de empelado: "+employees.getListEmployee().size());
                
    }
}
