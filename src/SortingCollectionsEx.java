package com.cg.collections;

import java.util.ArrayList;
import java.util.Collections;


public class SortingCollectionsEx {

	public static void main(String[] args) {
		ArrayList<Product> arr = new ArrayList<Product>();
		Product p1 = new Product(1, "Laptop", 500, 4.6f);
		Product p2 = new Product(2, "Desktop", 1000, 4.1f);
		Product p3 = new Product(3, "Mobile", 1500, 4.3f);
		Product p4 = new Product(4, "iPhone", 2000, 4.9f);
		Product p5 = new Product(5, "tablet", 2500, 4.2f);
		arr.add(p1);
		arr.add(p2);
		arr.add(p3);
		arr.add(p4);
		arr.add(p5);
		Collections.sort(arr);
		System.out.println(arr);

	}

}
