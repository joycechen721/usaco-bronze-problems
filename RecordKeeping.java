//package bronze_questions;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class RecordKeeping {
	public static void main(String[] argv) throws IOException {
		//taking input
		Scanner sc = new Scanner (new File ("records.in"));
		int N = sc.nextInt();
		String lines [ ] = new String [N];
		for (int line = 0; line < N; line++) {
			String [ ] names = new String [3];
			names [0] = sc.next();
			names [1] = sc.next();
			names [2] = sc.next();
			Arrays.sort(names);
			lines [line] = names[0] + " " + names[1] + " "+ names[2]; //concatenate the names into single string
		}

		Arrays.sort(lines); //sorts into alphabetical order
		int maxCounter = 0, count = 1; //not count = 0 ?
		for (int i = 1; i < N; i++) {
			if (lines[i].equals(lines[i-1])) 
				count++;
			else 
				count = 1; //reset count if a different string comes in; otherwise count would keep adding
			
			maxCounter = Math.max(maxCounter, count); //if all names are the same
		}
		
		PrintWriter out = new PrintWriter(new FileWriter ("records.out"));
		out.println (maxCounter);
		out.close();
	}
}
