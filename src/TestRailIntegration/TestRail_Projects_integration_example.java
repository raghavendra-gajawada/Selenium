package TestRailIntegration;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import InterviewQuestions.APIException;

public class TestRail_Projects_integration_example extends TestRailIntegrationConnection {

	public TestRail_Projects_integration_example() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public void get_project(int projectid ) throws MalformedURLException, IOException, APIException
	{
		JSONObject getproject = (JSONObject) client.sendGet("get_project/"+projectid);
		System.out.println(getproject.toJSONString());
	}
	public void get_projects() throws MalformedURLException, IOException, APIException
	{
		JSONArray getprojects = (JSONArray) client.sendGet("get_projects");
		List<JSONObject> projects = getprojects;
		for (JSONObject jsonObject : projects) {
			System.out.println(jsonObject);
		}
	}
	public void add_project(String name,String announcement,Boolean show_announcement,int suite_mode) throws MalformedURLException, IOException, APIException
	{
		Map data = new HashMap();
		data.put("name", name);
		data.put("announcement", announcement);
		data.put("show_announcement", show_announcement);
		data.put("suite_mode", suite_mode);
		JSONObject addsuite = (JSONObject) client.sendPost("add_project", data);
		System.out.println("successfully added project");
	}
	public void update_project(int projectid,Boolean is_completed,String name,String announcement,Boolean show_announcement,int suite_mode) throws MalformedURLException, IOException, APIException
	{
		Map data = new HashMap();
		data.put("nis_completed", is_completed);
		data.put("name", name);
		data.put("announcement", announcement);
		data.put("show_announcement", show_announcement);
		data.put("suite_mode", suite_mode);
		
		JSONObject addsuite = (JSONObject) client.sendPost("update_project/"+projectid, data);
		System.out.println("successfully updated project for project id :"+projectid);
	}
	public void delete_project(int projectid) throws MalformedURLException, IOException, APIException
	{
		JSONObject deleteproject = (JSONObject) client.sendPost("delete_project/"+projectid, "");
		System.out.println("successfully deleted project for  project id :"+projectid);
	}
}
