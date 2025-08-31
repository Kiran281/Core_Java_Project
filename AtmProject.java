
import java.util.Scanner;

public class AtmProject {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        

        float balance =100000.50f;
        int withdraw,deposit;
        int pin =456;
        System.out.println("Welcome to ATM");
        System.out.println(".................");

        int attempts;
        for(attempts=1;attempts<=3 ;attempts++){
          System.out.println("Enter the PIN:");
          int enterpin =sc.nextInt();  

          if(enterpin==pin){
            System.out.println("✅ Login Successful!");

            for(int i=1;i<=5 ;i++){
                System.out.println("\n----- ATM Menu -----");
                    System.out.println("1. Check Balance");
                    System.out.println("2. Withdraw");
                    System.out.println("3. Deposit");
                    System.out.println("4. Exit");
                    System.out.print("Choose an option: ");

                    int choice=sc.nextInt();

                    switch (choice){
                        case 1:
                            System.out.println("💰 Current Balance: " + balance);
                            break;

                        case 2:
                            System.out.print("Enter amount to withdraw: ");
                            withdraw = sc.nextInt();
                            if (withdraw <= balance) {
                                balance -= withdraw;
                                System.out.println("✅ Withdrawn: " + withdraw);
                                System.out.println("💰 New Balance: " + balance);
                            } else {
                                System.out.println("❌ Insufficient Balance!");
                            }
                            break;

                        case 3:
                            System.out.print("Enter amount to deposit: ");
                            deposit = sc.nextInt();
                            balance += deposit;
                            System.out.println("✅ Deposited: " + deposit);
                            System.out.println("💰 New Balance: " + balance);
                            break;

                        case 4:
                            System.out.println("👋 Thank you for using ATM!");
                            return; // exit program

                        default:
                            System.out.println("❌ Invalid Option!");
                    }
                }
                break; // stop asking for PIN once logged in
            } else {
                System.out.println("❌ Wrong PIN! Attempts left: " + (3 - attempts));
            }

                        
                    
                   
            }
             if (attempts > 3) {
            System.out.println("🚫 Card Blocked! Too many wrong attempts.");
        }

        sc.close();
        }
    }






        

