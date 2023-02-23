
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author rexxr
 */
public class BankAccount {

    protected String name;
    protected double balance;
    protected int pass;

    public BankAccount(String name, double balance) {

        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount) {

        if (amount <= 10000) {
            balance += amount;
            System.out.println("You have deposited " + amount + " SAR. Your new balance is " + balance + " SAR.");
        } else {
            System.out.println("Your cannot deposit more than 10k");
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("The balanceis not enough.");
        } else if (amount > 5000) {
            System.out.println("You cannot withdraw more than 5k");

        } else {
            balance -= amount;
            System.out.println("You have withdrawn " + amount + " SAR. Your new balance is " + balance + " SAR.");
        }
    }

    public void transfer(double amount,String recipient) {
        if (amount > balance) {
            System.out.println("The balance is not enough.");
        } 
////        else if (amount > 8000) {
//            System.out.println("You cannot transfer more than 8k");
        
    else {
            balance -= amount;
//            recipient.deposit(amount);
            System.out.println("You have transferred " + amount + " SAR to " + recipient + ".");
        }
    }

    public void printInfo() {
        System.out.println("Account name: " + name);
        System.out.println("Account balance: " + balance + " SAR.");
    }

}
