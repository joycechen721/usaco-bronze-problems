package bronze_questions;
import java.util.*;

public class HashSetPractice {
	public static void main(String argv [ ]) {
		
		ArrayList <Integer> aList = new ArrayList< > ();
		
		
	
		HashSet <Integer> hSet = new HashSet< > (); //same idea as ArrayList
		
//		Scanner sc = new Scanner(System.in);
//		int aNum = sc.nextInt();
//		hSet.add(aNum);
//		
//		hSet.add(2);
//		hSet.add(3);
//		hSet.add(6);
//		hSet.add(2);

//		for (int eachNum : hSet) {
//			System.out.println(eachNum);
//			
//		}
//		
//		for (int n = 0; n < 100000; n++) {
//			int num = (int)(Math.random()*100000);
//			aList.add(num);
//			hSet.add(num);
//		}
//		
//		//hashset is faster than arraylist
//		System.out.println("arraylist:");
//		long time1 = System.currentTimeMillis();
//		System.out.println(aList.contains(5000));
//		long time2 = System.currentTimeMillis();
//		System.out.println("took"+ (time2-time1) + "msec");
//		
//		System.out.println("hashset:");
//		System.out.println(aList.contains(5000));
//		long time3 = System.currentTimeMillis();
//		System.out.println("took"+ (time3-time2) + "msec");
//		
//		for (int n : hSet)
//			System.out.println(n);
		
		//finding intersection of 2 sets -- if intersect, add to s3
		HashSet<Integer> s1 = new HashSet<>();
		HashSet<Integer> s2 = new HashSet<>();
		s1.add(3);
		s1.add(3);
		s1.add(1);
		s1.add(7);
		s2.add(8);
		s2.add(5);
		s2.add(2);
		s2.add(7);
		
		s1.retainAll(s2); //removes everything in s1 that's not part of s2; s1 becomes intersection; original s1 is gone
		for (int n1 : s1) {
			System.out.print(n1 + ""); //prints 7 because that's the element s1 and s2 share
		}
		HashSet<Integer> s3 = new HashSet<>();
		for (int n1 : s1) {
				if (s2.contains(s1))
					s3.add(n1);
		}
		
		for (int n : s3) {
			System.out.print(n + "");
		}
	}
	
}
