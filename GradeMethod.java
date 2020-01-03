"##0.0)grade1, gr bew/*Aram Mikayelian
CSIS 112 - Winter 2017
Homework #8 - 1*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class GradeMethod
{
   public static void main(String[]args)
      {
         Scanner keyboard = new Scanner (System.in);
         DecimalFormat formatter = new DecimalFormat("##0.0");
         
         double grade1, grade2, grade3, grade4, grade5;
         double average;
         double overallGrade;
         
         System.out.println("Please enter the first score between 0 and 100: ");
         grade1 = keyboard.nextDouble();
         System.out.println("Please enter the second score between 0 and 100: ");
         grade2 = keyboard.nextDouble();
         System.out.println("Please enter the third score between 0 and 100: ");
         grade3 = keyboard.nextDouble();
         System.out.println("Please enter the forth score between 0 and 100: ");
         grade4 = keyboard.nextDouble();
         System.out.println("Please enter the fifth score between 0 and 100: ");
         grade5 = keyboard.nextDouble();
         
         System.out.println("The first letter grade is: " + determineGrade(grade1));
         System.out.println("The second letter grade is: " + determineGrade(grade2));
         System.out.println("The third letter grade is: " + determineGrade(grade3));
         System.out.println("The fourth letter grade is: " + determineGrade(grade4));
         System.out.println("The fifth letter grade is: " + determineGrade(grade5));
         
         average = calcAverage(grade1, grade2, grade3, grade4, grade5);
         overallGrade = determineGrade(average);
         
         System.out.println("\nThe average test score is: " + formatter.format(average)); 
         System.out.println("The average grade is " + determineGrade(average));

      }
      
   public static char determineGrade(double score)
      {
         if(score >= 90)
         {
            return 'A';
         }
         else if(score >= 80)
         {
            return 'B';
         }
         else if(score >= 70)
         {
            return 'C';
         }
         else if(score >=60)
         {
            return 'D';
         }
         else
         {
            return 'F';
         }
        
      }
   public static double calcAverage(double score1,double score2,double score3,double score4,double score5)
      {
         return (score1 + score2 + score3 + score4 + score5)/5; 
      }
}
