/* Aram Mikayelian
CSIS 112 - Winter 2017
Homework #2 - Q3
   1. Create variables for (firstNum, secondNum, thirdNum, average, total)
	2. Store values in firstNum, secondNum, thirdNum
	3. Retrieve data from firstNum, secondNum, thirdNum
	4. Add values of variables and store total in variable named "total"
	5. Retrieve data from variable named "total" and divide by 3 and store result in variable named "average"
	6. Display the value of variable named "total"
   7. Display the value of variable named "average" */
public class Average
{
   public static void main(String[]args)
   {
      double firstNum;
      double secondNum;
      double thirdNum;
      double total;
      double average;
      
      firstNum = 105.62;
      secondNum = 89.352;
      thirdNum = 98.67;
      
      total = firstNum + secondNum + thirdNum;
      average = total/3.0;
      System.out.println("The total is " + total + "\nThe average is " + average);
   }
}