/*Aram Mikayelian
CSIS 112 - Winter 2017
Homework #3 - Q1

	1. Import scanner utility
	2. Create variables (testOne, testOnein, testTwo, testTwoin, testThree, testThreein, average)
	3. Display: Please enter the first test score: 
	4. Wait for user input
	5. Store user input in variable testOne
	6. Display: Please enter the second test score:
	7. Wait for user input
	8. Store user input in variable named testTwo
	9. Display: Please enter the third test score:
	10. Wait for user input
	11. Store user input in variable named testThree
	12. Retrieve data from variables testOne, testTwo, testThree
	13. Add all value and divide by 3 and store the result in the variable named "average"
   15. Use cast operator for test score variables to convert to integer
   14. Display results of all three (int)test scores along with average*/
   
import java.util.Scanner;

public class TestScores
{
   public static void main(String[]args)
   {
      Scanner keyboard = new Scanner (System.in);
      int testOnein;
      int testTwoin;
      int testThreein;
     
      double testOne;
      double testTwo;
      double testThree;
      double average;
      
    
      System.out.println("Please enter the first test score: ");
      testOne = keyboard.nextDouble ();
     
      
      System.out.println("Please enter the second test score: ");
      testTwo = keyboard.nextDouble ();
      
      
      System.out.println("Please enter the third test score: ");
      testThree = keyboard.nextDouble ();
      
      
      average = (testOne + testTwo + testThree)/ 3;
      
      testOnein =(int)testOne;
      testTwoin =(int)testTwo;
      testThreein =(int)testThree;
      
      System.out.println("The average of the scores, " + testOnein + ", " + testTwoin + ", and " + testThreein + " is " + average);
   }
}