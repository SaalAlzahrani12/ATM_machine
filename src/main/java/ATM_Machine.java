
import java.util.Scanner;

public class ATM_Machine {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CheckingAccount account = new CheckingAccount("Saad Alzahrani", 10000);
        account.checkPass();
        while (true) {
            System.out.println("======================");
            System.out.println("       ANB BANK       ");
            System.out.println("======================");
            System.out.println(" > Enter (W or w) to withdraw");
            System.out.println(" > Enter (D or d) to deposit");
            System.out.println(" > Enter (T or t) to transfer");
            System.out.println(" > Enter (P or p) to print info");
            System.out.println(" > Enter (E or e) to exit");
            System.out.println("");
            System.out.println("  > Enter your choice: ");

            String choice = input.next();

            switch (choice.toUpperCase()) {
                case "W":
                    System.out.println("Enter amount of money to withdraw (up to 5000): ");
                    double amountToWithdraw = input.nextDouble();
                    account.withdraw(amountToWithdraw);
                    break;

                case "D":

                    System.out.println("Enter amount of money to deposit (up to 10000): ");
                    double amountToDeposit = input.nextDouble();
                    account.deposit(amountToDeposit);
                    break;

                case "T":
                    System.out.println("Enter amount of money to transfer: ");
                    double amountToTransfer = input.nextDouble();
                    
                    System.out.println("Enter recipient's account name: ");
                    String recipientName = input.next();
                    BankAccount recipient = new CheckingAccount(recipientName, 0);
                    account.transfer(amountToTransfer, recipientName);
                   
//                    ((CheckingAccount) account).transfer(amountToTransfer, recipient);
                    break;

                case "P":
                    account.printInfo();
                    break;

                case "E":
                    System.out.println("Thank you for using ANB Bank.");
                    System.exit(0);
                    break;
                default:
            }
        }
    }
}
