package TestRailIntegration;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import InterviewQuestions.APIClient;

public class TestRailIntegrationConnection {

	
	public static APIClient client;
	public Properties prop;
	public  TestRailIntegrationConnection() throws IOException
	{
		prop = new Properties();
		InputStream input = new FileInputStream("TestRailLogins.properties");
		prop.load(input);
		
		client = new APIClient("https://raghavseleniumtest.testrail.io/");
		client.setUser(prop.getProperty("user"));
		client.setPassword(prop.getProperty("password"));
		
	}
	
}
