package TestRailIntegration;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import InterviewQuestions.APIClient;
import InterviewQuestions.APIException;

public class TestRail_Cases_Integration_examples extends TestRailIntegrationConnection{

	TestRail_Cases_Integration_examples() throws IOException {
		
		super();
		
	}

	public void get_case() throws MalformedURLException, IOException, APIException
	{
//		*****************************************************************************************
//		TestRail api call to get all the test cases using for loop using get_case id
			
		for (int i = 1; i <= 7; i++) {
				
				
				JSONObject c = (JSONObject) client.sendGet("get_case/"+i);
				System.out.println("TestCase Name : "+c.get("title")+"  >>>>>");
				System.out.println(c.toJSONString());
				System.out.println("----------------------------------------");
				
		 
			}
		
	}
	
	public void get_cases() throws MalformedURLException, IOException, APIException
	{
//	    ******************************************************************************************
//		TestRail api call to get test cases using eclipse using get_cases id
		
			JSONArray c =  (JSONArray) client.sendGet("get_cases/1&suite_id=1&priority_id=1,2,3");
//			System.out.println(c.toJSONString());
			
			System.out.println(c.size());
			List<JSONObject> obj2 = (List<JSONObject>)c;
			
			for (JSONObject jsonObject : obj2) {
				
					System.out.println("priority_id         :"+jsonObject.get("priority_id"));
					System.out.println("created_on         :"+jsonObject.get("created_on"));
					System.out.println("template_id         :"+jsonObject.get("template_id"));
					System.out.println("section_id         :"+jsonObject.get("section_id"));
					System.out.println("priority_id         :"+jsonObject.get("priority_id"));
					System.out.println("suite_id         :"+jsonObject.get("suite_id"));
					System.out.println("type_id         :"+jsonObject.get("type_id"));
					System.out.println("id         :"+jsonObject.get("id"));
					System.out.println("title         :"+jsonObject.get("title"));
					System.out.println("________________________________");
					
			}
	}
	
	public void add_case() throws MalformedURLException, IOException, APIException
	{
//		******************************************************************************************
//		adding test case through eclipse to testrail
			
			
			Map data = new HashMap();
			data.put("priority_id", 1);
			data.put("created_on", 1548852133);
			data.put("template_id", 1);
			data.put("section_id", 1);
			data.put("priority_id", 1);
			data.put("suite_id", 1);
			data.put("type_id", 4);
			data.put("id", 10);
			data.put("title", "sample test case adding through eclipse");
			
			
			JSONObject addcase = (JSONObject) client.sendPost("add_case/1", data); 
			
			System.out.println("Success");
			
	}
	
	public void update_case() throws MalformedURLException, IOException, APIException
	{
//		******************************************************************************************
//		update test case through eclipse to testrail
			
			
			Map data = new HashMap();
			data.put("priority_id", 1);
			data.put("created_on", 1548852133);
			data.put("template_id", 1);
			data.put("section_id", 1);
			data.put("priority_id", 3);
			data.put("suite_id", 1);
			data.put("type_id", 4);
			data.put("id", 1);
			data.put("title", "updated test case through eclipse");
			
			
			JSONObject addcase = (JSONObject) client.sendPost("update_case/1", data); 
			
			System.out.println("Success");
	}
	
	public void delete_case() throws MalformedURLException, IOException, APIException
	{
//		******************************************************************************************
//		delete test case through eclipse to testrail
		
	
		Map data = new HashMap();
		data.put("id", 1);
		data.put("title", "updated test case through eclipse");
		
		
		JSONObject addcase = (JSONObject) client.sendPost("delete_case/1",data); 
		
		System.out.println("deleted Success");
	}
	
	public void add_results_to_Testcase_in_testRail() throws MalformedURLException, IOException, APIException
	{
//		*****************************************************************************************
//		testrail api call to add results to the test case using add_result_for_case
			
			Map data = new HashMap();
			data.put("status_id", new Integer(1));
			data.put("comment", "This test worked fine!");
			JSONObject r = (JSONObject) client.sendPost("add_result_for_case/1/1", data);
	}
	
}


	
