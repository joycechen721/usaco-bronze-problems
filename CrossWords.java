//package bronze_questions;

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class CrossWords {
	public static void main(String[] argv) throws IOException {
		Scanner in = new Scanner (new File("crosswords.in"));
		int N = in.nextInt();
		int M = in.nextInt();
		char [][] grid = new char [N][M];
		for (int r = 0; r < N; r++) {
			if (in.hasNext()) {
				String line = in.next();
				grid[r] = line.toCharArray();
			}
		}
		
		ArrayList <Integer> xValues = new ArrayList <Integer> ();
		ArrayList <Integer> yValues = new ArrayList <Integer> ();
		
		for (int r = 0; r < N; r++) {
			for (int c = 0; c < M; c++) {
				if ((c+2) < M && (grid[r][c] == '.') && ((c==0)||(grid[r][c-1] == '#')) && 
						(grid[r][c+1] == '.' && grid[r][c+2] == '.')){
							xValues.add(r);
							yValues.add(c);
							continue;
				}
				if ((r+2) < N && (grid[r][c] == '.') && ((r==0)||(grid[r-1][c] == '#')) && 
						(grid[r+1][c] == '.' && grid[r+2][c] == '.')) {
							xValues.add(r);
							yValues.add(c);
				}
				
			}
		}
		PrintWriter out = new PrintWriter(new FileWriter ("crosswords.out"));
		out.println(xValues.size());
		System.out.println(xValues.size());
		for (int i = 0; i < xValues.size(); i++) {
			out.println((xValues.get(i) +1) + " " + (yValues.get(i)+1));
		}
		out.close();
		
		
	}
}
