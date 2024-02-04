package Dlite;
import java.util.Scanner;

public class ATM {
    static int pin=1234,balance=0;
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int choice,enteredPin,depositAmount,withdrawAmount;
        do
        {
            System.out.println("Welcome to ATM");
            System.out.print("Enter your PIN: ");
            enteredPin=sc.nextInt();
            if(enteredPin==pin)
            {
                do
                {
                    System.out.print("\nOptions:\n1. Deposit\n2. Withdraw\n3. Balance enquiry\n4. PIN change\n5. Exit\nEnter your choice: ");
                    choice=sc.nextInt();
                    switch(choice)
                    {
                        case 1:	System.out.print("Enter the amount to deposit: ");
                                depositAmount=sc.nextInt();
                                balance+=depositAmount;
                                System.out.println("Transaction successful!");
                                break;
                        case 2:	System.out.print("Enter the amount to withdraw: ");
                                withdrawAmount=sc.nextInt();
                                if(withdrawAmount<=balance)
                                {
                                    balance-=withdrawAmount;
                                    System.out.println("Transaction successful!");
                                }
                                else
                                    System.out.println("Insufficient balance!");
                                break;
                        case 3:	System.out.println("Your current balance: "+balance);
                                break;
                        case 4:	System.out.print("Enter new PIN: ");
                                pin=sc.nextInt();
                                System.out.println("PIN changed successfully!");
                                break;
                        case 5:	System.out.println("Thank you for using the ATM. Goodbye!");
                                System.exit(0);
                        default:System.out.println("Invalid choice! Please try again.");
                    }
                }while(choice!=4);
            }
            else
                System.out.println("Invalid PIN! Exiting program.");
        }while(true)
    }
}


