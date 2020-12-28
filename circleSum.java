package USACO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

//REVISE: MAX SUBARRAY - MIN SUBARRAY!!!!!!!!!
public class circleSum {
    public static void main(String argv[]) throws IOException {

        PrintWriter out = new PrintWriter(new FileWriter("circlesum.out"));
        Scanner in = new Scanner(new File("circlesum.in"));

        int N = in.nextInt();
        int [] array = new int [N];
        for (int i = 0; i < N; i++){
            array[i] = in.nextInt();
        }

        int maxSum = 0;
        int sum = 0;
        for (int i = 0; i < N; i++){ //looping through beads for starting point i
            for (int k = 0; k < N - i; k++) {
                sum += array[i + k];
                maxSum = Math.max(sum, maxSum);
                if (k == N - i - 1) { //once beads reach full circle
                    for (int j = 0; j < i; j++) {
                        sum += array[j];
                        maxSum = Math.max(sum, maxSum);
                    }
                }
            }
            sum = 0;
        }

        out.println(maxSum);
        out.close();
        }
    }
