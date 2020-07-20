package TestRailIntegration;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import InterviewQuestions.APIException;

public class TestRail_Priorities_Integration_examples extends TestRailIntegrationConnection{

	public TestRail_Priorities_Integration_examples() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public void get_priorities() throws MalformedURLException, IOException, APIException
	{
		JSONArray getpriorities = (JSONArray) client.sendGet("get_priorities");
//		System.out.println(getpriorities);
		
		List<JSONObject> prioritiesObj = (List<JSONObject>)getpriorities;
		for (JSONObject jsonObject : prioritiesObj) {
			System.out.println(jsonObject.get("id"));
			System.out.println(jsonObject.get("priority"));
			System.out.println(jsonObject.get("name"));
			System.out.println(jsonObject.get("is_default"));
			System.out.println(jsonObject.get("short_name"));
			System.out.println("*******************************************");
			
		}
	}
	
	
}
