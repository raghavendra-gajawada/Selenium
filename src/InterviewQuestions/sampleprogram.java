package InterviewQuestions;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sampleprogram{
	
	

	@Test
	public static void sampleprograms()throws MalformedURLException, IOException, InterruptedException
	{
				System.out.println("Programs to execute ");
				System.out.println("anagram of strings");		
				AnagramOfStrings.anagramofStrings();
				System.out.println("armstrong numbers");
				ArmstrongNumber.ArmStrongNumber();
				System.out.println("char occurances in string");
				charOccuranceInString.charOccuranceInString();
				System.out.println("duplicate char count");
				duplicateCharCount.duplicatecharcount();
				System.out.println("file system methods");
				filesystem_methods.drive_space();
				System.out.println("remove spaces from string");
				RemoveSpacesFromString.spaceremovalwithoutreplace();
				System.out.println("string revers programs");
				stringReversePrograms.StringReverseMethod1();
				
				System.out.println("opening a browser");
//				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver.exe");
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");
				// Initialize browser.
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.google.com");
				Thread.sleep(10000);
				driver.quit();
				
				
	}

}






//https://stackoverflow.com/questions/17160351/create-json-object-by-java-from-data-of-mysql
//http://docs.gurock.com/testrail-api2/start




