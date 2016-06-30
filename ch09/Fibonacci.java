package ch09;

/**
 * Created by justin on 6/29/16.
 */
public class Fibonacci
{

  public static void main(String[] args)
  {
    int[] fibNums = fibArray(20);

    for(int i : fibNums)
      System.out.print(i + "  ");
  }

  public static int[] fibArray(int n)
  {
    int a = 0, b = 1, temp;
    int[] result = new int[n+1];

    for(int i = 0; i <= n; i++)
    {
      result[i] = fibRecursive(i);
      //temp = a + b;
      //a = b;
      //b = temp;
    }

    return result;
  }

  public static int fibRecursive(int n)
  {
    if ( n < 2 ) return n;
    else return (fibRecursive(n-1) + fibRecursive(n-2));
  }

}
