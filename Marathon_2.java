//package bronze_questions;

import java.io.*;
import java.util.Scanner;

public class Marathon_2 {

	public static void main(String[] argv) throws IOException {
		//taking input
		Scanner sc = new Scanner (new File ("marathon.in"));
		int N = sc.nextInt();
		int [ ] x = new int [N];
		int [ ] y = new int [N];
		int totalDistance = 0;
		for (int i = 0; i < N; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			if (i > 0)
				totalDistance += Math.abs(x[i] - x[i-1] +
								 Math.abs(y[i] - y[i-1]));
		}
		
		//algorithm (complete search)
		int maxSaving = 0;
		for (int i = 1; i <= N - 2; i++) {
			//calculate total running distance if I skip CP#1
			int d1 = Math.abs(x[i] - x[i-1]) + 
			           Math.abs((y [i] - y[i-1]));
			int d2 = Math.abs(x[i+1] - x[i]) + 
			           Math.abs((y [i+1] - y[i]));
			int d3 = Math.abs(x[i+1] - x[i-1]) + 
			           Math.abs((y[i+1] - y[i-1]));
			int saving = d1 + d2 - d3;
			//update maxSaving 
			maxSaving = Math.max(maxSaving, saving);
			/*
			 * if (saving > maxSaving) maxSaving = saving;
			 */
		}
		
		PrintWriter out = new PrintWriter(new FileWriter ("marathon.out"));
		out.println (totalDistance - maxSaving);
		out.close();
		
	}

}
