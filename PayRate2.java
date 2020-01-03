/*Aram Mikayelian
CSIS 112 - Winter 2017
HW #7 -2 */
 
 import java.util.Scanner;
 import java.text.DecimalFormat;
 
 public class PayRate2
  {
   public static void main(String[]args)
   {
      Scanner keyboard = new Scanner (System.in);
      DecimalFormat formatter = new DecimalFormat("$#,##0.00");
      
      int numDays = 1;
      int day = 1;
      double payPerDay = 1.00;
      double multiDay;
      double totalPay = 0;
     
     
     System.out.println("Please enter the number of days you worked: ");
     numDays = keyboard.nextInt(); 
     
     do
     {
      if(numDays < 1)
      {
         System.out.println("You have entered an invalid number of days.");
         System.out.println("Please enter the number of days you worked: ");
         numDays = keyboard.nextInt();
      
      }
    }while(numDays < 1);
      
      
     for(int counter = 1; counter <= numDays; ++counter)
     {
      if(numDays == 1 )
      {
      totalPay = 1.00;
      System.out.println("Pay for day #" + day + ": " + formatter.format(totalPay));
      }
      else
     {
         
       System.out.println("Pay for day #" + day + ": " + formatter.format(payPerDay));
       ++day;
       payPerDay *= 2.00;
       totalPay = payPerDay - 1;

     }
           
        
     }
      
      System.out.println("\nTOTAL PAY FOR " + numDays + " DAYS: " + formatter.format(totalPay));
   }
 }  
            
/*For the first day worked a person earns $1.00 for the entire day.  
For the second day worked the person's daily pay is doubled to $2.00.  
For the third day worked the person's daily pay is doubled again to $4.00.  
For each consecutive day a person works their daily pay is doubled in this way.

 Write a program that asks a user to enter the number of days they worked and 
 then calculates the pay they earned for each day along with the total pay they earned 
 for all of the days.  
 The program output should be the pay for each day and the total pay earned for all the days.

 Input Validation:  Do not let the user enter a number of days that is less than 1.  
 Use a loop to prompt them to enter another number for the number of days if they 
 enter a number that is less than 1.

 Make sure and format your output.*/
