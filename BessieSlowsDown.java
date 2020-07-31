//package bronze_questions;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BessieSlowsDown {
	public static void main(String[] argv) throws IOException {
		Scanner in = new Scanner (new File("slowdown.in"));
		int N = in.nextInt();
		ArrayList<Integer> T = new ArrayList<>();
		ArrayList<Integer> D = new ArrayList<>();
		
		//WRONG CODE
//		for (int i = 0; i < N; i++) {
//				  String type = in.next();
//				  int num = in.nextInt();
//				  if (type == "T") 
//					  T.add(num);
//				  if (type == "D")
//					  D.add(num);
//		}
		
		 for (int i = 0; i < N; i++) {
	            char type = in.next().charAt(0);
	            int value = in.nextInt();
	            if (type == 'T')
	                T.add(value);
	            if (type == 'D')
	                D.add(value);
	        }
		 
		Collections.sort(T);
		D.add(1000); //make final destination (1km) a distance event
		Collections.sort(D);  
		
		double currentTime = 0, currentDistance = 0, speed = 1, eventCount = 0;
		while (!D.isEmpty()) {
			char nextEvent;
			if (T.isEmpty())
				nextEvent = 'D';
			else  {
				if ((currentDistance + (T.get(0) - currentTime) * speed) < D.get(0))
					nextEvent = 'T';
				else 
					nextEvent = 'D';
				// nextEvent = (currentDistance + (T.get(0) - currentTime) * speed < D.get(0)) ? 'T' : 'D';
			}
			if (nextEvent == 'T') {
				currentDistance += (T.get(0) - currentTime) * speed;
				currentTime = T.get(0);
				T.remove(0);
			}
			else {
				currentTime += (D.get(0) - currentDistance) / speed;
				currentDistance = D.get(0);
				D.remove(0);
			}
			eventCount++; 
			speed = 1 / (eventCount+1);
		}
		
		System.out.println((int)(currentTime + 0.5));
		PrintWriter out = new PrintWriter(new FileWriter ("slowdown.out"));
		out.println ((int)(currentTime + 0.5));
		out.close();
		
		
	}
}
