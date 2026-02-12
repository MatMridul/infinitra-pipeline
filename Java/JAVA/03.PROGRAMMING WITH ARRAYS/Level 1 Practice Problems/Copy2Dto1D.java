import java.util.Scanner;

public class Copy2Dto1D {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int rows = scanner.nextInt();
		System.out.print("Enter the number of columns: ");
		int cols = scanner.nextInt();
		
		//Defininig an array object with rows and columns as integer data types for further usage.
		int[][] matrix = new int[rows][cols];
		int[] array = new int[rows * cols];
		int index = 0;
		
		//Vertical and horizontal for loops to fill in rows and columns in the required array of the required form.
		for (int i=0; i < rows; i++) {
			for (int j=0; j < cols; j++) {
				System.out.print("Enter the element: [" + i + "][" + j + "]:");
				matrix[i][j] = scanner.nextInt();
				array[index++] = matrix[i][j];
			}
		}
		
		System.out.print("1D Array: ");
		for (int num : array) {
			System.out.print(num + " ");
		}
		scanner.close();
	}
}
		