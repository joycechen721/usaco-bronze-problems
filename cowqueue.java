//package bronze_questions;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class cowqueue {
	
		static class Entry implements Comparable <Entry>{ //specify how to sort a list of Entry objects
			int arrival;
			int duration;
			public Entry (int n1, int n2) {
				arrival = n1;
				duration = n2;
			}
			public int compareTo (Entry e) {
				//return arrival - e.arrival;
				if (arrival > e.arrival)
					return 1;
				else if (arrival < e.arrival)
					return -1;
				else 
					return 0;
			}
		}
		public static void main(String[] argv) throws IOException {
			//taking input
			Scanner sc = new Scanner (new File ("cowqueue.in"));
			int N = sc.nextInt();
			Entry [ ] cows = new Entry[N];
			for (int c = 0; c < N; c++) {
				//cows[c] = new Entry (sc.nextInt(), sc.nextInt());
				Entry e = new Entry (sc.nextInt(), sc.nextInt());
				cows[c] = e;
			}
			Arrays.sort(cows);
			
			int time = 0;
			for (int i = 0; i < N; i++) {
				Entry cow = cows[i];
				if (cow.arrival > time) {
					time = cow.arrival;
					time += cow.duration;
				}
				else if (cow.arrival <= time) {
					time += cow.duration;
				}
				
				
			}
			
			System.out.println(time);
			PrintWriter out = new PrintWriter(new FileWriter ("cowqueue.out"));
			out.println(time);
			out.close();
		
	}

}
