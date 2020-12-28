package USACO;

import java.io.*;
import java.util.Scanner;

public class promotion_counting {
    public static void main (String argv[]) throws IOException{

        Scanner sc = new Scanner (new File("promote.in"));
        int b_before = sc.nextInt();
        int b_after = sc.nextInt();
        int s_before = sc.nextInt();
        int s_after = sc.nextInt();
        int g_before = sc.nextInt();
        int g_after = sc.nextInt();
        int p_before = sc.nextInt();
        int p_after = sc.nextInt();

        int g_to_p = p_after - p_before;
        int s_to_g = g_after - (g_before - g_to_p);
        int b_to_s = s_after - (s_before - s_to_g);

        PrintWriter out = new PrintWriter (new FileWriter ("promote.out"));
        out.println(b_to_s);
        out.println(s_to_g);
        out.println(g_to_p);
        out.close();
    }
}
