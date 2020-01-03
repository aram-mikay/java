/*Aram Mikayelian
CSIS 112 - Winter 2017
Homework #3 - Q4

	1. Import Dialog box utility
	2. Create variables (testNum, correctNum, score, inTestNum, inCorrectNum, testNumInt, correctNumInt)
	3. Display : How many questions were on the test?
	4. Wait for user input
	5. Store user input in variable named testNum
	6. Display: How many questions did you get correct?
	7. Wait for user input
	8. Store user input In variable named correctNum
	9. Retrieve data from totalPoint and testNum
  10. Divide testNum from totalPoint and store result in variable named score
  11. Convert testNum and correctNum to integer type
  12. Display students score on screen */


import javax.swing.JOptionPane;

public class StudentScore
{
   public static void main(String[]args)
   {
      String inTestNum;
      String inCorrectNum;
      double testNum;
      double correctNum;
      double score;
      double totalPoint = 100;
      int testNumInt;
      int correctNumInt;
      
      inTestNum = JOptionPane.showInputDialog("How many questions were on the test?");
      testNum = Double.parseDouble(inTestNum);
      
      inCorrectNum = JOptionPane.showInputDialog("How many questions did you answer correctly?");
      correctNum = Double.parseDouble(inCorrectNum);
      
      score = (totalPoint/testNum)* correctNum;
      
           
      testNumInt = (int)testNum;
      correctNumInt = (int) correctNum;
      
      JOptionPane.showMessageDialog(null, "You got " + correctNumInt + " out of " + testNumInt + " correct. Your percentage is " + score + "%");
   }
}