import java.util.Scanner;



public class Atm{
    public static void main(String[] args) {
    float balance=400000;
    int withdraw,deposit;

    Scanner sc=new Scanner(System.in);
    while(true){
        System.out.println("TAutomated Teller Machine");
        System.out.println(".................................");
        System.out.println("Choose 1 for Withdraw");
         System.out.println("Choose 2 for deposite");
          System.out.println("Choose 3 for cheak balance");
         System.out.println("Choose 4 for Exit");
          System.out.println("Enter your choice");

         int choice=sc.nextInt();
         switch(choice){
            case 1:
            System.out.println("Enter how many money to be withdraw");
            withdraw =sc.nextInt();

            if(balance >=withdraw){
                balance=balance-withdraw;
                  System.out.println("Please collect your money");  

            }
            else{
                  System.out.println(" you have insufficient balance");  

            }
            System.out.println();
            break;

            case 2:
            System.out.println("Enter money to be deposite");
            deposit = sc.nextInt();
            balance =balance +deposit ;
            System.out.println("your money is successfully deposit");
            System.out.println();
            break;


            case 3:  
        //displaying the total balance of the user  
        System.out.println("Balance : "+balance);  
        System.out.println("");  

        case 4:
        System.exit(0);

         }
     

          }
          

    }
        
    }
