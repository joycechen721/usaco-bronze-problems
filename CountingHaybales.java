//package bronze_questions;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.io.File;
import java.io.FileWriter;

public class CountingHaybales {
	public static void main(String [] argv)throws IOException{
		//silver problem -- use binary search
		PrintWriter out = new PrintWriter(new FileWriter ("haybales.out"));
		Scanner in = new Scanner (new File("haybales.in"));
		int N = in.nextInt();
		int Q = in.nextInt();
		int location [] = new int [N];
		for (int i = 0; i < N; i++) {
			location[i] = in.nextInt();
		}
		Arrays.sort(location);
		
		for (int i = 0; i < Q; i++) {
			int start = in.nextInt();
			int end = in.nextInt();
			int startIndex = Arrays.binarySearch(location, start);
			int endIndex = Arrays.binarySearch(location, end);
			
			if (startIndex < 0)
				startIndex = (-(startIndex) - 1);
			if (endIndex < 0)
				endIndex = (-(endIndex)-1) - 1;
			
			System.out.println(endIndex - startIndex + 1);
			out.println (endIndex - startIndex + 1);
		}
		out.close();
	}
}
