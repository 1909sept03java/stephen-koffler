
public class StairCase {

	public static void main(String[] args) {
		int n = 7;
		 
		for (int i = 1; i < n + 1; i++) {
			int j = n - i;
			
			int k = n - j;
			
			
			while (j > 0) {
				System.out.print(" ");
				j--;
			}
				
			while (k > 0) {
				if (k != 1)
					System.out.print("#");
				else
					System.out.println("#");
				
				k--;
			}
					
				}
			}
			
		}
			

	
	


