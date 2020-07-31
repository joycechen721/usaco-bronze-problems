package bronze_questions;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
																									
public class SecretCode {
		public static void main(String[] argv) throws IOException {
			Scanner in = new Scanner (new File("scode.in"));
			String s = in.nextLine();
			int count = count(s);
																																					
			System.out.println(count);
			PrintWriter out = new PrintWriter(new FileWriter ("scode.out"));
			out.println (count);
			out.close();
	}

static int count (String s) {				
	if (s.length() % 2 == 0) // isn't possible for an even number to be the code
		return 0;
	
	int numOfPossibilities = 0;
	//right is longer than left
	String left = s.substring(0, s.length()/2);																									
	String right = s.substring(s.length()/2);
																																						
		if (right.startsWith(left)) {
			numOfPossibilities++;
			numOfPossibilities += count(right); //could have been more operations
		}
		
		if (right.endsWith(left)) {																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																
			//numOfPossibilities++;
			numOfPossibilities += count(right) + 1;
		}
		
		left = s.substring(0, s.length()/2 + 1);
		right = s.substring(s.length()/2 + 1);
		
		if (left.startsWith(right)) {
			numOfPossibilities++;
			numOfPossibilities += count(left); //could have been more operations
		}
		
		if (left.endsWith(right)) {
			//numOfPossibilities++;
			numOfPossibilities += count(left) + 1;
		}
		return numOfPossibilities;
	}
	
}
