package InterviewQuestions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class convertingHashmaptoarraylist {

	public static void conversionofHashmaptoArraylist()
	{
		
		
//		Method 1 : using Set method
//		HashMap<String, String> map = new HashMap<String,String>();
//		Set<String> values = map.keySet();
//		ArrayList<String> arraylist = new ArrayList<String>(values);
		
		
		HashMap<String, String> employeeData = new HashMap<String, String>();
		employeeData.put("325", "Raghavendra");
		employeeData.put("324", "dragon");
		employeeData.put("33", "Raghav");
		employeeData.put("355", "Raghu");
		employeeData.put("325", "Raghvendra");
		
		Set<String> values = employeeData.keySet();
		ArrayList<String> arraylist = new ArrayList<String>(values);
		
		
		
		
//		Method 2: using collection method
		
		HashMap<String, String> map2 = new HashMap<String,String>();
		Collection<String> collection = map2.keySet();
		ArrayList<String> arraylist2 =new ArrayList<String>(collection);
		
//		Method 3: conversion for keyvalue pairs
		
		HashMap<String, String> map3 = new HashMap<String, String>();
		Set<Entry<String,String>> entryset = map3.entrySet();
		ArrayList<Entry<String,String>> arraylist3 = new ArrayList<Entry<String,String>>(entryset);
		
		
	}
	
}
//https://javaconceptoftheday.com/how-to-convert-hashmap-to-arraylist-in-java/