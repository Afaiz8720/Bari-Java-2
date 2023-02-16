package Inheritance;

import java.util.Scanner;
class Account {
    protected float account_Balance = 0 ;
    protected long account_Number;
    protected float new_balance = 0 ;
    private String name ;
    private String Address ;
    private long phone_Number ;
    private String dob ;

    public float getAccount_Balance() {
        return account_Balance;
    }

    public long getAccount_Number() {
        return account_Number;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return Address;
    }

    public long getPhone_Number() {
        return phone_Number;
    }

    public String getDob() {
        return dob;
    }

    public void setData(long account_Number , String name , long phone_Number ){
        this.account_Number = account_Number ;
        this.name = name;
        this.phone_Number = phone_Number;
    }

    public void passbook(){
        System.out.println("ACCOUNT HOLDER NAME : " + name);
        System.out.println("ACCOUNT NUMBER : " + account_Number);
        System.out.println("PHONE NUMBER : " + phone_Number);
        
    }
}
class SavingAccount extends Account {
    public void deposit(int amount){
      account_Balance = account_Balance + amount ;
      //System.out.println("Account balance is : " + account_Balance);
      float new_balance = account_Balance ;
      System.out.println("Account balance is : " + new_balance);
    }

    public void withDraw(int amount){
      if(amount >= 0 || amount <= 500){
        System.out.println("LOW CASH AVAILABLE");
      }
      else{
        account_Balance = account_Balance - amount ;
        //System.out.println("Account balance is : " + account_Balance);
        //new_balance = account_Balance ;
        System.out.println("Account balance is : " + account_Balance);
      }

    }

    public void fixedDeposit(int principle , int rate , int dateTime){
        double fixed_Deposit = principle * Math.pow(1 + (rate / 100 ), dateTime);
        System.out.println("Fixed Deposit balance is : " + fixed_Deposit);

    }
}


public class BankAccount {
    /**
     * @param args
     */
    public static void main(String[] args) {
        SavingAccount s = new SavingAccount();
        System.out.println("<----------------------- SABKA BANK OF INDIA --------------------->");
        System.out.println("1. ENTER ACCOUNT DETAILS");
        System.out.println("2. DEPOSIT");
        System.out.println("3. WITHDRAW");

        Scanner sc = new Scanner(System.in);
    
        int amount ;
        int cont ;
        int choice ;
        do{
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();
        switch(choice){
            case 1 : 
            do{
                System.out.print("Enter account holder name :");
                String name = sc.nextLine();
                sc.nextLine();
                System.out.print("Enter account number :");
                long account_number = sc.nextLong();
                sc.nextLine();
                System.out.print("Enter phone number :");
                long phone_Number = sc.nextLong();
                sc.nextLine();
                System.out.print("Enter 0 for stop : ");
                cont = sc.nextInt();
                s.setData(account_number, name, phone_Number);
                s.passbook();
            }while(cont != 0 );
        
            break ;

            case 2 : 
                do{
                    System.out.print("Enter a amount for deposit : ");
                    amount = sc.nextInt();
                    System.out.println();
                    System.out.print("Enter 0 for stop : ");
                    cont = sc.nextInt();
                    s.deposit(amount);
                }while(cont != 0 );
            
                break ;
            case 3 : 
                do{
                System.out.print("Enter a amount for withdrawing : ");
                amount = sc.nextInt();
                System.out.println();
                System.out.print("Enter 0 for stop : ");
                cont = sc.nextInt();
                s.withDraw(amount);
            }while(cont != 0);
            
            break ;
        }

    }while(choice != 0);
    }
}
