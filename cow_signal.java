package USACO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class cow_signal {
    public static void main(String argv[]) throws IOException {

        PrintWriter out = new PrintWriter(new FileWriter("cowsignal.out"));
        Scanner in = new Scanner(new File("cowsignal.in"));

        int M = in.nextInt();
        int N = in.nextInt();
        int K = in.nextInt();
        String [] lines = new String[M];
        for (int i = 0; i < M; i++)
            lines[i] = in.next();

        for (String origLine : lines) {
            //LINE duplication; looping through all of this for K times
            for (int km = 0; km < K; km++) {
                //looping through each character of the string
                for (int i = 0; i < origLine.length(); i++) {
                    char c = origLine.charAt(i); //this is the character at position i in the String origLine
                    //CHARACTER duplication
                    for (int kc = 0; kc < K; kc++)
                        out.print(c);
                }
                out.println(); //after each new line, println
            }
        }
        out.close();
    }
}
