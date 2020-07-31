//package bronze_questions;

import java.io.*;
import java.io.IOException;
import java.util.Scanner;

public class Promotion_Counting {
	  public static void main(String argv[]) throws IOException{
		  
		  //part 1: read input
	       Scanner sc = new Scanner (new File("promote.in"));
	       
	       int b_before = sc.nextInt();
	       int b_after = sc.nextInt();
	       int s_before = sc.nextInt();
	       int s_after = sc.nextInt();
	       int g_before = sc.nextInt();
	       int g_after = sc.nextInt();
	       int p_before = sc.nextInt ();
	       int p_after = sc.nextInt();

	       //part 2: algorithm
	       int g2p = p_after - p_before;
	       // g_after = g_before + s2g - g2p
	       int s2g = g_after - g_before + g2p; 
	       int b2s = s_after - s_before + s2g;

	       //part 3: write output
	       PrintWriter out = new PrintWriter(new FileWriter ("promote.out")); //why is it not generating it
	       out.println(b2s);
	       out.println(s2g);
	       out.println(g2p);
	       out.close();
	   }
}

