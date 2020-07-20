package TestRailIntegration;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import InterviewQuestions.APIException;

public class TestRail_Tests_integration_examples extends TestRailIntegrationConnection{

	public TestRail_Tests_integration_examples() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public void get_test() throws MalformedURLException, IOException, APIException
	{
		
		JSONObject results = (JSONObject) client.sendGet("get_test/2");
		System.out.println(results.toJSONString());
//		List<JSONObject> obj2 = (List<JSONObject>)c;
//		
//		for (JSONObject jsonObject : obj2) {
//			
//				System.out.println("priority_id         :"+jsonObject.get("priority_id"));
//				System.out.println("created_on         :"+jsonObject.get("created_on"));
//				System.out.println("template_id         :"+jsonObject.get("template_id"));
//				System.out.println("section_id         :"+jsonObject.get("section_id"));
//				System.out.println("priority_id         :"+jsonObject.get("priority_id"));
//				System.out.println("suite_id         :"+jsonObject.get("suite_id"));
//				System.out.println("type_id         :"+jsonObject.get("type_id"));
//				System.out.println("id         :"+jsonObject.get("id"));
//				System.out.println("title         :"+jsonObject.get("title"));
//				System.out.println("________________________________");
//				
//		}
		
	}
	
	public void get_tests() throws MalformedURLException, IOException, APIException
	{
		
		JSONArray results = (JSONArray) client.sendGet("get_tests/1");
//		System.out.println(results.toJSONString());
		List<JSONObject> obj2 = (List<JSONObject>)results;
//		
		for (JSONObject jsonObject : obj2) {
			
				System.out.println(jsonObject);
//				System.out.println("created_on         :"+jsonObject.get("created_on"));
//				System.out.println("template_id         :"+jsonObject.get("template_id"));
//				System.out.println("section_id         :"+jsonObject.get("section_id"));
//				System.out.println("priority_id         :"+jsonObject.get("priority_id"));
//				System.out.println("suite_id         :"+jsonObject.get("suite_id"));
//				System.out.println("type_id         :"+jsonObject.get("type_id"));
//				System.out.println("id         :"+jsonObject.get("id"));
//				System.out.println("title         :"+jsonObject.get("title"));
//				System.out.println("________________________________");
				
		}
		
	}
	
}
