package ch07;

/**
 * Created by justin on 6/29/16.
 */
public class Checkerboard
{
  public static void main(String[] args)
  {
    printCheckerboard(7);
  }

  public static void printCheckerboard(int n)
  {
    for(int r = 1; r <= n; r++)
    {
      for(int c = 1; c <= n; c++)
      {
        if(isEven(r) == isEven(c)) System.out.print("# ");
        else System.out.print("o ");
      }
      System.out.println();
    }
  }

  public static boolean isEven(int n)
  {
    return n%2==0;
  }
}
