/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package f17poststrikeprep;

import java.util.Scanner;

/**
 *
 * @author jwright
 */
public class Class7 {
    public static void main(String[] args)
    {
        System.out.print("Enter the number of rows: ");
        Scanner keyboard = new Scanner(System.in);
        int rows = keyboard.nextInt();
        
        for (int i=1; i<=rows; i++)
        {
            for (int j=1; j<=i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
