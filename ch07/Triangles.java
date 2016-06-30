package ch07;

/**
 * Created by justin on 6/29/16.
 */
public class Triangles
{
  public static void main(String[] args)
  {
    printTrianglesUp(4);
    System.out.println();
    printTrianglesDown(4);
  }

  public static void printTrianglesUp(int n)
  /**
   * Prints a triangle pointing up
   */
  {
    System.out.println("Triangle up: ");
    for (int i = 1; i <= n; i++)
    {
      for (int j = 1; j <= i; j++)
        System.out.print("*");
      System.out.println();
    }
  }

  public static void printTrianglesDown(int n)
  /**
   * Prints a triangle pointing up
   */
  {
    System.out.println("Triangle down: ");
    for (int i = n; i >= 1; i--)
    {
      for (int j = i; j >= 1; j--)
        System.out.print("*");
      System.out.println();
    }
  }

  public static void printTriangle2(int n)
  {
    int padding = n/2;

  }
}
