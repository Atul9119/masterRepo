package AssiOnComparator;
import java.util.ArrayList;
import java.util.Collections;


public class Song {

	public static void main(String[] args) {
		ArrayList<Album> songList = new ArrayList<Album>();
		Album p1 = new Album(5, "xyz", "a", 2022, 4.6f);
		Album p2 = new Album(4, "abc", "b", 2010, 2.1f);
		Album p3 = new Album(2, "pqr", "c", 2014, 3.3f);
	    Album p4 = new Album(6, "mno", "d", 2018, 5.9f);
		Album p5 = new Album(1, "ghi", "e", 2021, 1.2f);
		songList.add(p1);
		songList.add(p2);
		songList.add(p3);
		songList.add(p4);
		songList.add(p5);
		System.out.println("All Songs Details are: ");
		for(Album a: songList) {
			System.out.println(a);
		}
		
		//Sorted by album name
		SortBySongName sortBySong = new SortBySongName();
		Collections.sort(songList, sortBySong);
		System.out.println("Sorted by Song ID high to low_________");
		for(Album p: songList) {
			System.out.println(p);
		}
		
		
		
		

	}

}
