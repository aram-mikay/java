/* Aram Mikayelian
CSIS 112 - Winter 2017
Homework #6*/
import java.util.Scanner;
import java.text.DecimalFormat;

public class BookClubMenu
{
   public static void main(String[]args)
   {
      Scanner keyboard = new Scanner (System.in);
      DecimalFormat formatter = new DecimalFormat("$#0.00");
      
      String bookClub = "BOOK CLUB MEMBERSHIP MENU";
      int choice;
      int sixMonth = 0;
      int twelveMonth = 0;
      double totalSales = 0;
      
      do
      {  
         System.out.println();
         System.out.println(bookClub);
         System.out.println("1) Sell a Six Month Membership" + "\n2) Sell a Twelve Month Membership" + 
                              "\n3) Quit the Program\n");
         System.out.println("Make a selection by choosing a number: ");                     
                              
         choice = keyboard.nextInt();
      if(choice == 1)
      {
         ++sixMonth;
         totalSales += 50.50;
         
         System.out.println("You sold a six month membership.");  
      }
      else if (choice == 2)
      {
         ++twelveMonth;
         totalSales += 99.00;
       
         System.out.println("You sold a 12 month membership.");
      }
      else if(choice != 3)
      {
         System.out.println("You have made an invalid selection.");
      
      }
      else
      {
         System.out.println("The total book club membership sales were " + formatter.format(totalSales));
      } 
      
      }while(choice !=3);                   
      
   }
}