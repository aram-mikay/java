import java.text.DecimalFormat;
import java.util.Scanner;
public class Test

{
   public static void main(String[]args)
   {
     Scanner keyboard = new Scanner (System.in); 
     DecimalFormat formatter = new DecimalFormat ("$##,#00.00");
     
      int money;
      money = 0;
      System.out.println("How much money did you earn last year?");
      money = keyboard.nextInt();
      
      System.out.println("Last year I made " + formatter.format(money));
      System.out.println("This is just a test");
      
   }
}