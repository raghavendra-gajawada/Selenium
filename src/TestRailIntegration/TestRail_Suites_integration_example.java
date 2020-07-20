package TestRailIntegration;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import InterviewQuestions.APIException;

public class TestRail_Suites_integration_example extends TestRailIntegrationConnection{

	
	public TestRail_Suites_integration_example() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public void get_suite(int suiteid) throws MalformedURLException, IOException, APIException
	{
		JSONObject getsuite = (JSONObject) client.sendGet("get_suite/"+suiteid);
		System.out.println(getsuite.toJSONString());
	}
	public void get_suites(int projectid) throws MalformedURLException, IOException, APIException
	{
		JSONArray getsuite = (JSONArray) client.sendGet("get_suites/"+projectid);
		List<JSONObject> suites = getsuite;
		for (JSONObject jsonObject : suites) {
			System.out.println(jsonObject);
		}
	}
	public void add_suite(int projectid,String name,String description) throws MalformedURLException, IOException, APIException
	{
		Map data = new HashMap();
		data.put("name", name);
		data.put("description", description);
		JSONObject addsuite = (JSONObject) client.sendPost("add_suite/"+projectid, data);
		System.out.println("successfully added suite for project id :"+projectid);
	}
	public void update_suite(int suiteid,String name,String description) throws MalformedURLException, IOException, APIException
	{

		Map data = new HashMap();
		data.put("name", name);
		data.put("description", description);
		JSONObject addsuite = (JSONObject) client.sendPost("update_suite/"+suiteid, data);
		System.out.println("successfully updated suite for suite id :"+suiteid);
	}
	public void delete_suite(int suiteid) throws MalformedURLException, IOException, APIException
	{
		JSONObject deletesuite = (JSONObject) client.sendPost("delete_suite/"+suiteid, "");
		System.out.println("successfully deleted suite for suite id :"+suiteid);
	}
	
	
}
