package InterviewQuestions;

import java.util.Arrays;

import org.testng.annotations.Test;

public class AnagramOfStrings {

	@Test
	public static void anagramofStrings()
	{
		
        isAnagram("Mother In Law", "Hitler Woman");
        isAnagram("keEp", "peeK");
        isAnagram("SiLeNt CAT", "LisTen AcT");
        isAnagram("Debit Card", "Bad Credit");
        isAnagram("School MASTER", "The ClassROOM");
        isAnagram("DORMITORY", "Dirty Room");
        isAnagram("ASTRONOMERS", "NO MORE STARS");
        isAnagram("Toss", "Shot");
        isAnagram("joy", "enjoy");
		
		
	}
	
	public static void isAnagram(String str1, String str2)
	{
		
		String copy1 = str1.replaceAll("\\s", "");
		String copy2 = str2.replaceAll("\\s", "");
		
		boolean status = true;
		
		if(copy1.length() != copy2.length())
		{
			status = false;
		}
		else
		{
			char[] s1Array = copy1.toLowerCase().toCharArray();
			char[] s2Array = copy2.toLowerCase().toCharArray();
			
			Arrays.sort(s1Array);
			Arrays.sort(s2Array);
			
			status = Arrays.equals(s1Array,s2Array);
			
			
			if(status)
			{
				System.out.println(str1 +" and "+str2 +" are anagrams");
			}
			else
			{
				System.out.println(str1 +" and "+str2 +" are not anagrams");
			}
			
		}
		
		
		
		
		
	}
	
}
