import java.util.ArrayList;
import java.util.Collections;
public class Assi1 {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(4);
		arr.add(6);
		arr.add(8);
		arr.add(3);
//		System.out.println(arr);
		
		for(int n: arr) {
			System.out.println(n);
		}
		
//		for(int i=0; i<arr.size(); i++) {
//			System.out.println(arr.get(i));
//		}
////		
		ArrayList<String> str = new ArrayList<String>();
		str.add("Atul");
		str.add("Tony");
		str.add("Stark");
		str.add("Thor");
		str.add("Wonda");
		for(String s:str) {
			System.out.println(s);
		}
		
		System.out.println("Sorted array");
		Collections.sort(arr);
		System.out.println(arr);
		
		System.out.println("Sorted string");
		Collections.sort(str);
		System.out.println(str);
		
		}

}
