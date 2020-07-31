package bronze_questions;

import java.io.*;
import java.util.Scanner;

public class moocryptionTEACHER {
	static int N;
	static int M;
	static char [][] board;
	public static void main (String [] argv) throws IOException{
		Scanner in = new Scanner (new File ("moocrypt.in"));
		N = in.nextInt();
		M = in.nextInt();
		board = new char [N][M];
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				board [i][j] = in.next().charAt(j); //ask about scanner and char
				System.out.println(board[i][j]);
			}
		}
		int maxCount = 0;
		//build all match combination as a string XYY
		for (char c1 = 'A'; c1 <= 'Z'; c1++) {
			for (char c2 = 'A'; c2 <= 'Z'; c2++) {
				if (c1 == 'M' || c2 == 'O' || c1 == c2) continue;
				//now this XYY is a valid possible option to be MOO
				int count = count(c1,c2,c2);
				maxCount = Math.max(maxCount, count); //finding the maximum XYY that appears
			}
		}
		PrintWriter out = new PrintWriter(new FileWriter ("moocrypt.out"));
		out.println(maxCount);
		System.out.println(maxCount);
		out.close();
	}
	
	static int match(char c1, char c2, char c3, char p1, char p2, char p3) {
		if (c1 == p1 && c2 == p2 && c3 == p3)
			return 1;
		else return 0;
	}
	static int count(char c1, char c2, char c3) { //counting how much XYY appears vertically, horizontally, diagonally
		int count = 0;
		for (int r = 0; r < N; r++) { //N is the number of rows, M is the number of columns
			for (int c = 0; c < M; c++) {
				//each row
				if (c+2 < M)
					count += match(c1,c2,c3, board[r][c], board[r][c+1], board[r][c+2]);
				if (c-2 >= 0)
					count += match(c1,c2,c3, board[r][c], board[r][c-1], board[r][c+2]);
				//each column
				if (r+2 < N)
					count += match(c1,c2,c3, board[r][c], board[r+1][c], board[r+2][c]);
				if (r-2 >= 0)
					count += match(c1,c2,c3, board[r][c], board[r-1][c], board[r-2][c]);
				//check each diagonal
				if (r+2 < N && c+2 < M)
					count += match(c1,c2,c3, board[r][c], board[r+1][c+1], board[r+2][c+2]);
				if (r-2 >= 0 && c-2 >= 0)
					count += match(c1,c2,c3, board[r][c], board[r-1][c-1], board[r-2][c-2]);
				if (r-2 >= 0 && c+2 < M)
					count += match(c1,c2,c3, board[r][c], board[r-1][c+1], board[r-2][c+2]);
				if (r+2 < N && c-2 >= 0)
					count += match(c1,c2,c3, board[r][c], board[r+1][c-1], board[r+2][c-2]);
			} 
		}
		return count;
	}
	
	
//	static String PROBNAME = "";
//	public static void main(String[] args) throws IOException {
//		for (int f = 1; f <= 10; f++) {
//			System.out.print("");
//			solve(PROBNAME + "/" + f + ".in", PROBNAME + "/" + f + ".myout");
//			compare(f);
//		}
//	}
//	
//	static void compare(int t) throws IOException {
//		Scanner f1 = new Scanner(new FileReader(PROBNAME + "/" + t + ".out"));
//		Scanner f2 = new Scanner(new FileReader(PROBNAME + "/" + t + ".myout"));
//		while (f1.hasNextLine())
//			if (!f1.nextLine().equals(f2.nextLine())) {
//				System.out.println("solve" + t + "failed");
//				return;
//			}
//		System.out.println("solve" + t + "passed");
//	}
}
