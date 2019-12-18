public class DiagSum {
	static int n = 4;
	static int m = 0;
	static int [][] arr = {{1, 2, 3, 1},
							{4, 5, 6, 0},
							{9, 8, 9, 0},
							{1,1,1, 0}};
	static int lrsum = 0;
	static int rlsum = 0;
	
	public static void main(String[] args) {
		
		for (int i=0; i<n; i++)
			lrsum = lrsum + arr[i][i];
		
		for (int j = n - 1; j>-1; j--) {
			System.out.println(j + ", "+m + ": " + arr[j][m]);
			rlsum = rlsum + arr[j][m];
			m++;
		}
		
		System.out.println(lrsum);
		System.out.println(rlsum);
		
		System.out.println("the abs value of the difference of the diags is: "+Math.abs(lrsum - rlsum));
		

	}

}