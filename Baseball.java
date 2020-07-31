//package bronze_questions;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Arrays;

public class Baseball {
	public static void main(String[] argv) throws IOException {
		//taking input
		Scanner sc = new Scanner (new File ("baseball.in"));
		int N = sc.nextInt();
		int [] cowPosition = new int [N];
		for (int i = 0; i < N; i++) {
			cowPosition [i] = sc.nextInt();
		}
		Arrays.sort (cowPosition);
		
		int count = 0;
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				int distanceXY = cowPosition [j] - cowPosition[i];
				for (int k = j + 1; k < N; k++) {
					int distanceYZ = cowPosition[k] - cowPosition[j];
					if (distanceYZ <= 2 * distanceXY && distanceYZ >= distanceXY) count++;
					//else if (distanceYZ > distanceXY * 2) break;
				}
			}
			
		}
		
		System.out.println (count);
		PrintWriter out = new PrintWriter(new FileWriter ("baseball.out"));
		out.println (count);
		out.close();
		
	}
}
