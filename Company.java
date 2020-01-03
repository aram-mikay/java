/*Aram Mikayelian
CSIS 112 - Winter 2017
Homework #2 - Q4
	1. Create variables (Sales, Percentage, yearIncome)
	2. Assign values to variables (Sales, Percentage, yearIncome)
	3. Retrieve data from variables named "Sales" and "Percentage" 
	4. Multiply values in variables "Sales" and "Percentage" and store result in variable "yearIncome"
   5. Display the program results from "yearIncome"*/


import javax.swing.JOptionPane;

public class Company
{
   public static void main(String[]args)
	{
	   String name;
		name = JOptionPane.showInputDialog("What's your name?");  
		JOptionPane.showMessageDialog(null, "Hello " + name);
		
		System.exit(0);
     
      double sales;
      double percentage;
      double yearIncome;
      
      sales = 500000;
      percentage = .62;
      yearIncome = sales * percentage;
      System.out.println("This year the East Coast Division will generate $" + yearIncome + " in sales.");
      }
}
