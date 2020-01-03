import java.util.Scanner;
import java.text.DecimalFormat;

public class GasStation
{
   public static void main(String[]args)
   {
      Scanner keyboard = new Scanner(System.in);
      DecimalFormat formatter = new DecimalFormat("$##0.00");
      DecimalFormat formatter2 = new DecimalFormat("$#,##0.00");      
      
      String welcome = "HELLO, WELCOME TO CTC FUELING STATION!";
      int pumpNum = 1;
      double fuelValue = 1;
      double totalSales = 0;
      double fuelType;
      double fuelPrice;
      double salesAverage;
      
      
      do
      {
      
      System.out.println(welcome);
      System.out.println("What pump number are you on today?");
      pumpNum = keyboard.nextInt();
       
      if(pumpNum >= 1 && pumpNum <= 8)
      {
         System.out.println("How much fuel would you like to purchase?");
         fuelValue = keyboard.nextDouble();
      }
      else
      {
         System.out.println("You have entered an invalid number. Please try again.");      
      }
      
      if(fuelValue < 1)
      {
            System.out.println("You have entered an invalid number. Please try again.");
      }
    
      }while(pumpNum > 8 || pumpNum <=0 || fuelValue < 1);
      
      do
      {
      System.out.println("What grade fuel would you like to purchase: \n" + "\n1) Regular - 87" 
                           + "\n2) Plus - 89" + "\n3) Super - 91");
      fuelType = keyboard.nextInt();
    
      if(fuelType == 1)
      {
         System.out.println("You have purchased " + formatter2.format(fuelValue) + " worth of Regular - 87.");
      }
      else if(fuelType == 2)
         {
            System.out.println("You have purchased " + formatter2.format(fuelValue) + " worth of Plus - 89.");
         }
      else if (fuelType != 3)
      {
         System.out.println("Sorry, you have entered an invalid fuel type. Please try again.");
      }
      else
      {
      System.out.println("You have purchased " + formatter2.format(fuelValue) + " worth of Super - 91.");
      }
     
     }while( fuelType > 3);     
    
     
   }
}