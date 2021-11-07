/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import project_2.models.InvoiceMod;

/**
 *
 * @author Paxtian
 */
public class Project_2Test {
    
    public static void main(String[] args) {
        
        InvoiceMod invoice = new InvoiceMod();
        invoice.setNumber("2310");
        invoice.setDesc("Desct Article");
        invoice.setCountPay(10);
        invoice.setPrice(23.67);
        
        
        System.out.println(invoice.getTotalInvoice());
        
    }
}
