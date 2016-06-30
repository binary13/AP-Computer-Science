package ch09;

import ch04.Circle;

/**
 * Created by justin on 6/29/16.
 */
public class CircleArray
{
  public static void main(String[] args)
  {
    Circle c1 = new Circle(4);
    Circle c2 = new Circle(1);
    Circle c3 = new Circle(9);
    Circle c4 = new Circle(2);

    Circle[] circles = {c1, c2, c3, c4};

    for (Circle circle : circles)
      System.out.println(circle);
  }
}
