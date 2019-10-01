package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
        Algorithm:
        1. This program simulates a vending machine.
        2. Display items, their serial numbers and their corresponding prices.
        3. Ask User to enter money in acceptable money amounts i.e 1,5 dollar or 1,5,10,25 cents.
        4. While money entered is not 0 accept money from user and save to balance.
        5. If user enters anything other then acceptable money amounts print error message.
           Else save money entered to balance and display balance.
        6. When user enters zero terminate while loop and save to balance.
        7. If balance entered by user is 0 then display message and end program.
           Else continue with program.
        8. declare items and their corresponding prices as doubles.
        9. Ask user to enter serial numbers of items to dispense.
        10. Run a For loop to allow user to dispense 5 items maximum per transaction.
        11. If user enters valid serial number and has enough balance dispense item.
            Else if user enters 0. Break loop.
            Else if user enters invalid serial number display error message.
        12. Display balance remaining.
        13. If balance remaining is more then 0 calculate change in .25, .10 , .05 ,.01
            Else Display last message and terminate program.
        14. Display end message and terminate program.

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("SR   Item          Price");          //displays items and prices
        System.out.println(" 1   Snickers      $1.25");
        System.out.println(" 2   Twix          $1.25");
        System.out.println(" 3   Trident       $0.75");
        System.out.println(" 4   Gum5          $0.75");
        System.out.println(" 5   Lays          $2.25");

        System.out.println("Enter Money, This machine accepts coins 0.01,0.05,0.10,0.25 and bills 1, 5. Enter 0 to accept");
        double balance = 0;
        double MonEnt = 1;

        while (MonEnt !=0){                                                   // while statement to terminate if user enters 0 to stop accepting money.
                MonEnt = scanner.nextDouble();
                if (MonEnt != 0.01 && MonEnt != 0.05 && MonEnt != 0.10 && MonEnt != 0.25 && MonEnt != 1 && MonEnt != 5 && MonEnt !=0) { //if statement to make sure user enters acceptable money value.
                    System.out.println("Invalid amount entered");
                }
                else balance = MonEnt + balance;
                System.out.println("Your balance is " + balance);        //if money enetered is acceptable it is added to the customers balance.
            }

        if (balance == 0) System.out.println("Transaction Cancelled"); //if customer enters 0 money value program is cancelled and message is displayed.
        else{
        double a = 1.25;                   //else values are declared for items
        double b = 1.25;
        double c = 0.75;
        double d = 0.75;
        double e = 2.25;
        System.out.println("Enter SR 1-5 to dispense items, Enter 0 to stop dispensing");  //asks user what item they want


            for (int i = 1; i < 6 && balance >= 0.75; i++) {  //loop runs 5 times, 5 being the maximum items that can be dispensed at once. and also makes sure customer has enough money to buy least valuable item.
                double ItemSel = scanner.nextDouble();
                if (ItemSel == 1 && balance >= 1.25) {         //makes sure customer has enough balance to buy the item
                    System.out.println("Snickers Dispensed");
                    balance = balance - 1.25;
                } else if (ItemSel == 2 && balance >= 1.25) {  //makes sure customer has enough balance to buy the item
                    System.out.println("Twix Dispensed");
                    balance = balance - 1.25;
                } else if (ItemSel == 3) {
                    System.out.println("Trident Dispensed");
                    balance = balance - 0.75;
                } else if (ItemSel == 4) {
                    System.out.println("Gum5 Dispensed");
                    balance = balance - 0.75;
                } else if (ItemSel == 5 && balance >= 2.25) {   //makes sure customer has enough balance to buy the item
                    System.out.println("Lays Dispensed");
                    balance = balance - 2.25;
                } else if (ItemSel == 0) break;        // customer enters 0 to dispense items selected
                else System.out.println("Invalid Selection");    //if customer enters invalid SR message is printed
                System.out.println("Your Remaining balance is " + balance);   //displays remaining balance after item selection

            }


        if (balance>0) {                                   //this block calculates the change to be given back to the customer
            int q = (int) (balance / 0.25);
             balance = balance - (q*0.25);
                  if (q > 0) System.out.println("Change " + q + " $0.25");
            int r = (int) (balance / 0.10);
             balance = balance - (r*0.10);
                  if (r > 0) System.out.println("Change " + r + " $0.10");
            int s = (int) (balance / 0.05);
             balance = balance - (s*0.05);
                  if (s > 0) System.out.println("Change " + s + " $0.05");
            int t = (int) (balance / 0.01);
             balance = balance - (t*0.01);
                  if (t > 0) System.out.println("Change " + t + " $0.01");
            System.out.println("Thank You!");           //prints ending message
        }
        else{
            System.out.println("Thank You!");}             //prints ending message if balance is zero on line 63


    }

    }
}