package HW1.random;

	public class random_matrix {

		public static void main(String[] args) {
			int n=5;
			int [][] r = new int[n][n];
			for(int i = 0;i<n;i++) {
				for(int j =0; j<n;j++) {
					r[i][j]= rand();
				}
			}
			for(int i = 0;i<n;i++) {
				for(int j =0; j<n;j++) {
					System.out.print(r[i][j]+" ");
				}
				System.out.println();
			}
			
		}
		public static int rand() {
			double r = Math.random();
			if (r<0.5) {
				return 0;
			}
			else {
				return 1;
			}
		}

	

}
