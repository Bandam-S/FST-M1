package Activities;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Activity4sorting {

	public static void main(String[] args) {
	List<Integer> reorder= Arrays.asList(4,3,2,10,12,1,5,2,5,6);
			System.err.println("Before sorting "+reorder);
			System.out.println("Actual size "+reorder.size());
			Set<Integer> myset= new HashSet<Integer>(reorder);
			System.err.println("After sorting "+myset);
			System.err.println("New size "+myset.size());
			
	}

}
