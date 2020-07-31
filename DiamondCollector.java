//package bronze_questions;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class DiamondCollector {
	public static void main(String[] argv) throws IOException {
		//taking input
		Scanner sc = new Scanner (new File ("diamond.in"));
		int N = sc.nextInt();
		int K = sc.nextInt();
		int diamonds [ ] = new int [N];
		for (int i = 0; i < N; i++) {
			diamonds [i] = sc.nextInt();
		}
		Arrays.sort(diamonds);
		int maxCounter = 0;
		for (int minSizeIndex = 0; minSizeIndex <= diamonds.length - 1; minSizeIndex++) {
			int minSize = diamonds[minSizeIndex];
			int maxSize = minSize + K;
			int counter = 0;
			for (int d = minSizeIndex - 1; d >= 0; d--) {
				if (diamonds[d] == minSizeIndex)
					counter++;
				else break;
			}
			for (int d = minSizeIndex ; d < diamonds.length; d++) {
				if (diamonds [d] >= minSize && diamonds [d] <= maxSize)
					counter ++;
				else if (diamonds[d] > maxSize)
					break;
			}
			maxCounter = Math.max(maxCounter, counter);
		}
		
		
		
		PrintWriter out = new PrintWriter(new FileWriter ("diamond.out"));
		out.println (maxCounter);
		out.close();
	}
}