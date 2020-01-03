/*Program asks user to choose a number 1-5.
Depending on number chosen user wins a prize!


	1. Create variables 
	2. Create scanner
	3. Display: Choose a number 1-5
	4. Wait for user input
	5. Store user input in variable named inData
Display: Congratulations! You have won -------*/
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Prize
{
   public static void main(String[]args)
   {
      Scanner keyboard = new Scanner (System.in);
      
      int num1 = 2000;
      int num2 = 5600;
      int num3 = 8870;
      int num4 = 60;
      int num5 = 1000000;
      
      String cashPrize;
		cashPrize = JOptionPane.showInputDialog("Hello player! Pick a number 1-5 to win a prize!");
    
		JOptionPane.showMessageDialog(null, "Congratulations you won " + num1 + "!");
		
		System.exit(0);
      
      
   }
   
}