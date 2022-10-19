package qsp;

import java.util.ArrayList;
import java.util.HashMap;

public class DemoDataDrivenTesting {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("");
		al.add("admin");
		al.add("admin@actitime.com");
		al.add("manager");
		System.out.println(al.get(2));
		
		
		HashMap<String, String>hs=new HashMap<String, String>();
		hs.put("url","");
		hs.put("url", "admin");
		hs.put("email", "admin@actitime.com");
		hs.put("pw", "manager");
		
		System.out.println(hs.get("pw"));
	}

}
