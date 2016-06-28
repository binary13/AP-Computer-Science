package Homework;

/**
 * Created by justin on 6/28/16.
 */
public class Close10 {

    public static String close10(int a, int b)
    {
        int aDiff = Math.abs(a - 10);
        int bDiff = Math.abs(b - 10);

        if (aDiff == bDiff) return "Tie!";
        if (aDiff > bDiff) return a + " is closer.";
        return b + " is closer.";
    }

    public static void main(String[] args) {
        System.out.println(close10(5, 11));
        System.out.println(close10(12, 19));
        System.out.println(close10(6, 1));
        System.out.println(close10(5, 15));
    }
}
