package week3.day1;

import java.util.Arrays;
import java.util.Iterator;

public class LearnArrays {

	public static void main(String[] args) {
		// Array Literal
		//To store  5 marks of a person
		int scores[]= {98,99,97,96,95};
		
	    //To find number of data- length
		int lengthOfArray = scores.length;
		System.out.println("The length is :  "+ lengthOfArray);
		
		//Retrieve a data
		System.out.println(scores[2]);
		
		//Print all the data in an array
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		//To print lowest value
		
		//Sort the array in ascending order
		Arrays.sort(scores);
		//maximum index=length-1
		
		//To print lowest value
		System.out.println("lowest value is"+ scores[0]);
		
		//To print highest value
		System.out.println("highest value" +scores[lengthOfArray-1]);
		
	    //Reverse for loop
	    for (int i = scores.length-1; i >=0; i--) {
			System.out.println(scores[i]);
			
			//By Instantiation
				int[] marks=new int[3];// 3 is number of data we can store.
				marks[0]=65;
				marks[1]=96;
				marks[2]=78;
				
				
		}
		}
	}


