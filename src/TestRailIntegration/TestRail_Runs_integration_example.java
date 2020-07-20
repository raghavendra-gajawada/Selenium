package TestRailIntegration;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import InterviewQuestions.APIException;

public class TestRail_Runs_integration_example extends TestRailIntegrationConnection{

	public TestRail_Runs_integration_example() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	public void get_run(int runid) throws MalformedURLException, IOException, APIException
	{
		JSONObject getrun = (JSONObject) client.sendGet("get_run/"+runid);
		System.out.println(getrun.toJSONString());
	}
	public void get_runs(int project_id) throws MalformedURLException, IOException, APIException
	{
		JSONArray getrun = (JSONArray) client.sendGet("get_runs/"+project_id);
		System.out.println(getrun.toJSONString());
	}
	public void add_run(int project_id,int suite_id,String name,String description,int milestone_id ,int assignedto_id ,Boolean include_all ,int[] case_ids) throws MalformedURLException, IOException, APIException
	{
		Map data = new HashMap();
		data.put("suite_id",suite_id);
		data.put("name",name);
		data.put("description",description);
		data.put("milestone_id",milestone_id);
		data.put("assignedto_id",assignedto_id);
		data.put("include_all",include_all);
		data.put("case_ids",case_ids);
		
		JSONObject addrun = (JSONObject) client.sendPost("add_run/"+project_id, data);
		System.out.println("run config added successfully for project id : "+project_id);
	}
	public void update_run(int runid,int suite_id,String name,String description,int milestone_id ,int assignedto_id ,Boolean include_all ,int[] case_ids) throws MalformedURLException, IOException, APIException
	{
		Map data = new HashMap();
		data.put("suite_id",suite_id);
		data.put("name",name);
		data.put("description",description);
		data.put("milestone_id",milestone_id);
		data.put("assignedto_id",assignedto_id);
		data.put("include_all",include_all);
		data.put("case_ids",case_ids);
		
		JSONObject updaterun = (JSONObject) client.sendPost("update_run/"+runid, data);
		System.out.println("run config added successfully for project id : "+runid);
	}
	public void close_run(int runid) throws MalformedURLException, IOException, APIException
	{
		JSONObject closerun = (JSONObject) client.sendGet("close_run/"+runid);
		System.out.println(closerun.toJSONString());
	}
	public void delete_run(int runid) throws MalformedURLException, IOException, APIException
	{
		JSONObject deleterun = (JSONObject) client.sendGet("delete_run/"+runid);
		System.out.println(deleterun.toJSONString());
	}
	
}
