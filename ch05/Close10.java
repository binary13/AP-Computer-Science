package ch05;

/**
 * Created by justin on 6/28/16.
 */
public class Close10 {

    public static String close10(int a, int b)
    {
        int aDiff = Math.abs(a - 10);
        int bDiff = Math.abs(b - 10);

        String result = "Comparing " + a + " and " + b + ": ";

        if (aDiff == bDiff) result += "Tie!";
        else if (aDiff < bDiff) result += a + " is closer.";
        else result += b + " is closer.";
        return result;
    }

    public static void main(String[] args) {
        System.out.println(close10(5, 11));
        System.out.println(close10(12, 19));
        System.out.println(close10(6, 1));
        System.out.println(close10(5, 15));
    }
}
