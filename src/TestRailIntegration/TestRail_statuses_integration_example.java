package TestRailIntegration;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import InterviewQuestions.APIException;

public class TestRail_statuses_integration_example extends TestRailIntegrationConnection{

	public TestRail_statuses_integration_example() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public void get_statuses() throws MalformedURLException, IOException, APIException
	{
		JSONArray data = (JSONArray) client.sendGet("get_statuses");
		List<JSONObject> obj = data;
		
		for (JSONObject jsonObject : obj) {
			System.out.println(jsonObject);
		}
	}
	
}
