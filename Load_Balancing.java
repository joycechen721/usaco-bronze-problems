package USACO;

//TIMED OUT VERSION

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Load_Balancing {
    public static void main(String argv[]) throws IOException {

        PrintWriter out = new PrintWriter(new FileWriter("balancing.out"));
        Scanner in = new Scanner(new File("balancing.in"));

        int numOfCows = in.nextInt();
        int maxCoor = in.nextInt();
        int cowsXCoor [] = new int [numOfCows];
        int cowsYCoor [] = new int [numOfCows];
        for (int i = 0; i < numOfCows; i++){
            cowsXCoor [i] = in.nextInt();
            cowsYCoor [i] = in.nextInt();
        }

        int currentMax = 0;
        int minNum = maxCoor;
        for (int x = 2; x < maxCoor; x = x+2) { //loop thru x coordinates

            for (int y = 2; y < maxCoor; y = y+2){ //loop thru y coordinates
                int q1 = 0; int q2 = 0; int q3 = 0; int q4 = 0;

               for (int i = 0; i < numOfCows; i++){
                    if (cowsXCoor[i] > x && cowsYCoor[i] > y) q1++;
                    else if (cowsXCoor [i] < x && cowsYCoor[i] > y) q2++;
                    else if (cowsXCoor [i] < x && cowsYCoor[i] < y) q3++;
                    else if (cowsXCoor [i] > x && cowsYCoor[i] < y) q4++;
               }
                currentMax = Math.max(Math.max(q1, q2), Math.max(q3, q4));
                minNum = Math.min(minNum, currentMax);
            }
        }


        System.out.println(minNum);
        out.println(minNum);
        out.close();

    }
}
