package bronze_questions;
import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String arg []) {
		
		ArrayList <Integer> myList = new ArrayList <>();
		ArrayList <String> anotherList = new ArrayList <String>();
		
		myList.add(6);
		myList.add(5);
		myList.add(1);
		
		anotherList.add("Hello");
		
		int num = myList.get(1); //gives value of element at index 1, which is 5!
		
		for (int i = 0; i < myList.size(); i++) 
			System.out.print(myList.get(i) + " ");
		
		myList.remove(0); //removes INDEX 0
		System.out.println(myList);
		
		myList.add(1, 3); //inserts 3 in index 1 of the ArrayList
		System.out.println(myList);
		
		myList.add(5);
		myList.add(5);
		myList.add(5);
		myList.add(5);
		myList.add(5);
		System.out.println(myList);
		
		while(myList.remove((Integer)5)); //returns a boolean; removes the actual 5 in the array, not the number in index 5; but only removes the first 5
		
		System.out.println(myList);
	
	}
}
