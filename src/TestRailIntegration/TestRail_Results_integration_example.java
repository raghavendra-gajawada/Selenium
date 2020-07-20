package TestRailIntegration;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import InterviewQuestions.APIException;

public class TestRail_Results_integration_example extends TestRailIntegrationConnection{

	public TestRail_Results_integration_example() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public void get_results(int testid) throws MalformedURLException, IOException, APIException
	{
		JSONArray getresults = (JSONArray) client.sendGet("get_results/"+testid);
		List<JSONObject> results = getresults;
		for (JSONObject jsonObject : results) {
			System.out.println(jsonObject.toJSONString());
		}
	}
	
	public void get_results_for_case(int runid,int caseid) throws MalformedURLException, IOException, APIException
	{
		
		JSONArray getresults = (JSONArray) client.sendGet("get_results_for_case/"+runid+"/"+caseid);
		List<JSONObject> results = getresults;
		for (JSONObject jsonObject : results) {
			System.out.println(jsonObject.toJSONString());
		}
		
	}
	public void get_results_for_run(int runid) throws MalformedURLException, IOException, APIException
	{
		JSONArray getresults = (JSONArray) client.sendGet("get_results_for_run/"+runid);
		List<JSONObject> results = getresults;
		for (JSONObject jsonObject : results) {
			System.out.println(jsonObject.toJSONString());
		}
	}
	public void add_result(int testid,int status_id,String comment,String version,String elapsed,String defects,int assignedto_id) throws MalformedURLException, IOException, APIException
	{
		Map data = new HashMap();
		data.put("status_id", status_id); // status id must be from 1 to 5 - passed , blocked , untested , retest , failed
		data.put("comment", comment);
		data.put("version", version);
		data.put("elapsed", elapsed);
		data.put("defects", defects);
		data.put("assignedto_id", assignedto_id);
		
		JSONObject addresult = (JSONObject) client.sendPost("add_result/"+testid, data);
		System.out.println("results added for test id "+testid);
		
	}
	public void add_result_for_case(int run_id,int case_id,int status_id,String comment,String version,String elapsed,String defects,int assignedto_id) throws MalformedURLException, IOException, APIException
	{
		Map data = new HashMap();
		data.put("status_id", status_id); // status id must be from 1 to 5 - passed , blocked , untested , retest , failed
		data.put("comment", comment);
		data.put("version", version);
		data.put("elapsed", elapsed);
		data.put("defects", defects);
		data.put("assignedto_id", assignedto_id);
		
		JSONObject addresult = (JSONObject) client.sendPost("add_result_for_case/"+run_id+"/"+case_id, data);
		System.out.println("results added for run id "+run_id+" and case id "+case_id);
		
	}
	public void add_results(int run_id,int status_id,String comment,String version,String elapsed,String defects,int assignedto_id) throws MalformedURLException, IOException, APIException
	{
		Map data = new HashMap();
		data.put("status_id", status_id); // status id must be from 1 to 5 - passed , blocked , untested , retest , failed
		data.put("comment", comment);
		data.put("version", version);
		data.put("elapsed", elapsed);
		data.put("defects", defects);
		data.put("assignedto_id", assignedto_id);
		
		JSONObject addresult = (JSONObject) client.sendPost("add_results/"+run_id, data);
		System.out.println("results added for run id "+run_id);
	}
	public void add_results_for_cases(int run_id,int status_id,String comment,String version,String elapsed,String defects,int assignedto_id) throws MalformedURLException, IOException, APIException
	{
		Map data = new HashMap();
		data.put("status_id", status_id); // status id must be from 1 to 5 - passed , blocked , untested , retest , failed
		data.put("comment", comment);
		data.put("version", version);
		data.put("elapsed", elapsed);
		data.put("defects", defects);
		data.put("assignedto_id", assignedto_id);
		
		JSONObject addresult = (JSONObject) client.sendPost("add_results_for_cases/"+run_id, data);
		System.out.println("results added for run id "+run_id);
	}
}
