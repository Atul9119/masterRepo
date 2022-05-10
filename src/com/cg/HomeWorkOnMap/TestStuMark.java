package com.cg.HomeWorkOnMap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class TestStuMark {

	private static Set<Entry<Student, MarkSheet>> rows;

	public static void main(String[] args) {
		HashMap<Student, MarkSheet> map = new HashMap<>();
		map.put(new Student(101, "A","X"), new MarkSheet(90,80,77));
		map.put(new Student(102, "B","IX"), new MarkSheet(50,60,87));
		map.put(new Student(103, "C","XI"), new MarkSheet(80,90,97));
		map.put(new Student(104, "D","XII"), new MarkSheet(99,88,77));
		map.put(new Student(101, "A","X"), new MarkSheet(90,80,77));
		
		System.out.println("key--------------------value");
		
		Set<Entry<Student, MarkSheet>> rows = map.entrySet();
		
		for(Entry<Student, MarkSheet> row: rows) {
			Student k = row.getKey();
			MarkSheet v = row.getValue();
			System.out.println(k+"---------------"+v);
		}
	}

}
