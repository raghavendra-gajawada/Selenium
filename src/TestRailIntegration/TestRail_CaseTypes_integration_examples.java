package TestRailIntegration;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import InterviewQuestions.APIException;

public class TestRail_CaseTypes_integration_examples extends TestRailIntegrationConnection{

	TestRail_CaseTypes_integration_examples() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public void get_case_types() throws MalformedURLException, IOException, APIException
	{
		
//		******************************************************************************************
//		TestRail api to get testcase types in eclipse
				
				JSONArray testcasetypes = (JSONArray)client.sendGet("get_case_types");
				List<JSONObject> obj2 = (List<JSONObject>)testcasetypes;
					
				for (JSONObject jsonObject : obj2) {
					
						System.out.println("id         :"+jsonObject.get("id"));
						System.out.println("name         :"+jsonObject.get("name"));
						System.out.println("default         :"+jsonObject.get("default"));
					
						System.out.println("________________________________");
				}
		
		
		
		
	}

}
