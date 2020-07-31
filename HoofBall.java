package bronze_questions;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HoofBall {
	public static void main(String[] argv) throws IOException {
		//make array for each cow's count value
		//when you pass the ball, increase both cows' counts
		//two scenarios - either two end up passing it forever or a cow never gets the ball (count is 0)
		Scanner in = new Scanner (new File("shuffle.in"));
		int N = in.nextInt();
		ArrayList <Integer> positions = new ArrayList <Integer> (N);
		for (int i = 0; i < N; i++)
			positions.add(in.nextInt());
		Collections.sort(positions);
		
		int [] count = new int [N];
		int ballCount = 0;
		
		for (int i = 1; i <= N; i++) {
			if (positions.get(i) - positions.get(i-1) < positions.get(i+1) - positions.get(i)) {	
				count [i] = ballCount++;
				count [i+1] = ballCount++;
			}
			if (positions.get(i) - positions.get(i-1) > positions.get(i+1) - positions.get(i)) {
				count [i] = ballCount++;
				count [i-1] = ballCount++;
			}
			if (positions.get)
		}
		
		int totalBallsNeeded = 0;
		for (int i = 1; i <= N; i++) {
			if (count[i] == 0)
				totalBallsNeeded++;
		}
			
	}
}
