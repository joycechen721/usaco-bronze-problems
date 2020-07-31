package bronze_questions;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class CowCrossing {
	
	static String PROB_NAME = "crossings";
	public static void main(String[] argv) throws IOException {
		//solve ("corssings.in", "crossings.out");  -- when you submit comment out bottom
		for (int i = 1; i <= 15; i++) { 
			System.out.print("Test #" + i + "...");
			String infile = PROB_NAME + "/" + i +".in";
			String outfile = PROB_NAME + "/" + i +".myout";
			long before = System.currentTimeMillis();
			solve (infile, outfile);
			long after = System.currentTimeMillis();
			System.out.print("took" + (after - before) + "millisec...");
			String correctfile = PROB_NAME + "/" + i +".out";
			compare (outfile, correctfile);
		}
	}
	
	
	public static void compare (String myOutputFile, String corrOutputFile) throws IOException{
		Scanner sc1 = new Scanner (new File (myOutputFile));
		String myOutput = sc1.next();
		Scanner sc2 = new Scanner (new File(corrOutputFile));
		String corrOutput = sc2.next();
		if (myOutputFile == corrOutputFile) {
			System.out.print("Passed.");
		}
		else 
			System.out.print("Failed.");
		System.out.println("Expected result:" + corrOutput + ", myOutput: " + myOutput);
	}
	
	
	static class Cow implements Comparable <Cow>{
		int from, to;
		public Cow (int from, int to) {
			this.from = from;
			this.to = to;
		}
		public int compareTo (Cow anotherCow) {
			return from - anotherCow.from;
			//return name.compareTo(anotherCow.name) -- for Strings
		}
	}
	
	
	public static void solve (String inFile, String outFile) throws IOException {
		String file = "crossings";
		Scanner sc = new Scanner (new File ("crossings.in"));
		int N = sc.nextInt();
		Cow [] cows = new Cow [N];
		for (int i = 0; i < N; i++)
			cows[i] = new Cow (sc.nextInt(), sc.nextInt());
		Arrays.sort(cows);
		int max_to_left_cows [] = new int [N];
		int min_to_right_cows [] = new int [N];
		
		max_to_left_cows [0] = cows [0].to;
		
		for (int i = 1; i < N; i++) {
				max_to_left_cows [i] = Math.max(cows[i].to, max_to_left_cows [i-1]);
		}
		min_to_right_cows [N-1] = cows [N-1].to;
		for (int i = N - 2; i >= 0; i--) {
			min_to_right_cows [i] = Math.min(cows[i].to, min_to_right_cows [i+1]);
		}
		int safeCount = 0;
		for (int i = 0; i < N; i++) {
			boolean crossingCase_1 = (i != 0 && cows[i].to < max_to_left_cows [i-1]);
			boolean crossingCase_2 = (i != N-1 && cows[i].to > min_to_right_cows[i+1]);
			if (!crossingCase_1 && !crossingCase_2)
				safeCount ++;
		}
		System.out.println(safeCount);
		PrintWriter out = new PrintWriter(new FileWriter ("crossings.out"));
		out.println(safeCount);
		out.close();
	}
}
