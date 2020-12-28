package USACO;
import java.io.*;
import java.util.Scanner;

//remember that they might not overlap (there are TWO scenarios - either they
 // overlap or not)

public class fence_painting {
    public static void main (String argv[]) throws IOException {
        Scanner in = new Scanner (new File ("paint.in"));
        PrintWriter out = new PrintWriter (new File("paint.out"));

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        if ((b<c) || (d<a)){
            out.println ((b-a) + (d-c));
        }
        else {
            int min = Math.min(Math.min(a,b), Math.min(c,d));
            int max = Math.max(Math.max(a,b), Math.max(c,d));
            out.println(max-min);
        }

        out.close();

    }
}
