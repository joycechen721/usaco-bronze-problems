package bronze_questions;
import java.io.*;
import java.util.*;

public class SlowDownTeacher {
	public static void main(String[] argv) throws IOException {
	        Scanner f = new Scanner(new FileReader("slowdown.in"));
	        PrintWriter out = new PrintWriter(new FileWriter("slowdown.out"));

	        int totalNumOfEvents = f.nextInt(); //1-1000
	        ArrayList<Integer> T = new ArrayList<Integer>();
	        ArrayList<Integer> D = new ArrayList<Integer>();

	        for (int i = 0; i < totalNumOfEvents; i++) {
	            char type = f.next().charAt(0);
	            int value = f.nextInt();
	            if (type == 'T')
	                T.add(value);
	            else
	                D.add(value);
	        }

	        Collections.sort(T);
	        D.add(1000); //make the final destination a distance event
	        Collections.sort(D);

	        double currTime = 0, currPos = 0, speed = 1, eventCount = 0;
	        while (!D.isEmpty()) {  //we know D events are not empty
	            char nextEvent; //make it either 'T' or 'D'
	            if (T.isEmpty())
	                nextEvent = 'D';
	            else
	                nextEvent = (currPos + (T.get(0) - currTime) * speed < D.get(0)) ? 'T' : 'D';
	            if (nextEvent == 'T') {                 //next T event happens first
	                currPos += (T.get(0) - currTime) * speed;
	                currTime = T.get(0);
	                T.remove(0);
	            } else {                                //next distance event happens first
	                currTime += (D.get(0) - currPos) / speed;
	                currPos = D.get(0);
	                D.remove(0);
	            }
	            eventCount++;
	            speed = 1 / (eventCount + 1);     //update the speed (slowing down)
	        }
	        System.out.println((int) (currTime + 0.5));
	        out.println((int) (currTime + 0.5));
	        out.close();
	    }

//	    static String DIRNAME = "slowdown/";
//	    public static void main(String[] args) throws IOException {
//	        for (int f = 1; f <= 10; f++) {
//	            System.out.print("Test # " + f + "....");
//	            long lStartTime = System.currentTimeMillis();
//	            solve(DIRNAME + f + ".in", DIRNAME + f + ".myout");
//	            long lEndTime = System.currentTimeMillis();
//	            long output = lEndTime - lStartTime;
//	            System.out.print("Took " + output + " milliseconds....");
//	            compare(f);
//	        }
//	    }
//
//	    static void compare(int t) throws IOException {
//	        BufferedReader f1 = new BufferedReader(new FileReader(DIRNAME + t + ".out"));
//	        BufferedReader f2 = new BufferedReader(new FileReader(DIRNAME + t + ".myout"));
//	        String c = f1.readLine();
//	        String m = f2.readLine();
//	        if (c.equals(m))
//	            System.out.print("Passed");
//	        else
//	            System.out.print("Failed");
//	        System.out.println(" (Expected result: " + c + ", your result: " + m + ")");
//	    }
//
//	}

}
