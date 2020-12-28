//package USACO;
//MORE WORK ON

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class blocked_billboard_2 {
    public static void main(String argv[]) throws IOException {

        Scanner in = new Scanner(new File("billboard.in"));
        PrintWriter out = new PrintWriter(new File("billboard.out"));

        int bill1_x1 = in.nextInt(); int bill1_y1 = in.nextInt();
        int bill1_x2 = in.nextInt(); int bill1_y2 = in.nextInt();
        int bill2_x1 = in.nextInt(); int bill2_y1 = in.nextInt();
        int bill2_x2 = in.nextInt(); int bill2_y2 = in.nextInt();

        if((bill2_x2 - bill2_x1 >= bill1_x2 - bill1_x1) && ((bill2_y2 > bill1_y1 && bill2_y2 < bill1_y2) || (bill2_y1 > bill1_y1 && bill2_y1 < bill1_y2)))
            out.println((Math.max(0, bill2_y1 - bill1_y1) + Math.max(0, bill1_y2 - bill2_y2)) * (bill1_x2 - bill1_x1));

        else if((bill2_x2 - bill2_x1 >= bill1_x2 - bill1_x1) && ((bill2_x2 > bill1_x1 && bill2_x2 < bill1_x2) || (bill2_x1 > bill1_x1 && bill2_x1 < bill1_x2)))
            out.println((Math.max(0, bill2_x1 - bill1_x1) + Math.max(0, bill1_x2 - bill2_x2)) * (bill1_y2 - bill1_y1));

        else if (bill2_x2 >= bill1_x1 && bill2_x1 <= bill1_x1 && bill2_y2 >= bill1_y2 && bill2_y1 <= bill1_y1)
            out.println(0);

        else
            out.println((bill1_x2 - bill1_x1) * (bill1_y2 - bill1_y1));

        out.close();
    }
}
