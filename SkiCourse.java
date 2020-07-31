//package bronze_questions;

import java.io.*;
import java.util.Scanner;

public class SkiCourse {
	public static void main(String[] argv) throws IOException {
		//taking input
		Scanner sc = new Scanner (new File ("skidesign.in"));
		int N = sc.nextInt();
		int height [] = new int [N];
		int lowestHill = 100, highestHill = 0;
		for (int i = 0; i < N; i++) {
			height[i] = sc.nextInt();
			lowestHill = Math.min(lowestHill, height[i]); //finds the lowest hill in all inputs
			highestHill = Math.max(highestHill, height[i]); // finds the highest hill
		}
		
		//algorithm- as long as the range remains 17, you try out different ways of getting a difference of 17
		int minCost = Integer.MAX_VALUE;  
		for (int low = lowestHill; low < highestHill; low++) {
			 // test the range of [low.......low + 17]
			int totalCostForThisRange = 0;
			for (int hill = 0; hill < N; hill++) {
				if (height [hill] < low)
					totalCostForThisRange += (low - height [hill]) * (low - height [hill]);
				else if (height [hill] > low + 17)
					totalCostForThisRange += (int) Math.pow((height[hill]) - (low+17), 2);
			}
			minCost = Math.min(minCost, totalCostForThisRange);
		}
		
		if (minCost == Integer.MAX_VALUE) minCost = 0;
		
		System.out.println(minCost);
		PrintWriter out = new PrintWriter(new FileWriter ("skidesign.out"));
		out.println (minCost);
		out.close();
	}
}
