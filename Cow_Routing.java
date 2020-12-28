package USACO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Cow_Routing {
    public static void main(String argv[]) throws IOException {

        PrintWriter out = new PrintWriter(new FileWriter("cowroute.out"));
        Scanner in = new Scanner(new File("cowroute.in"));

        int cityA = in.nextInt();
        int cityB = in.nextInt();
        int numPlanes = in.nextInt();

        int minCost = Integer.MAX_VALUE;
        for (int i = 0; i < numPlanes; i++){
            int cost = in.nextInt();
            int numCities = in.nextInt();
            int [] cities = new int [numCities];
            boolean atCityA = false;
            boolean atCityB = false;
            for (int j = 0; j < numCities; j++){
                cities[j] = in.nextInt();
                if (cities[j] == cityA)
                    atCityA = true;
                if (atCityA && cities[j] == cityB)
                    atCityB = true;
            }
            if (atCityA && atCityB){
                minCost = Math.min(minCost, cost);
            }
        }

        if (minCost == Integer.MAX_VALUE)
            out.println(-1);
        else
            out.println(minCost);

        out.close();
    }
}
