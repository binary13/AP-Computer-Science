package ch05;

public class Close10 {

  public static int close10(int a, int b)
  {
      int adiff = Math.abs(a - 10);
      int bdiff = Math.abs(b - 10);

      if (adiff == bdiff) return 0;
      if (adiff > bdiff) return a;
      return b;
  }

  public static void main(String[] args) {
      System.out.println(close10(12, 18));
  }
}