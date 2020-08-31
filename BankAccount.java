import java.util.Scanner;

public class BankAccount {
     String acctNumber;
     double balance;

    public BankAccount(){
        acctNumber="";
        balance=0;
        System.out.println("BankAccount Object Constructed");

    }

    public void setter(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        acctNumber=scanner.next();
        System.out.print("Enter Balance: ");
        balance=scanner.nextDouble();
    }
    public void getter(){
        System.out.println("Account Number: "+acctNumber);
        System.out.println("Balance: "+balance);
    }
}
