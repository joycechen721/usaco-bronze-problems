//package bronze_questions;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TheBovineShuffle {
	public static void main(String[] argv) throws IOException {
		Scanner in = new Scanner (new File("shuffle.in"));
		int N = in.nextInt();
		int [] instruction = new int[N+1];
		int [] finalLineup = new int [N+1];
		for (int i = 1; i <=N; i++) {
			instruction[i] = in.nextInt(); // 1 3 4 5 2
		}
		
		int [] finalLineUp = new int[N+1];
		for (int i = 1; i <= N; i++)
			finalLineUp[i] = in.nextInt(); //1234567 2222222 etc.
		
		int [] reverseInstruction = new int[N+1];
		for (int i = 1; i <= N; i++)
			reverseInstruction [ instruction[i] ] = i;
		
		for (int s = 0; s < 3; s++) {
			int output [] = new int [N+1];
			for (int i = 1; i <= N; i++) {
				output[reverseInstruction [i] ] = finalLineUp[i];
			}
			finalLineUp = output; //loop through again
		}
		
		
		PrintWriter out = new PrintWriter(new FileWriter ("shuffle.out"));
		for (int i = 1; i <= N; i++) {
			out.println (finalLineUp[i]);
		}
		out.close();
	}
}
