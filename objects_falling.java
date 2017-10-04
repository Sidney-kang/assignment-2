/****************************************************************************
 *
 * Created on : 22 Sept. 2017
 * Created for : ICS3UR
 * Weekly Assignment - Assignment #2 
 * This program calculates the height of an object dropped from a 100 m cliff  
 *   based on the number of seconds that has passed. (inputed by the user)
 *
 ****************************************************************************/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class assignment2b
{
    //constant
    static double GRAVITY = 9.81;

    static double CalculateHeightOfBall(double secondsPassed)
    {
        double heightOfBall = 100.0 - (1.0/2.0) * (GRAVITY * (secondsPassed * secondsPassed));
        return heightOfBall;
    }
           
    public static void main(String[] args)
    {
        double secondsPassed;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of seconds since the object was dropped, in seconds."); 
      
        try
        {
         secondsPassed = Double.parseDouble(br.readLine());  
         double heightOfBall = CalculateHeightOfBall(secondsPassed);
         System.out.println("The height above the ground is: " + heightOfBall + "m");                     
        }
        catch(Exception nfe)
        {
           System.err.println("Invalid input!");
        }
    }
}
