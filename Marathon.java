//package bronze_questions;

import java.io.*;
import java.util.Scanner;

public class Marathon {

	public static void main(String[] argv) throws IOException {
		//taking input
		Scanner sc = new Scanner (new File ("marathon.in"));
		int N = sc.nextInt();
		int [ ] x = new int [N];
		int [ ] y = new int [N];
		for (int i = 0; i < N; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		
		//algorithm (complete search)
		int minTotal = Integer.MAX_VALUE;
		for (int i = 1; i <= N - 2; i++) {
			//calculate total running distance if I skip CP#1
			int total = 0;
			for (int cp = 1; cp <= N-1; cp++) {
				if (cp != i) {
					int distance = Math.abs(x[cp] - x[cp-1]) + 
							       Math.abs((y [cp] - y[cp-1]));
					total += distance;
				}
				else {
					int distance = Math.abs(x[cp+1] - x[cp-1]) + 
						           Math.abs((y [cp+1] - y[cp-1]));
					total += distance;
					cp++;
				}
			}
			if (total < minTotal) minTotal = total;
		}
		
		PrintWriter out = new PrintWriter(new FileWriter ("marathon.out"));
		out.println(minTotal);
		out.close();
		
		
	}

}
