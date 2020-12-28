package USACO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class spiralPrint {
    public static void main(String[] argv) throws IOException {

        PrintWriter out = new PrintWriter(new FileWriter("spiralprint.out"));
        Scanner in = new Scanner(new File("spiralprint.in"));

        //given: n = number of rows/columns in the square matrix
        int N = in.nextInt();
        int[][] matrix = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        int direction = 0; //0 is right, 1 is down, 2 is left, 3 is up
        int top = 0;
        int right = N - 1;
        int left = 0;
        int bottom = N - 1;
        while (top <= bottom && right >= left) {
            if (direction == 0) {
                for (int i = left; i <= right; i++) {
                    out.println(matrix[top][i]);
                }
                top++;
                direction++;
            } else if (direction == 1) {
                for (int i = top; i <= bottom; i++) {
                    out.println(matrix[i][right]);
                }
                right--;
                direction++;
            } else if (direction == 2) {
                for (int i = right; i >= left; i--) {
                    out.println(matrix[bottom][i]);
                }
                bottom--;
                direction++;
            } else if (direction == 3) {
                for (int i = bottom; i >= top; i--) {
                    out.println(matrix[i][left]);
                }
                left++;
                direction = 0;
            }
        }
        out.close();
    }
}









//
//        for (int i = N; i >= 1; i -= 2){
//            printSpiral(i, matrix);
//        }
//    }
//
//    static void printSpiral(int width, int [][] matrix, int direction) {
//        for (int i = 0; i < width; i++){
//            if (i < width)
//            System.out.println(matrix[i][0]);
//        }
//    }
//}
//
//

//make a function for moving in a circle, parameter is x






//        for (int j = 0; j < N; j++) {
//            for (int i = j * N; i < j * N + N; i++) {
//                System.out.println(matrix[i][]);
//            }
//            for (int i = N * 2 - j - 1; i < N * N; i += N) {
//                System.out.println(matrix[i][]);
//            }
//            for (int i = N * N - 2; i >= N * N - N; i--) {
//                System.out.println(matrix[i][]);
//            }
//            for (int i = N*(N-1) - 1; i < N+1; i -= N){
//                System.out.println(matrix[i][]);
//            }
//        }


