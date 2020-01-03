/*Aram Mikayelian
CSIS 112 - Winter 2017
Homework #3 - Q3

	1. Import scanner utility
	2. Create variables ( name, carSold, bonus)
	3. Display: Please enter the name of the salesperson
	4. Wait for user input
	5. Store input in variable "name"
	6. Display: How many cars did the salesperson sell this month?
	7. Wait for user input
	8. Store input in variable "carSold"
	9. Retrieve data from variables named bonus and carSold
  10. Multiply values and store result in variable bonus
  11. Display the name of salesperson and bonus for the month*/

import java.util.Scanner;

public class CarSales
{
   public static void main(String[]args)
   {
      Scanner keyboard = new Scanner (System.in);
      
      String name;
      int carSold;
      double bonus;
      
      bonus = 1000;
      
      System.out.println("What is the name of the Sales Person?");
      name = keyboard.nextLine();
      
      System.out.println("How many cars did " + name + " sell this month?");
      carSold = keyboard.nextInt();
      
      bonus *= carSold;
      
      System.out.println(name + "'s" + " bonus for the month is " + "$" + bonus + ".");
   }
}