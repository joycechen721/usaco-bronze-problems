//package bronze_questions;

import java.util.Scanner;
import java.io.*;

public class MooCryptionTest {
	static int N, M;
	static char [][] board;
	public static void main (String [] argv) throws IOException{
		//take input and put into a matrix
		Scanner in = new Scanner (new File ("moocrypt.in"));
		N = in.nextInt();
		M = in.nextInt();
		board = new char[N][M]; //INITIALIZE THE ARRAY
		for (int r = 0; r < N; r++) {
			if (in.hasNext()) {
				String line = in.next();
				board[r] = line.toCharArray(); //use java API
				System.out.println(board[r]); //test
			}
		}
		//System.out.println (checkCount('Q','M','M')); test
		int maxCount = 0;
		for (char c1 = 'A'; c1 <= 'Z'; c1++) {
			for (char c2 = 'A'; c2 <= 'Z'; c2++) {
				if (c1 == 'M' || c2 == 'O' || c1 == c2) continue; //VERY IMPORTANT LINE?? since no letters can map to itself? i think?
				int count = checkCount(c1, c2, c2);
				maxCount = Math.max(maxCount, count);
			}
		}
		PrintWriter out = new PrintWriter(new FileWriter ("moocrypt.out"));
		out.println(maxCount);
		System.out.println(maxCount);
		out.close();
	}
	
	static int checkCount (char c1, char c2, char c3) {
		int count = 0; //INITIALIZE COUNT HERE NOT ABOVE THE FUNCTION
		for (int i=0; i < N; i++)
		{
			for(int j=0; j < M; j++)
			{
				if(board[i][j] == c1)
				{
					if((j+2) < M && board[i][j+1] == c2 && board[i][j+2] == c3)
						count++;
					if ((j-2) >=0 && board [i][j-1] == c2 && board [i][j-2] == c3)
						count++;
					if ((i+2) < N && board [i+1][j] == c2 && board [i+2][j] == c3)
						count++;
					if ((i-2) >= 0 && board [i-1][j] == c2 && board [i-2][j] == c3)
						count++;
					if ((i+2) < N && (j+2) < M && board [i+1][j+1] == c2 && board [i+2][j+2] == c3)
						count++;
					if ((i-2) >= 0 && (j-2) >= 0 && board [i-1][j-1] == c2 && board [i-2][j-2] == c3)
						count++;
					if ((i-2) >= 0 && (j+2) < M && board [i-1][j+1] == c2 && board [i-2][j+2] == c3)
						count++;
					if ((i+2) < N && (j-2) >= 0 && board [i+1][j-1] == c2 && board [i+2][j-2] == c3)
						count++;
				}
			}
		}
		return count;
	}
}












