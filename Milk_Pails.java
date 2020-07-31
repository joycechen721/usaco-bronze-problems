//package bronze_questions;

import java.io.*;
import java.util.Scanner;

public class Milk_Pails {

	public static void main(String[] argv) throws IOException {
		Scanner sc = new Scanner (new File ("pails.in"));
		
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int M = sc.nextInt();
		
		int maxTotal = 0;
	    for (int i = 0; i <= M/X; i++) {
	    	int totalX = X * i;
	    	int totalY = (M - totalX) / Y;
	    	int total = totalX + totalY * Y;
	    	if (total > maxTotal) maxTotal = total;
	    }
	    PrintWriter out = new PrintWriter(new FileWriter ("pails.out"));
		out.println (maxTotal);
		out.close();
	}

}
