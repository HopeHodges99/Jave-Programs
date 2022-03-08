import java.util.Scanner;

public class PracFor10_09_19 {

	public static void main(String[] args) {
		
		
				int[][] matrix = getMatrix();
				for (int col = 0; col < matrix[0].length; col++) {	
					System.out.println(
						"All the sums in the columns are " + sumColumn(matrix, col));
				}
			}

			
     public static int[][] getMatrix() {
				Scanner input = new Scanner(System.in);
				final int Rows = 3;
				final int Columns = 4;
				int[][] m = new int[Rows][Columns];

	
				System.out.println("Enter a " + Rows + " by " + 
					Columns + " matrix row by row:");
				for (int row = 0; row < m.length; row++)
					for (int col = 0; col < m[row].length; col++) 
						m[row][col] = input.nextInt();
				return m;
			}

			
			public static int sumColumn(int[][] m, int columnIndex) {
				int sum = 0;
				for (int row = 0; row < m.length; row++) {
					sum += m[row][columnIndex];		
				}
				return sum;
			}
		
	}


