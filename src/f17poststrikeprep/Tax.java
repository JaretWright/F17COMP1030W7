
package f17poststrikeprep;

import java.util.Scanner;

/**
 *
 * @author JWright
 */
public class Tax {
    public static void main(String[] args)
    {        
        for (int i=1 ; i<=2; i++)
        {
            //prompt the user to enter sale amount
            double saleAmount = promptUserForAmount();

            //calculate the tax
            double tax = calculateTax(saleAmount);

            //display the results
            System.out.printf("Sale Amount: $%6.2f%n", saleAmount);
            System.out.printf("Tax:         $%6.2f%n", tax);
            System.out.printf("Total:       $%6.2f%n", saleAmount+tax);
        }
        
    }
    
    public static double promptUserForAmount()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.printf("Enter the sale amount: ");
        return keyboard.nextDouble();
    }
    
    public static double calculateTax(double total)
    {
        return total*0.13;
    }
}
