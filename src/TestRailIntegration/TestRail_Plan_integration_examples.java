package TestRailIntegration;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import InterviewQuestions.APIException;

public class TestRail_Plan_integration_examples extends TestRailIntegrationConnection{

	
	public TestRail_Plan_integration_examples() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	public void get_plan() throws MalformedURLException, IOException, APIException
	{
		JSONObject getplan = (JSONObject) client.sendGet("get_plan/1");
	}
	public void get_plans() throws MalformedURLException, IOException, APIException
	{
	
		JSONArray getplans = (JSONArray) client.sendGet("get_plans");
	}
	public void add_plan(String name,String description,int milestone_id,String[] entries) throws MalformedURLException, IOException, APIException
	{
		Map addplan = new HashMap();
		addplan.put("name", name);
		addplan.put("description", description);
		addplan.put("milestone_id", milestone_id);
		addplan.put("entries", entries);
		
		JSONArray addplanjson = (JSONArray) client.sendPost("add_plan/1", addplan);
		System.out.println("plan added successfully");
		
		
	}
	public void add_plan_entry(int suite_id,String name,String description,int assignedto_id,Boolean include_all,String[] case_ids,String[] config_ids,String[] runs) throws MalformedURLException, IOException, APIException
	{
		
		Map data = new HashMap();
		data.put("suite_id", suite_id);
		data.put("description", description);
		data.put("assignedto_id", assignedto_id);
		data.put("include_all", include_all);
		data.put("case_ids", case_ids);
		data.put("runs", runs);
		
		JSONArray add_plan_entry = (JSONArray) client.sendPost("add_plan_entry/1", data);
		System.out.println("plan entry added successfully");
		
		
	}
	
	
	public void update_plan(String name,String description,int milestone_id,String[] entries) throws MalformedURLException, IOException, APIException
	{
		Map data = new HashMap();
		data.put("name", name);
		data.put("description", description);
		data.put("milestone_id", milestone_id);
		data.put("entries", entries);
		
		JSONArray addplanjson = (JSONArray) client.sendPost("update_plan/1", data);
		System.out.println("plan updated successfully");
		
		
	}
	public void update_plan_entry(int suite_id,String name,String description,int assignedto_id,Boolean include_all,String[] case_ids,String[] config_ids,String[] runs) throws MalformedURLException, IOException, APIException
	{
		
		Map data = new HashMap();
		data.put("suite_id", suite_id);
		data.put("description", description);
		data.put("assignedto_id", assignedto_id);
		data.put("include_all", include_all);
		data.put("case_ids", case_ids);
		data.put("runs", runs);
		
		JSONArray update_plan_entry = (JSONArray) client.sendPost("update_plan_entry/1/1", data);
		System.out.println("plan entry updated successfully");
		
		
	}
	
	public void close_plan() throws MalformedURLException, IOException, APIException
	{
		JSONObject closeplan = (JSONObject) client.sendPost("close_plan/1", "");
	}
	public void delete_plan()
	{
		
	}
	public void delete_plan_entry()
	{
		
	}
	
	
}
