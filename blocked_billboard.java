package USACO;
import java.util.Scanner;
import java.io.*;

public class blocked_billboard {
    public static void main(String argv[]) throws IOException {

        Scanner in = new Scanner(new File("billboard.in"));
        PrintWriter out = new PrintWriter(new File("billboard.out"));

        int bill1_x1 = in.nextInt(); int bill1_y1 = in.nextInt();
        int bill1_x2 = in.nextInt(); int bill1_y2 = in.nextInt();
        int bill2_x1 = in.nextInt(); int bill2_y1 = in.nextInt();
        int bill2_x2 = in.nextInt(); int bill2_y2 = in.nextInt();
        int bill3_x1 = in.nextInt(); int bill3_y1 = in.nextInt();
        int bill3_x2 = in.nextInt(); int bill3_y2 = in.nextInt();

        int areaBill1 = (bill1_x2 - bill1_x1) * (bill1_y2 - bill1_y1);
        int areaBill2 = (bill2_x2 - bill2_x1) * (bill2_y2 - bill2_y1);

        int maxX1 = Math.max(bill1_x1, bill3_x1);
        int minX_1 = Math.min(bill1_x2, bill3_x2);
        int maxY1 = Math.max(bill1_y1, bill3_y1);
        int minY_1 = Math.min (bill1_y2, bill3_y2);
        int overlap_bill1 = (Math.max(0, minX_1 - maxX1)) *  (Math.max(0, minY_1 - maxY1));

        int maxX2 = Math.max(bill2_x1, bill3_x1);
        int minX_2 = Math.min(bill2_x2, bill3_x2);
        int maxY2 = Math.max(bill2_y1, bill3_y1);
        int minY_2 = Math.min (bill2_y2, bill3_y2);
        int overlap_bill2 = (Math.max(0, minX_2 - maxX2)) *  (Math.max(0, minY_2 - maxY2));

        int area = (areaBill1 + areaBill2) - (overlap_bill1 + overlap_bill2);
        out.println(area);
        System.out.println(area);
        out.close();

    }
}
