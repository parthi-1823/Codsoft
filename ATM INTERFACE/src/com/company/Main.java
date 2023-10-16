package com.company;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static int withdraw(int amount,int withdrawalamount){
        return amount-withdrawalamount;
    }
    public static int deposit(int amount,int depositamount){
        return amount+depositamount;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
	    Users acc=new Users();
        acc.addToMap(001,10000);
        acc.addToMap(002,30000);
        acc.addToMap(003,2000);

        int i=1;

        while(i==1){
            System.out.println("Enter your account number");
            int acNo=sc.nextInt();
            if(acc.contains(acNo)){
                int amount=acc.getValue(acNo);
                System.out.println("Enter 1 for Money withdrawal");
                System.out.println("Enter 2 for Money Deposit");
                System.out.println("Enter 3 for Balance Check");
                int num=sc.nextInt();
                switch (num){
                    case 1:
                        System.out.println("Enter the Withdrawal amount");
                        int withdrwalAmount= sc.nextInt();
                        if(withdrwalAmount>amount){
                            System.out.println("Your Account is not having sufficient balance to withdraw");
                        }
                        else{
                            int aferWithdrawal=withdraw(amount,withdrwalAmount);
                            acc.addToMap(acNo,aferWithdrawal);
                            System.out.println("Collect Your cash");
                            break;
                        }
                    case 2:
                        System.out.println("Enter the deposit amount");
                        int depositAmount= sc.nextInt();
                        int AfterDeposit=deposit(amount,depositAmount);
                        acc.addToMap(acNo,AfterDeposit);
                        System.out.println("Your money is successfully deposited");
                        break;
                    case 3:
                        int balance=acc.checkBalance(acNo);
                        System.out.println("Your account balance is : "+balance);
                        break;
                    default:
                        System.out.println("Press Valid key");
                        break;
                }
            }else{
                System.out.println("Invalid Account Number");
                System.out.println("Thank you for visiting our ATM");
            }
            System.out.println("Enter 1 to continue");
            System.out.println("Enter 0 to exit");

            i= sc.nextInt();

        }
        System.out.println("Thank You for visiting Codsoft ATM");
    }
}
