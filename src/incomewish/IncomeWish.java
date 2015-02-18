/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package incomewish;

/**
 *
 * @author rkhatchadourian
 */
public class IncomeWish {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name;
        int age;
        double annualPay;
        
        name = "Dr. K";
        age = 21;
        annualPay = 500000;
        
        System.out.println("My name is " + name + ", my age is " +
                age + " and\n" +
                "I hope to earn $" + annualPay + " per year.");
        
    }
    
}
