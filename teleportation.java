package USACO;

import java.io.*;
import java.util.Scanner;

public class teleportation {
    public static void main (String argv[]) throws IOException {

        PrintWriter out = new PrintWriter (new FileWriter("teleport.out"));

        Scanner in = new Scanner(new File("teleport.in"));
        int start = in.nextInt();
        int end = in.nextInt();
        int tel_1 = in.nextInt();
        int tel_2 = in.nextInt();

        int path1 = Math.abs(tel_1-start) + Math.abs(tel_2-end);
        int path2 = Math.abs(tel_2-start) + Math.abs(tel_1-end);
        int path3 = Math.abs(start-end);

        int distance = Math.min(path1, Math.min(path2, path3));
        out.println(distance);
        out.close();
    }
}
