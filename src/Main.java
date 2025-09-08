import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AtmOperations op = new AtmOpImp();
        System.out.println("Welcome to ATM ");
        final int atmNumber = 1234;
        final int pin = 2412;
        System.out.println("Enter ATM number ");
        int atm = sc.nextInt();
        System.out.println("Enter ATM pin");
        int Pin = sc.nextInt();
        if (atm == atmNumber && Pin == pin) {
            System.out.println("Verified successfully");
            while (true) {
                System.out.println("\n=== Bank Menu ===");
                System.out.println("1. Check Balance");
                System.out.println("2. Withdraw");
                System.out.println("3. Deposit");
                System.out.println("4. View Statement");
                System.out.println("5. Exit Application");
                System.out.print("Choose an option: ");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                            op.viewbalance();
                        break;

                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = sc.nextDouble();
                        op.withdraw(withdrawAmount);
                        break;

                    case 3:
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = sc.nextDouble();
                        op.deposit(depositAmount);
                        break;

                    case 4:
                        op.viewStatement();
                        break;
                    case 5:
                        System.out.println("Thank you for using ATM. Bye!");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            }
        } else {
            System.out.println("Wrong details. Access Denied.");
        }
    }
}