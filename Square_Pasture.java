// package bronze_questions;

import java.io.*;
import java.util.Scanner;

public class Square_Pasture {

	public static void main(String[] argv) throws IOException{
		
		Scanner sc = new Scanner(new File ("square.in"));
		
		int r1_x1 = sc.nextInt();
		int r1_y1 = sc.nextInt();
		int r1_x2 = sc.nextInt();
		int r1_y2 = sc.nextInt();
		
		int r2_x1 = sc.nextInt();
		int r2_y1 = sc.nextInt();
		int r2_x2 = sc.nextInt();
	   	int r2_y2 = sc.nextInt();
	   	
		int max_x;
		int min_x;
		int max_y;
		int min_y = 0;
		
		if (r1_x2 > r2_x2) max_x = r1_x2;
		else max_x = r2_x2;
		
		if (r1_x1 < r2_x1) min_x = r1_x1;
		else min_x = r2_x1;
		
		if (r1_y2 > r2_y2) max_y = r1_y2;
		else max_y = r2_y2;
		
		if (r1_y1 < r2_y1) min_y = r1_y1;
		else min_y = r2_y1;
		
		int x_difference = max_x - min_x;
		int y_difference = max_y - min_y;
		int area;
		
		if (x_difference > y_difference) area = x_difference * x_difference;
		else area = y_difference * y_difference;
		
		PrintWriter out = new PrintWriter(new FileWriter ("square.out"));
	       out.println(area);
	       out.close();

	}

}
