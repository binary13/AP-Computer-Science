package ch04;

public class CircleTest
{

  public static void main(String[] args)
  {
    Circle circle1 = new Circle(2);
    Circle circle2 = new Circle(4);
    Circle circle3 = new Circle(12);
    
    System.out.println("The radius of circle1 is " + circle1.getRadius());
    System.out.println("The area of circle1 is " + circle1.getArea() + "\n");
    
    System.out.println("The radius of circle2 is " + circle2.getRadius());
    System.out.println("The area of circle2 is " + circle2.getArea() + "\n");
    
    System.out.println("The radius of circle3 is " + circle3.getRadius());
    System.out.println("The area of circle3 is " + circle3.getArea() + "\n");

  }

}
