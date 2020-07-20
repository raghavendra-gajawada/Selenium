package TestRailIntegration;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import InterviewQuestions.APIException;

public class TestRail_configurations_integration_example extends TestRailIntegrationConnection{

	public TestRail_configurations_integration_example() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public void get_configs() throws MalformedURLException, IOException, APIException
	{
		
		JSONArray configs = (JSONArray) client.sendGet("get_configs/1");
//		System.out.println(configs.toJSONString());
		
		System.out.println(configs.size());
		List<JSONObject> obj2 = (List<JSONObject>)configs;
		
		for (JSONObject jsonObject : obj2) {
			
				System.out.println("id         :"+jsonObject.get("id"));
				System.out.println("name         :"+jsonObject.get("name"));
				System.out.println("project_id         :"+jsonObject.get("project_id"));
				
				
		}
		
	}
	
	public void add_config_group(String name) throws MalformedURLException, IOException, APIException
	{
		Map data = new HashMap();
		data.put("name", name);
		JSONObject addconfig_group = (JSONObject) client.sendPost("add_config_group/1", data);
		
		System.out.println("successfully configuration group added");
	}
	


	public void add_config() throws MalformedURLException, IOException, APIException
	{
		Map data = new HashMap();
		data.put("name", "chrome");
		JSONObject addconfig = (JSONObject) client.sendPost("add_config/1", data);
		
		System.out.println("successfully configuration added");
		
	}
	public void update_config_group() throws MalformedURLException, IOException, APIException
	{
		Map data = new HashMap();
		data.put("name", "chrome");
		JSONObject addconfig = (JSONObject) client.sendPost("update_config_group/1", data);
		
		System.out.println("successfully update_config_group updated");
	}
	public void update_config() throws MalformedURLException, IOException, APIException
	{
		Map data = new HashMap();
		data.put("name", "firefox");
		JSONObject addconfig = (JSONObject) client.sendPost("update_config/1", data);
		
		System.out.println("successfully update_config updated");
	}
	public void delete_config_group() throws MalformedURLException, IOException, APIException
	{
		Map data = new HashMap();
		data.put("name", "browsers");
		JSONObject addconfig = (JSONObject) client.sendPost("delete_config_group/1", data);
		
		System.out.println("successfully delete_config_group deleted");
	}
	public void delete_config() throws MalformedURLException, IOException, APIException
	{
		Map data = new HashMap();
		data.put("name", "chrome");
		JSONObject addconfig = (JSONObject) client.sendPost("delete_config/1", data);
		
		System.out.println("successfully delete_config deleted");
	}





}
