package USACO;
// commented out: timed out after 6th test case
//new code: still timed out from 7-12, but shorter and more efficient code
//REMEMBER TO WRITE CLASSES FOR REPEATING STUFF

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Swapity_Swap {
    public static void main(String argv[]) throws IOException {

        PrintWriter out = new PrintWriter(new FileWriter("swap.out"));
        Scanner in = new Scanner(new File("swap.in"));

        int numOfCows = in.nextInt();
        int K = in.nextInt();
        int Aa = in.nextInt();
        int Ab = in.nextInt();
        int Ba = in.nextInt();
        int Bb = in.nextInt();

        int[] cowOrder = new int[numOfCows];
        for (int i = 0; i < numOfCows; i++) {
            cowOrder[i] = i + 1;
        }
        for (int i = 0; i < K; i++) {
            swap(cowOrder, Aa, Ab);
            swap(cowOrder, Ba, Bb);
        }
        for (int i = 0; i < numOfCows; i++){
            out.println(cowOrder[i]);
        }
        out.close();
    }

    private static void swap(int[] array, int a, int b) {
        while (a < b) {
            int temp = array[a - 1];
            array[a - 1] = array[b - 1];
            array[b - 1] = temp;
            a++;
            b--;
        }
    }
}


//    int[] cowOrder = new int [numOfCows + 1];
//        int[] cowOrderCopy = new int [numOfCows + 1];
//        for (int i = 1; i <= numOfCows; i++){
//            cowOrder[i] = i;
//            cowOrderCopy[i] = i;
//        }
//        cowOrder[0] = 0;
//        cowOrderCopy[0] = 0;
//
//        for (int i = 0; i < K; i++){
//            int ab = Ab; int bb = Bb;
//            for (int a = Aa; a <= Ab; a++){
//                cowOrder[a] = cowOrderCopy[ab];
//                ab--;
//            }
//            for (int j = 0; j <= numOfCows; j++){
//                cowOrderCopy[j] = cowOrder[j];
//            }
//            for (int b = Ba; b <= Bb; b++){
//                cowOrder[b] = cowOrderCopy[bb];
//                bb--;
//            }
//            for (int j = 0; j <= numOfCows; j++){
//                cowOrderCopy[j] = cowOrder[j];
//            }
//        }
//
////        public static void swap(int [] array) {
////            System.out.println("hi");
////        }
//        for (int i = 1; i <= numOfCows; i++){
//            System.out.println(cowOrder[i]);
//            out.println(cowOrder[i]);
//        }
//        out.close();