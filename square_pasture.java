package USACO;
import java.util.Scanner;
import java.io.*;

public class square_pasture {
    public static void main(String argv[]) throws IOException {
        Scanner in = new Scanner (new File ("square.in"));
        PrintWriter out = new PrintWriter (new File("square.out"));

        int rect1_x1 = in.nextInt(); int rect1_y1 = in.nextInt();
        int rect1_x2 = in.nextInt(); int rect1_y2 = in.nextInt();
        int rect2_x1 = in.nextInt(); int rect2_y1 = in.nextInt();
        int rect2_x2 = in.nextInt(); int rect2_y2 = in.nextInt();

        int x_min = Math.min(rect1_x1, rect2_x1);
        int x_max = Math.max(rect1_x2, rect2_x2);
        int y_min = Math.min(rect1_y1, rect2_y1);
        int y_max = Math.max(rect1_y2, rect2_y2);
        int sqr_length = Math.max((x_max-x_min), (y_max-y_min));

        out.println(sqr_length*sqr_length);
        out.close();
    }
}
