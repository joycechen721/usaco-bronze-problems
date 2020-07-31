package bronze_questions;

public class Matrix_Practice {

	public static void main(String[] argvp) {
		String [][] alphabet = {{"a","b","c","d","e"},{"f","g","h","i","j"}, {"k","l","m","n","o"}, {"p","q","r","s","t"}};
		
		char [][] m = new char[4][5];
		char alpha = 'a';
		for (int r = 0; r < m.length; r++) {
			for (int c = 0; c < m[r].length; c++) {
				m[r][c] = alpha;
				alpha++;
			}
		}
		
		//m.length is the number of 1D arrays in the 2D arrays (# of rows)
		//m.length[r] is the number of elements in each 1D array (# of columns)
		
		for (int r = 0; r < m.length; r++) {
			for (int c = 0; c < m[r].length; c++) {
				System.out.print(m[r][c]);
			}
			System.out.println();		
		}
		
		//check each row against a given three letter word
		char [] target = {'a','b','c'};
		int count = 0;
		//check row
		for (int r = 0; r < m.length; r++){
			//check all sliding windows
			for (int start = 0; start <= m[r].length - target.length; start++) {
				if (m[r][start] == target[0] && m[r] [start +1] == target[1] && m[r][start + 2] == target[2])
					count++;
				}
			}
		//check column
		for (int c = 0; c < m[0].length; c++) {
			for (int top = 0; top <= m.length - target.length; top++) {
				if (m[top][c] == target [0] && m[top+1][c] == target [1] && m[top+2][c] == target[2])
					count++;
				//comparing the letters in bottom-up order
				if (m[top][c] == target [2] && m[top+1][c] == target [1] && m[top+2][c] == target[0])
					count++;
			}
		}
		//check diagonal
		for (int r = 0; r < m.length; r++) {
			for (int c = 0; c < m[0].length; c++) {
				//with each cell at m[r][c] as the starting letter, check four possibilities 
				if (r < m.length - 2 && c < m[r].length - 2 && m[r][c] == target [0] 
						&& m[r+1][c+1] == target [1] && m[r+2][c+2] == target [2])
					count++;
				if (m[r][c] == target [0] && m[r+1][c+1] == target [1] 
						&& m[r+2][c+2] == target [2])
					count++;
			}
		}
		
		
		
		
		}
	}

