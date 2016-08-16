package chomp;

public class CharMatrixTest
{

  public static void main(String[] args)
  {
    CharMatrix m1 = new CharMatrix(3,4);
    CharMatrix m2 = new CharMatrix(3,4, 'k');
    System.out.println("Here it is:");
    
    System.out.println(m1);  // will print nothing, as spaces don't show
    System.out.println(m2);
    System.out.println("the end");
  }

}
