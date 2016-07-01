package oldAPQuestions;

/**
 * Created by justin on 6/30/16.
 */
public class LoudDog extends Dog
{

  public LoudDog(String dogName)
  {
    super(dogName);
  }

  public String speak()
  {
    return super.speak() + " " + super.speak();
  }

}
