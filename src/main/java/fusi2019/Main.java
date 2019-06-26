package fusi2019;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		//list with arraylist
		List<String> list = new ArrayList<String>();
		list.add("alfi");
		list.add("ramdhani");
		//array basic
		int[][] array = new int[10][10];
		array[0][1] = 1;
		
		//map
		Map<String, String> map = new HashMap<String, String>();
		map.put("nama", "alfi ramdhani");
		map.get("nama");
		
		//set
		Set<String> set = new HashSet();
		set.add("alfi");
		
		//collection
		Collection<String> collection = null;
								
		System.out.println(list.toString());
		System.out.println(map.get("nama"));
		System.out.println(set.toString());

	}

}
