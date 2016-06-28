package ch04;

public class DieTest
{

  public static void main(String[] args)
  {
    Die d6 = new Die();
    Die d20 = new Die(20);
    
    System.out.println("Twenty rolls with the d6:");
    for(int i = 0; i<20; i++) 
    {
      System.out.println(d6.roll());
    }
    
    System.out.println("Twenty rolls with the d20:");
    for(int i = 0; i<20; i++) 
    {
      System.out.println(d20.roll());
    }
  }

}
