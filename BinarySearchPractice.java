package bronze_questions;
import java.util.Arrays;

public class BinarySearchPractice {
	public static void main(String argv[]) {
		int [] arr = {3,6,82,893,1345,3525,24634};
		int n = Arrays.binarySearch(arr,3525); //binary searches arr until it finds 3525 -- gives back the index of where 3525 is located
		System.out.println("n = " + n); //prints 5
		int n2 = Arrays.binarySearch(arr,2425);
		System.out.println("n = " + n2); //prints -6 because insertion point is 5, -1-5 = -6
		
		/**if finding 5 in an array of 1,2,4,5,5,5,5,5,5,6,7, it could give back any index where 
		the 5 is because binary search chops and chops the array -- won't give back all 6 indexes where the 5 is */
		
	}
}
