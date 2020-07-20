package TestRailIntegration;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import InterviewQuestions.APIException;

public class TestRail_templates_integration_example extends TestRailIntegrationConnection{

	
	public TestRail_templates_integration_example() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public void get_templates() throws MalformedURLException, IOException, APIException
	{
		JSONArray templates = (JSONArray) client.sendGet("get_templates/1");
		List<JSONObject> templatelist = (List<JSONObject>)templates;
		for (JSONObject jsonObject : templatelist) {
			System.out.println(jsonObject);
		}
	}
}
