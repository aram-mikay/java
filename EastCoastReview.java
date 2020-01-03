import java.text.DecimalFormat;
import java.util.Scanner;

public class EastCoastReview
{
   public static void main(String[]args)
   {
   
   Scanner keyboard = new Scanner (System.in);
   DecimalFormat formatter = new DecimalFormat("$#,##0.00");
   
   int sales;
   double salesDouble;
   double percentage;
   double profit;
   
   
   System.out.println("How many sales did the East Coast Divison have this year?");
   sales = keyboard.nextInt();
   
   System.out.println("What is the profit made on each sale?");
   percentage = keyboard.nextDouble();
   
   salesDouble = (double)sales;
   
   profit = sales * percentage;
   
   System.out.println("The East Coast Divison made a total profit of: " + formatter.format(profit));   
   
   
   }
}