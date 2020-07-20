package InterviewQuestions;

import org.testng.annotations.Test;

public class findSecondLargestInArray {

	@Test
	public static void secondlargestInArray()
	{
		
		int[] arrayvalues = { 4312,2213,4565,1523,2522,6325,3375,8725};
		int firstlargest,secondlargest;
		
		if(arrayvalues[0]>arrayvalues[1])
		{
			firstlargest = arrayvalues[0];
			secondlargest = arrayvalues[1];
			
		}else
		{
			firstlargest = arrayvalues[1];
			secondlargest = arrayvalues[0];
			
		}
		
		for (int i = 2; i < arrayvalues.length; i++) {
			
			if(arrayvalues[i]>firstlargest)
			{
				secondlargest = firstlargest;
				firstlargest = arrayvalues[i];
			}else
			{
				if(arrayvalues[i]<firstlargest && arrayvalues[i]>secondlargest)
				{
					secondlargest = arrayvalues[i];
				}
			}
		
		}
		
		System.out.println("second largest number is "+secondlargest);
	}
	
}
