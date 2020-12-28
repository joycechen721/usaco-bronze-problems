package USACO;

import java.util.*;

public class HashMap_Practice {

        public static void main (String [] arg) {
            HashMap <String, Integer> studentAges = new HashMap < > ();
            studentAges.put ("Evan",11);
            studentAges.put("Keshav", 15);

            int evanAge = studentAges.get("Evan");
            System.out.println(evanAge); //prints out 11

            System.out.println(studentAges.size()); //prints out how many entrys there are
            for (Map.Entry<String, Integer> e : studentAges.entrySet()) {
                System.out.println(e.getKey() + " ---> " + e.getValue());

            }

            //java.util.Set<String>keys = studentAges.keySet(); //can import here if lazy
            Set<String> keys = studentAges.keySet();
            for (String studentName : keys) {
                System.out.println(studentName);
            }

            boolean hasJasmine = studentAges.containsKey("Jasmine"); //is false
        }
    }
