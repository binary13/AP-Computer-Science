package ch09;

import java.util.ArrayList;

/**
 * Created by justin on 6/30/16.
 */
public class TwoDArrayPractice
{
  public static void main(String[] args)
  {
    double[][] b = {{0.0, 0.1, 0.2},{1.0, 1.1, 1.2},{2.0, 2.1, 2.2}};

    // Print number of rows
    System.out.println("Number of rows: " + b.length);

    // Print number of columns
    System.out.println("Number of columns: " + b[0].length);

    // Display all elements
    for (int r = 0; r < b.length; r++)
    {
      System.out.print("{ ");
      for (int c = 0; c < b[r].length; c++)
      {
        System.out.print(b[r][c] + " ");
      }
      System.out.println("}");
    }




//    ArrayList myList = new ArrayList();
//    myList.add(12);
//    myList.add(42);
//    System.out.println(myList.toString());
  }

  /**
   * Displays two-dimensional double array using for-each loops
   * @param b
   */

  public static void print2d(double[][] b)
  {
    for(double[] row : b)
    {
      System.out.print("{");
      for (double val : row)
      {
        System.out.print(" " + String.format("%1f", val) + " ");
      }
      System.out.println("}");
    }
  }
}
