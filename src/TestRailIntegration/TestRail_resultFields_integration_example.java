package TestRailIntegration;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import InterviewQuestions.APIException;

public class TestRail_resultFields_integration_example extends TestRailIntegrationConnection{

	public TestRail_resultFields_integration_example() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public void get_result_fields() throws MalformedURLException, IOException, APIException
	{
		
		JSONArray results = (JSONArray) client.sendGet("get_result_fields");
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
	
}
