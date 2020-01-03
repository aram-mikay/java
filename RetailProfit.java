/*Aram Mikayelian
CSIS 112 - Winter 2017
Homework #3 - Q2

	1. Import dialog box utility
	2. Create variables profit, retailPrice, inRetailPrice, percentage
	3. Assign value .4 to variable percentage
	4. Display: What is the retail price for a circuit board?
	5. Wait for user input
	6. Store user input in variable "inRetailPrice"
   7. Convert string inRetialPrice to double and store in retailPice variable
	8. Retrieve data in variables percentage and retail price
	9. Multiply values in variables percentage and retail price and store result in variable named profit
  10. Display value in variable profit */
   
import javax.swing.JOptionPane;

public class RetailProfit
{
   public static void main(String[]args)
   {
      String inRetailPrice;
      double retailPrice;
      double profit;
      double percentage;
      
      percentage = .4;
      
      inRetailPrice = JOptionPane.showInputDialog("What is the retail price for a circuit board?");
      retailPrice = Double.parseDouble(inRetailPrice);
      profit = retailPrice * percentage;
      
      System.out.println("The profit on a " + retailPrice + " circuit board is: " + profit);
   }
}