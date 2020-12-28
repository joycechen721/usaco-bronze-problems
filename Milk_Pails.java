package USACO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Milk_Pails {
    public static void main(String argv[]) throws IOException {

        PrintWriter out = new PrintWriter(new FileWriter("pails.out"));
        Scanner in = new Scanner(new File("pails.in"));

        int smallPail = in.nextInt();
        int mediumPail = in.nextInt();
        int bigPail = in.nextInt();

        int maxAmount = 0;
        int currAmount = 0;
        for (int i = 0; i <= bigPail/smallPail; i++) { // has to be "<=" because there can be zero small pails as well -- think REAL, instead of "logically" like other for loops
            int mediumToBig = mediumPail * ((bigPail - smallPail * i) / mediumPail);
            currAmount = smallPail * i + mediumToBig;
            if (currAmount > maxAmount && currAmount <= bigPail)
                maxAmount = currAmount;
        }

        System.out.println(maxAmount);
        out.println(maxAmount);
        out.close();

    }
}
