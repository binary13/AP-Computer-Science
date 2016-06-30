package ch05;

/**
 * Created by justin on 6/29/16.
 */
public class MaxOf3
{
  public static int maxOf3(int a, int b, int c)
  {
    System.out.println(String.format("Finding the max of %d, %d, and %d.", a, b, c));
    return Math.max(Math.max(a, b), c);
  }

  public static void main(String[] args)
  {
    System.out.println(maxOf3(23, 12, 76));
  }
}
