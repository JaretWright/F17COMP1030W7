package f17poststrikeprep;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author jwright
 */
public class InputValidationExample {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        
        int temperature;
        
        do{
            System.out.printf("%nEnter the temperature outside: ");
            try{
                temperature= keyboard.nextInt();
            }
            catch(InputMismatchException e)
            {
                System.out.println("Sorry, only numeric, whole numbers can be input");
                temperature = 1000;
                keyboard.nextLine();
            }
        } while (invalidTemp(temperature));
        
        
        if (temperature < 0)
            System.out.println("Let's going skiing");
        else
            System.out.println("We want more snow!");
    }
    
    /**
     * The goal of this method is to ensure the temperature range
     * is between -40 and +50
     */
    public static boolean invalidTemp(int temp)
    {
        if (temp < -40 || temp > 50)
        {
            System.out.println("Sorry temperatures must be in the range -40C to +50C");
            return true;
        }
        else
            return false;
        
    }
}
