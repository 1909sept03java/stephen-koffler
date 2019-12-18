
public class LargeSum {
	

	public static void main(String[] args) {
		int[] arr = {1000000000, 1000000000, 1000000000, 1000000000, 1000000001, 1000000004};
		int m = 0;
		long n = 0;
		
		for (int i = 0; i < arr.length; i++) {
			n = n + arr[i];
			System.out.println("iteration " + i);
			System.out.println(n);
			m = m + arr[i];
			System.out.println(m);
			
		System.out.println(arr[i]);}
		System.out.println(m);
		System.out.println(n);

			
	}

}
