/*Aram Mikayelian
CSIS 112 - Winter 2017
Homework #4*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class Trees2
{
   public static void main(String[]args)
   {
      Scanner keyboard = new Scanner (System.in);
      DecimalFormat formatter = new DecimalFormat ("#0.00");
      DecimalFormat formatter2 = new DecimalFormat("$#,##0.00");
      
      String strInput;
      int numTrees;
      int treeHeight;
      int delivery;
      int choice;
      double costSingle = 0;
      double treeTotal;
      double deliveryCost = 0;
      double total;
     
      
      System.out.println("How many trees do you want to purchase?");
      numTrees = keyboard.nextInt();
      if(numTrees < 1)
      {
         System.out.println("You have entered an invalid amount.");
      }   
      
      System.out.println("Enter the height of trees you want to purchase.");
      treeHeight = keyboard.nextInt();
      if(treeHeight < 3)         
      {
         costSingle = 39.0;
      }
      else if(treeHeight <= 5)
      {
         costSingle = 69.5;
      }
      else if(treeHeight < 8)
      {
         costSingle = 99.0;
      }
      else if(treeHeight >= 8)
      {
         costSingle = 199.50;
      }
      
      treeTotal = costSingle * numTrees;
      
      System.out.println("Would you like the trees delivered? Enter 1 for Yes, Enter 0 for No.");
      delivery = keyboard.nextInt();
      
      if(delivery == 1)
      {
         if(numTrees < 5)
         {
            deliveryCost = 10.0 * numTrees;        
         }
         else if(numTrees >= 5)
         {
            deliveryCost = 50.0;
         }
     if(delivery == 0)
         {
            deliveryCost = 0.0;
         }
      
     }
            
       total = treeTotal + deliveryCost;
       
       System.out.println("Green Fields Landscaping" + "\nEvergreen Tree Invoice\n" + "\n" + 
                           numTrees + " Trees at " + formatter.format(costSingle) + 
                           " each: " + formatter2.format(treeTotal));
                           
      System.out.println("Delivery Charge:\t" + formatter2.format(deliveryCost));
      System.out.println("\t\t\t--------");
      System.out.println("TOTAL:\t\t\t" + formatter2.format(total));
      
   }
}