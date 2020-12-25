package simplebankapplication;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Map<Integer, BankAccount> accounts = new HashMap<>();
        BankAccount account1 = new BankAccount("Ilya Vasilov", "2412-3546-2135-5754", 10000);
        BankAccount account2 = new BankAccount("Nikolay Valuev", "2514-6435-3646-6534", 10000);
        BankAccount account3 = new BankAccount("Svetoslav Kozimirov", "3564-3523-5233-3532", 10000);
        BankAccount account4 = new BankAccount("Mariya Jeorns", "1234-1435-6552-3325", 10000);
        accounts.put(1001, account1);
        accounts.put(1002, account2);
        accounts.put(1003, account3);
        accounts.put(1004, account4);
           
           account1.showMenu();
     
    }
}
