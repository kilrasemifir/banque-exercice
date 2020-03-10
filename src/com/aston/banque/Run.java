package com.aston.banque;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Run {

	public static void main(String[] args) {
		System.out.println("Hello world");
		int i = 4;
		String[] array = new String[5];
		array[0] = "Salut";
		System.out.println(array[0]);
		
		List<String> list = new ArrayList<String>();
		list.add("Salut list");
		list.add("Salut list");
		for (String string : list) {
			System.out.println(string);
		}
		
		Set<String> set = new HashSet<String>();
		set.add("Salut set");
		set.add("Salut set");
		for (String string : set) {
			System.out.println(string);
		}
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(15, "salut!");
		map.put(16,"bye!");
		map.forEach((k,v)->{
			System.out.println(""+k+":"+v);
		});
	}
}