package InterviewQuestions;

import java.util.HashMap;
import java.util.Set;

import org.testng.annotations.Test;

public class duplicateCharCount {

	@Test
	public static void duplicatecharcount()
	{
		
		duplicatecharcount("this is a test for duplication of characters");
		
		
	}
	
	
	public static void duplicatecharcount(String input)
	{

		HashMap<Character, Integer> charcountMap = new HashMap<Character, Integer>();
		char[] strArray = input.toCharArray();
		
		for (char c : strArray) {
			
			if(charcountMap.containsKey(c))
			{
				charcountMap.put(c, charcountMap.get(c)+1);
			}
			else
			{
				charcountMap.put(c, 1);
			}
			
		}
		
		
		
		Set<Character> charinString = charcountMap.keySet();
		
		for (Character character : charinString) {
			if(charcountMap.get(character)>1)
			{
				if(character == ' ')
				{	
					System.out.println("space :   "+charcountMap.get(character));
				}
				else
					System.out.println(character+" :   "+charcountMap.get(character));
			}
		}
		
		
	}
	

	
}
