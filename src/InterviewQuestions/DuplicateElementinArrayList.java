package InterviewQuestions;

import java.util.HashSet;

import org.testng.annotations.Test;

public class DuplicateElementinArrayList 
{

//	there are two types of methods to find out duplicate elements in an array list
	
	@Test
	public static void duplicateElementFinding_Method1()
	{
		String[] strArray = {"abc1","abcx","abc7","abc6","ab5c","abc3","abc1","abc2","abc1"};
		
		for (int i = 0; i < strArray.length-1; i++) {
			for (int j = i+1; j < strArray.length; j++) {
				if(strArray[i].equals(strArray[j]) && (i !=j) )
				{
					System.out.println("duplicate element is   "+strArray[j]);
				}
			}
		}
	}
	@Test
	public static void duplicateElementFinding_Method2()
	{
		System.out.println("________________________________________________________________");
		String[] strArray = {"abc1","abcx","abc7","abc6","ab5c","abc3","abc1","abc2","abc1"};
		HashSet<String> strHash = new HashSet<String>();
		for (String str : strArray) {
			
			if(!strHash.add(str))
			{
				System.out.println("duplicate element is  "+str);
			}
			
		}
	}

}
