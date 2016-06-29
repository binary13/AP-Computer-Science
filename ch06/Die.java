package ch06;

/**
 * Base six-sided Die class extended by RollingDie for craps game.
 *
 * Created by justin on 6/28/16.
 */
public class Die
{

  private int numDots;

  public void roll()
  {
    numDots = (int)(Math.random() * 6) + 1;
  }

  public int getNumDots()
  {
    return numDots;
  }
}
