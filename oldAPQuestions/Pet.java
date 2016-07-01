package oldAPQuestions;

/**
 * Created by justin on 6/30/16.
 */
public abstract class Pet
{

  private String name;

  public Pet(String petName)
  {
    name = petName;
  }

  public String getName()
  {
    return name;
  }

  public abstract String speak();

}
