//package USACO;

//basically its saying to find the smallest consecutive number that
// is unique. So what I need to write is one number more than the
// largest repeating pattern of characters. USE SUBSTRINGS

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Where_Am_I {
    public static void main(String argv[]) throws IOException {

        PrintWriter out = new PrintWriter(new FileWriter("whereami.out"));
        Scanner in = new Scanner(new File("whereami.in"));

        int N = in.nextInt();
        String mailBoxes = in.next();

        for (int length = 1; length < N; length++){
            boolean good = true;
            for (int start = 0; start + length <= N; start++){
                String substring1 = mailBoxes.substring(start, start+length);
                for (int start2 = start + length; start2 + length <= N; start2++){
                    String substring2 = mailBoxes.substring(start2, start2+length);
                    if (substring1.equals(substring2)) {
                        good = false;
                        break;
                    }
                }
                if (!good){
                    break;
                }
            }
        if (good){
           out.println(length);
            break;
        }
        }
        out.close();

    }
}