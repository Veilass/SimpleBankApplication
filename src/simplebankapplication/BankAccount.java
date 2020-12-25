
package simplebankapplication;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
*
*
*///@author Veilas
public class BankAccount {
    int money;
    int currentTransaction;
    private String NameAndSurname;
    private String NumberBankCard;
   
    //Create empty constructor
    public BankAccount(){}
       //Create constructor with parametrs
        public BankAccount(String NameAndSurname,
                String NumberBankCard, int money){
            this.NameAndSurname = NameAndSurname;
            boolean result =
                    NumberBankCard.matches("[1-9]{4}\\-[1-9]{4}\\-[1-9]{4}\\-[1-9]{4}");
            if(result == true){
            this.NumberBankCard = NumberBankCard;
            }
            this.money = money;
        }
       
        //create checkBalance
        public void checkBalance(){
            if(money != 0){
                System.out.println("Your balance: " + money);
            }else
         System.out.println("Your balance empty");
        }
       
                //create deposit
  public void deposit(int value){
         if(value != 0){
             money += value;
            currentTransaction += value;
             System.out.println("Success deposit " + value);
         }else{
             System.out.print("Value less and 0");
         }
    }
        //create withdrawal
        public void withdrawal(int value){
            if(value != 0){
                money -= value;
                currentTransaction -= value;
                System.out.println("Success withdrawal " + value);
            }else
                System.out.println("Value 0 and less");
        }
        //create get transaction
        public void getCurrentTransaction(){
            if(currentTransaction > 0){
                System.out.println("Deposit: " + currentTransaction);
                
            }else if(currentTransaction < 0){
                  System.out.println("withdrawal: " + currentTransaction);
            }else
                System.out.println("No transactions");
        }
        
        public void showMenu(){
            char option = '\0';
            Scanner in = new Scanner(System.in);
            
            System.out.println("Welcome " + NameAndSurname);
            System.out.println("Your NumberBankCard: " + NumberBankCard);
            System.out.println("\n");
            System.out.println("1. CheckBalance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdrawal");
            System.out.println("4. Previos transaction");
            System.out.println("5. Exit");
            
            do{
                System.out.println("=================================================================");
                System.out.println("Enter an option");
                System.out.println("=================================================================");
                option = in.next().charAt(0);
                System.out.println("\n");
                
                switch(option){
                    case '1':
                        System.out.println("-----------------------------------");
                        System.out.println("Balance: " + money);
                        System.out.println("-----------------------------------");
                        System.out.println("\n");
                        break;
                    case '2':
                        System.out.println("-----------------------------------");
                        System.out.println("Enter an summ");
                        int value1 = in.nextInt();
                        deposit(value1);
                        System.out.println("-----------------------------------");
                        System.out.println("\n");
                        break;
                    case '3':
                       System.out.println("-----------------------------------");
                        System.out.println("Enter an summ");
                        int value2 = in.nextInt();
                        withdrawal(value2);
                        System.out.println("-----------------------------------");
                        System.out.println("\n");
                        break;
                    case '4':
                        System.out.println("-----------------------------------");
                        getCurrentTransaction();
                        System.out.println("-----------------------------------");
                        System.out.println("\n");
                        break;
                    case '5':
                        System.out.println("-----------------------------------");
                        System.out.println("Close programm");
                        System.out.println("-----------------------------------");
                         System.out.println("\n");
                        break;
                    default:
                        System.out.println("Invalid data entered");
                        System.out.println("-----------------------------------");
                         System.out.println("\n");
                         break;
                }
            }while(option != '5');
            System.out.println("Thank you for using the services of the program");
       }
        
              //Override the method toString
        @Override
        public String toString(){
            return '{' + " NameAndSurname: " + NameAndSurname
            + ", NumberBankCard: " + NumberBankCard
            + ", money: " + money + "\n";
        }
}