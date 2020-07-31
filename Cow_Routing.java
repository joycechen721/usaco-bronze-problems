//package bronze_questions;

import java.io.*;
import java.util.Scanner;

public class Cow_Routing {

	public static void main(String[] argv) throws IOException {
		
		Scanner sc = new Scanner (new File ("cowroute.in"));
		
		int cityA = sc.nextInt();
		int cityB = sc.nextInt();
		int numOfRoutes = sc.nextInt();
		int minCost = Integer.MAX_VALUE;
		
		for (int i = 0; i < numOfRoutes; i++) {
			int costOfRoute = sc.nextInt();
			int numOfCities = sc.nextInt();
			//int citiesOnRoute [] = new int [numOfCities];
			boolean alreadySeenA = false;
			for (int j = 0; j < numOfCities; j++) {
				int oneCity = sc.nextInt();
				if (oneCity == cityA) {
					alreadySeenA = true;
				}
				else if (oneCity == cityB) {
					if (alreadySeenA) {
						minCost = Math.min(minCost, costOfRoute);
					}
				}
			}
			
		}
			if (minCost == Integer.MAX_VALUE) minCost = -1;
		
		
		
		
		PrintWriter out = new PrintWriter(new FileWriter ("cowroute.out"));
		out.println (minCost);
		out.close();

	}

}
