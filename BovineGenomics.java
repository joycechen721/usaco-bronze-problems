package bronze_questions;

import java.io.*;
import java.util.HashSet;
import java.util.Scanner;

public class BovineGenomics {
	public static void main(String[] argv) throws IOException {
		Scanner in = new Scanner (new File("cownomics.in"));
		//2 arrays of hashsets and find the intersection
		int N = in.nextInt();
		int M = in.nextInt();
		
		HashSet<Character>[]spottyGenes = new HashSet [M]; //array of HashSets
		HashSet<Character>[]plainGenes = new HashSet [M];
		
		for (int position = 0; position < M; position++) {
			spottyGenes[position] = new HashSet <>(); //actual HashSet
			plainGenes[position] = new HashSet <>();
			}
			
		for (int cow = 0; cow < N; cow++) {
			String aLine = in.next();
			for (int position = 0; position < M; position++) {
				char g = aLine.charAt(position);
				spottyGenes[position].add(g);
			}
		}
		for (int cow = 0; cow < N; cow++) {
			String aLine = in.next();
			for (int position = 0; position < M; position++) {
				char g = aLine.charAt(position);
				plainGenes[position].add(g);
			}
	}
		
		int count = 0;
		for (int position = 0; position < M; position++) {
			HashSet<Character> s1 = spottyGenes[position];
			HashSet<Character> s2 = plainGenes[position];
			s1.retainAll(s2);
			if (s1.isEmpty()) //if s1 and s2 have nothing in common; since s1 would remove everything that it has in common with s2
				count++;
		}
		
		System.out.println(count);
		PrintWriter out = new PrintWriter(new FileWriter ("cownomics.out"));
		out.println (count);
		out.close();
}
}
