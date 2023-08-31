import java.util.Scanner;
class TwoDArray {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int rows,columns;
		System.out.println("Enter the Row value:");
		rows=s.nextInt();
		System.out.println("Enter the column value:");
		columns=s.nextInt();

		int[][] a= new int[rows][columns];
		System.out.println("Enter the Array elements:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				a[i][j] =s.nextInt();
			}
		}

		System.out.println("The 2D array is: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
