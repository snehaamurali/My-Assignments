package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {
public static void main(String[] args) {
//Declare a list
	List<String> learnerList=new ArrayList<String>();
	System.out.println("The List is: "+learnerList);
	
	//Methods in a list
	//Add an element in the list
	learnerList.add("Snehaa");
	System.out.println("The List is: "+learnerList);
	
	//Add more element
	learnerList.add("Murali");
	learnerList.add("Dhiya");
	System.out.println("The List after adding : "+learnerList);
	
	//Add using Index
	learnerList.add(1, "MSD");
	System.out.println("The List after using index: "+learnerList);
	
	//Add duplicate value
    learnerList.add("Snehaa");
	System.out.println("The List after adding duplicate: "+learnerList);
	
	//Remove an element
	learnerList.remove(2);
	System.out.println("The List after removing: "+learnerList);
	
	//Arrange list in Ascending order /ASCII-sort under classname -Collections
	Collections.sort(learnerList);
	System.out.println("The List after asc: "+learnerList);
	
	//To retrieve particular element from List- get
	String elementAtIndex1 = learnerList.get(2);
	System.out.println("The element after retrieve: "+elementAtIndex1);
	
	//To count number of elements
	int sizeOfList = learnerList.size();
	System.out.println(sizeOfList);
}
}
