package USACO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] argv) throws IOException {

        PrintWriter out = new PrintWriter(new FileWriter("fibonacci.out"));
        Scanner in = new Scanner(new File("fibonacci.in"));

        int N = in.nextInt();
        long a = 1;
        long b = 1;
        if (N == 1)
            out.println(1);
        else if (N == 2)
            out.println(1);
        else {
            for (int i = 0; i < N - 2; i++) {
                long c = b;
                b = a + b;
                a = c;
            }
            out.println(b);
        }
        out.close();
    }

//    public int fibonacci (int a, int b){
//        int c = a + b;
//        return c;
//    }
}
