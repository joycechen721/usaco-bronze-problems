package USACO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Photoshoot {
    public static void main(String argv[]) throws IOException {

        PrintWriter out = new PrintWriter(new FileWriter("photo.out"));
        Scanner in = new Scanner(new File("photo.in"));

        //input
        int numInt = in.nextInt();
        int [] numbers = new int [numInt];
        for (int i = 0; i < numInt - 1; i++){
            numbers[i] = in.nextInt();
        }

        //basically gives all the combinations of the output - output
        //cannot have ""repeating numbers or 0s or negative numbers"" + 1st num has to be smallest
        int a1 = 0;
        int a2 = 0;
        int [] output = new int [numInt];
        for (int i = 1; i < numbers[0]; i++) {
            a1 = i;
            a2 = numbers[0] - a1;
            output [0] = a1;
            output[1] = a2;
            for (int j = 1; j < numInt - 1; j++) {
                a1 = a2;
                a2 = numbers[j] - a1;
                output[j + 1] = a2;
            }
            int errorCount = 0;
            for (int j = 0; j < numInt; j++){
                if (output[j] <= 0)
                    errorCount++;
                for (int k = j + 1; k < numInt; k++){
                    if (output[k] == output[j])
                        errorCount++;
                }
            }
            if (errorCount == 0){
                for (int j = 0; j < numInt; j++) {
                    if (j == numInt - 1)
                        out.print(output[j]);
                    else
                        out.print(output[j] + " ");
                }
            }
        }
        out.close();
    }
}
