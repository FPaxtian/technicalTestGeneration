/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_2.models;

/**
 *
 * @author Paxtian
 */
public class InvoiceMod {
    
    private String number;
    private String desc;
    private int countPay;
    private double price;

    public InvoiceMod() {        
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getCountPay() {
        return countPay;
    }

    public void setCountPay(int countPay) {
        this.countPay = countPay;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public double getTotalInvoice(){
        
        double amount = this.countPay* this.price;
        if (amount <= 0) {
            if (this.price < 0) {
                amount = 0;
            }
            amount = 0;
        }
        return amount;
    }

    public void getCountPay(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
