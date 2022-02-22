package com.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Colection {
	public static void main(String[] args) {

		//LIST
		System.out.println("LIST");
		ArrayList<Integer> array= new ArrayList<>();
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(5);
		array.add(6);
		System.out.println(array);

		//SET
		//   -> HashSet Random
		System.out.println("SET");
		Set<String> hashSet= new HashSet<>();
		hashSet.add("one");
		hashSet.add("two");
		hashSet.add("Three");
		hashSet.add("four");
		hashSet.add("five");
		System.out.println(hashSet);

		//   -> LinkedHashSet Random
		System.out.println("LinkedHashSet");
		Set<String> linkedHashSet= new LinkedHashSet<>();
		linkedHashSet.add("eleven");
		linkedHashSet.add("tewelve");
		linkedHashSet.add("thirteen");
		linkedHashSet.add("fourteen");
		linkedHashSet.add("fifteen");
		System.out.println(linkedHashSet);

		//   -> TreeSet Assending Order
		System.out.println("TreeSet");
		Set<String> TreeSet= new TreeSet<>();
		TreeSet.add("eleven");
		TreeSet.add("tewelve");
		TreeSet.add("thirteen");
		TreeSet.add("fourteen");
		TreeSet.add("fifteen");
		System.out.println(TreeSet);

		//     ->set not allow duplicates
		System.out.println("TreeSetPartTwo");
		Set<String> TreeSetPartTwo= new TreeSet<>();
		TreeSetPartTwo.add("eleven");
		TreeSetPartTwo.add("eleven");
		TreeSetPartTwo.add("twelve");
		TreeSetPartTwo.add("twelve");
		TreeSetPartTwo.add("thirteen");
		System.out.println(TreeSetPartTwo);
		
		
		//MAP
		//Key Not Allow duplicates
		//Value allow duplicatres
		System.out.println("MAP");
		Map<String, Integer> map= new HashMap<String, Integer>();
		map.put("one", 1);
		map.put("one", 1);
		map.put("two",2);
		map.put("three", 2);
		map.put("four", 2);
		System.out.println(map);
		
	}
}
