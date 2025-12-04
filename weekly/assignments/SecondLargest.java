package weekly.assignments;



	import java.util.Arrays;
	import java.util.Collections;
	import java.util.List;

	public class SecondLargest {

	    public static void main(String[] args) {

	        Integer[] array = {3, 2, 11, 4, 6, 7};

	        // Convert array into list
	        List<Integer> list = Arrays.asList(array);

	        // Sort the list in ascending order
	        Collections.sort(list);

	        // Pick 2nd element from the last
	        int secondLargest = list.get(list.size() - 2);

	        System.out.println("Second Largest Number: " + secondLargest);
	    }
	}


