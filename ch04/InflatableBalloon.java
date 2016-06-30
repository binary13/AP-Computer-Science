package ch04;

/**
 * Created by justin on 6/29/16.
 */
public class InflatableBalloon extends Balloon
{
  public void inflate(int percentage)
  {
    setRadius((int)Math.round(getRadius()*(1 + 0.01*percentage)));
  }
}
