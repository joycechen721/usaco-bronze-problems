package USACO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class cowsum {
    public static void main(String[] argv) throws IOException {

        PrintWriter out = new PrintWriter(new FileWriter("cowsum.out"));
        Scanner in = new Scanner(new File("cowsum.in"));

        int N = in.nextInt();
        int time = in.nextInt();
        int cows [][] = new int [N][6];
        for (int i = 0; i < N; i++){
            for (int j = 0; j < 6; j++){
                cows[i][j] = in.nextInt();
            }
        }

        int maxAttribute = 0;
        for (int i = 0; i < N; i++){ //looping through rows
            if (time >= cows[i][4] && time <= cows[i][5]){
                break;
            }
            else{
                maxAttribute = findMax;
                System.out.println(maxAttribute);
            }
            for (int j = 0; j < 6; j++){

            }
        }
    }

    public static boolean findMax (int array [][], int i, int j){
        
    }
}
