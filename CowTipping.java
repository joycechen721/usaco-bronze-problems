package bronze_questions;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CowTipping {
	public static void main(String[] argv) throws IOException {
		Scanner in = new Scanner (new File("cowtip.in"));
		int N = in.nextInt();
		int [][] farm = new int [N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				farm [i][j] = in.nextInt();
			}
		}
		
		int count = 0;
		for (int r = 0; r < N; r++) {
			for (int c = 0; c < N; c++) {
				if (farm [r][c] == 0) farm [r][c] = 2;
				
			
			}
		}
		
		
		
		
	}
}
