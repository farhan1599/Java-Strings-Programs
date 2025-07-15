
public class Patterns {

	public static void main(String[] args) {

		// pattern1(5);
		// pattern2(7);
		// pattern3(5);
		// pattern4(5);
		// pattern5(5);
		// pattern6(5);
		// pattern7(5);
		// pattern8(5);
		// pattern9(5);
		// pattern10(5);
		// pattern11(5);
		// pattern12(5);
		pattern13(5);
	}
	

	private static void pattern13(int n) {

//		1 
//		2 3 
//		4 5 6 
//		7 8 9 10 
//		11 12 13 14 15 

		int number = 1;
		for (int row = 1; row <= n; row++) {

			for (int col = 1; col <= row; col++) {
				System.out.print(number + " ");
				number++;
			}

			System.out.println();
		}
	}

	
	private static void pattern12(int n) {

//	         1 
//	       2 1 2 
//	     3 2 1 2 3 
//	   4 3 2 1 2 3 4 
//	 5 4 3 2 1 2 3 4 5 
//	   4 3 2 1 2 3 4 
//	     3 2 1 2 3 
//	       2 1 2 
//	         1 

		for (int row = 1; row <= 2 * n; row++) {

			int c = row > n ? 2 * n - row : row;

			for (int spaces = 0; spaces < n - c; spaces++) {
				System.out.print("  ");
			}

			for (int col = c; col >= 1; col--) {
				System.out.print(col + " ");
			}

			for (int col = 2; col <= c; col++) {
				System.out.print(col + " ");

			}

			System.out.println();
		}
	}

	private static void pattern11(int n) {

//	        1 
//	      2 1 2 
//	    3 2 1 2 3 
//	  4 3 2 1 2 3 4 
//	5 4 3 2 1 2 3 4 5 

		for (int row = 1; row <= n; row++) {

			for (int spaces = 0; spaces < n - row; spaces++) {
				System.out.print("  ");
			}

			for (int col = row; col >= 1; col--) {
				System.out.print(col + " ");
			}

			for (int col = 2; col <= row; col++) {
				System.out.print(col + " ");
			}

			System.out.println();
		}
	}

	private static void pattern10(int n) {

//		* * * * * 
//		*       * 
//		*       * 
//		*       * 
//		* * * * *

		for (int row = 1; row <= n; row++) {

			for (int col = 1; col <= n; col++) {

				if (row == 1 || row == n || col == 1 || col == n) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

	private static void pattern9(int n) {

//		 * * * * * 
//		   * * * * 
//		     * * * 
//		       * * 
//		         * 

		for (int row = 0; row < n; row++) {

			int noOfSpaces = row;

			for (int space = 0; space < noOfSpaces; space++) {

				System.out.print("  ");
			}

			for (int col = 0; col < n - row; col++) {
				System.out.print("* ");
			}

			System.out.println();
		}

	}

	private static void pattern8(int n) {

//		     *
//		   * *
//		 * * *
//	   * * * *
//	 * * * * *

		for (int row = 0; row < n; row++) {

			int noOfSpaces = n - row;

			for (int space = 0; space < noOfSpaces; space++) {
				System.out.print("  ");
			}

			for (int col = 0; col <= row; col++) {
				System.out.print("* ");
			}

			System.out.println();
		}

	}

	private static void pattern7(int n) {

//	      * 
//	     * * 
//	    * * * 
//	   * * * * 
//	  * * * * * 

		for (int row = 0; row < n; row++) {

			int noOfSpaces = n - row;

			for (int space = 0; space < noOfSpaces; space++) {
				System.out.print(" ");
			}

			for (int col = 0; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	private static void pattern6(int n) {

//		* * * * * 
//		 * * * * 
//		  * * * 
//		   * * 
//		    * 

		for (int row = 0; row < n; row++) {

			int noOfSpaces = row;

			for (int space = 0; space < noOfSpaces; space++) {
				System.out.print(" ");
			}

			for (int col = 0; col < n - row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	private static void pattern5(int n) {

//	    * 
//	   * * 
//	  * * * 
//	 * * * * 
//	* * * * * 
//	 * * * * 
//	  * * * 
//	   * * 
//	    * 

		for (int row = 0; row < 2 * n; row++) {

			int totalColsInRow = row > n ? 2 * n - row : row;
			int noOfSpaces = n - totalColsInRow;

			for (int space = 0; space < noOfSpaces; space++) {
				System.out.print(" ");
			}

			for (int col = 0; col < totalColsInRow; col++) {

				System.out.print("* ");
			}
			System.out.println();
		}

	}

	private static void pattern4(int n) {

//		* 
//		* * 
//		* * * 
//		* * * * 
//		* * * * *
//		* * * * 
//		* * * 
//		* * 
//		*

		for (int row = 0; row < 2 * n; row++) {

			int totalColsInRow = row > n ? 2 * n - row : row;

			for (int col = 0; col < totalColsInRow; col++) {

				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private static void pattern3(int n) {
//		1
//		1 2
//		1 2 3
//		1 2 3 4
//		1 2 3 4 5

		for (int row = 1; row <= n; row++) {

			for (int col = 1; col <= row; col++) {

				System.out.print(col + " ");
			}

			System.out.println();
		}

	}

	private static void pattern2(int n) {

//		* * * * * 
//		* * * * 
//		* * * 
//		* * 
//		* 

		for (int row = 1; row <= n; row++) {

			for (int col = n; col >= row; col--) {

				System.out.print(col + " ");
			}

			System.out.println();
		}

//		for (int row = 0; row < n; row++) {
//			for (int col = 0; col < n - row; col++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}

	}

	private static void pattern1(int n) {

//		* 
//		* * 
//		* * * 
//		* * * * 
//		* * * * *

		for (int row = 0; row < n; row++) {

			for (int col = 0; col <= row; col++) {

				System.out.print("* ");
			}

			System.out.println();
		}

	}

}
