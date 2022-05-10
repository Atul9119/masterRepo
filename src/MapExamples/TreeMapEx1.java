package MapExamples;

import java.util.TreeMap;

public class TreeMapEx1 {

	public static void main(String[] args) {
		System.out.println("I pull it");
		TreeMap<Integer, String> tree1 = new TreeMap<Integer, String>();
		tree1.put(2, "Bangalore");
		tree1.put(5, "Mumbai Certral");
		tree1.put(8, "Varanasi");
		tree1.put(9, "Chennai Central");
		System.out.println(tree1);
		tree1.put(2, "Bangalore");
		System.out.println(tree1);  // It is overwrite
		String city = tree1.get(5);
		System.out.println(city);
		
		
	}


}


