package InterviewQuestions;

import java.util.HashMap;

import org.testng.annotations.Test;

public class charOccuranceInString {

	
	@Test
	public static void charOccuranceInString()
	{
		
		String str = "this is a sample string to check character count in the string cfvhdujfghgdtukfytweszhkflurfyidchkgfdy";
		
		HashMap<Character, Integer> charmap = new HashMap<Character,Integer>();
		char[] characterarray = str.toCharArray();
		
		for (char c : characterarray) {
			if(charmap.containsKey(c))
			{
				charmap.put(c, charmap.get(c)+1);
			}
			else
			{
				charmap.put(c, 1);
			}
		}
		
		System.out.println(charmap);
		
	}
	
}
