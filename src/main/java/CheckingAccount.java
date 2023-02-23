
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author rexxr
 */
public class CheckingAccount extends BankAccount {

    public CheckingAccount(String name, double balance) {
        super(name, balance);
    }

//    public void transfer(double amount, BankAccount recipient) {
//        if (amount > balance) {
//            System.out.println("Insufficient balance.");
//        } else {
//            balance -= amount;
//            recipient.deposit(amount);
//            System.out.println("You have transferred " + amount + " SAR to " + recipient.name + ".");
//        }
//    }

    public void checkPass() {
        Scanner passw = new Scanner(System.in);
        int attempts = 3; // set number of password attempts
        boolean passwordCorrect = false;

        while (attempts > 0 && !passwordCorrect) { // loop until correct password or no more attempts
            System.out.println("Enter password (you have " + attempts + " attempts left): ");
            int inputPassword = passw.nextInt();
            if (inputPassword == 1727) {
                passwordCorrect = true;
                System.out.println("Password accepted!");
            } else {
                System.out.println("Incorrect password. Please try again.");
                attempts--;
            }
        }

        if (!passwordCorrect) {
            System.out.println("No attempts remaining. Exiting program.");
            System.exit(0);
        }
    }
}
