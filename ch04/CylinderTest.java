package ch04;

/**
 * Test the Cylinder class
 * Java Methods p.92 ex.8b
 * @author justin
 *
 */
public class CylinderTest
{
  public static void main(String[] args)
  {
    Cylinder cyl1 = new Cylinder(1, 12);
    Cylinder cyl2 = new Cylinder(2, 10);
    Cylinder cyl3 = new Cylinder(4, 5);
    
    System.out.println("The volume of cyl1 is " + cyl1.getVolume());
    System.out.println("The volume of cyl2 is " + cyl2.getVolume());
    System.out.println("The volume of cyl3 is " + cyl3.getVolume());
  }

}
