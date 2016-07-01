package ch09;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by justin on 6/30/16.
 */
public class ArrayPractice
{
  public static void main(String[] args)
  {
    // Declare an array
    int[] nums = {12, 17, 42, 14, 72, 96, -3, 14, 14, -276, 87, 88, 493, 42, 23, 35};

    // Print the number of elements
    System.out.println("Number of elements in nums: " + nums.length);

    // Print array forward
    System.out.print("Before shift: ");
    for(int i = 0; i < nums.length; i++)
    {
      System.out.print(nums[i] + "  ");
    }
    System.out.println();

    // Shift each element one to the left
    int firstElem = nums[0];
    int lastIndex = nums.length-1;
    for(int i = 0; i < lastIndex; i++)
      nums[i] = nums[i+1];
    nums[lastIndex] = firstElem;

    // Print array using for-each
    System.out.print("After shift: ");
    for(int n : nums)
      System.out.print(n + "  ");
    System.out.println();

    // Print backward
    System.out.print("Backward:   ");
    for(int i = nums.length-1; i>=0; i--)
      System.out.print(nums[i] + "  ");
    System.out.println();

    // Find the sum
    int sum = 0;
    for(int n : nums)
      sum += n;
    System.out.println("Sum of nums: " + sum);

    // Find the maximum value
    int max = nums[0];
    for (int n : nums)
    {
      if (n > max) max = n;
    }
    System.out.println("The maximum value is: " + max);

    // Find the index of the minimum value
    int min = nums[0];
    int minIndex = 0;
    for(int i = 0; i < nums.length; i++)
    {
      if(nums[i] < min)
      {
        min = nums[i];
        minIndex = i;
      }
    }
    System.out.println("The minimum value is: " + min);
    System.out.println("The index of the minimum value is: " + minIndex);

    // TODO Print all elements which are repeated
//    int notInArray = max + 100;
//    int[] repeated = new int[nums.length/2];
//    for(int n : repeated)
//      n = notInArray;
//
//    System.out.print("Repeated: ");
//    for(int i = 0; i < nums.length; i++)
//    {
//      for(int j = 0; j < nums.length; j++)
//      {
//        if(nums[i] == nums[j] && i < j && !(repeated.)
//        {
//
//          System.out.print(nums[j] + "  ");
//          break;
//        }
//      }
//    }
//    System.out.println();

    // TODO Print the element which occurs the most
  }
}
