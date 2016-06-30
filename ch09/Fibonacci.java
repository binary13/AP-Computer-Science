package ch09;

/**
 * Created by justin on 6/29/16.
 */
public class Fibonacci
{

  public static void main(String[] args)
  {
    int[] fib6 = fibonacci(6);

    for(int i : fib6)
      System.out.print(i + "  ");
  }

  public static int[] fibonacci(int n)
  {
    int a = 0, b = 1, temp;
    int[] result = new int[n+1];

    for(int i = 0; i <= n; i++)
    {
      result[i] = a;
      temp = a + b;
      a = b;
      b = temp;
    }

    return result;
  }

}
