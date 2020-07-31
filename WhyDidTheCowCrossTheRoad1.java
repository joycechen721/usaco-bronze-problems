//package bronze_questions;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class WhyDidTheCowCrossTheRoad1 {
	public static void main(String[] argv) throws IOException {
		//taking input
		Scanner sc = new Scanner (new File ("crossroad.in"));
		int N = sc.nextInt();
		int side [] = new int [11];
		Arrays.fill(side, -1);
		int counter = 0;
		for (int i = 0; i < N; i++) {
			int cowId = sc.nextInt();
			int currentSide = sc.nextInt();
			if (side[cowId] != -1 && currentSide != side[cowId])
				counter ++;
			side[cowId] = currentSide;
		}
		
		System.out.println(counter);
		PrintWriter out = new PrintWriter(new FileWriter ("crossroad.out"));
		out.println (counter);
		out.close();
	}
	
}
