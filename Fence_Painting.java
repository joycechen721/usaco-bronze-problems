//package bronze_questions;

import java.io.*;
import java.util.Scanner;

public class Fence_Painting {

	public static void main(String[] argv) throws IOException {
		
		Scanner sc = new Scanner (new File ("paint.in"));
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int max;
		int min;
		             
//		if (a < c && d < b) area = b-a;
//		else if (a > c && d < b) area = b-c;
//		else if (a > c && d > b) area = d-c;
//		else area = d-a;
		
		if (d > b) max = d;
		else max = b;
		if (a > c) min = c;
		else min = a;
		
		PrintWriter out = new PrintWriter(new FileWriter ("paint.out"));
	    if (c < b && a < d) out.println(max - min);
	    else out.println (max - min - (Math.abs(c-b)));
	    out.close();

	}

}
