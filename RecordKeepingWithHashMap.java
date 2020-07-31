package bronze_questions;

import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class RecordKeepingWithHashMap {
	public static void main(String [] argv) throws IOException {
		
		Scanner in = new Scanner (new File("records.in"));
		int N = in.nextInt();
		String lines [] = new String [N];
		HashMap< HashSet<String> , Integer > counts = new HashMap<>(); //each hashset is the three names
		
		int maxCount = 0;
		for (int line = 0; line < N; line ++) {
			HashSet<String> key = new HashSet<>();
			key.add(in.next());
			key.add(in.next());
			key.add(in.next());
			if (counts.containsKey(key)) {
				int currCount = counts.get(key);
				counts.put(key, currCount+1); //increments currCount
				maxCount = Math.max(currCount+1, maxCount);
			}
			else 
				counts.put(key, 1);
		}
		
		System.out.println(maxCount);
		PrintWriter out = new PrintWriter(new FileWriter ("slowdown.out"));
		out.println (maxCount);
		out.close();
	}
}
