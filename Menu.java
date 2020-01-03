/* Aram Mikayelian
CSIS 112 - Winter 2017
Homework #5 


1.	Create variables : choice, area, circumference, radius
2.	Display: Menu 
3.	Display: Make a selection by choosing a number:
4.	If-else statement to find user input
5.	Store user input in variable choice
6.	If user selected choice 1 retrieve data from radius, square radius, and multiple by pi store the result in area
7.	If user selected choice 2 retrieve data from radius and pi. Multiple pi and radius and multiple by 2 and store the result in circumference.
8.	Display chosen option on screen rounded to 4 decimal places
*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class Menu
{
   public static void main(String[]args)
   {
      Scanner keyboard = new Scanner (System.in);
      DecimalFormat formatter = new DecimalFormat ("#0.0000");
      DecimalFormat formatter2 = new DecimalFormat ("#0.0");
      
      String header = "circle calculator menu";
      header = header.toUpperCase();
      int choice = 0;
      double area;
      double circumference;
      double radius = 0;
      
      System.out.println(header);
      System.out.println("1) Calculate the Area of a Circle" + "\n2) Calculate the Circumference of a Circle" 
                           + "\n3) Quit the Program");
      System.out.println("\nMake a selection by choosing a number: ");                     
                           
       choice = keyboard.nextInt();                    
                           
      if(choice == 1 || choice == 2)
      {
         System.out.println("Please enter the radius of the circle: ");
         radius = keyboard.nextDouble();
      }
      if(choice == 1)
      {
         area = Math.PI * Math.pow(radius,2);
         System.out.println("The area of the circle with radius " + formatter2.format(radius) + " is: " 
                              + formatter.format(area));
      }
      else if (choice == 2)
      {
         circumference = 2 * radius * Math.PI;
         System.out.println("The circumference of the circle with radius " + formatter2.format(radius) 
                              + " is: " + formatter.format(circumference));                        
      }
      else if(choice != 3)
      {
         System.out.println("You have made an invalid selection.");
      }
      else
      {
         System.out.println("You have chosen to quit the program.");
      }
           
   }
}