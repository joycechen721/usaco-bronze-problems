package com.USACO_Studying;

/*
ID: hsini_h1
LANG: JAVA
TASK: ride
*/
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class ride {
    public static void main (String [] args) throws IOException {
        Scanner in = new Scanner(new File("ride.in"));
        PrintWriter out = new PrintWriter(new FileWriter("ride.out"));

        String comet = in.next();
        String group = in.next();

        HashMap <Character, Integer> characters = new HashMap<>();
        int num = 1;
        for (char chara = 'A'; chara <= 'Z'; chara++){
            characters.put(chara, num);
            num++;
        }
        int product1 = 1;
        int product2 = 1;
        for (int i = 0; i < comet.length(); i++){
            int num1 = characters.get(comet.charAt(i));
            product1 *= num1;
        }
        for (int i = 0; i < group.length(); i++) {
            int num2 = characters.get(group.charAt(i));
            product2 *= num2;
        }

        if (product1%47 == product2%47)
            out.println("GO");
        else
            out.println("STAY");

        out.close();
    }
}
