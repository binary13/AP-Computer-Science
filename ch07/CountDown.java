package ch07;

import java.util.Scanner;

/**
 * Created by justin on 6/29/16.
 */
public class CountDown
{
  public static void main(String[] args)
  {
    System.out.print("Enter a starting number: ");
    Scanner kb = new Scanner(System.in);
    int start = kb.nextInt();
    countDown(start);
  }

  public static void countDown(int n)
  {
    for(int i=n; i > 0; i--)
    {
      System.out.print(i + "... ");
    }

    System.out.println("\nBlast off!");
  }
}
