import java.util.Scanner;

public class CheckingAccount extends BankAccount {
    private double limit;

    public CheckingAccount(){
        limit=0;
        System.out.println("CheckingAccount Object Constructed");
    }

    public void setter(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        acctNumber=scanner.next();
        System.out.print("Enter Balance: ");
        balance=scanner.nextDouble();
        System.out.print("Enter Limit: ");
        limit=scanner.nextDouble();
    }
    public void getter(){
        System.out.println("Account Number: "+acctNumber);
        System.out.println("Balance: "+balance);
        System.out.println("LIMIT: "+limit);
    }


}
