/** 
 * Java Methods p.92 Ex. 8
 * Author: Justin Neil
 */

package ch10;

public class Circle
{
  private static int nextId = 1;
  private int radius, Id;
  
  public Circle(int r)
  {
    Id = nextId;
    nextId++;
    radius = r;
  }

  /**
   * @return static value nextId
   */
  public static String getNextId()
  {
    return "nextId = " + nextId;
  }

  /**
   * @return radius of the circle object
   */
  public int getRadius()
  {
    return radius;
  }
  
  /**
   * @return area of the circle object
   */
  public double getArea()
  {
    return Math.PI * radius * radius;
  }
  
  public String toString()
  {
    return "Circle: radius = " + radius + ", Id = " + Id;
  }
}
