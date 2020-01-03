/*Aram Mikayelian
CSIS 112 - Winter 2017
Homework #7 - 1*/

//HyperGrade is giving me a small spacing issue... 
//I spent too much time trying to find where to possibly place a \n for it to work.

import java.util.Scanner;
import java.text.DecimalFormat;

 
public class HotelFloors
{
   public static void main(String[]args)
   {
         Scanner keyboard = new Scanner (System.in);
         DecimalFormat formatter = new DecimalFormat("##0%");
         
         int maxFloors = 0;
         int floorNum = 1;
         int numRooms = 0;
         int occRooms = 0;
         int totalRooms = 0;
         int totalOccRooms = 0;
         double percentOcc = 0;
         
  
            
        do
         {
         
            System.out.println("Please enter the number of floors in the hotel: ");
            maxFloors = keyboard.nextInt();
            
            if(maxFloors < 1)
            {  
                System.out.println("You have entered an invalid number of floors.\n");
            }
            
    
         }while(maxFloors < 1);
         
        
         for( int counter = 1; counter <= maxFloors; ++counter) 
         {
            while(floorNum <= maxFloors)
            {
            if(floorNum == 13)
               {
                  ++floorNum;
               }

               System.out.println("Please enter the number of rooms on floor #: " + floorNum);
               numRooms = keyboard.nextInt();
               
               
              
                  if(numRooms < 10)                  
                  {
                     System.out.println("You have entered an invalid number of rooms.\n");
                  }
           
                  else
                  {
                     totalRooms += numRooms;
                     
                     System.out.println("Please enter the number of occupied rooms on floor #: " + floorNum);
                     occRooms = keyboard.nextInt();
                     
                     totalOccRooms += occRooms;
                     
                      ++floorNum;         
                  }

               }
                  
                                           
               percentOcc = (double)totalOccRooms / (double)totalRooms;
    
      }
      
      System.out.println("\nThe hotel has a total of " + totalRooms + " rooms.\n" +
                                   totalOccRooms + " of the rooms are occupied.\n" +
                                   formatter.format(percentOcc) + " of the rooms are occupied.");   
   }
}
