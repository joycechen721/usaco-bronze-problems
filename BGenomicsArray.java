package bronze_questions;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class BGenomicsArray {
	public static void main(String[] argv) throws IOException {
		Scanner in = new Scanner (new File("cownomics.in"));
		int numOfCows = in.nextInt()/2;
		int numOfPositions = in.nextInt();
		
		char [][] spottyCows = new char [numOfCows][numOfPositions];
		char [][] plainCows = new char [numOfCows][numOfPositions];
		
		for (int c = 0; c < numOfCows; c++) {
			String line = in.next();
			for (int r = 0; r < numOfPositions; r++) {
				spottyCows [c][r] = line.charAt(r);
			}
		}
			
		for (int c = 0; c < numOfCows; c++) {
			String line = in.next();
			for (int r = 0; r < numOfPositions; r++) {
				plainCows [c][r] = line.charAt(r);
			}	
		}
		
		int count = numOfPositions;
		for (int c = 0; c < numOfCows; c++) {
			for (int r = 0; r < numOfPositions; r++) {
				for (int p = 0; p < numOfCows/2; p++) {
				if (spottyCows [c][r] == plainCows[c+p][r] || spottyCows [c+p][r] == plainCows[c][r]) {
					count--;
					break;
				}
				break;
			}
		}
	}
		System.out.println(count);
		PrintWriter out = new PrintWriter(new FileWriter ("cownomics.out"));
		out.println (count);
		out.close();
	}
}
