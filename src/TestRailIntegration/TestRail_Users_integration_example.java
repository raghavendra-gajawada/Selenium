package TestRailIntegration;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import InterviewQuestions.APIException;

public class TestRail_Users_integration_example extends TestRailIntegrationConnection{

	public TestRail_Users_integration_example() throws IOException {
		super();
	}

	public void get_user(int userid) throws MalformedURLException, IOException, APIException
	{
		JSONObject getuser = (JSONObject) client.sendGet("get_user/"+userid);
		System.out.println(getuser.toJSONString());
	}
	public void get_user_by_email(int userid,String email) throws MalformedURLException, IOException, APIException
	{
		JSONObject getuser = (JSONObject) client.sendGet("get_user_by_email/"+userid+"&email="+email);
		System.out.println(getuser.toJSONString());
	}
	
	public void get_users() throws MalformedURLException, IOException, APIException
	{
		JSONArray getusers = (JSONArray) client.sendGet("get_users");
		List<JSONObject> users = getusers;
		for (JSONObject jsonObject : users) {
			System.out.println(jsonObject.toJSONString());
		}
	}
	
}
