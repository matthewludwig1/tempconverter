/*
    Matthew Ludwig
    7 March 2019 
    This program converts temperatures from either celcius to fahrenheit
    or vice-versa.
 */

package tempconversions;

import java.util.Scanner;

/**
 * Performs a temperature conversion.
 */
public class TempConversions {

       public static void fahrenheitToCelsius(double temp) {
               double cTemp;
               System.out.print("Enter a Fahrenheit temperature: ");

               cTemp = (double)5/(double)9*(temp- 32);
               System.out.println("The Celsius temperature is " + cTemp);
       }


       public static void celsiusToFahrenheit(double temp) {
               double fTemp;
               System.out.print("Enter a Celsius temperature: ");
               fTemp = (double)9/(double)5*temp + 32;
               System.out.println("The Fahrenheit temperature is " + fTemp);
       }


       public static void main(String[] args) {
               int choice;
               Scanner input = new Scanner(System.in);
               double temp;
               /* Prompt user for type of conversion */
               System.out.println("1. Fahrenheit to Celsius conversion.");
               System.out.println("2. Celsius to Fahrenheit conversion.");
               System.out.print("Enter your choice: ");
               choice = input.nextInt();
               
               if (choice == 1) {
                input = new Scanner(System.in);
                System.out.println("Enter a Fahrenheit temperature: ");
                temp = input.nextDouble();
                fahrenheitToCelsius(temp);
                input.close();
               } 
               else {
                   input = new Scanner(System.in);
                   System.out.println("Enter a Celcius temperature: ");
                   temp = input.nextDouble();
                   celsiusToFahrenheit(temp);
                   input.close();
               }
               input.close();
       }
}
