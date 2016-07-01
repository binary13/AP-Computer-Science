/** 
 * Circle implementing Interface
 * Author: Justin Neil
 */

package ch12;

public class Circle implements Comparable<Circle>
{
  private int radius;
  
  public Circle(int r)
  {
    radius = r;
  }
  
  /**
   * @return radius of the circle object
   */
  public int getRadius()
  {
    return radius;
  }

  /**
   * Compare radii of Circles this and other
   * @param other
   * @return positive value if this.radius > other.radius
   */
  public int compareTo(Circle other)
  {
    return radius - other.radius;
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
    return "Circle: radius = " + radius;
  }

}
