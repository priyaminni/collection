
public class ArrayTest4 {

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3, 4 }, { 0, 8, 9, 5 }, { 1, 4, 3 } };
		for (int i = 0; i < a.length; i++) {
			System.out.print("Elements in row" + i +": ");
			for (int j = 0; j < a[i].length; j++) {

				System.out.print( a[i][j] +"\t");
			}
			System.out.println();
		}
	}
}
