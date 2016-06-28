package ch05;

/**
 * Finds the average of three integers as a double
 * @author justin
 *
 */

public class Average3
{
  
  
  public static double average3(int a, int b, int c)
  {
    return (a+b+c)/3.0;
  }
  
  public static void main(String[] args)
  {
    System.out.println(average3(5, 7, 1));
  }

}
