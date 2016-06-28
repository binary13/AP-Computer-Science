/**
 * This program prompts the user to enter his or her
 * first name and last name and displays a greeting message.
 * Author: Maria Litvin
 */
package ch02;

import java.util.Scanner;

public class Greetings2
{
  public static void main(String[] args)
  {
    Scanner kboard = new Scanner(System.in);

    System.out.print("Enter your first name: ");
    String firstName = kboard.nextLine();

    System.out.print("Enter your last name: ");
    String lastName = kboard.nextLine();
    
    System.out.print("Enter your age: ");
    int age = kboard.nextInt();
    
    System.out.println("Enter your GPA: ");
    float gpa = kboard.nextFloat();

    System.out.println("Hello, " + firstName + " " + lastName + "!");
    System.out.println("Next year you will be " + (age + 1) + ".");
    System.out.println("Welcome to Java!");
    
    if (gpa > 3.2)
      System.out.println(gpa + " is a great GPA!");
    else
      System.out.println(gpa + " is not great. Practice more Java!");

    kboard.close();
  }
}
