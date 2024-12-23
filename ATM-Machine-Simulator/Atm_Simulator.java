import java.util.Scanner;
public class Atm_Simulator{
    static int balance;
    
        public static int getBalance() {
            return balance;
        }
      
        public static boolean userLogin(int input_pin){
            int pin=2222;
            if (input_pin==pin) {
                return true; 
            }else
            return false;
        }
        public static void deposit(int depAmt){
            balance=balance+depAmt;
            System.out.println(depAmt+" Added Succesfully! \n");

    }
       public static int withdraw(int withdrawAmt){
        if (balance==0) {
            System.out.println("Account is Empty!");
            return 0;
            
        }
        if (withdrawAmt>balance) {
            System.out.println("Low Balance!");
            return 0;
        }else{ 
        balance=balance-withdrawAmt;
        }
        return withdrawAmt;

       }

 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.println("\t**ATM MACHINE**");
    System.out.print("Enter Your 4-digit Pin : ");
    int pin=sc.nextInt();
    System.out.println();
    
    if (userLogin(pin)) {
        System.out.println("\tLogin Succesful.");
        while (true) {
            System.out.println("Press 1 to Check Balanace.");
            System.out.println("Press 2 to Deposit Money.");
            System.out.println("Press 3 to Withdraw Money");
            System.out.println("Press 4 to Exit.\n");  
            System.out.print("Enter your choice 1-4:");
            int inp=sc.nextInt();
            if (inp==1) {
                System.out.println("\tYour current balance is: "+getBalance()+"\n");
            }
            if (inp==2) {
                System.out.print("\tDeposit Money:"); 
                int dep=sc.nextInt();
                deposit(dep);   
            }
            if (inp==3) {
                System.out.print("\tWithdraw Money:");
                int wd=sc.nextInt();
                System.out.println(withdraw(wd)+" Succesfully Withdrawn.\n");   
            }
            if (inp==4) {
                System.out.println("\tExit.");
             break;
                
            }
            
        }
    }else
    System.out.println("Wrong Pin! Please Enter Valid Pin");

 


    
}
}

//!Create a program that simulates an ATM machine:
//! User login
//! Check balance
//! Deposit/withdraw money