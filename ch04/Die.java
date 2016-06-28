package ch04;

public class Die
{
  public int sides;
  
  public Die()
  {
    sides = 6;
  }
  
  public Die(int s)
  {
    sides = s;
  }
  
  public int roll()
  {
    return ((int)(Math.random() * sides) + 1);
  }
}
