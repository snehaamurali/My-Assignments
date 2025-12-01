package week4.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LearnSet {

	public static void main(String[] args) {
		Set<String>mentorsList=new HashSet<String>();//Random order
		mentorsList.add("Snehaa");
		mentorsList.add("Murali");
		mentorsList.add("Dhiya");
		System.out.println("The Set is" +mentorsList);
		//Try to add duplicate values
		mentorsList.add("Snehaa");
		
		int sizeOfText = mentorsList.size();
		System.out.println("The size is" +sizeOfText);
		//get is not available for Set
		
		//add all the elements from one list to another list
		//add all the elements from one set to another set
		
		List<String> trainers=new ArrayList<String>(mentorsList);
		System.out.println("The list is" +trainers);
	}

}
