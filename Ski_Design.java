package USACO;

import java.io.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ski_Design {
    public static void main(String argv[]) throws IOException {

        PrintWriter out = new PrintWriter(new FileWriter("skidesign.out"));
        Scanner in = new Scanner(new File("skidesign.in"));

        int numHills = in.nextInt();
        ArrayList <Integer> hills = new ArrayList <> ();
        for (int i = 0; i < numHills; i++){
            hills.add(in.nextInt());
        }
        Collections.sort(hills);

        int constantLowest = hills.get(0);
        int lowest = hills.get(0);
        int constantHighest = hills.get(numHills-1);
        int highest = hills.get(numHills-1);


        int units = 0;
        System.out.println(units);
        out.println(units);
        out.close();
    }
}
