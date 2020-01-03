/*Aram Mikayelian
CSIS 112 - Winter 2017
Homework #8 - 2*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class ConverterMethods2
{
   public static void main(String[]args)
   {
      Scanner keyboard = new Scanner (System.in);
      DecimalFormat formatter = new DecimalFormat("##0.0000");
      
      double convKilo = 0;
      double convInches;
      double convFeet;
      double convMeters = 0;
      int choice;
   
      do
      {
      
         showMenu();
         choice = keyboard.nextInt();
       
       while(choice < 1 || choice > 4)
       {
             
            System.out.println("Invalid selection.");
            showMenu();
            choice = keyboard.nextInt();
      
       }
       if(choice >= 1 && choice <= 3)
       {
         System.out.println("Please enter the number of meters you want to convert: ");
         convMeters = keyboard.nextDouble();
         while(convMeters < 1)
         {
             System.out.println("Invalid entry.");
            System.out.println("Please enter a positive number: ");
          
            convMeters = keyboard.nextDouble();
         }
       }
      
      if(choice == 1)
      {
         convKilo = calcKilometers(convMeters);
         
         System.out.println(convMeters + " meters is " + formatter.format(convKilo) + " kilometers."); 
      }
      else if (choice == 2)
      {
         
          convInches = calcInches(convMeters);
          System.out.println(convMeters + " meters is " + formatter.format(convInches) + " inches.");
      }
      
      else if (choice != 4)
      {
        
        convFeet = calcFeet(convMeters);
        System.out.println(convMeters + " meters is " + formatter.format(convFeet) + " feet.");
      }
    }while(choice != 4);
  }
      
 
   public static double calcKilometers(double meters)
   {
   
      double kiloM;
      kiloM = meters * 0.001;
      
      return kiloM;
   }
   public static double calcInches(double meters)
   {
      double inchM;
      inchM = meters * 39.37;
      return inchM;
   }
   public static double calcFeet(double meters)
   {
      double feetM;
      feetM = meters * 3.281;
      return feetM;
   }
   public static void showMenu()
   {
      System.out.println("\nMETER CONVERSION");
      System.out.println(" 1) Convert to Kilometers" + "\n 2) Convert to Inches" + 
                           "\n 3) Convert to Feet" + "\n 4) Quit the Program");
      System.out.println("Please make a selection: ");
      
   }
     
      
      
   }