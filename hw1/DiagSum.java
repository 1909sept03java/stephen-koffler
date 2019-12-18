
public class DiagSum {
	int n;
	int m = n-1;
	int [][] arr = new int [n][n];
	num lrsum, rlsum = 0;
	
	public static void main(String[] args) {
		
		for (int i=0; i<n; i++)
			lrsum = lrsum + arr[i][i];
		
		for (int j = 0; j<n; j++) {
			rlsum = arr[j][m];
			m--
		}
		
		System.out.println(lrsum);
		System.out.println(rlsum);
		

	}

}
