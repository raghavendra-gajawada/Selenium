package InterviewQuestions;

import org.testng.annotations.Test;

public class stringReversePrograms {

	@Test
	public static void StringReverseMethod1()
	{
		
//		using StringBuffer Method
		StringBuffer strbuf = new StringBuffer("StringReverse");
		System.out.println(strbuf.reverse());
		System.out.println();
		
	}
	@Test
	public static void StringReverseMethod2()
	{
//		using iterative method
		String str = "String Reverse";
		char[] strrev = str.toCharArray();
		for (int i =  strrev.length -1 ; i >= 0 ; i--) {
			
			System.out.print(strrev[i]);
			
		}
		System.out.println();
		
	}
	@Test
	public static void StringReverseMethod3()
	{
		
//		using recursive method
		System.out.println(recursivemethodforstring("String reverse"));
		
	}
	public static String recursivemethodforstring(String str)
	{
		if((str==null) || (str.length() <= 1))
			return str;
		
		return recursivemethodforstring(str.substring(1))+str.charAt(0);
	}
	
	
}
