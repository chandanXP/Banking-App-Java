package BankingApplication;


import java.sql.SQLOutput;
import java.util.Scanner;

public class StateBankOfIndia {
    public static void main(String []args)
    {
        //TODO
        BankAccount chandan=new BankAccount("Chandan","20110212805");
        chandan.ShowMenu();
    }
}
class BankAccount
{
    int Balance;
    int PreviousTransaction;
    String CustomerId;
    String CustomerName;
    public int Amount;
    BankAccount(String name, String cid)
    {
        CustomerName=name;
        CustomerId=cid;
    }

    void deposit(int Amount)
    {
        if (Amount != 0) {
            Balance = Balance + Amount;
            PreviousTransaction = Amount;
        }
    }
    void Withdraw(int Amount)
    {
        if (Amount != 0)
        {
            Balance = Balance - Amount;
            PreviousTransaction = -Amount;
        }
    }
    void GetPreviousTransaction() {
        if (PreviousTransaction > 0) {
            System.out.println("Deposited: " + PreviousTransaction);
        } else if (PreviousTransaction < 0) {
            System.out.println("Withdrawn" + Math.abs(PreviousTransaction));//abs will give the positive value.
        } else {
            System.out.println("No transaction occurred!!");
        }
    }
    void ShowMenu() {
        char option = '\0';//initialize the value to zero.
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome" + CustomerName);
        System.out.println("\n");
        System.out.println(CustomerId);
        System.out.println("(A) for check Balance.");
        System.out.println("(B) for Deposit");
        System.out.println("(C) for Withdraw");
        System.out.println("(D) for Previous Transaction");
        System.out.println("(E) for Exit");

        do {
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("Enter The option");
            System.out.println("-----------------------------------------------------------------------------");
            option = input.next().charAt(0);
            System.out.println("\n");
            switch (option) {
                case 'A':

                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("Balance: " + Balance);
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("\n");
                    break;
                case 'B':
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("Enter an amount to deposit: ");
                    System.out.println("-----------------------------------------------------------------------------");
                    int Amount = input.nextInt();
                    deposit(Amount);
                    System.out.println("\n");
                    break;
                case 'C':

                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("Enter an amount to Withdraw:");
                    System.out.println("-----------------------------------------------------------------------------");
                    int Amount2 = input.nextInt();
                    Withdraw(Amount2);
                    System.out.println("\n");
                    break;
                case 'D':
                    System.out.println("-----------------------------------------------------------------------------");
                    GetPreviousTransaction();
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("\n");
                    break;
                case 'E':
                    System.out.println("-----------------------------------------------------------------------------");
                    break;
                default:
                    System.out.println("Invalid Option!!,Please Enter Again");
                    break;



            }
        }
            while (option != 'E') ;
            System.out.println("Thanks for using our service");


        }

}
