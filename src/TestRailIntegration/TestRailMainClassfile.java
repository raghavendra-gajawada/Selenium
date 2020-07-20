package TestRailIntegration;

import java.io.IOException;

import org.testng.annotations.Test;

import InterviewQuestions.APIException;

public class TestRailMainClassfile extends TestRailIntegrationConnection{

	public TestRailMainClassfile() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

//	@Test
	public static void test() throws IOException, APIException
	{
		TestRail_Suites_integration_example conf = new TestRail_Suites_integration_example();
		conf.get_suite(1);
		
		
	}
	
}



