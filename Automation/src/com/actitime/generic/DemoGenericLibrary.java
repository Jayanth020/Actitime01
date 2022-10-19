package com.actitime.generic;

import java.io.IOException;

public class DemoGenericLibrary {

	public static void main(String[] args) throws IOException {
		FileLib f=new FileLib();
		String url = f.getpropertyData("url");
		System.out.println(url);
		String custname = f.getExcelData("CreateCustomer", 1, 2);
		System.out.println(custname);
		f.setExcelData("CreateCustomer", 1, 3, "pass");
	}

}
