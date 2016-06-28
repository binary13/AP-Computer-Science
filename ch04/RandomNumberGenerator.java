package ch04;

public class RandomNumberGenerator
{
  public static void main(String[] args)
  {
    for (int i=0; i<=100; i++)
    {
      System.out.print((int)(Math.random() * 6) + 1);
    }
  }
}
