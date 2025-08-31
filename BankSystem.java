import java.util.Scanner;

public class BankSystem {

    long accNo;
    String accHolder;
    double balance;
    static String bankName = "HDFC";   // fixed Static -> static

    Scanner sc = new Scanner(System.in);

    // take input
    void userData() {
        System.out.println("Enter the account number:");
        accNo = sc.nextLong();

        System.out.println("Enter the account Holder name:");
        accHolder = sc.next();

        System.out.println("Enter the account balance:");
        balance = sc.nextDouble();
    }

    // deposit method
    void deposit() {
        System.out.println("Enter the deposit amount:");
        double amount = sc.nextDouble();

        balance = balance + amount;
        System.out.println(amount + " is deposited in your account.");
    }

    // withdraw method
    void withdraw() {
        System.out.println("Enter the withdraw amount:");
        double amount = sc.nextDouble();

        if (balance >= amount) {
            balance = balance - amount;
            System.out.println(amount + " withdrawn. Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // display account info
    void display() {
        System.out.println("AccNo: " + accNo + ", Holder: " + accHolder +
                           ", Balance: " + balance + ", Bank: " + bankName);
    }

    // main method
    public static void main(String args[]) {
        BankSystem b1 = new BankSystem();
        b1.userData();    // input account details
        b1.deposit();     // deposit money
        b1.withdraw();    // withdraw money
        b1.display();     // display final info
    }
}
