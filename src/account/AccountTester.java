/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;
import java.io.PrintStream;
import java.util.Scanner;
/**
 *
 * @author Sivagama
 */
public class AccountTester {
    
    public static void main(String[] args) {
        /*here assumed that 500 accounts can be created
        for the given bank*/
        Account ac[]=new Account[500];
        
        System.out.println("Please enter the amount by which you want to open an account:");
        
               
        Scanner sc=new Scanner(System.in);
        double bal=sc.nextDouble();
         if (bal>50){
             System.out.println("Account is created");
         }
         else {
             System.out.println("Please deposit more than $50 to create account");
             
         }
        System.out.println("Please enter the unique user name:");
        sc.nextLine();
        String user=sc.nextLine();
        
        Account a=new Account(bal,user);
        ac[0]=a;
        
             
        System.out.println("The balance is: "+a.getBalance());  
        System.out.println("The InterestRate per month is "+a.newBalance());
        
    }
}
