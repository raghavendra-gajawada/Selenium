package InterviewQuestions;

import org.testng.annotations.Test;

public class RemoveSpacesFromString {

	@Test
	public static void SpaceRemoveFromString()
	{
		
//		using replace and replaceAll methods
		
		String str = "this is a sample string to check          to remove spaces from String";
		String strWithoutSpaces = str.replace(" ", "");
//		or
		String strWithoutSpaceswithoutReplace = str.replaceAll("\\s", "");
		
		System.out.println(strWithoutSpaces+" "+strWithoutSpaceswithoutReplace);
		
		
		
	}
	
	@Test
	public static void spaceremovalwithoutreplace()
	{
		String str = "this is a sample text to check             for string values finding weather text comes without spaces or not";
		
		char[] strchars = str.toCharArray();
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < strchars.length; i++) {
			if( (strchars[i] != ' ') || (strchars[i] != '\t')  )
				
				sb.append(strchars[i]);
			
		}
		System.out.println(sb);
	}
	
	
}
