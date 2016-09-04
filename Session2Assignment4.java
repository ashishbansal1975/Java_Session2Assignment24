
// Write a program to find the highest among the given 3 numbers.

import java.util.Scanner;
public class Session2Assignment4
{
    public static void main(String [] args) 
    {

       Scanner sc = new Scanner(System.in);      
       int num1, num2, num3;
     
       System.out.print("Enter the first number: ");
       num1 = sc.nextInt();
       System.out.print("Enter the second number: ");
       num2 = sc.nextInt();     
       System.out.print("Enter the third number: ");
       num3 = sc.nextInt();  

       if ( num1 > num2 && num1 > num3 )
           System.out.println("First number "+ num1+ " is highest.");
        else if ( num2 > num1 && num2 > num3 )
            System.out.println("Second number "+ num2+ " is highest.");
        else if ( num3 > num1 && num3 > num2 )
             System.out.println("Third number "+ num3+ " is highest.");
        else   
            System.out.println("Entered numbers are not distinct.");

    }
}
        