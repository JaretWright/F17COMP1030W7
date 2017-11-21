
package f17poststrikeprep;

import java.util.Scanner;

/**
 *
 * @author JWright
 */
public class HeightOfBridge {

    public static void main(String[] args)
    {
       /* System.out.printf("How many seconds did it take to get to the ground?: ");
        Scanner keyboard = new Scanner(System.in);
        double seconds = keyboard.nextDouble();
        
        System.out.printf("Based on %.2f seconds to fall, the bridge is %.2f m tall%n",
                                    seconds, calcHeight(seconds));
        System.out.printf("A brick would have been travelling at %.2f m/s when it hit the ground%n", calcSpeed(seconds));
        System.out.printf("Which is %.1f KPH %n", convertToKPH(calcSpeed(seconds)));*/
        
        displayChartOfHeights();
        
    }
    
    
    public static void displayChartOfHeights()
    {
        System.out.printf("%n%n%-6s %-10s %-15s %-15s%n", "Time", "Height(m)", "m/s at impact", "KPH at impact");
        for (int time=1; time<=5; time++)
        {
            System.out.printf("%3d %10.1f %13.1f %15.1f%n", time,
                                                          calcHeight(time),
                                                          calcSpeed(time),
                                                          convertToKPH(calcSpeed(time)));
        }
    }
    
    
    
    /**
     * Calculate the height of an object based on the # of seconds it takes for
     * an object to fall.  Assumes the object never hits terminal velocity
     * @param secondsToFall
     * @return 
     */
    public static double calcHeight(double secondsToFall)
    {
        return 9.8*secondsToFall*secondsToFall;
    }
    
    
    /**
     * This method will calculate the speed an object is travelling when it 
     * hits the ground after being dropped with an initial velocity of 0.
     * @param secondsToFall
     * @return 
     */
    public static double calcSpeed(double secondsToFall)
    {        
        //formula for velocity (assuming initial velocity = 0) V=sqrt(2dg).  
        double distance = calcHeight(secondsToFall);
        return Math.sqrt(2*distance*9.81);
    }
    
    
    /**
     * This method will convert meters per second into KPH
     * @param metersPerSecond
     * @return 
     */
    public static double convertToKPH(double metersPerSecond)
    {
        return metersPerSecond * 3.6;
    }
}
