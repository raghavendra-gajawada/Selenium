package TestRailIntegration;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import InterviewQuestions.APIException;

public class TestRail_sections_integration_example extends TestRailIntegrationConnection{

	
	
	
	public TestRail_sections_integration_example() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	public void get_section() throws MalformedURLException, IOException, APIException{ JSONObject data = (JSONObject) client.sendGet("/get_section/1"); System.out.println(data.toJSONString()); }
	public void get_sections() throws MalformedURLException, IOException, APIException{ JSONArray data = (JSONArray) client.sendGet("get_sections/1&suiteid=1");List<JSONObject> sections = data; for (JSONObject jsonObject : sections) { System.out.println(jsonObject.toJSONString());}}
	public void add_section(String description,int suite_id,int parent_id,String name,int projectid) throws MalformedURLException, IOException, APIException{
		
		Map data = new HashMap();
		
		data.put("description", description);
		data.put("suite_id", suite_id);
		data.put("parent_id", parent_id);
		data.put("name", name);
		
		JSONObject addsection = (JSONObject) client.sendPost("add_section/"+projectid, data);
		System.out.println("section is added for Project id  : 1");
		
		
	}
	public void update_section(String name, String description,int sectionid) throws MalformedURLException, IOException, APIException{
		
		Map data = new HashMap();
		
		data.put("name",name);
		data.put("description",description);
		
		JSONObject updatesection = (JSONObject) client.sendPost("update_section/"+sectionid, data);
		
		
		
	}
	public void delete_section(int sectionid) throws MalformedURLException, IOException, APIException{
		
		
		Map data = new HashMap();
		data.put("section_id", sectionid);
		JSONObject deletesection = (JSONObject) client.sendPost("delete_section/1", data);
	}
	
}
