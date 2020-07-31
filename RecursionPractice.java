package bronze_questions;

public class RecursionPractice {
	public static void main (String argv [ ]) {
		for (int i = 0; i < 10; i++) {
			System.out.println("fib(" + i + ") = " + fib(i));
		}
	}
	
	static int fib (int n) {
		if (n == 0) return 0;
		if (n == 1) return 1;
		return fib(n-1) + fib(n-2);
	}
}
