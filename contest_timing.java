package USACO;

import java.io.*;
import java.util.Scanner;

public class contest_timing {
    public static void main (String argv[]) throws IOException {

        Scanner in = new Scanner (new File ("ctiming.in"));
        PrintWriter out = new PrintWriter(new FileWriter ("ctiming.out"));

        int endDay = in.nextInt();
        int endHour = in.nextInt();
        int endMinute = in.nextInt();

        if (endDay < 11 || (endDay == 11 && endHour >= 11 && endMinute <11)){
            out.println(-1);
        }

        int dayMinutes = (endDay - 11)*1440;
        int hourMinutes = (endHour - 11)*60;
        int minutes = (endMinute - 11);

        int totalMinutes = dayMinutes + hourMinutes + minutes;

        out.println(totalMinutes);
        out.close();
    }
}
