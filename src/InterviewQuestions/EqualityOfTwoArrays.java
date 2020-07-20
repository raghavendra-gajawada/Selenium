package InterviewQuestions;

import java.util.Arrays;

import org.testng.annotations.Test;

public class EqualityOfTwoArrays {

	@Test
	public static void equalityofArrays()
	{
		
		int[] a = {1,2,3,4};
		int[] b = {1,2,3,4};
		
		boolean equalornot = true;
		
		if(a.length == b.length)
		{
			for (int i = 0; i < b.length; i++) {
				if(a[i] != b[i])
				{
					equalornot = false;
				}
			}
		}
		else
		{
			equalornot = false;
		}
		
		if(equalornot)
			System.out.println("arrays are equal");
		else
			System.out.println("arrays are not equal");
	}
	
	
	
	@Test
	public static void equalityofArrayUsingEqualMethod()
	{
		
		String[][] str1 = { {"one","two","three"},{"one","four","seven"}};
		String[][] str2 = { {"one","two","three"},{"one","four","seven"}};
		
		System.out.println("using equals method :  "+Arrays.equals(str1,str2));
		System.out.println("using deep equals methods  : "+Arrays.deepEquals(str1, str2));
		
		
	}
}
