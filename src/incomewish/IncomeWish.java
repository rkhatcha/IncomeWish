package incomewish;

/**
 * A practice program that teaches us how to use variables.
 * @author <a href="mailto:rkhatchadourian@citytech.cuny.edu"Raffi Khatchadourian</a>.
 */
public class IncomeWish {

    /**
     * This is the main() method. It's the first portion of code that is executed by the JVM when you
     * run your program.
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
