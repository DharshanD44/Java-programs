class t-matrix{ 
	int N = 4; 

	void transpose(int A[][], int B[][]) 
	{ 
		int i, j; 
		for (i = 0; i < N; i++) 
			for (j = 0; j < N; j++) 
				B[i][j] = A[j][i]; 
	} 

	public static void main(String[] args) 
	{ 
		int A[][] = { {4,4,4,4}, 
					{3,3,3,3}, 
					{2,2,2,2}, 
					{1,1,1,1} }; 

		int B[][] = new int[N][N], i, j; 

		transpose(A, B); 

		System.out.print("Result matrix is \n"); 
		for (i = 0; i < N; i++) { 
			for (j = 0; j < N; j++) 
				System.out.print(B[i][j] + " "); 
			System.out.print("\n"); 
		} 
	} 
} 

