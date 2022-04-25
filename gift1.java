package com.USACO_Studying;

/*
ID: hsini_h1
LANG: JAVA
TASK: gift1
*/
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.*;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class gift1 {
    public static void main (String [] args) throws IOException {
        Scanner in = new Scanner(new File("gift1.in"));
        PrintWriter out = new PrintWriter(new FileWriter("gift1.out"));

        int numStudents = in.nextInt();
        LinkedHashMap <String, Integer> students = new LinkedHashMap <> ();

        for (int i = 0; i < numStudents; i++){
            students.put(in.next(), 0);
        }

        for (int i = 0; i < numStudents; i++){
            String currStudent = in.next();
            int currMoney = in.nextInt();
            int friends = in.nextInt();
            int share = 0;
            if (friends != 0) {
                share = (currMoney - currMoney % friends) / friends;
                students.put(currStudent, students.get(currStudent) - share * friends);
            }

            for (int j = 0; j < friends; j++){
                String friend = in.next();
                students.put(friend, students.get(friend) + share);
            }
        }

        for (String key : students.keySet()){
                out.println(key + " " + students.get(key));
                System.out.println(key + " " + students.get(key));
        }
        out.close();
    }
}
