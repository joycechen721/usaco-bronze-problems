package USACO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Triangle {
    public static void main(String argv[]) throws IOException {

        PrintWriter out = new PrintWriter(new FileWriter("triangles.out"));
        Scanner in = new Scanner(new File("triangles.in"));

        int numPoints = in.nextInt();
        int [] xCoors = new int [numPoints];
        int [] yCoors = new int [numPoints];
        for (int i = 0; i < numPoints; i++){
            xCoors[i] = in.nextInt();
            yCoors[i] = in.nextInt();
        }

        int maxArea = 0;
        for (int i = 0; i < numPoints ; i++) {
            int xLength = 0; int yLength = 0;
            int xCoor1 = xCoors[i];
            int yCoor1 = yCoors[i];


            for (int a = i + 1; a < numPoints - 1; a++) {
                int xUpdate = 0; int yUpdate = 0;
                int xCoor2 = xCoors[a];
                int yCoor2 = yCoors[a];
                if (xCoors[a] == xCoor1) {
                    yLength = Math.abs(yCoors[a] - yCoor1);
                    yUpdate++;
                }
                else if (yCoors[a] == yCoor1) {
                    xLength = Math.abs(xCoors[a] - xCoor1);
                    xUpdate++;
                }


                 for (int j = i + 1; j < numPoints; j++) { //STARTS AT i+1
                    if (yUpdate == 0 && xUpdate == 0)
                        break;
                    else if (yUpdate == 1){
                        if (yCoors[j] == yCoor1)
                            xLength = Math.abs(xCoors[j] - xCoor1);
                        else if (yCoors[j] == yCoor2)
                            xLength = Math.abs(xCoors[j] - xCoor2);
                    }
                    else{
                        if (xCoors[j] == xCoor1)
                            yLength = Math.abs(yCoors[j] - yCoor1);
                        else if (xCoors[j] == xCoor2)
                            yLength = Math.abs(yCoors[j] - yCoor2);
                    }
                    int area = xLength * yLength;
                    maxArea = Math.max(maxArea, area);
                    }

            }

        }
        System.out.println(maxArea);
        out.println(maxArea);
        out.close();
    }
}