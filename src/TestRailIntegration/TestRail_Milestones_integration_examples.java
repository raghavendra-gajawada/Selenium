package TestRailIntegration;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import InterviewQuestions.APIException;

public class TestRail_Milestones_integration_examples extends TestRailIntegrationConnection{

	public TestRail_Milestones_integration_examples() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public void get_milestone() throws MalformedURLException, IOException, APIException
	{
		JSONObject c = (JSONObject) client.sendGet("get_milestone/1");
		System.out.println(c.toJSONString());
	}
	public void get_milestones() throws MalformedURLException, IOException, APIException
	{
		JSONArray c = (JSONArray) client.sendGet("get_milestones");
		System.out.println(c.toJSONString());
	}
	public void add_milestone(String name,String description,String due_on,String parent_id,String start_on) throws MalformedURLException, IOException, APIException
	{
		Map data = new HashMap();
		data.put("name", name);
		data.put("description", description);
		data.put("due_on", due_on);
		data.put("parent_id", parent_id);
		data.put("start_on", start_on);
		JSONArray c = (JSONArray) client.sendPost("add_milestone/1",data);
		System.out.println("successfully milestone added");
	}
	public void update_milestone(Boolean is_completed,Boolean is_started,int parent_id,String start_on) throws MalformedURLException, IOException, APIException
	{
		Map data = new HashMap();
		data.put("is_completed", is_completed);
		data.put("is_started", is_started);
		data.put("parent_id", parent_id);
		data.put("start_on", start_on);
		JSONArray c = (JSONArray) client.sendPost("update_milestone/1",data);
		System.out.println("successfully milestone updated");
	}
	public void delete_milestone() throws MalformedURLException, IOException, APIException
	{
		
		JSONObject c = (JSONObject) client.sendPost("delete_milestone/1","");
		
		System.out.println("deleted milestone ");
	}
	
	
}
