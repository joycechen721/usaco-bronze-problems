package USACO;

//UPDATED VERSION

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Load_Balancing2 {
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
        for (int x = 0; x < numOfCows; x++) { //loop thru x coordinates
            int xCoor = cowsXCoor[x] + 1;

            for (int y = 0; y < numOfCows; y++){ //loop thru y coordinates
              int yCoor = cowsYCoor[y] + 1;
                int q1 = 0; int q2 = 0; int q3 = 0; int q4 = 0;

                for (int i = 0; i < numOfCows; i++){
                    if (cowsXCoor[i] > xCoor && cowsYCoor[i] > yCoor) q1++;
                    else if (cowsXCoor [i] < xCoor && cowsYCoor[i] > yCoor) q2++;
                    else if (cowsXCoor [i] < xCoor && cowsYCoor[i] < yCoor) q3++;
                    else if (cowsXCoor [i] > xCoor && cowsYCoor[i] < yCoor) q4++;
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
