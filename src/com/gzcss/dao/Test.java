package com.gzcss.dao;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		String str = "Hello World!";
		// changStr(str);
		// System.out.println(str);
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse().toString());
		
		
		  ArrayList list = new ArrayList();
			double array[] = { 112, 111, 23, 456, 231 };
			for (int i = 0; i < array.length; i++) {
				list.add(new Double(array[i]));
			}
			Collections.sort(list);
			for (int i = 0; i < array.length; i++) {
				System.out.println(list.get(i));
			}

	}

	public static String changStr(String str) {
		return str = "welcome";
	}

}
