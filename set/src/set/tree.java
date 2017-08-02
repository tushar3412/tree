package set;
import java.util.*;

public class tree {
	public static void main(String[] args) {
		
		TreeSet<Integer> a = new TreeSet<Integer>();
		a.add(12);
		a.add(13);
		a.add(14);
		a.add(15);
		a.add(1);
		
		for(Integer b:a)
		{
			System.out.println(b);
			
		}
	}

}
