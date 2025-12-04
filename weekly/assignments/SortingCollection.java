package weekly.assignments;



	import java.util.Arrays;
	import java.util.Collections;
	import java.util.List;

	public class SortingCollection {

	    public static void main(String[] args) {

	        // Step 1: Declare array
	        String[] companies = {"HCL", "Wipro", "Aspire Systems", "CTS"};

	        // Step 2: Convert array to list
	        List<String> list = Arrays.asList(companies);

	        // Step 3: Sort in ascending order
	        Collections.sort(list);

	        // Step 4: Reverse iterate and print
	        for (int i = list.size() - 1; i >= 0; i--) {
	            System.out.print(list.get(i));

	            // to format with comma except the last item
	            if (i != 0) {
	                System.out.print(", ");
	            }
	        }
	    }
	}


