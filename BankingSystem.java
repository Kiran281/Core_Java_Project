
import java.util.Scanner;

public class BankingSystem {

    public static void main(String[] args) {
        long Account_No = 4310973626L;   // fixed account number
        int balance = 65000;             // initial balance
        int withdraw, deposit;
        int TransferAccount_balance = 23000; // another account balance

        Scanner sc = new Scanner(System.in);

        // Account check
        System.out.print("Enter the account number: ");
        long enteredAccNo = sc.nextLong();  // must use long (not int)

        int choice;  // menu choice variable

        if (enteredAccNo == Account_No) {
            do {
                // Menu Display
                System.out.println("\n===== Bank Menu =====");
                System.out.println("1. Check Balance");
                System.out.println("2. Withdraw");
                System.out.println("3. Deposit");
                System.out.println("4. Transfer Money");
                System.out.println("5. Exit");
                System.out.print("Choose an option: ");

                choice = sc.nextInt();  // take menu choice

                switch (choice) {
                    case 1:
                        System.out.println("💰 Your balance: " + balance);
                        break;

                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        withdraw = sc.nextInt();
                        if (withdraw <= balance) {
                            balance -= withdraw;
                            System.out.println("✅ Please collect your cash.");
                        } else {
                            System.out.println("❌ Insufficient funds!");
                        }
                        break;

                    case 3:
                        System.out.print("Enter amount to deposit: ");
                        deposit = sc.nextInt();
                        balance += deposit;
                        System.out.println("✅ Money deposited successfully.");
                        break;

                    case 4:
                        System.out.print("Enter amount to transfer: ");
                        int transfer = sc.nextInt();
                        if (transfer <= balance) {
                            balance -= transfer;
                            TransferAccount_balance += transfer;
                            System.out.println("✅ Money transferred successfully!");
                            System.out.println("Your balance: " + balance);
                            System.out.println("Receiver’s balance: " + TransferAccount_balance);
                        } else {
                            System.out.println("❌ Not enough balance for transfer!");
                        }
                        break;

                    case 5:
                        System.out.println("👋 Thank you for banking with us!");
                        break;

                    default:
                        System.out.println("❌ Invalid Option! Please try again.");
                }

            } while (choice != 5);  // repeat until user exits

        } else {
            System.out.println("❌ Invalid Account number!");
        }

        sc.close();
    }
}
