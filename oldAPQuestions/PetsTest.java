package oldAPQuestions;

/**
 * Created by justin on 6/30/16.
 */
public class PetsTest
{

  public static void main(String[] args)
  {
    Pet fido = new Dog("Fido");
    Pet rex = new LoudDog("Rex");
    Pet mittens = new Cat("Mittens");

    Pet[] pets = {fido, rex, mittens};

    for(Pet pet : pets)
      System.out.printf("%s says \"%s\"\n", pet.getName(), pet.speak());
  }

}
