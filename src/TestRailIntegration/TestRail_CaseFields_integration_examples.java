package TestRailIntegration;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import InterviewQuestions.APIException;

public class TestRail_CaseFields_integration_examples extends TestRailIntegrationConnection{

	TestRail_CaseFields_integration_examples() throws IOException {
		super();
	}

	
	public void get_case_fields() throws MalformedURLException, IOException, APIException
	{
//			******************************************************************************************			
//			TestRail api call to get all the test cases using for loop using get_case_fields id
	

			JSONArray getcasefield = (JSONArray) client.sendGet("get_case_fields/1");
		//	System.out.println("TestCase Name : "+c.get("title")+"  >>>>>");
			System.out.println(getcasefield.toJSONString());
			System.out.println("----------------------------------------");
			
		
	}
	
	public void add_case_field() throws MalformedURLException, IOException, APIException
	{
		
//		******************************************************************************************
//		TestRail api to add test case field to testcase(failed to add test case field)***
				
				Map data = new HashMap();
				data.put("configs", " awst");
				data.put("type", "test");
				data.put("label", "added pre conditions");
				data.put("name", "steps");
				data.put("description", "this is used to test rail config through eclipse");
				JSONObject addfield = (JSONObject) client.sendPost("add_case_field/1", data); 
				System.out.println("added field to test case");
	}
	
}
