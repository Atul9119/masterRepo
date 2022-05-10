package AssiOnComparator;
import java.util.Comparator;

public class SortBySongName implements Comparator<Album> {
	public int compare(Album s1, Album s2) {
		if(s1.getId()<s2.getId())
			return 1;
		else
			return -1;
		}

}
