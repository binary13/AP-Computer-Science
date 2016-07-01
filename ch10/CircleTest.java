package ch10;

public class CircleTest
{
  public static void main(String[] args)
  {
    Circle circle1 = new Circle(2);
    Circle circle2 = new Circle(4);
    Circle circle3 = new Circle(12);
    
    System.out.println(circle1.toString());
    System.out.println(circle2.toString());
    System.out.println(circle3.toString());

    System.out.println(Circle.getNextId());
  }
}
