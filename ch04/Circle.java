/** 
 * Java Methods p.92 Ex. 8
 * Author: Justin Neil
 */

package ch04;

public class Circle
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
   * @return area of the circle object
   */
  public double getArea()
  {
    return Math.PI * radius * radius;
  }
  

}
