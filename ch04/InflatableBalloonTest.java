package ch04;

/**
 * Created by justin on 6/29/16.
 */
public class InflatableBalloonTest
{
  public static void main(String[] args)
  {
    InflatableBalloon myBalloon = new InflatableBalloon();

    System.out.println("My balloon has radius " + myBalloon.getRadius());
    System.out.println("Inflating balloon by 40%...");
    myBalloon.inflate(40);
    System.out.println("My balloon has radius " + myBalloon.getRadius());
  }
}
