package ch06;

/**
 * Created by justin on 6/29/16.
 */
public class DieTest {
  public static void main(String[] args) {
    Die die = new Die();

    for(int i = 0; i < 20; i++) {
      die.roll();
      System.out.println("Rolled: " + die.getNumDots());
    }
  }
}
