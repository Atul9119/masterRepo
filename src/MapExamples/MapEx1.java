package MapExamples;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import java.util.Collection;

public class MapEx1 {

	public static void main(String[] args) {
		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("SBC", "Bangalore");
		map1.put("MMCT", "Mumbai Certral");
		map1.put("BSB", "Varanasi");
		map1.put("MAS", "Chennai Central");
		System.out.println(map1);
		map1.put("SBC", "Bangalore");
		System.out.println(map1);  // It is overwrite
		String city = map1.get("MAS");
		System.out.println(city);
		
		boolean b = map1.containsKey("BSB");
		System.out.println(b);
		
		//try for TreeMap and LinkedHashMap
		Set<String> keys = map1.keySet();
		System.out.println("--------Itereating key------------");
		for(String s: keys) {
			System.out.println(s);
		}
		//try for 
		Collection<String> values = map1.values();
		System.out.println("--------Itereating value------------");
		for(String s: values) {
			System.out.println(s);
		}
		System.out.println("*******************");
		Set<Entry<String, String>> rows = map1.entrySet();
			System.out.println("key=================value");
			for(Entry<String, String> row:rows) {
				String k = row.getKey();
				String v = row.getValue();
				System.out.println(k+"------------------"+v);
			}
	}

}





















