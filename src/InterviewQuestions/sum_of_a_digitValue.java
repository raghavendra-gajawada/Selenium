package InterviewQuestions;

import org.testng.annotations.Test;

public class sum_of_a_digitValue {

	@Test
	public static void sumofdigits_of_number()
	{
		
		int sum = 0 ,integervalue,lastdigit,temp;
		
		integervalue = 13545;
		temp = integervalue;
		while(integervalue!=0)
		{
			lastdigit = integervalue%10;
			sum = sum+lastdigit;
			integervalue = integervalue/10;
		}
		
			
		System.out.println("sum of the integervalue("+temp+") is "+sum);
		
	}
	
}
