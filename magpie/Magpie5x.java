package magpie;

/**
 * The completed version of Magpie activity 2.
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie5x
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}

	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		// The new responses are added here, but they could be
		// placed earlier. Their positioning matters when
		// there are two or more keywords in the same
		// string.

		// Handle cat and dog:
		else if (statement.indexOf("cat") >= 0
				|| statement.indexOf("dog") >= 0)
		{
			response = "Tell me more about your pets.";
		}

		// Handle teacher name (of course, your name may
		// differ)
		else if (statement.indexOf("Mr. Neil") >= 0)
		{
			response = "He sounds like a good teacher.";
		}

		// Handle empty string
		else if (statement.trim().length() == 0)
		{
			response = "Say something, please.";
		}
		
		//  There should also be three more replies of the student's own choosing.
		else if (statement.indexOf("Java") >= 0)
			response = "Java is very interesting!";

		else if (statement.indexOf("computer") >= 0)
			response = "Do you enjoy technology?";

		else if (statement.indexOf("food") >= 0)
			response = "I think you must be hungry.";

		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		String[] responses = {
				"Interesting, tell me more.",
				"Hmmm.",
				"Do you really think so?",
				"You don't say.",
				"I suppose...",
				"And how do you feel about that?",
				"Yes, go on."
		};

		int whichResponse = (int)(Math.random() * responses.length);

		return responses[whichResponse];
	}
}
