import java.util.Scanner;

public class MatrixMultiply {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows");
		int rows = sc.nextInt();
		System.out.println("Enter cols");
		int cols = sc.nextInt();

		int m[][] = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.println("Enter value for " + i + " " + j);
				int val1 = sc.nextInt();
				m[i][j] = val1;

			}
		}
		System.out.println("*******  Matrix 1 *********");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}

		int r[][] = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.println("Enter value for " + i + " " + j);
				int val2 = sc.nextInt();
				r[i][j] = val2;
			}
		}
		System.out.println("*******  Matrix 2 *********");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(r[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("----------Matrix Multiplication-----------");
		int mr[][] = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				mr[i][j] = 0;
				for (int k = 0; k < rows; k++) {
					mr[i][j] = mr[i][j] + (m[i][k] * r[k][j]);
				}
			}
		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(mr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
