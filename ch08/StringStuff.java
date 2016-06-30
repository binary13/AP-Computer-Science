package ch08;

/**
 * Created by justin on 6/29/16.
 */
public class StringStuff
{
  public static void main(String[] args)
  {
    String quote = "To be or not to be, that is the question.";
    String quote2 = quote;
    quote2 = "hi";

    System.out.println(quote);
    System.out.println("Quotation length: " + quote.length());
    System.out.println(quote.substring(0, 8));
    System.out.println(quote.substring(9));
    System.out.println(quote.indexOf("not to be"));
    System.out.println(quote.compareTo("Whether 'tis nobler in the mind to suffer"));

    String lyrics = "Country roads, take me home";
    String[] splitString = lyrics.split(" ");

    for (String word : splitString)
      System.out.println(word);

    String state = "west virginia";
    System.out.println(state.compareTo(state.toUpperCase()));
    System.out.println("West".compareTo("west"));
    System.out.println("'A' compared to 'a': " + "A".compareTo("a"));
    System.out.println("'b' compared to 'B': " + "b".compareTo("B"));

    String ssn = "123-45-6789";
    System.out.println(ssn);
    ssn = ssn.replace("-", "");
    System.out.println(ssn);
  }
}
