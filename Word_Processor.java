package USACO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Word_Processor {
    public static void main(String argv[]) throws IOException {

        PrintWriter out = new PrintWriter(new FileWriter("word.out"));
        Scanner in = new Scanner(new File("word.in"));

        int numOfWords = in.nextInt();
        int maxCharOnLine = in.nextInt();
        String line [] = new String [numOfWords];
        for (int i = 0; i < numOfWords; i++)
            line[i] = in.next();

        int prevWord = 0;
        for (String word : line){
            if (word.length() + prevWord <= maxCharOnLine) {
                if (prevWord == 0) out.print (word);
                else out.print(" " + word);
                prevWord = word.length() + prevWord;
            }
            else {
                out.println();
                out.print(word);
                prevWord = word.length();
            }
        }
        out.close();
    }
}
