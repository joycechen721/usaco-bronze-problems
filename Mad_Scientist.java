package USACO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Mad_Scientist {
    public static void main(String argv[]) throws IOException {

        PrintWriter out = new PrintWriter(new FileWriter("breedflip.out"));
        Scanner in = new Scanner(new File("breedflip.in"));

        int numOfCows = in.nextInt();
        String A = in.next();
        String B = in.next();

        int count = 0;
        boolean last_flipped = false;
        for (int i = 0; i < numOfCows; i++){
            if ((B.charAt(i) != A.charAt(i))){ // if the characters aren't equal
                if (!last_flipped){ // if the last character is NOT flipped, increase count
                    count++;  }
                last_flipped = true; // no matter if the last one was flipped or not, IF the characters are different, this HAS to be set to "flipped"
            }
            else{
                last_flipped = false;
            }
        }

        System.out.println(count);
        out.println(count);
        out.close();
    }
}
