/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Angel
 */
public class Debt {
    private double interestRate;
    private double balance;
    
    public Debt(double initialBalance, double initialInterestRate){
        this.interestRate = initialInterestRate;
        this.balance = initialBalance;
    }
    
    public void printBalance(){
        System.out.println(balance);
    }
    
    public void waitOneYear(){
        this.balance = this.balance * this.interestRate;
    }
    
}
